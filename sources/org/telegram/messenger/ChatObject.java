package org.telegram.messenger;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.collection.LongSparseArray;
import com.google.android.exoplayer2.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import me.vkryl.core.BitwiseUtils;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.GroupCallActivity;

public class ChatObject {
    public static final int ACTION_ADD_ADMINS = 4;
    public static final int ACTION_BLOCK_USERS = 2;
    public static final int ACTION_CHANGE_INFO = 1;
    public static final int ACTION_DELETE_MESSAGES = 13;
    public static final int ACTION_EDIT_MESSAGES = 12;
    public static final int ACTION_EMBED_LINKS = 9;
    public static final int ACTION_INVITE = 3;
    public static final int ACTION_MANAGE_CALLS = 14;
    public static final int ACTION_MANAGE_DIRECT = 24;
    public static final int ACTION_MANAGE_LINKED_CHATS = 27;
    public static final int ACTION_MANAGE_TAGS = 25;
    public static final int ACTION_MANAGE_TOPICS = 15;
    public static final int ACTION_MANAGE_WELCOME = 28;
    public static final int ACTION_PIN = 0;
    public static final int ACTION_POST = 5;
    public static final int ACTION_SEND = 6;
    public static final int ACTION_SEND_DOCUMENTS = 19;
    public static final int ACTION_SEND_GIFS = 23;
    public static final int ACTION_SEND_MEDIA = 7;
    public static final int ACTION_SEND_MUSIC = 18;
    public static final int ACTION_SEND_PHOTO = 16;
    public static final int ACTION_SEND_PLAIN = 22;
    public static final int ACTION_SEND_POLLS = 10;
    public static final int ACTION_SEND_REACTIONS = 26;
    public static final int ACTION_SEND_ROUND = 21;
    public static final int ACTION_SEND_STICKERS = 8;
    public static final int ACTION_SEND_TEXT = 22;
    public static final int ACTION_SEND_VIDEO = 17;
    public static final int ACTION_SEND_VOICE = 20;
    public static final int ACTION_VIEW = 11;
    public static final int CHAT_TYPE_CHANNEL = 2;
    public static final int CHAT_TYPE_CHAT = 0;
    public static final int CHAT_TYPE_FORUM = 5;
    public static final int CHAT_TYPE_MEGAGROUP = 4;
    public static final int CHAT_TYPE_USER = 3;
    private static final int MAX_PARTICIPANTS_COUNT = 5000;
    public static final int VIDEO_FRAME_HAS_FRAME = 2;
    public static final int VIDEO_FRAME_NO_FRAME = 0;
    public static final int VIDEO_FRAME_REQUESTING = 1;

    public static MessagesController.PeerColor getPeerColorForAvatar(int i, TLRPC.Chat chat) {
        return null;
    }

    private static boolean isAdminAction(int i) {
        return i == 12 || i == 13 || i == 15 || i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    private static boolean isBannableAction(int i) {
        if (i != 0 && i != 1 && i != 3 && i != 26 && i != 27) {
            switch (i) {
                default:
                    switch (i) {
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            break;
                        default:
                            return false;
                    }
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    return true;
            }
        }
        return true;
    }

    public static boolean reactionIsAvailable(TLRPC.ChatFull chatFull, String str) {
        TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
            return true;
        }
        if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
            for (int i = 0; i < tL_chatReactionsSome.reactions.size(); i++) {
                if ((tL_chatReactionsSome.reactions.get(i) instanceof TLRPC.TL_reactionEmoji) && TextUtils.equals(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i)).emoticon, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isForum(int i, long j) {
        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
        if (chat != null) {
            return chat.forum;
        }
        return false;
    }

    public static boolean isMonoForum(int i, long j) {
        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
        if (chat != null) {
            return chat.monoforum;
        }
        return false;
    }

    public static boolean canSendAnyMedia(TLRPC.Chat chat) {
        return canSendPhoto(chat) || canSendVideo(chat) || canSendRoundVideo(chat) || canSendVoice(chat) || canSendDocument(chat) || canSendMusic(chat) || canSendStickers(chat);
    }

    public static boolean isIgnoredChatRestrictionsForBoosters(TLRPC.ChatFull chatFull) {
        int i;
        return chatFull != null && (i = chatFull.boosts_unrestrict) > 0 && chatFull.boosts_applied - i >= 0;
    }

    public static boolean isIgnoredChatRestrictionsForBoosters(TLRPC.Chat chat) {
        if (chat != null) {
            return isIgnoredChatRestrictionsForBoosters(MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.id));
        }
        return false;
    }

    public static boolean isPossibleRemoveChatRestrictionsByBoosts(TLRPC.Chat chat) {
        if (chat != null) {
            return isPossibleRemoveChatRestrictionsByBoosts(MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.id));
        }
        return false;
    }

    public static boolean isPossibleRemoveChatRestrictionsByBoosts(TLRPC.ChatFull chatFull) {
        return chatFull != null && chatFull.boosts_unrestrict > 0;
    }

    public static String getAllowedSendString(TLRPC.Chat chat) {
        StringBuilder sb = new StringBuilder();
        if (canSendPhoto(chat)) {
            sb.append(LocaleController.getString(R.string.SendMediaPermissionPhotos));
        }
        if (canSendVideo(chat)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString(R.string.SendMediaPermissionVideos));
        }
        if (canSendStickers(chat)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString(R.string.SendMediaPermissionStickersGifs));
        }
        if (canSendMusic(chat)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString(R.string.SendMediaPermissionMusic));
        }
        if (canSendDocument(chat)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString(R.string.SendMediaPermissionFiles));
        }
        if (canSendVoice(chat)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString(R.string.SendMediaPermissionVoice));
        }
        if (canSendRoundVideo(chat)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString(R.string.SendMediaPermissionRound));
        }
        if (canSendEmbed(chat)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString(R.string.SendMediaEmbededLinks));
        }
        return sb.toString();
    }

    public static class Call {
        public static final int RECORD_TYPE_AUDIO = 0;
        public static final int RECORD_TYPE_VIDEO_LANDSCAPE = 2;
        public static final int RECORD_TYPE_VIDEO_PORTAIT = 1;
        private static int videoPointer;
        public int activeVideos;
        public TLRPC.GroupCall call;
        public boolean canStreamVideo;
        public long chatId;
        private Runnable checkQueueRunnable;
        public AccountInstance currentAccount;
        public boolean isConference;
        private long lastGroupCallReloadTime;
        private int lastLoadGuid;
        public boolean loadedRtmpStreamParticipant;
        private boolean loadingGroupCall;
        public boolean loadingMembers;
        public boolean membersLoadEndReached;
        private String nextLoadOffset;
        public long participantsReceivedTime;
        public boolean recording;
        public boolean reloadingMembers;
        public VideoParticipant rtmpStreamParticipant;
        public TLRPC.Peer selfPeer;
        public int speakingMembersCount;
        private boolean typingUpdateRunnableScheduled;
        private long updatesStartWaitTime;
        public VideoParticipant videoNotAvailableParticipant;
        public LongSparseArray participants = new LongSparseArray();
        public final ArrayList<TLRPC.GroupCallParticipant> sortedParticipants = new ArrayList<>();
        public final ArrayList<VideoParticipant> visibleVideoParticipants = new ArrayList<>();
        public final ArrayList<TLRPC.GroupCallParticipant> visibleParticipants = new ArrayList<>();
        public final HashMap<String, Bitmap> thumbs = new HashMap<>();
        private final HashMap<String, VideoParticipant> videoParticipantsCache = new HashMap<>();
        public ArrayList<Long> invitedUsers = new ArrayList<>();
        public HashMap<Long, InvitedUser> invitedUsersMessageIds = new HashMap<>();
        public ArrayList<Long> shadyLeftParticipants = new ArrayList<>();
        public ArrayList<Long> shadyJoinParticipants = new ArrayList<>();
        public HashSet<Long> invitedUsersMap = new HashSet<>();
        public ArrayList<Long> kickedUsers = new ArrayList<>();
        public SparseArray<TLRPC.GroupCallParticipant> participantsBySources = new SparseArray<>();
        public SparseArray<TLRPC.GroupCallParticipant> participantsByVideoSources = new SparseArray<>();
        public SparseArray<TLRPC.GroupCallParticipant> participantsByPresentationSources = new SparseArray<>();
        private Runnable typingUpdateRunnable = new Runnable() {
            @Override
            public final void run() {
                ChatObject.Call.$r8$lambda$dyiSnUmltwVEU2EeGtPLdg3cA40(this.f$0);
            }
        };
        private HashSet<Integer> loadingGuids = new HashSet<>();
        private ArrayList<TL_update.TL_updateGroupCallParticipants> updatesQueue = new ArrayList<>();
        private HashSet<Long> loadingUids = new HashSet<>();
        private HashSet<Long> loadingSsrcs = new HashSet<>();
        public final LongSparseArray currentSpeakingPeers = new LongSparseArray();
        private final Runnable updateCurrentSpeakingRunnable = new Runnable() {
            @Override
            public void run() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                int i = 0;
                boolean z = false;
                while (i < Call.this.currentSpeakingPeers.size()) {
                    long jKeyAt = Call.this.currentSpeakingPeers.keyAt(i);
                    if (jUptimeMillis - ((TLRPC.GroupCallParticipant) Call.this.currentSpeakingPeers.get(jKeyAt)).lastSpeakTime >= 500) {
                        Call.this.currentSpeakingPeers.remove(jKeyAt);
                        if (jKeyAt > 0) {
                            TLRPC.User user = MessagesController.getInstance(Call.this.currentAccount.getCurrentAccount()).getUser(Long.valueOf(jKeyAt));
                            StringBuilder sb = new StringBuilder();
                            sb.append("remove from speaking ");
                            sb.append(jKeyAt);
                            sb.append(" ");
                            sb.append(user != null ? user.first_name : null);
                            Log.d("GroupCall", sb.toString());
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(Call.this.currentAccount.getCurrentAccount()).getChat(Long.valueOf(-jKeyAt));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("remove from speaking ");
                            sb2.append(jKeyAt);
                            sb2.append(" ");
                            sb2.append(chat != null ? chat.title : null);
                            Log.d("GroupCall", sb2.toString());
                        }
                        i--;
                        z = true;
                    }
                    i++;
                }
                if (Call.this.currentSpeakingPeers.size() > 0) {
                    AndroidUtilities.runOnUIThread(Call.this.updateCurrentSpeakingRunnable, 550L);
                }
                if (z) {
                    Call.this.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.groupCallSpeakingUsersUpdated, Long.valueOf(Call.this.chatId), Long.valueOf(Call.this.call.id), Boolean.FALSE);
                }
            }
        };

        public interface OnParticipantsLoad {
            void onLoad(ArrayList<Long> arrayList);
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface RecordType {
        }

        public static class InvitedUser {
            public boolean calling;
            public int msg_id;
            public long startTime;

            public static InvitedUser make(int i) {
                InvitedUser invitedUser = new InvitedUser();
                invitedUser.msg_id = i;
                invitedUser.calling = true;
                invitedUser.startTime = System.currentTimeMillis();
                return invitedUser;
            }

            public boolean isCalling() {
                return this.calling && (System.currentTimeMillis() - this.startTime) / 1000 <= ((long) MessagesController.getInstance(UserConfig.selectedAccount).callRingTimeout);
            }
        }

        public static void $r8$lambda$dyiSnUmltwVEU2EeGtPLdg3cA40(Call call) {
            call.typingUpdateRunnableScheduled = false;
            call.checkOnlineParticipants();
            call.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.groupCallTypingsUpdated, new Object[0]);
        }

        public void setCall(AccountInstance accountInstance, long j, TLRPC.GroupCall groupCall) {
            this.chatId = j;
            this.currentAccount = accountInstance;
            this.call = TlUtils.applyGroupCallUpdate(this.call, groupCall);
            this.recording = groupCall.record_start_date != 0;
            sortParticipants();
            loadMembers(true);
            createNoVideoParticipant();
            if (groupCall.rtmp_stream) {
                createRtmpStreamParticipant(Collections.EMPTY_LIST);
            }
        }

        public void setCall(AccountInstance accountInstance, long j, TL_phone.groupCall groupcall) {
            this.chatId = j;
            this.currentAccount = accountInstance;
            TLRPC.GroupCall groupCallApplyGroupCallUpdate = TlUtils.applyGroupCallUpdate(this.call, groupcall.call);
            this.call = groupCallApplyGroupCallUpdate;
            this.recording = groupCallApplyGroupCallUpdate.record_start_date != 0;
            int size = groupcall.participants.size();
            int iMin = Integer.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                TLRPC.GroupCallParticipant groupCallParticipant = groupcall.participants.get(i);
                this.participants.put(MessageObject.getPeerId(groupCallParticipant.peer), groupCallParticipant);
                this.sortedParticipants.add(groupCallParticipant);
                processAllSources(groupCallParticipant, true);
                iMin = Math.min(iMin, groupCallParticipant.date);
            }
            sortParticipants();
            this.nextLoadOffset = groupcall.participants_next_offset;
            loadMembers(true);
            createNoVideoParticipant();
            if (this.call.rtmp_stream) {
                createRtmpStreamParticipant(Collections.EMPTY_LIST);
            }
        }

        public void createRtmpStreamParticipant(List<TL_phone.TL_groupCallStreamChannel> list) {
            if (!this.loadedRtmpStreamParticipant || this.rtmpStreamParticipant == null) {
                VideoParticipant videoParticipant = this.rtmpStreamParticipant;
                TLRPC.GroupCallParticipant tL_groupCallParticipant = videoParticipant != null ? videoParticipant.participant : new TLRPC.TL_groupCallParticipant();
                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                tL_groupCallParticipant.peer = tL_peerChat;
                tL_peerChat.channel_id = this.chatId;
                tL_groupCallParticipant.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                Iterator<TL_phone.TL_groupCallStreamChannel> it = list.iterator();
                while (it.hasNext()) {
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(it.next().channel));
                }
                tL_groupCallParticipant.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                tL_groupCallParticipant.video.endpoint = "unified";
                tL_groupCallParticipant.videoEndpoint = "unified";
                this.rtmpStreamParticipant = new VideoParticipant(tL_groupCallParticipant, false, false);
                sortParticipants();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ChatObject.Call call = this.f$0;
                        call.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.groupCallUpdated, Long.valueOf(call.chatId), Long.valueOf(call.call.id), Boolean.FALSE);
                    }
                });
            }
        }

        public void createNoVideoParticipant() {
            if (this.videoNotAvailableParticipant != null) {
                return;
            }
            TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            tL_groupCallParticipant.peer = tL_peerChannel;
            tL_peerChannel.channel_id = this.chatId;
            tL_groupCallParticipant.muted = true;
            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = new TLRPC.TL_groupCallParticipantVideo();
            tL_groupCallParticipant.video = tL_groupCallParticipantVideo;
            tL_groupCallParticipantVideo.paused = true;
            tL_groupCallParticipantVideo.endpoint = "";
            this.videoNotAvailableParticipant = new VideoParticipant(tL_groupCallParticipant, false, false);
        }

        public void addSelfDummyParticipant(boolean z) {
            long selfId = getSelfId();
            if (this.participants.indexOfKey(selfId) >= 0) {
                return;
            }
            TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
            tL_groupCallParticipant.peer = this.selfPeer;
            tL_groupCallParticipant.muted = true;
            tL_groupCallParticipant.self = true;
            tL_groupCallParticipant.video_joined = this.call.can_start_video;
            TLRPC.Chat chat = this.currentAccount.getMessagesController().getChat(Long.valueOf(this.chatId));
            tL_groupCallParticipant.can_self_unmute = !this.call.join_muted || ChatObject.canManageCalls(chat);
            tL_groupCallParticipant.date = this.currentAccount.getConnectionsManager().getCurrentTime();
            if (ChatObject.canManageCalls(chat) || !ChatObject.isChannel(chat) || chat.megagroup || tL_groupCallParticipant.can_self_unmute) {
                tL_groupCallParticipant.active_date = this.currentAccount.getConnectionsManager().getCurrentTime();
            }
            if (selfId > 0) {
                TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount.getCurrentAccount()).getUserFull(selfId);
                if (userFull != null) {
                    tL_groupCallParticipant.about = userFull.about;
                }
            } else {
                TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount.getCurrentAccount()).getChatFull(-selfId);
                if (chatFull != null) {
                    tL_groupCallParticipant.about = chatFull.about;
                }
            }
            this.participants.put(selfId, tL_groupCallParticipant);
            this.sortedParticipants.add(tL_groupCallParticipant);
            sortParticipants();
            if (z) {
                this.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.id), Boolean.FALSE);
            }
        }

        public void migrateToChat(TLRPC.Chat chat) {
            this.chatId = chat.id;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance == null || sharedInstance.getAccount() != this.currentAccount.getCurrentAccount() || sharedInstance.getChat() == null || sharedInstance.getChat().id != (-this.chatId)) {
                return;
            }
            sharedInstance.migrateToChat(chat);
        }

        public boolean shouldShowPanel() {
            TLRPC.GroupCall groupCall = this.call;
            return groupCall.participants_count > 0 || groupCall.rtmp_stream || isScheduled();
        }

        public boolean isScheduled() {
            return (this.call.flags & 128) != 0;
        }

        private long getSelfId() {
            TLRPC.Peer peer = this.selfPeer;
            if (peer != null) {
                return MessageObject.getPeerId(peer);
            }
            return this.currentAccount.getUserConfig().getClientUserId();
        }

        private void onParticipantsLoad(ArrayList<TLRPC.GroupCallParticipant> arrayList, boolean z, String str, String str2, int i, int i2) {
            TLRPC.GroupCallParticipant groupCallParticipant;
            TLRPC.GroupCallParticipant groupCallParticipant2;
            this.participantsReceivedTime = System.currentTimeMillis();
            TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) this.participants.get(getSelfId());
            LongSparseArray longSparseArray = null;
            if (TextUtils.isEmpty(str)) {
                if (this.participants.size() != 0) {
                    longSparseArray = this.participants;
                    this.participants = new LongSparseArray();
                } else {
                    this.participants.clear();
                }
                this.sortedParticipants.clear();
                this.participantsBySources.clear();
                this.participantsByVideoSources.clear();
                this.participantsByPresentationSources.clear();
                this.loadingGuids.clear();
            }
            this.nextLoadOffset = str2;
            if (arrayList.isEmpty() || TextUtils.isEmpty(this.nextLoadOffset)) {
                this.membersLoadEndReached = true;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.GroupCall groupCall = this.call;
                groupCall.version = i;
                groupCall.participants_count = i2;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("new participants count " + this.call.participants_count);
                }
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.applyGroupCallVisibleParticipants, Long.valueOf(jElapsedRealtime));
            int size = arrayList.size();
            boolean z2 = false;
            for (int i3 = 0; i3 <= size; i3++) {
                if (i3 == size) {
                    if (z && groupCallParticipant3 != null && !z2) {
                        groupCallParticipant = groupCallParticipant3;
                    }
                } else {
                    groupCallParticipant = arrayList.get(i3);
                    if (groupCallParticipant.self) {
                        z2 = true;
                    }
                }
                TLRPC.GroupCallParticipant groupCallParticipant4 = (TLRPC.GroupCallParticipant) this.participants.get(MessageObject.getPeerId(groupCallParticipant.peer));
                if (groupCallParticipant4 != null) {
                    this.sortedParticipants.remove(groupCallParticipant4);
                    processAllSources(groupCallParticipant4, false);
                    if (groupCallParticipant4.self) {
                        groupCallParticipant.lastTypingDate = groupCallParticipant4.active_date;
                    } else {
                        groupCallParticipant.lastTypingDate = Math.max(groupCallParticipant.active_date, groupCallParticipant4.active_date);
                    }
                    if (jElapsedRealtime != groupCallParticipant.lastVisibleDate) {
                        groupCallParticipant.active_date = groupCallParticipant.lastTypingDate;
                    }
                } else if (longSparseArray != null && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) longSparseArray.get(MessageObject.getPeerId(groupCallParticipant.peer))) != null) {
                    if (groupCallParticipant2.self) {
                        groupCallParticipant.lastTypingDate = groupCallParticipant2.active_date;
                    } else {
                        groupCallParticipant.lastTypingDate = Math.max(groupCallParticipant.active_date, groupCallParticipant2.active_date);
                    }
                    if (jElapsedRealtime != groupCallParticipant.lastVisibleDate) {
                        groupCallParticipant.active_date = groupCallParticipant.lastTypingDate;
                    } else {
                        groupCallParticipant.active_date = groupCallParticipant2.active_date;
                    }
                }
                this.participants.put(MessageObject.getPeerId(groupCallParticipant.peer), groupCallParticipant);
                this.sortedParticipants.add(groupCallParticipant);
                processAllSources(groupCallParticipant, true);
            }
            if (this.call.participants_count < this.participants.size()) {
                this.call.participants_count = this.participants.size();
            }
            sortParticipants();
            this.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.id), Boolean.FALSE);
            setParticiapantsVolume();
        }

        public void loadMembers(final boolean z) {
            if (z) {
                if (this.reloadingMembers) {
                    return;
                }
                this.membersLoadEndReached = false;
                this.nextLoadOffset = null;
            }
            if (this.membersLoadEndReached || this.sortedParticipants.size() > 5000) {
                return;
            }
            if (z) {
                this.reloadingMembers = true;
            }
            this.loadingMembers = true;
            final TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
            getgroupparticipants.call = getInputGroupCall();
            String str = this.nextLoadOffset;
            if (str == null) {
                str = "";
            }
            getgroupparticipants.offset = str;
            getgroupparticipants.limit = this.isConference ? this.currentAccount.getMessagesController().conferenceCallSizeLimit : 20;
            this.currentAccount.getConnectionsManager().sendRequest(getgroupparticipants, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ChatObject.Call.$r8$lambda$fuQ8wLxAhlc13_q9b0LsmJ5Xv3o(this.f$0, z, getgroupparticipants, tLObject, tL_error);
                }
            });
        }

        public static void $r8$lambda$fuQ8wLxAhlc13_q9b0LsmJ5Xv3o(final Call call, final boolean z, final TL_phone.getGroupParticipants getgroupparticipants, final TLObject tLObject, TLRPC.TL_error tL_error) {
            call.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatObject.Call.$r8$lambda$bFoqTNBsOSNNf2RtxUJAuuocNo0(this.f$0, z, tLObject, getgroupparticipants);
                }
            });
        }

        public static void $r8$lambda$bFoqTNBsOSNNf2RtxUJAuuocNo0(Call call, boolean z, TLObject tLObject, TL_phone.getGroupParticipants getgroupparticipants) {
            call.loadingMembers = false;
            if (z) {
                call.reloadingMembers = false;
            }
            if (tLObject != null) {
                TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                call.currentAccount.getMessagesController().putUsers(groupparticipants.users, false);
                call.currentAccount.getMessagesController().putChats(groupparticipants.chats, false);
                call.onParticipantsLoad(groupparticipants.participants, z, getgroupparticipants.offset, groupparticipants.next_offset, groupparticipants.version, groupparticipants.count);
            }
        }

        private void setParticiapantsVolume() {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance == null || sharedInstance.getAccount() != this.currentAccount.getCurrentAccount() || sharedInstance.getChat() == null || sharedInstance.getChat().id != (-this.chatId)) {
                return;
            }
            sharedInstance.setParticipantsVolume();
        }

        public void setTitle(String str) {
            TL_phone.editGroupCallTitle editgroupcalltitle = new TL_phone.editGroupCallTitle();
            editgroupcalltitle.call = getInputGroupCall();
            editgroupcalltitle.title = str;
            this.currentAccount.getConnectionsManager().sendRequest(editgroupcalltitle, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ChatObject.Call.$r8$lambda$9UEmUNochbRxpihfnOCWOSXZeLI(this.f$0, tLObject, tL_error);
                }
            });
        }

        public static void $r8$lambda$9UEmUNochbRxpihfnOCWOSXZeLI(Call call, TLObject tLObject, TLRPC.TL_error tL_error) {
            call.getClass();
            if (tLObject != null) {
                call.currentAccount.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            }
        }

        public void addKickedUser(long j) {
            if (this.kickedUsers.contains(Long.valueOf(j))) {
                return;
            }
            this.kickedUsers.add(Long.valueOf(j));
            sortParticipants();
            this.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.id), Boolean.FALSE);
        }

        public void addInvitedUser(long j) {
            if (this.participants.get(j) != null || this.invitedUsersMap.contains(Long.valueOf(j))) {
                return;
            }
            this.invitedUsersMap.add(Long.valueOf(j));
            this.invitedUsers.add(Long.valueOf(j));
            this.kickedUsers.remove(Long.valueOf(j));
            sortParticipants();
            this.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.id), Boolean.FALSE);
        }

        public void removeInvitedUser(long j) {
            this.invitedUsersMap.remove(Long.valueOf(j));
            this.invitedUsers.remove(Long.valueOf(j));
            sortParticipants();
            this.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.id), Boolean.FALSE);
        }

        public void processTypingsUpdate(AccountInstance accountInstance, ArrayList<Long> arrayList, int i) {
            this.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.applyGroupCallVisibleParticipants, Long.valueOf(SystemClock.elapsedRealtime()));
            int size = arrayList.size();
            ArrayList<Long> arrayList2 = null;
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                Long l = arrayList.get(i2);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.participants.get(l.longValue());
                if (groupCallParticipant != null) {
                    if (i - groupCallParticipant.lastTypingDate > 10) {
                        if (groupCallParticipant.lastVisibleDate != i) {
                            groupCallParticipant.active_date = i;
                        }
                        groupCallParticipant.lastTypingDate = i;
                        z = true;
                    }
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    arrayList2.add(l);
                }
            }
            if (arrayList2 != null) {
                loadUnknownParticipants(arrayList2, true, null);
            }
            if (z) {
                sortParticipants();
                this.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.id), Boolean.FALSE);
            }
        }

        private void loadUnknownParticipants(final ArrayList<Long> arrayList, boolean z, final OnParticipantsLoad onParticipantsLoad) {
            final HashSet<Long> hashSet = z ? this.loadingUids : this.loadingSsrcs;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                if (hashSet.contains(arrayList.get(i))) {
                    arrayList.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            final int i2 = this.lastLoadGuid + 1;
            this.lastLoadGuid = i2;
            this.loadingGuids.add(Integer.valueOf(i2));
            hashSet.addAll(arrayList);
            TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
            getgroupparticipants.call = getInputGroupCall();
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                long jLongValue = arrayList.get(i3).longValue();
                if (z) {
                    getgroupparticipants.ids.add(this.currentAccount.getMessagesController().getInputPeer(jLongValue));
                } else {
                    getgroupparticipants.sources.add(Integer.valueOf((int) jLongValue));
                }
            }
            getgroupparticipants.offset = "";
            getgroupparticipants.limit = 100;
            this.currentAccount.getConnectionsManager().sendRequest(getgroupparticipants, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ChatObject.Call.$r8$lambda$sk77gznXGUMuJOga4Nhhycvtf_U(this.f$0, i2, onParticipantsLoad, arrayList, hashSet, tLObject, tL_error);
                }
            });
        }

        public static void $r8$lambda$sk77gznXGUMuJOga4Nhhycvtf_U(final Call call, final int i, final OnParticipantsLoad onParticipantsLoad, final ArrayList arrayList, final HashSet hashSet, final TLObject tLObject, TLRPC.TL_error tL_error) {
            call.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatObject.Call.$r8$lambda$32h1AL0bjiWZcM2v9cYm8h3Mshw(this.f$0, i, tLObject, onParticipantsLoad, arrayList, hashSet);
                }
            });
        }

        public static void $r8$lambda$32h1AL0bjiWZcM2v9cYm8h3Mshw(Call call, int i, TLObject tLObject, OnParticipantsLoad onParticipantsLoad, ArrayList arrayList, HashSet hashSet) {
            if (call.loadingGuids.remove(Integer.valueOf(i))) {
                if (tLObject != null) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                    call.currentAccount.getMessagesController().putUsers(groupparticipants.users, false);
                    call.currentAccount.getMessagesController().putChats(groupparticipants.chats, false);
                    int size = groupparticipants.participants.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        TLRPC.GroupCallParticipant groupCallParticipant = groupparticipants.participants.get(i2);
                        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) call.participants.get(peerId);
                        if (groupCallParticipant2 != null) {
                            call.sortedParticipants.remove(groupCallParticipant2);
                            call.processAllSources(groupCallParticipant2, false);
                        }
                        call.participants.put(peerId, groupCallParticipant);
                        call.sortedParticipants.add(groupCallParticipant);
                        call.processAllSources(groupCallParticipant, true);
                        if (call.invitedUsersMap.contains(Long.valueOf(peerId))) {
                            Long lValueOf = Long.valueOf(peerId);
                            call.invitedUsersMap.remove(lValueOf);
                            call.invitedUsers.remove(lValueOf);
                        }
                    }
                    if (call.call.participants_count < call.participants.size()) {
                        call.call.participants_count = call.participants.size();
                    }
                    call.sortParticipants();
                    call.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.groupCallUpdated, Long.valueOf(call.chatId), Long.valueOf(call.call.id), Boolean.FALSE);
                    if (onParticipantsLoad != null) {
                        onParticipantsLoad.onLoad(arrayList);
                    } else {
                        call.setParticiapantsVolume();
                    }
                }
                hashSet.removeAll(arrayList);
            }
        }

        private void processAllSources(TLRPC.GroupCallParticipant groupCallParticipant, boolean z) {
            int i;
            int i2 = groupCallParticipant.source;
            if (i2 != 0) {
                if (z) {
                    this.participantsBySources.put(i2, groupCallParticipant);
                } else {
                    this.participantsBySources.remove(i2);
                }
            }
            int i3 = 0;
            while (i3 < 2) {
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = i3 == 0 ? groupCallParticipant.video : groupCallParticipant.presentation;
                if (tL_groupCallParticipantVideo != null) {
                    if ((2 & tL_groupCallParticipantVideo.flags) != 0 && (i = tL_groupCallParticipantVideo.audio_source) != 0) {
                        if (z) {
                            this.participantsBySources.put(i, groupCallParticipant);
                        } else {
                            this.participantsBySources.remove(i);
                        }
                    }
                    SparseArray<TLRPC.GroupCallParticipant> sparseArray = i3 == 0 ? this.participantsByVideoSources : this.participantsByPresentationSources;
                    int size = tL_groupCallParticipantVideo.source_groups.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i4);
                        int size2 = tL_groupCallParticipantVideoSourceGroup.sources.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            int iIntValue = tL_groupCallParticipantVideoSourceGroup.sources.get(i5).intValue();
                            if (z) {
                                sparseArray.put(iIntValue, groupCallParticipant);
                            } else {
                                sparseArray.remove(iIntValue);
                            }
                        }
                    }
                    if (z) {
                        if (i3 == 0) {
                            groupCallParticipant.videoEndpoint = tL_groupCallParticipantVideo.endpoint;
                        } else {
                            groupCallParticipant.presentationEndpoint = tL_groupCallParticipantVideo.endpoint;
                        }
                    } else if (i3 == 0) {
                        groupCallParticipant.videoEndpoint = null;
                    } else {
                        groupCallParticipant.presentationEndpoint = null;
                    }
                }
                i3++;
            }
        }

        public void processVoiceLevelsUpdate(int[] iArr, float[] fArr, boolean[] zArr) {
            TLRPC.GroupCallParticipant groupCallParticipant;
            long j;
            boolean z;
            int currentTime = this.currentAccount.getConnectionsManager().getCurrentTime();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.applyGroupCallVisibleParticipants, Long.valueOf(jElapsedRealtime));
            int i = 0;
            ArrayList<Long> arrayList = null;
            boolean z2 = false;
            boolean z3 = false;
            while (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) this.participants.get(getSelfId());
                } else {
                    groupCallParticipant = this.participantsBySources.get(i2);
                }
                if (groupCallParticipant != null) {
                    boolean z4 = zArr[i];
                    groupCallParticipant.hasVoice = z4;
                    z = z3;
                    if (z4 || jElapsedRealtime - groupCallParticipant.lastVoiceUpdateTime > 500) {
                        groupCallParticipant.hasVoiceDelayed = z4;
                        groupCallParticipant.lastVoiceUpdateTime = jElapsedRealtime;
                    }
                    long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                    float f = fArr[i];
                    if (f > 0.1f) {
                        if (!zArr[i] || groupCallParticipant.lastTypingDate + 1 >= currentTime) {
                            j = jElapsedRealtime;
                        } else {
                            j = jElapsedRealtime;
                            if (j != groupCallParticipant.lastVisibleDate) {
                                groupCallParticipant.active_date = currentTime;
                            }
                            groupCallParticipant.lastTypingDate = currentTime;
                            z2 = true;
                        }
                        groupCallParticipant.lastSpeakTime = jUptimeMillis;
                        groupCallParticipant.amplitude = f;
                        if (this.currentSpeakingPeers.get(peerId, null) == null) {
                            if (peerId > 0) {
                                TLRPC.User user = MessagesController.getInstance(this.currentAccount.getCurrentAccount()).getUser(Long.valueOf(peerId));
                                StringBuilder sb = new StringBuilder();
                                sb.append("add to current speaking ");
                                sb.append(peerId);
                                sb.append(" ");
                                sb.append(user == null ? null : user.first_name);
                                Log.d("GroupCall", sb.toString());
                            } else {
                                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount.getCurrentAccount()).getChat(Long.valueOf(-peerId));
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("add to current speaking ");
                                sb2.append(peerId);
                                sb2.append(" ");
                                sb2.append(chat == null ? null : chat.title);
                                Log.d("GroupCall", sb2.toString());
                            }
                            this.currentSpeakingPeers.put(peerId, groupCallParticipant);
                            z2 = z2;
                            z3 = true;
                        } else {
                            jUptimeMillis = jUptimeMillis;
                        }
                    } else {
                        j = jElapsedRealtime;
                        jUptimeMillis = jUptimeMillis;
                        if (jUptimeMillis - groupCallParticipant.lastSpeakTime < 500 || this.currentSpeakingPeers.get(peerId, null) == null) {
                            z3 = z;
                        } else {
                            this.currentSpeakingPeers.remove(peerId);
                            if (peerId > 0) {
                                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount.getCurrentAccount()).getUser(Long.valueOf(peerId));
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("remove from speaking ");
                                sb3.append(peerId);
                                sb3.append(" ");
                                sb3.append(user2 == null ? null : user2.first_name);
                                Log.d("GroupCall", sb3.toString());
                            } else {
                                TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount.getCurrentAccount()).getChat(Long.valueOf(-peerId));
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("remove from speaking ");
                                sb4.append(peerId);
                                sb4.append(" ");
                                sb4.append(chat2 == null ? null : chat2.title);
                                Log.d("GroupCall", sb4.toString());
                            }
                            z3 = true;
                        }
                        groupCallParticipant.amplitude = 0.0f;
                        z2 = z2;
                    }
                    i++;
                    jElapsedRealtime = j;
                    jUptimeMillis = jUptimeMillis;
                } else {
                    j = jElapsedRealtime;
                    jUptimeMillis = jUptimeMillis;
                    z = z3;
                    if (iArr[i] != 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        arrayList.add(Long.valueOf(iArr[i]));
                    }
                }
                z2 = z2;
                z3 = z;
                i++;
                jElapsedRealtime = j;
                jUptimeMillis = jUptimeMillis;
            }
            boolean z5 = z2;
            boolean z6 = z3;
            if (arrayList != null) {
                loadUnknownParticipants(arrayList, false, null);
            }
            if (z5) {
                sortParticipants();
                this.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.id), Boolean.FALSE);
            }
            if (z6) {
                if (this.currentSpeakingPeers.size() > 0) {
                    AndroidUtilities.cancelRunOnUIThread(this.updateCurrentSpeakingRunnable);
                    AndroidUtilities.runOnUIThread(this.updateCurrentSpeakingRunnable, 550L);
                }
                this.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.groupCallSpeakingUsersUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.id), Boolean.FALSE);
            }
        }

        public void updateVisibleParticipants() {
            sortParticipants();
            this.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.id), Boolean.FALSE, 0L);
        }

        public void clearVideFramesInfo() {
            for (int i = 0; i < this.sortedParticipants.size(); i++) {
                this.sortedParticipants.get(i).hasCameraFrame = 0;
                this.sortedParticipants.get(i).hasPresentationFrame = 0;
                this.sortedParticipants.get(i).videoIndex = 0;
            }
            sortParticipants();
        }

        public void processUnknownVideoParticipants(int[] iArr, OnParticipantsLoad onParticipantsLoad) {
            ArrayList<Long> arrayList = null;
            for (int i = 0; i < iArr.length; i++) {
                if (this.participantsBySources.get(iArr[i]) == null && this.participantsByVideoSources.get(iArr[i]) == null && this.participantsByPresentationSources.get(iArr[i]) == null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(Long.valueOf(iArr[i]));
                }
            }
            if (arrayList != null) {
                loadUnknownParticipants(arrayList, false, onParticipantsLoad);
            } else {
                onParticipantsLoad.onLoad(null);
            }
        }

        private int isValidUpdate(TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants) {
            int i = this.call.version;
            int i2 = i + 1;
            int i3 = tL_updateGroupCallParticipants.version;
            if (i2 == i3 || i == i3) {
                return 0;
            }
            return i < i3 ? 1 : 2;
        }

        public void setSelfPeer(TLRPC.InputPeer inputPeer) {
            if (inputPeer == null) {
                this.selfPeer = null;
                return;
            }
            if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                this.selfPeer = tL_peerUser;
                tL_peerUser.user_id = this.currentAccount.getUserConfig().getClientUserId();
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                this.selfPeer = tL_peerUser2;
                tL_peerUser2.user_id = inputPeer.user_id;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                this.selfPeer = tL_peerChat;
                tL_peerChat.chat_id = inputPeer.chat_id;
            } else {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                this.selfPeer = tL_peerChannel;
                tL_peerChannel.channel_id = inputPeer.channel_id;
            }
        }

        private void processUpdatesQueue() {
            Collections.sort(this.updatesQueue, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return AndroidUtilities.compare(((TL_update.TL_updateGroupCallParticipants) obj).version, ((TL_update.TL_updateGroupCallParticipants) obj2).version);
                }
            });
            ArrayList<TL_update.TL_updateGroupCallParticipants> arrayList = this.updatesQueue;
            if (arrayList != null && !arrayList.isEmpty()) {
                boolean z = false;
                while (this.updatesQueue.size() > 0) {
                    TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = this.updatesQueue.get(0);
                    int iIsValidUpdate = isValidUpdate(tL_updateGroupCallParticipants);
                    if (iIsValidUpdate == 0) {
                        processParticipantsUpdate(tL_updateGroupCallParticipants, true);
                        this.updatesQueue.remove(0);
                        z = true;
                    } else {
                        if (iIsValidUpdate == 1) {
                            if (this.updatesStartWaitTime != 0 && (z || Math.abs(System.currentTimeMillis() - this.updatesStartWaitTime) <= 1500)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("HOLE IN GROUP CALL UPDATES QUEUE - will wait more time");
                                }
                                if (z) {
                                    this.updatesStartWaitTime = System.currentTimeMillis();
                                    return;
                                }
                                return;
                            }
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("HOLE IN GROUP CALL UPDATES QUEUE - reload participants");
                            }
                            this.updatesStartWaitTime = 0L;
                            this.updatesQueue.clear();
                            this.nextLoadOffset = null;
                            loadMembers(true);
                            return;
                        }
                        this.updatesQueue.remove(0);
                    }
                }
                this.updatesQueue.clear();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("GROUP CALL UPDATES QUEUE PROCEED - OK");
                }
            }
            this.updatesStartWaitTime = 0L;
        }

        public void checkQueue() {
            this.checkQueueRunnable = null;
            if (this.updatesStartWaitTime != 0 && System.currentTimeMillis() - this.updatesStartWaitTime >= 1500) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("QUEUE GROUP CALL UPDATES WAIT TIMEOUT - CHECK QUEUE");
                }
                processUpdatesQueue();
            }
            if (this.updatesQueue.isEmpty()) {
                return;
            }
            ChatObject$Call$$ExternalSyntheticLambda0 chatObject$Call$$ExternalSyntheticLambda0 = new ChatObject$Call$$ExternalSyntheticLambda0(this);
            this.checkQueueRunnable = chatObject$Call$$ExternalSyntheticLambda0;
            AndroidUtilities.runOnUIThread(chatObject$Call$$ExternalSyntheticLambda0, 1000L);
        }

        public void reloadGroupCall() {
            TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
            getgroupcall.call = getInputGroupCall();
            getgroupcall.limit = 100;
            this.currentAccount.getConnectionsManager().sendRequest(getgroupcall, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ChatObject.Call.m371$r8$lambda$GzNH1IhUEMzXIruu5neIx97uNY(this.f$0, tLObject, tL_error);
                }
            });
        }

        public static void m371$r8$lambda$GzNH1IhUEMzXIruu5neIx97uNY(final Call call, final TLObject tLObject, TLRPC.TL_error tL_error) {
            call.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatObject.Call.$r8$lambda$pR9KiZR0ATNgWzLu9DFTPdcSbUM(this.f$0, tLObject);
                }
            });
        }

        public static void $r8$lambda$pR9KiZR0ATNgWzLu9DFTPdcSbUM(Call call, TLObject tLObject) {
            call.getClass();
            if (tLObject instanceof TL_phone.groupCall) {
                TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                call.call = groupcall.call;
                call.currentAccount.getMessagesController().putUsers(groupcall.users, false);
                call.currentAccount.getMessagesController().putChats(groupcall.chats, false);
                ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
                String str = groupcall.participants_next_offset;
                TLRPC.GroupCall groupCall = groupcall.call;
                call.onParticipantsLoad(arrayList, true, "", str, groupCall.version, groupCall.participants_count);
            }
        }

        private void loadGroupCall() {
            if (this.loadingGroupCall || SystemClock.elapsedRealtime() - this.lastGroupCallReloadTime < 30000) {
                return;
            }
            this.loadingGroupCall = true;
            TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
            getgroupparticipants.call = getInputGroupCall();
            getgroupparticipants.offset = "";
            getgroupparticipants.limit = 1;
            this.currentAccount.getConnectionsManager().sendRequest(getgroupparticipants, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ChatObject.Call.m372$r8$lambda$nHg5TZ7swYWM9dPLjtVTrUFCc(this.f$0, tLObject, tL_error);
                }
            });
        }

        public static void m372$r8$lambda$nHg5TZ7swYWM9dPLjtVTrUFCc(final Call call, final TLObject tLObject, TLRPC.TL_error tL_error) {
            call.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatObject.Call.m373$r8$lambda$oKQGKUpVrcQaH9wVDLUlTFnkaw(this.f$0, tLObject);
                }
            });
        }

        public static void m373$r8$lambda$oKQGKUpVrcQaH9wVDLUlTFnkaw(Call call, TLObject tLObject) {
            call.getClass();
            call.lastGroupCallReloadTime = SystemClock.elapsedRealtime();
            call.loadingGroupCall = false;
            if (tLObject != null) {
                TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                call.currentAccount.getMessagesController().putUsers(groupparticipants.users, false);
                call.currentAccount.getMessagesController().putChats(groupparticipants.chats, false);
                TLRPC.GroupCall groupCall = call.call;
                int i = groupCall.participants_count;
                int i2 = groupparticipants.count;
                if (i != i2) {
                    groupCall.participants_count = i2;
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("new participants reload count " + call.call.participants_count);
                    }
                    call.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.groupCallUpdated, Long.valueOf(call.chatId), Long.valueOf(call.call.id), Boolean.FALSE);
                }
            }
        }

        public void processParticipantsUpdate(TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants, boolean z) {
            int i;
            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
            boolean z2;
            long j = 0;
            if (!z) {
                int size = tL_updateGroupCallParticipants.participants.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z2 = false;
                        break;
                    } else {
                        if (tL_updateGroupCallParticipants.participants.get(i2).versioned) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (z2 && this.call.version + 1 < tL_updateGroupCallParticipants.version) {
                    if (this.reloadingMembers || this.updatesStartWaitTime == 0 || Math.abs(System.currentTimeMillis() - this.updatesStartWaitTime) <= 1500) {
                        if (this.updatesStartWaitTime == 0) {
                            this.updatesStartWaitTime = System.currentTimeMillis();
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("add TL_updateGroupCallParticipants to queue " + tL_updateGroupCallParticipants.version);
                        }
                        this.updatesQueue.add(tL_updateGroupCallParticipants);
                        if (this.checkQueueRunnable == null) {
                            ChatObject$Call$$ExternalSyntheticLambda0 chatObject$Call$$ExternalSyntheticLambda0 = new ChatObject$Call$$ExternalSyntheticLambda0(this);
                            this.checkQueueRunnable = chatObject$Call$$ExternalSyntheticLambda0;
                            AndroidUtilities.runOnUIThread(chatObject$Call$$ExternalSyntheticLambda0, 1500L);
                            return;
                        }
                        return;
                    }
                    this.nextLoadOffset = null;
                    loadMembers(true);
                    return;
                }
                if (z2 && tL_updateGroupCallParticipants.version < this.call.version) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("ignore processParticipantsUpdate because of version");
                        return;
                    }
                    return;
                }
            }
            long selfId = getSelfId();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.sortedParticipants.isEmpty()) {
                i = 0;
            } else {
                ArrayList<TLRPC.GroupCallParticipant> arrayList = this.sortedParticipants;
                i = arrayList.get(arrayList.size() - 1).date;
            }
            this.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.applyGroupCallVisibleParticipants, Long.valueOf(jElapsedRealtime));
            int size2 = tL_updateGroupCallParticipants.participants.size();
            long j2 = 0;
            int i3 = 0;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            while (i3 < size2) {
                long j3 = j;
                TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i3);
                int i4 = size2;
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("process participant " + peerId + " left = " + groupCallParticipant.left + " versioned " + groupCallParticipant.versioned + " flags = " + groupCallParticipant.flags + " self = " + selfId + " volume = " + groupCallParticipant.volume);
                }
                TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.participants.get(peerId);
                if (groupCallParticipant.left) {
                    if (groupCallParticipant2 == null && tL_updateGroupCallParticipants.version == this.call.version) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("unknowd participant left, reload call");
                        }
                        z3 = true;
                    }
                    if (groupCallParticipant2 != null) {
                        this.participants.remove(peerId);
                        processAllSources(groupCallParticipant2, false);
                        this.sortedParticipants.remove(groupCallParticipant2);
                        this.visibleParticipants.remove(groupCallParticipant2);
                        if (this.currentSpeakingPeers.get(peerId, null) != null) {
                            if (peerId > j3) {
                                TLRPC.User user = MessagesController.getInstance(this.currentAccount.getCurrentAccount()).getUser(Long.valueOf(peerId));
                                StringBuilder sb = new StringBuilder();
                                sb.append("left remove from speaking ");
                                sb.append(peerId);
                                sb.append(" ");
                                sb.append(user == null ? null : user.first_name);
                                Log.d("GroupCall", sb.toString());
                            } else {
                                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount.getCurrentAccount()).getChat(Long.valueOf(-peerId));
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("left remove from speaking ");
                                sb2.append(peerId);
                                sb2.append(" ");
                                sb2.append(chat == null ? null : chat.title);
                                Log.d("GroupCall", sb2.toString());
                            }
                            this.currentSpeakingPeers.remove(peerId);
                            z6 = true;
                        } else {
                            selfId = selfId;
                        }
                        int i5 = 0;
                        while (i5 < this.visibleVideoParticipants.size()) {
                            if (MessageObject.getPeerId(this.visibleVideoParticipants.get(i5).participant.peer) == MessageObject.getPeerId(groupCallParticipant2.peer)) {
                                this.visibleVideoParticipants.remove(i5);
                                i5--;
                            }
                            i5++;
                        }
                    } else {
                        selfId = selfId;
                    }
                    TLRPC.GroupCall groupCall = this.call;
                    int i6 = groupCall.participants_count - 1;
                    groupCall.participants_count = i6;
                    if (i6 < 0) {
                        groupCall.participants_count = 0;
                    }
                    jElapsedRealtime = jElapsedRealtime;
                } else {
                    selfId = selfId;
                    if (this.invitedUsersMap.contains(Long.valueOf(peerId))) {
                        Long lValueOf = Long.valueOf(peerId);
                        this.invitedUsersMap.remove(lValueOf);
                        this.invitedUsers.remove(lValueOf);
                    }
                    if (groupCallParticipant2 != null) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("new participant, update old");
                        }
                        groupCallParticipant2.muted = groupCallParticipant.muted;
                        if (!groupCallParticipant.muted || this.currentSpeakingPeers.get(peerId, null) == null) {
                            jElapsedRealtime = jElapsedRealtime;
                        } else {
                            this.currentSpeakingPeers.remove(peerId);
                            if (peerId > j3) {
                                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount.getCurrentAccount()).getUser(Long.valueOf(peerId));
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("muted remove from speaking ");
                                sb3.append(peerId);
                                sb3.append(" ");
                                sb3.append(user2 == null ? null : user2.first_name);
                                Log.d("GroupCall", sb3.toString());
                            } else {
                                TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount.getCurrentAccount()).getChat(Long.valueOf(-peerId));
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("muted remove from speaking ");
                                sb4.append(peerId);
                                sb4.append(" ");
                                sb4.append(chat2 == null ? null : chat2.title);
                                Log.d("GroupCall", sb4.toString());
                            }
                            z6 = true;
                        }
                        if (!groupCallParticipant.min) {
                            groupCallParticipant2.volume = groupCallParticipant.volume;
                            groupCallParticipant2.muted_by_you = groupCallParticipant.muted_by_you;
                        } else {
                            int i7 = groupCallParticipant.flags;
                            if ((i7 & 128) != 0 && (groupCallParticipant2.flags & 128) == 0) {
                                groupCallParticipant.flags = i7 & (-129);
                            }
                            if (groupCallParticipant.volume_by_admin && groupCallParticipant2.volume_by_admin) {
                                groupCallParticipant2.volume = groupCallParticipant.volume;
                            }
                        }
                        groupCallParticipant2.flags = groupCallParticipant.flags;
                        groupCallParticipant2.can_self_unmute = groupCallParticipant.can_self_unmute;
                        groupCallParticipant2.video_joined = groupCallParticipant.video_joined;
                        if (groupCallParticipant2.raise_hand_rating == j3 && groupCallParticipant.raise_hand_rating != j3) {
                            groupCallParticipant2.lastRaiseHandDate = SystemClock.elapsedRealtime();
                        }
                        groupCallParticipant2.raise_hand_rating = groupCallParticipant.raise_hand_rating;
                        groupCallParticipant2.date = groupCallParticipant.date;
                        int iMax = Math.max(groupCallParticipant2.active_date, groupCallParticipant.active_date);
                        groupCallParticipant2.lastTypingDate = iMax;
                        if (jElapsedRealtime != groupCallParticipant2.lastVisibleDate) {
                            groupCallParticipant2.active_date = iMax;
                        }
                        if (groupCallParticipant2.source != groupCallParticipant.source || !isSameVideo(groupCallParticipant2.video, groupCallParticipant.video) || !isSameVideo(groupCallParticipant2.presentation, groupCallParticipant.presentation)) {
                            processAllSources(groupCallParticipant2, false);
                            groupCallParticipant2.video = groupCallParticipant.video;
                            groupCallParticipant2.presentation = groupCallParticipant.presentation;
                            groupCallParticipant2.source = groupCallParticipant.source;
                            processAllSources(groupCallParticipant2, true);
                            groupCallParticipant.presentationEndpoint = groupCallParticipant2.presentationEndpoint;
                            groupCallParticipant.videoEndpoint = groupCallParticipant2.videoEndpoint;
                            groupCallParticipant.videoIndex = groupCallParticipant2.videoIndex;
                        } else {
                            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2 = groupCallParticipant2.video;
                            if (tL_groupCallParticipantVideo2 != null && (tL_groupCallParticipantVideo = groupCallParticipant.video) != null) {
                                tL_groupCallParticipantVideo2.paused = tL_groupCallParticipantVideo.paused;
                            }
                        }
                    } else {
                        jElapsedRealtime = jElapsedRealtime;
                        if (groupCallParticipant.just_joined) {
                            if (peerId != selfId) {
                                j2 = peerId;
                            }
                            TLRPC.GroupCall groupCall2 = this.call;
                            groupCall2.participants_count++;
                            if (tL_updateGroupCallParticipants.version == groupCall2.version) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("new participant, just joined, reload call");
                                }
                                z3 = true;
                            } else if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("new participant, just joined");
                            }
                        }
                        if (groupCallParticipant.raise_hand_rating != j3) {
                            groupCallParticipant.lastRaiseHandDate = SystemClock.elapsedRealtime();
                        }
                        if (peerId == selfId || this.sortedParticipants.size() < 20 || groupCallParticipant.date <= i || groupCallParticipant.active_date != 0 || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || !groupCallParticipant.min || this.membersLoadEndReached) {
                            this.sortedParticipants.add(groupCallParticipant);
                        }
                        this.participants.put(peerId, groupCallParticipant);
                        processAllSources(groupCallParticipant, true);
                    }
                    if (peerId == selfId && groupCallParticipant.active_date == 0 && (groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
                        groupCallParticipant.active_date = this.currentAccount.getConnectionsManager().getCurrentTime();
                    }
                    z5 = true;
                }
                if (peerId == selfId) {
                    z7 = true;
                }
                i3++;
                j = j3;
                size2 = i4;
                selfId = selfId;
                jElapsedRealtime = jElapsedRealtime;
                z4 = true;
            }
            int i8 = tL_updateGroupCallParticipants.version;
            TLRPC.GroupCall groupCall3 = this.call;
            if (i8 > groupCall3.version) {
                groupCall3.version = i8;
                if (!z) {
                    processUpdatesQueue();
                }
            }
            if (this.call.participants_count < this.participants.size()) {
                this.call.participants_count = this.participants.size();
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("new participants count after update " + this.call.participants_count);
            }
            if (z3) {
                loadGroupCall();
            }
            if (z4) {
                if (z5) {
                    sortParticipants();
                }
                this.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.id), Boolean.valueOf(z7), Long.valueOf(j2));
            }
            if (z6) {
                this.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.groupCallSpeakingUsersUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.id), Boolean.FALSE);
            }
        }

        private boolean isSameVideo(TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo, TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2) {
            if ((tL_groupCallParticipantVideo == null && tL_groupCallParticipantVideo2 != null) || (tL_groupCallParticipantVideo != null && tL_groupCallParticipantVideo2 == null)) {
                return false;
            }
            if (tL_groupCallParticipantVideo != null && tL_groupCallParticipantVideo2 != null) {
                if (!TextUtils.equals(tL_groupCallParticipantVideo.endpoint, tL_groupCallParticipantVideo2.endpoint) || tL_groupCallParticipantVideo.source_groups.size() != tL_groupCallParticipantVideo2.source_groups.size()) {
                    return false;
                }
                int size = tL_groupCallParticipantVideo.source_groups.size();
                for (int i = 0; i < size; i++) {
                    TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i);
                    TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup2 = tL_groupCallParticipantVideo2.source_groups.get(i);
                    if (!TextUtils.equals(tL_groupCallParticipantVideoSourceGroup.semantics, tL_groupCallParticipantVideoSourceGroup2.semantics) || tL_groupCallParticipantVideoSourceGroup.sources.size() != tL_groupCallParticipantVideoSourceGroup2.sources.size()) {
                        return false;
                    }
                    int size2 = tL_groupCallParticipantVideoSourceGroup.sources.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (!tL_groupCallParticipantVideoSourceGroup2.sources.contains(tL_groupCallParticipantVideoSourceGroup.sources.get(i2))) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        public void processGroupCallUpdate(TL_update.TL_updateGroupCall tL_updateGroupCall) {
            processGroupCallUpdate(tL_updateGroupCall.call);
        }

        public void processGroupCallUpdate(TLRPC.GroupCall groupCall) {
            if (this.call.version < groupCall.version) {
                this.nextLoadOffset = null;
                loadMembers(true);
            }
            this.call = TlUtils.applyGroupCallUpdate(this.call, groupCall);
            this.recording = this.call.record_start_date != 0;
            this.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.id), Boolean.FALSE);
        }

        public TLRPC.InputGroupCall getInputGroupCall() {
            return getInputGroupCall(this.isConference);
        }

        public TLRPC.InputGroupCall getInputGroupCall(boolean z) {
            TLRPC.GroupCall groupCall = this.call;
            if (groupCall == null) {
                return null;
            }
            if (z) {
                if (groupCall.invite_link == null) {
                    return null;
                }
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                List<String> pathSegments = Uri.parse(this.call.invite_link).getPathSegments();
                tL_inputGroupCallSlug.slug = pathSegments.get(pathSegments.size() - 1);
                return tL_inputGroupCallSlug;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall2 = this.call;
            tL_inputGroupCall.id = groupCall2.id;
            tL_inputGroupCall.access_hash = groupCall2.access_hash;
            return tL_inputGroupCall;
        }

        public static boolean videoIsActive(TLRPC.GroupCallParticipant groupCallParticipant, boolean z, Call call) {
            VoIPService sharedInstance;
            VideoParticipant videoParticipant;
            if (groupCallParticipant == null || (sharedInstance = VoIPService.getSharedInstance()) == null) {
                return false;
            }
            if (groupCallParticipant.self) {
                return sharedInstance.getVideoState(z) == 2;
            }
            VideoParticipant videoParticipant2 = call.rtmpStreamParticipant;
            if ((videoParticipant2 != null && videoParticipant2.participant == groupCallParticipant) || (((videoParticipant = call.videoNotAvailableParticipant) != null && videoParticipant.participant == groupCallParticipant) || call.participants.get(MessageObject.getPeerId(groupCallParticipant.peer)) != null)) {
                if (z) {
                    return groupCallParticipant.presentation != null;
                }
                if (groupCallParticipant.video != null) {
                    return true;
                }
            }
            return false;
        }

        public void sortParticipants() {
            TLRPC.GroupCallParticipant groupCallParticipant;
            int i;
            int size;
            VideoParticipant videoParticipant;
            this.visibleVideoParticipants.clear();
            this.visibleParticipants.clear();
            TLRPC.Chat chat = this.currentAccount.getMessagesController().getChat(Long.valueOf(this.chatId));
            final boolean zCanManageCalls = ChatObject.canManageCalls(chat);
            VideoParticipant videoParticipant2 = this.rtmpStreamParticipant;
            if (videoParticipant2 != null) {
                this.visibleVideoParticipants.add(videoParticipant2);
            }
            final long selfId = getSelfId();
            VoIPService.getSharedInstance();
            this.canStreamVideo = true;
            int i2 = 0;
            this.activeVideos = 0;
            int i3 = 0;
            boolean z = false;
            while (i3 < this.sortedParticipants.size()) {
                TLRPC.GroupCallParticipant groupCallParticipant2 = this.sortedParticipants.get(i3);
                boolean zVideoIsActive = videoIsActive(groupCallParticipant2, false, this);
                boolean zVideoIsActive2 = videoIsActive(groupCallParticipant2, true, this);
                if (!groupCallParticipant2.self && (zVideoIsActive || zVideoIsActive2)) {
                    this.activeVideos++;
                }
                if (this.kickedUsers.contains(Long.valueOf(DialogObject.getPeerDialogId(groupCallParticipant2.peer)))) {
                    this.sortedParticipants.remove(i3);
                    i3--;
                }
                if (zVideoIsActive || zVideoIsActive2) {
                    if (this.canStreamVideo) {
                        if (groupCallParticipant2.videoIndex == 0) {
                            if (groupCallParticipant2.self) {
                                groupCallParticipant2.videoIndex = Integer.MAX_VALUE;
                            } else {
                                int i4 = videoPointer + 1;
                                videoPointer = i4;
                                groupCallParticipant2.videoIndex = i4;
                            }
                        }
                    } else {
                        groupCallParticipant2.videoIndex = 0;
                    }
                    z = true;
                } else if (groupCallParticipant2.self || !this.canStreamVideo || (groupCallParticipant2.video == null && groupCallParticipant2.presentation == null)) {
                    groupCallParticipant2.videoIndex = 0;
                }
                i3++;
            }
            try {
                Collections.sort(this.sortedParticipants, new Comparator() {
                    @Override
                    public final int compare(Object obj, Object obj2) {
                        return ChatObject.Call.$r8$lambda$EzHGCqeupkJw0T1DyjwXr92ClvM(this.f$0, selfId, zCanManageCalls, (TLRPC.GroupCallParticipant) obj, (TLRPC.GroupCallParticipant) obj2);
                    }
                });
            } catch (Exception unused) {
            }
            if (this.sortedParticipants.isEmpty()) {
                groupCallParticipant = null;
            } else {
                ArrayList<TLRPC.GroupCallParticipant> arrayList = this.sortedParticipants;
                groupCallParticipant = arrayList.get(arrayList.size() - 1);
            }
            if ((videoIsActive(groupCallParticipant, false, this) || videoIsActive(groupCallParticipant, true, this)) && (i = this.call.unmuted_video_count) > this.activeVideos) {
                this.activeVideos = i;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null && sharedInstance.groupCall == this && (sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(true) == 2)) {
                    this.activeVideos--;
                }
            }
            if (this.sortedParticipants.size() > 5000 && (!ChatObject.canManageCalls(chat) || groupCallParticipant.raise_hand_rating == 0)) {
                int size2 = this.sortedParticipants.size();
                for (int i5 = 5000; i5 < size2; i5++) {
                    TLRPC.GroupCallParticipant groupCallParticipant3 = this.sortedParticipants.get(5000);
                    if (groupCallParticipant3.raise_hand_rating == 0) {
                        processAllSources(groupCallParticipant3, false);
                        this.participants.remove(MessageObject.getPeerId(groupCallParticipant3.peer));
                        this.sortedParticipants.remove(5000);
                    }
                }
            }
            checkOnlineParticipants();
            if (!this.canStreamVideo && z && (videoParticipant = this.videoNotAvailableParticipant) != null) {
                this.visibleVideoParticipants.add(videoParticipant);
            }
            int size3 = 0;
            for (int i6 = 0; i6 < this.sortedParticipants.size(); i6++) {
                TLRPC.GroupCallParticipant groupCallParticipant4 = this.sortedParticipants.get(i6);
                if (this.canStreamVideo && groupCallParticipant4.videoIndex != 0) {
                    if (!groupCallParticipant4.self && videoIsActive(groupCallParticipant4, true, this) && videoIsActive(groupCallParticipant4, false, this)) {
                        VideoParticipant videoParticipant3 = this.videoParticipantsCache.get(groupCallParticipant4.videoEndpoint);
                        if (videoParticipant3 == null) {
                            videoParticipant3 = new VideoParticipant(groupCallParticipant4, false, true);
                            this.videoParticipantsCache.put(groupCallParticipant4.videoEndpoint, videoParticipant3);
                        } else {
                            videoParticipant3.participant = groupCallParticipant4;
                            videoParticipant3.presentation = false;
                            videoParticipant3.hasSame = true;
                        }
                        VideoParticipant videoParticipant4 = this.videoParticipantsCache.get(groupCallParticipant4.presentationEndpoint);
                        if (videoParticipant4 == null) {
                            videoParticipant4 = new VideoParticipant(groupCallParticipant4, true, true);
                        } else {
                            videoParticipant4.participant = groupCallParticipant4;
                            videoParticipant4.presentation = true;
                            videoParticipant4.hasSame = true;
                        }
                        this.visibleVideoParticipants.add(videoParticipant3);
                        if (videoParticipant3.aspectRatio > 1.0f) {
                            size3 = this.visibleVideoParticipants.size() - 1;
                        }
                        this.visibleVideoParticipants.add(videoParticipant4);
                        if (videoParticipant4.aspectRatio > 1.0f) {
                            size = this.visibleVideoParticipants.size();
                            size3 = size - 1;
                        }
                    } else if (groupCallParticipant4.self) {
                        if (videoIsActive(groupCallParticipant4, true, this)) {
                            this.visibleVideoParticipants.add(new VideoParticipant(groupCallParticipant4, true, false));
                        }
                        if (videoIsActive(groupCallParticipant4, false, this)) {
                            this.visibleVideoParticipants.add(new VideoParticipant(groupCallParticipant4, false, false));
                        }
                    } else {
                        boolean zVideoIsActive3 = videoIsActive(groupCallParticipant4, true, this);
                        VideoParticipant videoParticipant5 = this.videoParticipantsCache.get(zVideoIsActive3 ? groupCallParticipant4.presentationEndpoint : groupCallParticipant4.videoEndpoint);
                        if (videoParticipant5 == null) {
                            videoParticipant5 = new VideoParticipant(groupCallParticipant4, zVideoIsActive3, false);
                            this.videoParticipantsCache.put(zVideoIsActive3 ? groupCallParticipant4.presentationEndpoint : groupCallParticipant4.videoEndpoint, videoParticipant5);
                        } else {
                            videoParticipant5.participant = groupCallParticipant4;
                            videoParticipant5.presentation = zVideoIsActive3;
                            videoParticipant5.hasSame = false;
                        }
                        this.visibleVideoParticipants.add(videoParticipant5);
                        if (videoParticipant5.aspectRatio > 1.0f) {
                            size = this.visibleVideoParticipants.size();
                            size3 = size - 1;
                        }
                    }
                } else {
                    this.visibleParticipants.add(groupCallParticipant4);
                }
            }
            ArrayList<TLRPC.GroupCallParticipant> arrayList2 = this.sortedParticipants;
            int size4 = arrayList2.size();
            int i7 = 0;
            while (i7 < size4) {
                TLRPC.GroupCallParticipant groupCallParticipant5 = arrayList2.get(i7);
                i7++;
                this.kickedUsers.remove(Long.valueOf(DialogObject.getPeerDialogId(groupCallParticipant5.peer)));
            }
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (this.call != null && sharedInstance2 != null && sharedInstance2.isConference() && sharedInstance2.groupCall == this) {
                ArrayList<TLRPC.GroupCallParticipant> arrayList3 = this.sortedParticipants;
                int size5 = arrayList3.size();
                int i8 = 0;
                while (i8 < size5) {
                    TLRPC.GroupCallParticipant groupCallParticipant6 = arrayList3.get(i8);
                    i8++;
                    sharedInstance2.conference.joiningBlockchainParticipants.remove(Long.valueOf(DialogObject.getPeerDialogId(groupCallParticipant6.peer)));
                }
                this.shadyLeftParticipants.clear();
                this.shadyLeftParticipants.addAll(sharedInstance2.conference.getShadyLeftParticipants(this.sortedParticipants));
                this.shadyJoinParticipants.clear();
                this.shadyJoinParticipants.addAll(sharedInstance2.conference.getShadyJoiningParticipants(this.sortedParticipants));
                ArrayList<TLRPC.GroupCallParticipant> arrayList4 = this.sortedParticipants;
                int size6 = arrayList4.size();
                while (i2 < size6) {
                    TLRPC.GroupCallParticipant groupCallParticipant7 = arrayList4.get(i2);
                    i2++;
                    long peerDialogId = DialogObject.getPeerDialogId(groupCallParticipant7.peer);
                    if (this.invitedUsersMap.contains(Long.valueOf(peerDialogId))) {
                        this.invitedUsersMap.remove(Long.valueOf(peerDialogId));
                        this.invitedUsers.remove(Long.valueOf(peerDialogId));
                    }
                }
            }
            if (GroupCallActivity.isLandscapeMode || this.visibleVideoParticipants.size() % 2 != 1) {
                return;
            }
            this.visibleVideoParticipants.add(this.visibleVideoParticipants.remove(size3));
        }

        public static int $r8$lambda$EzHGCqeupkJw0T1DyjwXr92ClvM(org.telegram.messenger.ChatObject.Call r6, long r7, boolean r9, org.telegram.tgnet.TLRPC.GroupCallParticipant r10, org.telegram.tgnet.TLRPC.GroupCallParticipant r11) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ChatObject.Call.$r8$lambda$EzHGCqeupkJw0T1DyjwXr92ClvM(org.telegram.messenger.ChatObject$Call, long, boolean, org.telegram.tgnet.TLRPC$GroupCallParticipant, org.telegram.tgnet.TLRPC$GroupCallParticipant):int");
        }

        public boolean canRecordVideo() {
            if (!this.canStreamVideo) {
                return false;
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            return (sharedInstance != null && sharedInstance.groupCall == this && (sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(true) == 2)) || this.activeVideos < this.call.unmuted_video_limit;
        }

        public void saveActiveDates() {
            int size = this.sortedParticipants.size();
            for (int i = 0; i < size; i++) {
                TLRPC.GroupCallParticipant groupCallParticipant = this.sortedParticipants.get(i);
                groupCallParticipant.lastActiveDate = groupCallParticipant.active_date;
            }
        }

        private void checkOnlineParticipants() {
            if (this.typingUpdateRunnableScheduled) {
                AndroidUtilities.cancelRunOnUIThread(this.typingUpdateRunnable);
                this.typingUpdateRunnableScheduled = false;
            }
            this.speakingMembersCount = 0;
            int currentTime = this.currentAccount.getConnectionsManager().getCurrentTime();
            int size = this.sortedParticipants.size();
            int iMin = Integer.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                TLRPC.GroupCallParticipant groupCallParticipant = this.sortedParticipants.get(i);
                int i2 = currentTime - groupCallParticipant.active_date;
                if (i2 < 5) {
                    this.speakingMembersCount++;
                    iMin = Math.min(i2, iMin);
                }
                if (Math.max(groupCallParticipant.date, groupCallParticipant.active_date) <= currentTime - 5) {
                    break;
                }
            }
            if (iMin != Integer.MAX_VALUE) {
                AndroidUtilities.runOnUIThread(this.typingUpdateRunnable, iMin * 1000);
                this.typingUpdateRunnableScheduled = true;
            }
        }

        public void toggleRecord(String str, int i) {
            this.recording = !this.recording;
            TL_phone.toggleGroupCallRecord togglegroupcallrecord = new TL_phone.toggleGroupCallRecord();
            togglegroupcallrecord.call = getInputGroupCall();
            togglegroupcallrecord.start = this.recording;
            if (str != null) {
                togglegroupcallrecord.title = str;
                togglegroupcallrecord.flags |= 2;
            }
            if (i == 1 || i == 2) {
                togglegroupcallrecord.flags |= 4;
                togglegroupcallrecord.video = true;
                togglegroupcallrecord.video_portrait = i == 1;
            }
            this.currentAccount.getConnectionsManager().sendRequest(togglegroupcallrecord, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ChatObject.Call.$r8$lambda$bTMK8nManqOzPSgCalzsHopT0_0(this.f$0, tLObject, tL_error);
                }
            });
            this.currentAccount.getNotificationCenter().postNotificationName(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.id), Boolean.FALSE);
        }

        public static void $r8$lambda$bTMK8nManqOzPSgCalzsHopT0_0(Call call, TLObject tLObject, TLRPC.TL_error tL_error) {
            call.getClass();
            if (tLObject != null) {
                call.currentAccount.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            }
        }
    }

    public static int getParticipantVolume(TLRPC.GroupCallParticipant groupCallParticipant) {
        if ((groupCallParticipant.flags & 128) != 0) {
            return groupCallParticipant.volume;
        }
        return 10000;
    }

    private static boolean getBannedRight(TLRPC.TL_chatBannedRights tL_chatBannedRights, int i) {
        if (tL_chatBannedRights == null) {
            return false;
        }
        if (i == 0) {
            return tL_chatBannedRights.pin_messages;
        }
        if (i == 1) {
            return tL_chatBannedRights.change_info;
        }
        if (i == 3) {
            return tL_chatBannedRights.invite_users;
        }
        if (i == 26) {
            return tL_chatBannedRights.send_reactions;
        }
        if (i != 27) {
            switch (i) {
                case 6:
                    return tL_chatBannedRights.send_messages;
                case 7:
                    return tL_chatBannedRights.send_media;
                case 8:
                    return tL_chatBannedRights.send_stickers;
                case 9:
                    return tL_chatBannedRights.embed_links;
                case 10:
                    return tL_chatBannedRights.send_polls;
                case 11:
                    return tL_chatBannedRights.view_messages;
                default:
                    switch (i) {
                        case 15:
                            return tL_chatBannedRights.manage_topics;
                        case 16:
                            return tL_chatBannedRights.send_photos;
                        case 17:
                            return tL_chatBannedRights.send_videos;
                        case 18:
                            return tL_chatBannedRights.send_audios;
                        case 19:
                            return tL_chatBannedRights.send_docs;
                        case 20:
                            return tL_chatBannedRights.send_voices;
                        case 21:
                            return tL_chatBannedRights.send_roundvideos;
                        case 22:
                            return tL_chatBannedRights.send_plain;
                        default:
                            return false;
                    }
            }
        }
        return tL_chatBannedRights.manage_linked_peers;
    }

    public static boolean isActionBannedByDefault(TLRPC.Chat chat, int i) {
        if (chat == null) {
            return false;
        }
        if (getBannedRight(chat.banned_rights, i) && getBannedRight(chat.default_banned_rights, i)) {
            return true;
        }
        return getBannedRight(chat.default_banned_rights, i);
    }

    public static boolean isActionBanned(TLRPC.Chat chat, int i) {
        if (chat != null) {
            return getBannedRight(chat.banned_rights, i) || getBannedRight(chat.default_banned_rights, i);
        }
        return false;
    }

    public static boolean canUserDoAdminAction(TLRPC.TL_chatAdminRights tL_chatAdminRights, int i) {
        boolean z;
        if (tL_chatAdminRights != null) {
            if (i == 27) {
                z = tL_chatAdminRights.manage_linked_peers;
            } else if (i == 0) {
                z = tL_chatAdminRights.pin_messages;
            } else if (i == 1) {
                z = tL_chatAdminRights.change_info;
            } else if (i == 2) {
                z = tL_chatAdminRights.ban_users;
            } else if (i == 3) {
                z = tL_chatAdminRights.invite_users;
            } else if (i == 4) {
                z = tL_chatAdminRights.add_admins;
            } else if (i == 5) {
                z = tL_chatAdminRights.post_messages;
            } else {
                switch (i) {
                    case 12:
                        z = tL_chatAdminRights.edit_messages;
                        break;
                    case 13:
                        z = tL_chatAdminRights.delete_messages;
                        break;
                    case 14:
                        z = tL_chatAdminRights.manage_call;
                        break;
                    case 15:
                        z = tL_chatAdminRights.manage_topics;
                        break;
                    default:
                        z = false;
                        break;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean canManageMonoForum(int i, long j) {
        return canUserDoChannelDirectAdminAction(i, j, 24);
    }

    public static boolean canManageMonoForum(int i, TLRPC.Chat chat) {
        return canUserDoChannelDirectAdminAction(i, chat, 24);
    }

    public static boolean canUserDoChannelDirectAdminAction(int i, long j, int i2) {
        return canUserDoAdminAction(getChannelDirectChatInternal(i, j), i2);
    }

    public static boolean canUserDoChannelDirectAdminAction(int i, TLRPC.Chat chat, int i2) {
        return canUserDoAdminAction(getChannelDirectChatInternal(i, chat), i2);
    }

    private static TLRPC.Chat getChannelDirectChatInternal(int i, long j) {
        return getChannelDirectChatInternal(i, MessagesController.getInstance(i).getChat(Long.valueOf(-j)));
    }

    private static TLRPC.Chat getChannelDirectChatInternal(int i, TLRPC.Chat chat) {
        if (chat == null || chat.linked_monoforum_id == 0) {
            return null;
        }
        return chat.monoforum ? MessagesController.getInstance(i).getChat(Long.valueOf(chat.linked_monoforum_id)) : chat;
    }

    public static boolean canRemoveChatFromCommunity(TLRPC.Chat chat, TLRPC.Chat chat2) {
        if (chat == null || chat2 == null) {
            return false;
        }
        return chat.creator || canUserDoAdminAction(chat2, 27);
    }

    public static boolean canRemoveBotFromCommunity(TLRPC.User user, TLRPC.Chat chat) {
        if (user == null || chat == null) {
            return false;
        }
        return (user.bot && user.bot_can_edit) || canUserDoAdminAction(chat, 27);
    }

    public static boolean canAddChatToCommunity(TLRPC.Chat chat) {
        return canUserDoAction(chat, 27);
    }

    public static boolean canUserDoAdminAction(TLRPC.Chat chat, int i) {
        boolean z;
        if (chat == null) {
            return false;
        }
        if (chat.creator) {
            return true;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
        if (tL_chatAdminRights != null) {
            if (i == 24) {
                z = tL_chatAdminRights.manage_direct_messages;
            } else if (i == 25) {
                z = tL_chatAdminRights.manage_ranks;
            } else if (i == 27) {
                z = tL_chatAdminRights.manage_linked_peers;
            } else if (i == 28) {
                z = tL_chatAdminRights.manage_welcome_messages;
            } else if (i == 0) {
                z = tL_chatAdminRights.pin_messages;
            } else if (i == 1) {
                z = tL_chatAdminRights.change_info;
            } else if (i == 2) {
                z = tL_chatAdminRights.ban_users;
            } else if (i == 3) {
                z = tL_chatAdminRights.invite_users;
            } else if (i == 4) {
                z = tL_chatAdminRights.add_admins;
            } else if (i == 5) {
                z = tL_chatAdminRights.post_messages;
            } else {
                switch (i) {
                    case 12:
                        z = tL_chatAdminRights.edit_messages;
                        break;
                    case 13:
                        z = tL_chatAdminRights.delete_messages;
                        break;
                    case 14:
                        z = tL_chatAdminRights.manage_call;
                        break;
                    case 15:
                        z = tL_chatAdminRights.manage_topics;
                        break;
                    default:
                        z = false;
                        break;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean canUserDoAction(TLRPC.Chat chat, TLRPC.ChannelParticipant channelParticipant, int i) {
        if (chat == null) {
            return true;
        }
        if (channelParticipant == null) {
            return false;
        }
        if (canUserDoAdminAction(channelParticipant.admin_rights, i)) {
            return true;
        }
        if (!getBannedRight(channelParticipant.banned_rights, i) && isBannableAction(i)) {
            if (channelParticipant.admin_rights != null && !isAdminAction(i)) {
                return true;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
            if (tL_chatBannedRights == null && ((chat instanceof TLRPC.TL_chat_layer92) || (chat instanceof TLRPC.TL_chat_old) || (chat instanceof TLRPC.TL_chat_old2) || (chat instanceof TLRPC.TL_channel_layer92) || (chat instanceof TLRPC.TL_channel_layer77) || (chat instanceof TLRPC.TL_channel_layer72) || (chat instanceof TLRPC.TL_channel_layer67) || (chat instanceof TLRPC.TL_channel_layer48) || (chat instanceof TLRPC.TL_channel_old))) {
                return true;
            }
            if (tL_chatBannedRights != null && !getBannedRight(tL_chatBannedRights, i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean canUserDoAction(TLRPC.Chat chat, int i) {
        if (chat == null || canUserDoAdminAction(chat, i)) {
            return true;
        }
        if (!getBannedRight(chat.banned_rights, i) && isBannableAction(i)) {
            if (chat.admin_rights != null && !isAdminAction(i)) {
                return true;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
            if (tL_chatBannedRights == null && ((chat instanceof TLRPC.TL_chat_layer92) || (chat instanceof TLRPC.TL_chat_old) || (chat instanceof TLRPC.TL_chat_old2) || (chat instanceof TLRPC.TL_channel_layer92) || (chat instanceof TLRPC.TL_channel_layer77) || (chat instanceof TLRPC.TL_channel_layer72) || (chat instanceof TLRPC.TL_channel_layer67) || (chat instanceof TLRPC.TL_channel_layer48) || (chat instanceof TLRPC.TL_channel_old))) {
                return true;
            }
            if (tL_chatBannedRights != null && !getBannedRight(tL_chatBannedRights, i)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isForbidden(TLRPC.Chat chat) {
        return (chat instanceof TLRPC.TL_chatForbidden) || (chat instanceof TLRPC.TL_channelForbidden) || (chat instanceof TLRPC.TL_communityForbidden);
    }

    public static boolean isLeftFromChat(TLRPC.Chat chat) {
        return chat == null || (chat instanceof TLRPC.TL_chatEmpty) || isForbidden(chat) || chat.left || chat.deactivated;
    }

    public static boolean isKickedFromChat(TLRPC.Chat chat) {
        if (chat == null || (chat instanceof TLRPC.TL_chatEmpty) || isForbidden(chat) || chat.kicked || chat.deactivated) {
            return true;
        }
        TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.banned_rights;
        return tL_chatBannedRights != null && tL_chatBannedRights.view_messages;
    }

    public static boolean isNotInChat(TLRPC.Chat chat) {
        return chat == null || (chat instanceof TLRPC.TL_chatEmpty) || isForbidden(chat) || chat.left || chat.kicked || chat.deactivated;
    }

    public static boolean isInChat(TLRPC.Chat chat) {
        return (chat == null || (chat instanceof TLRPC.TL_chatEmpty) || isForbidden(chat) || chat.left || chat.kicked || chat.deactivated) ? false : true;
    }

    public static boolean canSendAsPeers(TLRPC.Chat chat) {
        if (!isChannel(chat)) {
            return false;
        }
        if (!chat.megagroup && chat.signatures && hasAdminRights(chat) && canWriteToChat(chat)) {
            return true;
        }
        if (chat.megagroup) {
            return isPublic(chat) || chat.has_geo || chat.has_link;
        }
        return false;
    }

    public static boolean isHiddenInCommunity(int i, long j) {
        if (j > 0) {
            return isHiddenInCommunity(i, MessagesController.getInstance(i).getUser(Long.valueOf(j)));
        }
        return isHiddenInCommunity(i, MessagesController.getInstance(i).getChat(Long.valueOf(-j)));
    }

    public static boolean isHiddenInCommunity(int i, TLRPC.User user) {
        return user != null && isHiddenInCommunity(i, user.linked_community_id, user.id);
    }

    public static boolean isHiddenInCommunity(int i, TLRPC.Chat chat) {
        return chat != null && isHiddenInCommunity(i, chat.linked_community_id, -chat.id);
    }

    private static boolean isHiddenInCommunity(int i, long j, long j2) {
        TLRPC.ChatFull chatFull;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        if (j != 0 && j2 != 0 && (chatFull = MessagesController.getInstance(i).getChatFull(j)) != null && (arrayList = chatFull.linked_peers) != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i2);
                i2++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (DialogObject.getPeerDialogId(communityPeer2.peer) == j2 && isCommunityPeerHidden(communityPeer2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCommunityPeerHidden(TL_communities.CommunityPeer communityPeer) {
        return (communityPeer == null || !BitwiseUtils.hasFlag(communityPeer.flags, 1) || communityPeer.visible) ? false : true;
    }

    public static boolean isCollapsedInCommunity(int i, long j) {
        if (j > 0) {
            return isUserCollapsedInCommunity(i, MessagesController.getInstance(i).getUser(Long.valueOf(j)));
        }
        return isChatCollapsedInCommunity(i, MessagesController.getInstance(i).getChat(Long.valueOf(-j)));
    }

    public static boolean isChatCollapsedInCommunity(LongSparseArray longSparseArray, TLRPC.Chat chat) {
        TLRPC.Chat chat2;
        if (chat != null) {
            long j = chat.linked_community_id;
            if (j != 0 && longSparseArray != null && (chat2 = (TLRPC.Chat) longSparseArray.get(j)) != null && chat2.collapsed_in_dialogs) {
                return true;
            }
        }
        return false;
    }

    public static boolean isChatCollapsedInCommunity(int i, TLRPC.Chat chat) {
        TLRPC.Chat chat2;
        return (chat == null || chat.linked_community_id == 0 || (chat2 = MessagesController.getInstance(i).getChat(Long.valueOf(chat.linked_community_id))) == null || !chat2.collapsed_in_dialogs) ? false : true;
    }

    public static boolean isUserCollapsedInCommunity(LongSparseArray longSparseArray, TLRPC.User user) {
        TLRPC.Chat chat;
        if (user != null) {
            long j = user.linked_community_id;
            if (j != 0 && longSparseArray != null && (chat = (TLRPC.Chat) longSparseArray.get(j)) != null && chat.collapsed_in_dialogs) {
                return true;
            }
        }
        return false;
    }

    public static boolean isUserCollapsedInCommunity(int i, TLRPC.User user) {
        TLRPC.Chat chat;
        return (user == null || user.linked_community_id == 0 || (chat = MessagesController.getInstance(i).getChat(Long.valueOf(user.linked_community_id))) == null || !chat.collapsed_in_dialogs) ? false : true;
    }

    public static boolean isCommunity(TLRPC.Chat chat) {
        return (chat instanceof TLRPC.TL_community) || (chat instanceof TLRPC.TL_communityForbidden);
    }

    public static boolean isCommunity(int i, long j) {
        return j < 0 && isCommunity(MessagesController.getInstance(i).getChat(Long.valueOf(-j)));
    }

    public static boolean isChannel(TLRPC.Chat chat) {
        return (chat instanceof TLRPC.TL_channel) || (chat instanceof TLRPC.TL_channelForbidden) || isCommunity(chat);
    }

    public static boolean isChannelOrGiga(TLRPC.Chat chat) {
        if (isChannel(chat)) {
            return !chat.megagroup || chat.gigagroup;
        }
        return false;
    }

    public static boolean isMegagroup(TLRPC.Chat chat) {
        return isChannel(chat) && chat.megagroup;
    }

    public static boolean isChannelAndNotMegaGroup(TLRPC.Chat chat) {
        return isChannel(chat) && !isMegagroup(chat);
    }

    public static boolean isDiscussionGroup(int i, long j) {
        MessagesController messagesController = MessagesController.getInstance(i);
        return isDiscussionGroup(messagesController.getChat(Long.valueOf(j)), messagesController.getChatFull(j));
    }

    public static boolean isDiscussionGroup(TLRPC.Chat chat, TLRPC.ChatFull chatFull) {
        return (!isMegagroup(chat) || chatFull == null || chatFull.linked_chat_id == 0) ? false : true;
    }

    public static boolean isBoostSupported(TLRPC.Chat chat) {
        return (isChannelAndNotMegaGroup(chat) || isMegagroup(chat)) && !isMonoForum(chat);
    }

    public static boolean isBoosted(TLRPC.ChatFull chatFull) {
        return chatFull != null && chatFull.boosts_applied > 0;
    }

    public static boolean isForum(TLRPC.Chat chat) {
        return chat != null && chat.forum;
    }

    public static boolean isMonoForum(TLRPC.Chat chat) {
        return chat != null && chat.monoforum;
    }

    public static boolean hasStories(TLRPC.Chat chat) {
        return chat != null && MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().hasStories(-chat.id);
    }

    public static boolean isMegagroup(int i, long j) {
        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(j));
        return isChannel(chat) && chat.megagroup;
    }

    public static boolean hasAdminRights(TLRPC.Chat chat) {
        if (chat == null) {
            return false;
        }
        if (chat.creator) {
            return true;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
        return (tL_chatAdminRights == null || tL_chatAdminRights.flags == 0) ? false : true;
    }

    public static boolean isCreator(TLRPC.Chat chat) {
        return chat != null && chat.creator;
    }

    public static boolean canChangeChatInfo(TLRPC.Chat chat) {
        return canUserDoAction(chat, 1);
    }

    public static boolean canAddAdmins(TLRPC.Chat chat) {
        return canUserDoAction(chat, 4);
    }

    public static boolean canManageTags(TLRPC.Chat chat) {
        return canUserDoAction(chat, 25);
    }

    public static boolean canManageMyTag(TLRPC.Chat chat) {
        boolean z;
        if (chat == null) {
            return false;
        }
        if (chat.creator) {
            return true;
        }
        TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.banned_rights;
        if (tL_chatBannedRights == null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
            if (tL_chatBannedRights2 == null) {
                return true;
            }
            z = tL_chatBannedRights2.edit_rank;
        } else {
            z = tL_chatBannedRights.edit_rank;
        }
        return !z;
    }

    public static boolean canBlockUsers(TLRPC.Chat chat) {
        return canUserDoAction(chat, 2);
    }

    public static boolean canManageCalls(TLRPC.Chat chat) {
        return canUserDoAction(chat, 14);
    }

    public static boolean canSendStickers(TLRPC.Chat chat) {
        if (isIgnoredChatRestrictionsForBoosters(chat)) {
            return true;
        }
        return canUserDoAction(chat, 8);
    }

    public static boolean canSendEmbed(TLRPC.Chat chat) {
        if (isIgnoredChatRestrictionsForBoosters(chat)) {
            return true;
        }
        return canUserDoAction(chat, 9);
    }

    public static boolean canSendPhoto(TLRPC.Chat chat) {
        if (isIgnoredChatRestrictionsForBoosters(chat)) {
            return true;
        }
        return canUserDoAction(chat, 16);
    }

    public static boolean canSendVideo(TLRPC.Chat chat) {
        if (isIgnoredChatRestrictionsForBoosters(chat)) {
            return true;
        }
        return canUserDoAction(chat, 17);
    }

    public static boolean canSendMusic(TLRPC.Chat chat) {
        if (isIgnoredChatRestrictionsForBoosters(chat)) {
            return true;
        }
        return canUserDoAction(chat, 18);
    }

    public static boolean canSendDocument(TLRPC.Chat chat) {
        if (isIgnoredChatRestrictionsForBoosters(chat)) {
            return true;
        }
        return canUserDoAction(chat, 19);
    }

    public static boolean canSendVoice(TLRPC.Chat chat) {
        if (isIgnoredChatRestrictionsForBoosters(chat)) {
            return true;
        }
        return canUserDoAction(chat, 20);
    }

    public static boolean canSendRoundVideo(TLRPC.Chat chat) {
        if (isIgnoredChatRestrictionsForBoosters(chat)) {
            return true;
        }
        return canUserDoAction(chat, 21);
    }

    public static boolean canSendPolls(TLRPC.Chat chat) {
        if (isMonoForum(chat)) {
            return false;
        }
        if (isIgnoredChatRestrictionsForBoosters(chat)) {
            return true;
        }
        return canUserDoAction(chat, 10);
    }

    public static boolean canSendMessages(TLRPC.Chat chat) {
        if (isNotInChat(chat) && chat != null && chat.join_to_send) {
            return false;
        }
        if (isIgnoredChatRestrictionsForBoosters(chat)) {
            return true;
        }
        return canUserDoAction(chat, 6);
    }

    public static boolean canSendPlain(TLRPC.Chat chat) {
        if (isIgnoredChatRestrictionsForBoosters(chat)) {
            return true;
        }
        return canUserDoAction(chat, 22);
    }

    public static boolean canPost(TLRPC.Chat chat) {
        return canUserDoAction(chat, 5);
    }

    public static boolean canAddUsers(TLRPC.Chat chat) {
        return canUserDoAction(chat, 3);
    }

    public static boolean shouldSendAnonymously(TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        return (chat == null || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.anonymous) ? false : true;
    }

    public static long getSendAsPeerId(TLRPC.Chat chat, TLRPC.ChatFull chatFull) {
        return getSendAsPeerId(chat, chatFull, false);
    }

    public static long getSendAsPeerId(TLRPC.Chat chat, TLRPC.ChatFull chatFull, boolean z) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.Peer peer;
        if (chat != null && chatFull != null && (peer = chatFull.default_send_as) != null) {
            long j = peer.user_id;
            if (j != 0) {
                return j;
            }
            long j2 = peer.channel_id;
            return z ? -j2 : j2;
        }
        if (chat != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.anonymous) {
            return z ? -chat.id : chat.id;
        }
        if (chat == null || !isChannelAndNotMegaGroup(chat) || chat.signatures) {
            return UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        }
        return z ? -chat.id : chat.id;
    }

    public static boolean canAddBotsToChat(TLRPC.Chat chat) {
        if (!isChannel(chat)) {
            return chat.migrated_to == null;
        }
        if (!chat.megagroup) {
            return false;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
        return (tL_chatAdminRights != null && (tL_chatAdminRights.post_messages || tL_chatAdminRights.add_admins)) || chat.creator;
    }

    public static boolean canPinMessages(TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (canUserDoAction(chat, 0)) {
            return true;
        }
        return isChannel(chat) && !chat.megagroup && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_messages;
    }

    public static boolean canCreateTopic(TLRPC.Chat chat) {
        return canUserDoAction(chat, 15);
    }

    public static boolean canManageTopics(TLRPC.Chat chat) {
        return canUserDoAdminAction(chat, 15);
    }

    public static boolean canManageTopic(int i, TLRPC.Chat chat, TLRPC.TL_forumTopic tL_forumTopic) {
        return canManageTopics(chat) || isMyTopic(i, tL_forumTopic);
    }

    public static boolean canManageTopic(int i, TLRPC.Chat chat, long j) {
        return canManageTopics(chat) || isMyTopic(i, chat, j);
    }

    public static boolean canDeleteTopic(int i, TLRPC.Chat chat, long j) {
        return (j == 1 || chat == null || !canDeleteTopic(i, chat, MessagesController.getInstance(i).getTopicsController().findTopic(chat.id, j))) ? false : true;
    }

    public static boolean canDeleteTopic(int i, TLRPC.Chat chat, TLRPC.TL_forumTopic tL_forumTopic) {
        TLRPC.Message message;
        TLRPC.Message message2;
        if (tL_forumTopic != null && tL_forumTopic.id == 1) {
            return false;
        }
        if (!canUserDoAction(chat, 13)) {
            if (isMyTopic(i, tL_forumTopic) && (message = tL_forumTopic.topMessage) != null && (message2 = tL_forumTopic.topicStartMessage) != null) {
                int i2 = message.id - message2.id;
                ArrayList<MessageObject> arrayList = tL_forumTopic.groupedMessages;
                if (i2 > Math.max(1, arrayList == null ? 0 : arrayList.size()) || !MessageObject.peersEqual(tL_forumTopic.from_id, tL_forumTopic.topMessage.from_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean isMyTopic(int i, TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic == null) {
            return false;
        }
        if (tL_forumTopic.my) {
            return true;
        }
        TLRPC.Peer peer = tL_forumTopic.from_id;
        return (peer instanceof TLRPC.TL_peerUser) && peer.user_id == UserConfig.getInstance(i).clientUserId;
    }

    public static boolean isMyTopic(int i, TLRPC.Chat chat, long j) {
        return chat != null && chat.forum && isMyTopic(i, chat.id, j);
    }

    public static boolean isMyTopic(int i, long j, long j2) {
        return isMyTopic(i, MessagesController.getInstance(i).getTopicsController().findTopic(j, j2));
    }

    public static boolean isChannel(long j, int i) {
        return isChannel(MessagesController.getInstance(i).getChat(Long.valueOf(j)));
    }

    public static boolean isCommunity(long j, int i) {
        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(j));
        return (chat instanceof TLRPC.TL_community) || (chat instanceof TLRPC.TL_communityForbidden);
    }

    public static boolean isChannelAndNotMegaGroup(long j, int i) {
        return isChannelAndNotMegaGroup(MessagesController.getInstance(i).getChat(Long.valueOf(j)));
    }

    public static boolean isCanWriteToChannel(long j, int i) {
        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(j));
        return canSendMessages(chat) || chat.megagroup;
    }

    public static boolean canWriteToChat(TLRPC.Chat chat) {
        if (!isChannel(chat) || chat.creator) {
            return true;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
        if (tL_chatAdminRights != null && tL_chatAdminRights.post_messages) {
            return true;
        }
        if (chat.broadcast || chat.gigagroup) {
            return chat.gigagroup && hasAdminRights(chat);
        }
        return true;
    }

    public static String getBannedRightsString(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        return ((((((((((((((((((((((("" + (tL_chatBannedRights.view_messages ? 1 : 0)) + (tL_chatBannedRights.send_messages ? 1 : 0)) + (tL_chatBannedRights.send_media ? 1 : 0)) + (tL_chatBannedRights.send_stickers ? 1 : 0)) + (tL_chatBannedRights.send_gifs ? 1 : 0)) + (tL_chatBannedRights.send_games ? 1 : 0)) + (tL_chatBannedRights.send_inline ? 1 : 0)) + (tL_chatBannedRights.embed_links ? 1 : 0)) + (tL_chatBannedRights.send_polls ? 1 : 0)) + (tL_chatBannedRights.invite_users ? 1 : 0)) + (tL_chatBannedRights.change_info ? 1 : 0)) + (tL_chatBannedRights.pin_messages ? 1 : 0)) + (tL_chatBannedRights.manage_topics ? 1 : 0)) + (tL_chatBannedRights.send_photos ? 1 : 0)) + (tL_chatBannedRights.send_videos ? 1 : 0)) + (tL_chatBannedRights.send_roundvideos ? 1 : 0)) + (tL_chatBannedRights.send_voices ? 1 : 0)) + (tL_chatBannedRights.send_audios ? 1 : 0)) + (tL_chatBannedRights.send_docs ? 1 : 0)) + (tL_chatBannedRights.send_plain ? 1 : 0)) + (tL_chatBannedRights.edit_rank ? 1 : 0)) + (tL_chatBannedRights.send_reactions ? 1 : 0)) + (tL_chatBannedRights.manage_linked_peers ? 1 : 0)) + tL_chatBannedRights.until_date;
    }

    public static boolean hasPhoto(TLRPC.Chat chat) {
        TLRPC.ChatPhoto chatPhoto;
        return (chat == null || (chatPhoto = chat.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) ? false : true;
    }

    public static TLRPC.ChatPhoto getPhoto(TLRPC.Chat chat) {
        if (hasPhoto(chat)) {
            return chat.photo;
        }
        return null;
    }

    public static String getPublicUsername(TLRPC.Chat chat) {
        return getPublicUsername(chat, false);
    }

    public static String getPublicUsername(TLRPC.Chat chat, boolean z) {
        ArrayList<TLRPC.TL_username> arrayList;
        if (chat == null) {
            return null;
        }
        if (!TextUtils.isEmpty(chat.username) && !z) {
            return chat.username;
        }
        if (chat.usernames != null) {
            for (int i = 0; i < chat.usernames.size(); i++) {
                TLRPC.TL_username tL_username = chat.usernames.get(i);
                if (tL_username != null && (((tL_username.active && !z) || tL_username.editable) && !TextUtils.isEmpty(tL_username.username))) {
                    return tL_username.username;
                }
            }
        }
        if (TextUtils.isEmpty(chat.username) || !z || ((arrayList = chat.usernames) != null && arrayList.size() > 0)) {
            return null;
        }
        return chat.username;
    }

    public static boolean hasPublicLink(TLRPC.Chat chat, String str) {
        if (chat == null) {
            return false;
        }
        if (!TextUtils.isEmpty(chat.username)) {
            return chat.username.equalsIgnoreCase(str);
        }
        if (chat.usernames != null) {
            for (int i = 0; i < chat.usernames.size(); i++) {
                TLRPC.TL_username tL_username = chat.usernames.get(i);
                if (tL_username != null && tL_username.active && !TextUtils.isEmpty(tL_username.username) && tL_username.username.equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPublic(TLRPC.Chat chat) {
        return !TextUtils.isEmpty(getPublicUsername(chat));
    }

    public static String getRestrictedErrorText(TLRPC.Chat chat, int i) {
        if (i == 23) {
            if (chat == null || isActionBannedByDefault(chat, i)) {
                return LocaleController.getString(R.string.GlobalAttachGifRestricted);
            }
            return AndroidUtilities.isBannedForever(chat.banned_rights) ? LocaleController.formatString("AttachGifRestrictedForever", R.string.AttachGifRestrictedForever, new Object[0]) : LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date));
        }
        if (i == 8) {
            if (chat == null || isActionBannedByDefault(chat, i)) {
                return LocaleController.getString(R.string.GlobalAttachStickersRestricted);
            }
            return AndroidUtilities.isBannedForever(chat.banned_rights) ? LocaleController.formatString("AttachStickersRestrictedForever", R.string.AttachStickersRestrictedForever, new Object[0]) : LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date));
        }
        if (i == 16) {
            if (chat == null || isActionBannedByDefault(chat, i)) {
                return LocaleController.getString(R.string.GlobalAttachPhotoRestricted);
            }
            return AndroidUtilities.isBannedForever(chat.banned_rights) ? LocaleController.formatString("AttachPhotoRestrictedForever", R.string.AttachPhotoRestrictedForever, new Object[0]) : LocaleController.formatString("AttachPhotoRestricted", R.string.AttachPhotoRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date));
        }
        if (i == 17) {
            if (chat == null || isActionBannedByDefault(chat, i)) {
                return LocaleController.getString(R.string.GlobalAttachVideoRestricted);
            }
            return AndroidUtilities.isBannedForever(chat.banned_rights) ? LocaleController.formatString("AttachVideoRestrictedForever", R.string.AttachVideoRestrictedForever, new Object[0]) : LocaleController.formatString("AttachVideoRestricted", R.string.AttachVideoRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date));
        }
        if (i == 19) {
            if (chat == null || isActionBannedByDefault(chat, i)) {
                return LocaleController.getString(R.string.GlobalAttachDocumentsRestricted);
            }
            return AndroidUtilities.isBannedForever(chat.banned_rights) ? LocaleController.formatString("AttachDocumentsRestrictedForever", R.string.AttachDocumentsRestrictedForever, new Object[0]) : LocaleController.formatString("AttachDocumentsRestricted", R.string.AttachDocumentsRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date));
        }
        if (i == 7) {
            if (chat == null || isActionBannedByDefault(chat, i)) {
                return LocaleController.getString(R.string.GlobalAttachMediaRestricted);
            }
            return AndroidUtilities.isBannedForever(chat.banned_rights) ? LocaleController.formatString("AttachMediaRestrictedForever", R.string.AttachMediaRestrictedForever, new Object[0]) : LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date));
        }
        if (i == 18) {
            if (chat == null || isActionBannedByDefault(chat, i)) {
                return LocaleController.getString(R.string.GlobalAttachAudioRestricted);
            }
            return AndroidUtilities.isBannedForever(chat.banned_rights) ? LocaleController.formatString("AttachAudioRestrictedForever", R.string.AttachAudioRestrictedForever, new Object[0]) : LocaleController.formatString("AttachAudioRestricted", R.string.AttachAudioRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date));
        }
        if (i == 22) {
            if (chat == null || isActionBannedByDefault(chat, i)) {
                return LocaleController.getString(R.string.GlobalAttachPlainRestricted);
            }
            return AndroidUtilities.isBannedForever(chat.banned_rights) ? LocaleController.formatString("AttachPlainRestrictedForever", R.string.AttachPlainRestrictedForever, new Object[0]) : LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date));
        }
        if (i == 21) {
            if (chat == null || isActionBannedByDefault(chat, i)) {
                return LocaleController.getString(R.string.GlobalAttachRoundRestricted);
            }
            return AndroidUtilities.isBannedForever(chat.banned_rights) ? LocaleController.formatString("AttachRoundRestrictedForever", R.string.AttachRoundRestrictedForever, new Object[0]) : LocaleController.formatString("AttachRoundRestricted", R.string.AttachRoundRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date));
        }
        if (i == 20) {
            if (chat == null || isActionBannedByDefault(chat, i)) {
                return LocaleController.getString(R.string.GlobalAttachVoiceRestricted);
            }
            return AndroidUtilities.isBannedForever(chat.banned_rights) ? LocaleController.formatString("AttachVoiceRestrictedForever", R.string.AttachVoiceRestrictedForever, new Object[0]) : LocaleController.formatString("AttachVoiceRestricted", R.string.AttachVoiceRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date));
        }
        return "";
    }

    public static class VideoParticipant {
        public float aspectRatio;
        public int aspectRatioFromHeight;
        public int aspectRatioFromWidth;
        public boolean hasSame;
        public TLRPC.GroupCallParticipant participant;
        public boolean presentation;

        public VideoParticipant(TLRPC.GroupCallParticipant groupCallParticipant, boolean z, boolean z2) {
            this.participant = groupCallParticipant;
            this.presentation = z;
            this.hasSame = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                VideoParticipant videoParticipant = (VideoParticipant) obj;
                if (this.presentation == videoParticipant.presentation && MessageObject.getPeerId(this.participant.peer) == MessageObject.getPeerId(videoParticipant.participant.peer)) {
                    return true;
                }
            }
            return false;
        }

        public void setAspectRatio(int i, int i2, Call call) {
            this.aspectRatioFromWidth = i;
            this.aspectRatioFromHeight = i2;
            setAspectRatio(i / i2, call);
        }

        private void setAspectRatio(float f, Call call) {
            if (this.aspectRatio != f) {
                this.aspectRatio = f;
                if (GroupCallActivity.isLandscapeMode || call.visibleVideoParticipants.size() % 2 != 1) {
                    return;
                }
                call.updateVisibleParticipants();
            }
        }
    }

    public static int getColorId(TLRPC.Chat chat) {
        if (chat == null) {
            return 0;
        }
        TLRPC.PeerColor peerColor = chat.color;
        if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0) {
            return peerColor.color;
        }
        return (int) (chat.id % 7);
    }

    public static long getEmojiId(TLRPC.Chat chat) {
        if (chat == null) {
            return 0L;
        }
        TLRPC.PeerColor peerColor = chat.color;
        if (!(peerColor instanceof TLRPC.TL_peerColor) || (peerColor.flags & 2) == 0) {
            return 0L;
        }
        return peerColor.background_emoji_id;
    }

    public static int getProfileColorId(TLRPC.Chat chat) {
        if (chat == null) {
            return 0;
        }
        TLRPC.PeerColor peerColor = chat.profile_color;
        if (!(peerColor instanceof TLRPC.TL_peerColor) || (peerColor.flags & 1) == 0) {
            return -1;
        }
        return peerColor.color;
    }

    public static long getProfileEmojiId(TLRPC.Chat chat) {
        if (chat != null) {
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                return ((TLRPC.TL_emojiStatusCollectible) emojiStatus).pattern_document_id;
            }
        }
        if (chat == null) {
            return 0L;
        }
        TLRPC.PeerColor peerColor = chat.profile_color;
        if (!(peerColor instanceof TLRPC.TL_peerColor) || (peerColor.flags & 2) == 0) {
            return 0L;
        }
        return peerColor.background_emoji_id;
    }

    public static long getOnlyProfileEmojiId(TLRPC.Chat chat) {
        if (chat == null) {
            return 0L;
        }
        TLRPC.PeerColor peerColor = chat.profile_color;
        if (!(peerColor instanceof TLRPC.TL_peerColor) || (peerColor.flags & 2) == 0) {
            return 0L;
        }
        return peerColor.background_emoji_id;
    }

    public static long getProfileCollectibleId(TLRPC.Chat chat) {
        if (chat == null) {
            return 0L;
        }
        TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            return ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id;
        }
        return 0L;
    }

    public static TL_account.RequirementToContact getRequirementToContact(TLRPC.Chat chat) {
        if (chat == null || chat.send_paid_messages_stars == 0) {
            return null;
        }
        TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = new TL_account.requirementToContactPaidMessages();
        requirementtocontactpaidmessages.stars_amount = chat.send_paid_messages_stars;
        return requirementtocontactpaidmessages;
    }

    public static boolean areTabsEnabled(TLRPC.Chat chat) {
        if (SharedConfig.forceForumTabs) {
            return true;
        }
        return chat != null && chat.forum_tabs;
    }
}
