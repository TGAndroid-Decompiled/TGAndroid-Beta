package org.telegram.messenger;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.j60;
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
        public a0.i participants = new a0.i();
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
        private Runnable typingUpdateRunnable = new t0(this, 0);
        private HashSet<Integer> loadingGuids = new HashSet<>();
        private ArrayList<TL_update.TL_updateGroupCallParticipants> updatesQueue = new ArrayList<>();
        private HashSet<Long> loadingUids = new HashSet<>();
        private HashSet<Long> loadingSsrcs = new HashSet<>();
        public final a0.i currentSpeakingPeers = new a0.i();
        private final Runnable updateCurrentSpeakingRunnable = new Runnable() {
            {
                Call.this = this;
            }

            @Override
            public void run() {
                long uptimeMillis = SystemClock.uptimeMillis();
                int i10 = 0;
                boolean z10 = false;
                while (i10 < Call.this.currentSpeakingPeers.m()) {
                    long j3 = Call.this.currentSpeakingPeers.j(i10);
                    if (uptimeMillis - ((TLRPC.GroupCallParticipant) Call.this.currentSpeakingPeers.f(j3)).lastSpeakTime >= 500) {
                        Call.this.currentSpeakingPeers.l(j3);
                        String str = null;
                        if (j3 > 0) {
                            TLRPC.User user = MessagesController.getInstance(Call.this.currentAccount.getCurrentAccount()).getUser(Long.valueOf(j3));
                            StringBuilder t10 = a4.a.t(j3, "remove from speaking ", " ");
                            if (user != null) {
                                str = user.first_name;
                            }
                            t10.append(str);
                            Log.d("GroupCall", t10.toString());
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(Call.this.currentAccount.getCurrentAccount()).getChat(Long.valueOf(-j3));
                            StringBuilder t11 = a4.a.t(j3, "remove from speaking ", " ");
                            if (chat != null) {
                                str = chat.title;
                            }
                            t11.append(str);
                            Log.d("GroupCall", t11.toString());
                        }
                        i10--;
                        z10 = true;
                    }
                    i10++;
                }
                if (Call.this.currentSpeakingPeers.m() > 0) {
                    AndroidUtilities.runOnUIThread(Call.this.updateCurrentSpeakingRunnable, 550L);
                }
                if (z10) {
                    Call.this.currentAccount.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallSpeakingUsersUpdated, Long.valueOf(Call.this.chatId), Long.valueOf(Call.this.call.f19879id), Boolean.FALSE);
                }
            }
        };

        public static class InvitedUser {
            public boolean calling;
            public int msg_id;
            public long startTime;

            public static InvitedUser make(int i10) {
                InvitedUser invitedUser = new InvitedUser();
                invitedUser.msg_id = i10;
                invitedUser.calling = true;
                invitedUser.startTime = System.currentTimeMillis();
                return invitedUser;
            }

            public boolean isCalling() {
                if (this.calling && (System.currentTimeMillis() - this.startTime) / 1000 <= MessagesController.getInstance(UserConfig.selectedAccount).callRingTimeout) {
                    return true;
                }
                return false;
            }
        }

        public interface OnParticipantsLoad {
            void onLoad(ArrayList<Long> arrayList);
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface RecordType {
        }

        private void checkOnlineParticipants() {
            if (this.typingUpdateRunnableScheduled) {
                AndroidUtilities.cancelRunOnUIThread(this.typingUpdateRunnable);
                this.typingUpdateRunnableScheduled = false;
            }
            this.speakingMembersCount = 0;
            int currentTime = this.currentAccount.getConnectionsManager().getCurrentTime();
            int size = this.sortedParticipants.size();
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.GroupCallParticipant groupCallParticipant = this.sortedParticipants.get(i11);
                int i12 = currentTime - groupCallParticipant.active_date;
                if (i12 < 5) {
                    this.speakingMembersCount++;
                    i10 = Math.min(i12, i10);
                }
                if (Math.max(groupCallParticipant.date, groupCallParticipant.active_date) <= currentTime - 5) {
                    break;
                }
            }
            if (i10 != Integer.MAX_VALUE) {
                AndroidUtilities.runOnUIThread(this.typingUpdateRunnable, i10 * 1000);
                this.typingUpdateRunnableScheduled = true;
            }
        }

        public void checkQueue() {
            this.checkQueueRunnable = null;
            if (this.updatesStartWaitTime != 0 && System.currentTimeMillis() - this.updatesStartWaitTime >= 1500) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("QUEUE GROUP CALL UPDATES WAIT TIMEOUT - CHECK QUEUE");
                }
                processUpdatesQueue();
            }
            if (!this.updatesQueue.isEmpty()) {
                t0 t0Var = new t0(this, 1);
                this.checkQueueRunnable = t0Var;
                AndroidUtilities.runOnUIThread(t0Var, 1000L);
            }
        }

        private long getSelfId() {
            TLRPC.Peer peer = this.selfPeer;
            if (peer != null) {
                return MessageObject.getPeerId(peer);
            }
            return this.currentAccount.getUserConfig().getClientUserId();
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
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i10);
                    TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup2 = tL_groupCallParticipantVideo2.source_groups.get(i10);
                    if (!TextUtils.equals(tL_groupCallParticipantVideoSourceGroup.semantics, tL_groupCallParticipantVideoSourceGroup2.semantics) || tL_groupCallParticipantVideoSourceGroup.sources.size() != tL_groupCallParticipantVideoSourceGroup2.sources.size()) {
                        return false;
                    }
                    int size2 = tL_groupCallParticipantVideoSourceGroup.sources.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (!tL_groupCallParticipantVideoSourceGroup2.sources.contains(tL_groupCallParticipantVideoSourceGroup.sources.get(i11))) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        private int isValidUpdate(TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants) {
            int i10 = this.call.version;
            int i11 = i10 + 1;
            int i12 = tL_updateGroupCallParticipants.version;
            if (i11 != i12 && i10 != i12) {
                if (i10 < i12) {
                    return 1;
                }
                return 2;
            }
            return 0;
        }

        public void lambda$createRtmpStreamParticipant$1() {
            this.currentAccount.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.f19879id), Boolean.FALSE);
        }

        public void lambda$loadGroupCall$10(TLObject tLObject) {
            this.lastGroupCallReloadTime = SystemClock.elapsedRealtime();
            this.loadingGroupCall = false;
            if (tLObject != null) {
                TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                this.currentAccount.getMessagesController().putUsers(groupparticipants.users, false);
                this.currentAccount.getMessagesController().putChats(groupparticipants.chats, false);
                TLRPC.GroupCall groupCall = this.call;
                int i10 = groupCall.participants_count;
                int i11 = groupparticipants.count;
                if (i10 != i11) {
                    groupCall.participants_count = i11;
                    if (BuildVars.LOGS_ENABLED) {
                        i2.g.o(this.call.participants_count, new StringBuilder("new participants reload count "));
                    }
                    this.currentAccount.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.f19879id), Boolean.FALSE);
                }
            }
        }

        public void lambda$loadGroupCall$11(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new x0(this, tLObject, 1));
        }

        public void lambda$loadMembers$2(boolean z10, TLObject tLObject, TL_phone.getGroupParticipants getgroupparticipants) {
            this.loadingMembers = false;
            if (z10) {
                this.reloadingMembers = false;
            }
            if (tLObject != null) {
                TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                this.currentAccount.getMessagesController().putUsers(groupparticipants.users, false);
                this.currentAccount.getMessagesController().putChats(groupparticipants.chats, false);
                onParticipantsLoad(groupparticipants.participants, z10, getgroupparticipants.offset, groupparticipants.next_offset, groupparticipants.version, groupparticipants.count);
            }
        }

        public void lambda$loadMembers$3(boolean z10, TL_phone.getGroupParticipants getgroupparticipants, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new uj(this, z10, tLObject, getgroupparticipants, 2));
        }

        public void lambda$loadUnknownParticipants$5(int i10, TLObject tLObject, OnParticipantsLoad onParticipantsLoad, ArrayList arrayList, HashSet hashSet) {
            if (!this.loadingGuids.remove(Integer.valueOf(i10))) {
                return;
            }
            if (tLObject != null) {
                TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                this.currentAccount.getMessagesController().putUsers(groupparticipants.users, false);
                this.currentAccount.getMessagesController().putChats(groupparticipants.chats, false);
                int size = groupparticipants.participants.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.GroupCallParticipant groupCallParticipant = groupparticipants.participants.get(i11);
                    long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.participants.f(peerId);
                    if (groupCallParticipant2 != null) {
                        this.sortedParticipants.remove(groupCallParticipant2);
                        processAllSources(groupCallParticipant2, false);
                    }
                    this.participants.k(groupCallParticipant, peerId);
                    this.sortedParticipants.add(groupCallParticipant);
                    processAllSources(groupCallParticipant, true);
                    if (this.invitedUsersMap.contains(Long.valueOf(peerId))) {
                        Long valueOf = Long.valueOf(peerId);
                        this.invitedUsersMap.remove(valueOf);
                        this.invitedUsers.remove(valueOf);
                    }
                }
                if (this.call.participants_count < this.participants.m()) {
                    this.call.participants_count = this.participants.m();
                }
                sortParticipants();
                this.currentAccount.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.f19879id), Boolean.FALSE);
                if (onParticipantsLoad != null) {
                    onParticipantsLoad.onLoad(arrayList);
                } else {
                    setParticiapantsVolume();
                }
            }
            hashSet.removeAll(arrayList);
        }

        public void lambda$loadUnknownParticipants$6(int i10, OnParticipantsLoad onParticipantsLoad, ArrayList arrayList, HashSet hashSet, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new bi.ia(this, i10, tLObject, onParticipantsLoad, arrayList, hashSet, 1));
        }

        public void lambda$new$0() {
            this.typingUpdateRunnableScheduled = false;
            checkOnlineParticipants();
            this.currentAccount.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallTypingsUpdated, new Object[0]);
        }

        public static int lambda$processUpdatesQueue$7(TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants, TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants2) {
            return AndroidUtilities.compare(tL_updateGroupCallParticipants.version, tL_updateGroupCallParticipants2.version);
        }

        public void lambda$reloadGroupCall$8(TLObject tLObject) {
            if (tLObject instanceof TL_phone.groupCall) {
                TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                this.call = groupcall.call;
                this.currentAccount.getMessagesController().putUsers(groupcall.users, false);
                this.currentAccount.getMessagesController().putChats(groupcall.chats, false);
                ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
                String str = groupcall.participants_next_offset;
                TLRPC.GroupCall groupCall = groupcall.call;
                onParticipantsLoad(arrayList, true, "", str, groupCall.version, groupCall.participants_count);
            }
        }

        public void lambda$reloadGroupCall$9(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new x0(this, tLObject, 0));
        }

        public void lambda$setTitle$4(TLObject tLObject, TLRPC.TL_error tL_error) {
            if (tLObject != null) {
                this.currentAccount.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            }
        }

        public int lambda$sortParticipants$12(long j3, boolean z10, TLRPC.GroupCallParticipant groupCallParticipant, TLRPC.GroupCallParticipant groupCallParticipant2) {
            boolean z11;
            int i10;
            int i11 = groupCallParticipant.videoIndex;
            boolean z12 = false;
            if (i11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i12 = groupCallParticipant2.videoIndex;
            if (i12 > 0) {
                z12 = true;
            }
            if (z11 && z12) {
                return i12 - i11;
            }
            if (z11) {
                return -1;
            }
            if (z12) {
                return 1;
            }
            int i13 = groupCallParticipant.active_date;
            if (i13 != 0 && (i10 = groupCallParticipant2.active_date) != 0) {
                return Integer.compare(i10, i13);
            }
            if (i13 != 0) {
                return -1;
            }
            if (groupCallParticipant2.active_date != 0) {
                return 1;
            }
            if (MessageObject.getPeerId(groupCallParticipant.peer) == j3) {
                return -1;
            }
            if (MessageObject.getPeerId(groupCallParticipant2.peer) == j3) {
                return 1;
            }
            if (z10) {
                long j10 = groupCallParticipant.raise_hand_rating;
                if (j10 != 0) {
                    long j11 = groupCallParticipant2.raise_hand_rating;
                    if (j11 != 0) {
                        return Long.compare(j11, j10);
                    }
                }
                if (j10 != 0) {
                    return -1;
                }
                if (groupCallParticipant2.raise_hand_rating != 0) {
                    return 1;
                }
            }
            if (this.call.join_date_asc) {
                return Integer.compare(groupCallParticipant.date, groupCallParticipant2.date);
            }
            return Integer.compare(groupCallParticipant2.date, groupCallParticipant.date);
        }

        public void lambda$toggleRecord$13(TLObject tLObject, TLRPC.TL_error tL_error) {
            if (tLObject != null) {
                this.currentAccount.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            }
        }

        private void loadGroupCall() {
            if (!this.loadingGroupCall && SystemClock.elapsedRealtime() - this.lastGroupCallReloadTime >= 30000) {
                this.loadingGroupCall = true;
                TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
                getgroupparticipants.call = getInputGroupCall();
                getgroupparticipants.offset = "";
                getgroupparticipants.limit = 1;
                this.currentAccount.getConnectionsManager().sendRequest(getgroupparticipants, new v0(this, 0));
            }
        }

        private void loadUnknownParticipants(ArrayList<Long> arrayList, boolean z10, OnParticipantsLoad onParticipantsLoad) {
            HashSet<Long> hashSet;
            if (z10) {
                hashSet = this.loadingUids;
            } else {
                hashSet = this.loadingSsrcs;
            }
            HashSet<Long> hashSet2 = hashSet;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                if (hashSet2.contains(arrayList.get(i10))) {
                    arrayList.remove(i10);
                    i10--;
                    size--;
                }
                i10++;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            int i11 = this.lastLoadGuid + 1;
            this.lastLoadGuid = i11;
            this.loadingGuids.add(Integer.valueOf(i11));
            hashSet2.addAll(arrayList);
            TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
            getgroupparticipants.call = getInputGroupCall();
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                long longValue = arrayList.get(i12).longValue();
                if (z10) {
                    getgroupparticipants.ids.add(this.currentAccount.getMessagesController().getInputPeer(longValue));
                } else {
                    getgroupparticipants.sources.add(Integer.valueOf((int) longValue));
                }
            }
            getgroupparticipants.offset = "";
            getgroupparticipants.limit = 100;
            this.currentAccount.getConnectionsManager().sendRequest(getgroupparticipants, new bi.fa((Object) this, i11, (Object) onParticipantsLoad, (Object) arrayList, (Serializable) hashSet2, 2));
        }

        private void onParticipantsLoad(ArrayList<TLRPC.GroupCallParticipant> arrayList, boolean z10, String str, String str2, int i10, int i11) {
            TLRPC.GroupCallParticipant groupCallParticipant;
            TLRPC.GroupCallParticipant groupCallParticipant2;
            this.participantsReceivedTime = System.currentTimeMillis();
            TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) this.participants.f(getSelfId());
            a0.i iVar = null;
            if (TextUtils.isEmpty(str)) {
                if (this.participants.m() != 0) {
                    iVar = this.participants;
                    this.participants = new a0.i();
                } else {
                    this.participants.b();
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
                groupCall.version = i10;
                groupCall.participants_count = i11;
                if (BuildVars.LOGS_ENABLED) {
                    i2.g.o(this.call.participants_count, new StringBuilder("new participants count "));
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.currentAccount.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.applyGroupCallVisibleParticipants, Long.valueOf(elapsedRealtime));
            int size = arrayList.size();
            boolean z11 = false;
            for (int i12 = 0; i12 <= size; i12++) {
                if (i12 == size) {
                    if (z10 && groupCallParticipant3 != null && !z11) {
                        groupCallParticipant = groupCallParticipant3;
                    }
                } else {
                    groupCallParticipant = arrayList.get(i12);
                    if (groupCallParticipant.self) {
                        z11 = true;
                    }
                }
                TLRPC.GroupCallParticipant groupCallParticipant4 = (TLRPC.GroupCallParticipant) this.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                if (groupCallParticipant4 != null) {
                    this.sortedParticipants.remove(groupCallParticipant4);
                    processAllSources(groupCallParticipant4, false);
                    if (groupCallParticipant4.self) {
                        groupCallParticipant.lastTypingDate = groupCallParticipant4.active_date;
                    } else {
                        groupCallParticipant.lastTypingDate = Math.max(groupCallParticipant.active_date, groupCallParticipant4.active_date);
                    }
                    if (elapsedRealtime != groupCallParticipant.lastVisibleDate) {
                        groupCallParticipant.active_date = groupCallParticipant.lastTypingDate;
                    }
                } else if (iVar != null && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) iVar.f(MessageObject.getPeerId(groupCallParticipant.peer))) != null) {
                    if (groupCallParticipant2.self) {
                        groupCallParticipant.lastTypingDate = groupCallParticipant2.active_date;
                    } else {
                        groupCallParticipant.lastTypingDate = Math.max(groupCallParticipant.active_date, groupCallParticipant2.active_date);
                    }
                    if (elapsedRealtime != groupCallParticipant.lastVisibleDate) {
                        groupCallParticipant.active_date = groupCallParticipant.lastTypingDate;
                    } else {
                        groupCallParticipant.active_date = groupCallParticipant2.active_date;
                    }
                }
                this.participants.k(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer));
                this.sortedParticipants.add(groupCallParticipant);
                processAllSources(groupCallParticipant, true);
            }
            if (this.call.participants_count < this.participants.m()) {
                this.call.participants_count = this.participants.m();
            }
            sortParticipants();
            this.currentAccount.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.f19879id), Boolean.FALSE);
            setParticiapantsVolume();
        }

        private void processAllSources(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10) {
            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
            SparseArray<TLRPC.GroupCallParticipant> sparseArray;
            int i10;
            int i11 = groupCallParticipant.source;
            if (i11 != 0) {
                if (z10) {
                    this.participantsBySources.put(i11, groupCallParticipant);
                } else {
                    this.participantsBySources.remove(i11);
                }
            }
            for (int i12 = 0; i12 < 2; i12++) {
                if (i12 == 0) {
                    tL_groupCallParticipantVideo = groupCallParticipant.video;
                } else {
                    tL_groupCallParticipantVideo = groupCallParticipant.presentation;
                }
                if (tL_groupCallParticipantVideo != null) {
                    if ((2 & tL_groupCallParticipantVideo.flags) != 0 && (i10 = tL_groupCallParticipantVideo.audio_source) != 0) {
                        if (z10) {
                            this.participantsBySources.put(i10, groupCallParticipant);
                        } else {
                            this.participantsBySources.remove(i10);
                        }
                    }
                    if (i12 == 0) {
                        sparseArray = this.participantsByVideoSources;
                    } else {
                        sparseArray = this.participantsByPresentationSources;
                    }
                    int size = tL_groupCallParticipantVideo.source_groups.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i13);
                        int size2 = tL_groupCallParticipantVideoSourceGroup.sources.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            int intValue = tL_groupCallParticipantVideoSourceGroup.sources.get(i14).intValue();
                            if (z10) {
                                sparseArray.put(intValue, groupCallParticipant);
                            } else {
                                sparseArray.remove(intValue);
                            }
                        }
                    }
                    if (z10) {
                        if (i12 == 0) {
                            groupCallParticipant.videoEndpoint = tL_groupCallParticipantVideo.endpoint;
                        } else {
                            groupCallParticipant.presentationEndpoint = tL_groupCallParticipantVideo.endpoint;
                        }
                    } else if (i12 == 0) {
                        groupCallParticipant.videoEndpoint = null;
                    } else {
                        groupCallParticipant.presentationEndpoint = null;
                    }
                }
            }
        }

        private void processUpdatesQueue() {
            Collections.sort(this.updatesQueue, new d(2));
            ArrayList<TL_update.TL_updateGroupCallParticipants> arrayList = this.updatesQueue;
            if (arrayList != null && !arrayList.isEmpty()) {
                boolean z10 = false;
                while (this.updatesQueue.size() > 0) {
                    TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = this.updatesQueue.get(0);
                    int isValidUpdate = isValidUpdate(tL_updateGroupCallParticipants);
                    if (isValidUpdate == 0) {
                        processParticipantsUpdate(tL_updateGroupCallParticipants, true);
                        this.updatesQueue.remove(0);
                        z10 = true;
                    } else if (isValidUpdate == 1) {
                        if (this.updatesStartWaitTime != 0 && (z10 || Math.abs(System.currentTimeMillis() - this.updatesStartWaitTime) <= 1500)) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("HOLE IN GROUP CALL UPDATES QUEUE - will wait more time");
                            }
                            if (z10) {
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
                    } else {
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

        private void setParticiapantsVolume() {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null && sharedInstance.getAccount() == this.currentAccount.getCurrentAccount() && sharedInstance.getChat() != null && sharedInstance.getChat().f19869id == (-this.chatId)) {
                sharedInstance.setParticipantsVolume();
            }
        }

        public static boolean videoIsActive(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10, Call call) {
            VoIPService sharedInstance;
            VideoParticipant videoParticipant;
            if (groupCallParticipant == null || (sharedInstance = VoIPService.getSharedInstance()) == null) {
                return false;
            }
            if (groupCallParticipant.self) {
                if (sharedInstance.getVideoState(z10) != 2) {
                    return false;
                }
                return true;
            }
            VideoParticipant videoParticipant2 = call.rtmpStreamParticipant;
            if ((videoParticipant2 != null && videoParticipant2.participant == groupCallParticipant) || (((videoParticipant = call.videoNotAvailableParticipant) != null && videoParticipant.participant == groupCallParticipant) || call.participants.f(MessageObject.getPeerId(groupCallParticipant.peer)) != null)) {
                if (z10) {
                    if (groupCallParticipant.presentation == null) {
                        return false;
                    }
                    return true;
                } else if (groupCallParticipant.video != null) {
                    return true;
                }
            }
            return false;
        }

        public void addInvitedUser(long j3) {
            if (this.participants.f(j3) == null && !this.invitedUsersMap.contains(Long.valueOf(j3))) {
                this.invitedUsersMap.add(Long.valueOf(j3));
                this.invitedUsers.add(Long.valueOf(j3));
                this.kickedUsers.remove(Long.valueOf(j3));
                sortParticipants();
                this.currentAccount.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.f19879id), Boolean.FALSE);
            }
        }

        public void addKickedUser(long j3) {
            if (this.kickedUsers.contains(Long.valueOf(j3))) {
                return;
            }
            this.kickedUsers.add(Long.valueOf(j3));
            sortParticipants();
            this.currentAccount.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.f19879id), Boolean.FALSE);
        }

        public void addSelfDummyParticipant(boolean z10) {
            boolean z11;
            long selfId = getSelfId();
            if (this.participants.h(selfId) < 0) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                tL_groupCallParticipant.peer = this.selfPeer;
                tL_groupCallParticipant.muted = true;
                tL_groupCallParticipant.self = true;
                tL_groupCallParticipant.video_joined = this.call.can_start_video;
                TLRPC.Chat chat = this.currentAccount.getMessagesController().getChat(Long.valueOf(this.chatId));
                if (this.call.join_muted && !ChatObject.canManageCalls(chat)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                tL_groupCallParticipant.can_self_unmute = z11;
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
                this.participants.k(tL_groupCallParticipant, selfId);
                this.sortedParticipants.add(tL_groupCallParticipant);
                sortParticipants();
                if (z10) {
                    this.currentAccount.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.f19879id), Boolean.FALSE);
                }
            }
        }

        public boolean canRecordVideo() {
            if (!this.canStreamVideo) {
                return false;
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if ((sharedInstance == null || sharedInstance.groupCall != this || (sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(true) != 2)) && this.activeVideos >= this.call.unmuted_video_limit) {
                return false;
            }
            return true;
        }

        public void clearVideFramesInfo() {
            for (int i10 = 0; i10 < this.sortedParticipants.size(); i10++) {
                this.sortedParticipants.get(i10).hasCameraFrame = 0;
                this.sortedParticipants.get(i10).hasPresentationFrame = 0;
                this.sortedParticipants.get(i10).videoIndex = 0;
            }
            sortParticipants();
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

        public void createRtmpStreamParticipant(List<TL_phone.TL_groupCallStreamChannel> list) {
            TLRPC.GroupCallParticipant tL_groupCallParticipant;
            if (this.loadedRtmpStreamParticipant && this.rtmpStreamParticipant != null) {
                return;
            }
            VideoParticipant videoParticipant = this.rtmpStreamParticipant;
            if (videoParticipant != null) {
                tL_groupCallParticipant = videoParticipant.participant;
            } else {
                tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
            }
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            tL_groupCallParticipant.peer = tL_peerChat;
            tL_peerChat.channel_id = this.chatId;
            tL_groupCallParticipant.video = new TLRPC.TL_groupCallParticipantVideo();
            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
            tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
            for (TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel : list) {
                tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
            }
            tL_groupCallParticipant.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
            tL_groupCallParticipant.video.endpoint = "unified";
            tL_groupCallParticipant.videoEndpoint = "unified";
            this.rtmpStreamParticipant = new VideoParticipant(tL_groupCallParticipant, false, false);
            sortParticipants();
            AndroidUtilities.runOnUIThread(new t0(this, 2));
        }

        public TLRPC.InputGroupCall getInputGroupCall() {
            return getInputGroupCall(this.isConference);
        }

        public boolean isScheduled() {
            if ((this.call.flags & 128) != 0) {
                return true;
            }
            return false;
        }

        public void loadMembers(boolean z10) {
            int i10;
            if (z10) {
                if (!this.reloadingMembers) {
                    this.membersLoadEndReached = false;
                    this.nextLoadOffset = null;
                } else {
                    return;
                }
            }
            if (!this.membersLoadEndReached && this.sortedParticipants.size() <= 5000) {
                if (z10) {
                    this.reloadingMembers = true;
                }
                this.loadingMembers = true;
                TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
                getgroupparticipants.call = getInputGroupCall();
                String str = this.nextLoadOffset;
                if (str == null) {
                    str = "";
                }
                getgroupparticipants.offset = str;
                if (this.isConference) {
                    i10 = this.currentAccount.getMessagesController().conferenceCallSizeLimit;
                } else {
                    i10 = 20;
                }
                getgroupparticipants.limit = i10;
                this.currentAccount.getConnectionsManager().sendRequest(getgroupparticipants, new u0(this, z10, getgroupparticipants, 0));
            }
        }

        public void migrateToChat(TLRPC.Chat chat) {
            this.chatId = chat.f19869id;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null && sharedInstance.getAccount() == this.currentAccount.getCurrentAccount() && sharedInstance.getChat() != null && sharedInstance.getChat().f19869id == (-this.chatId)) {
                sharedInstance.migrateToChat(chat);
            }
        }

        public void processGroupCallUpdate(TL_update.TL_updateGroupCall tL_updateGroupCall) {
            processGroupCallUpdate(tL_updateGroupCall.call);
        }

        public void processParticipantsUpdate(org.telegram.tgnet.tl.TL_update.TL_updateGroupCallParticipants r31, boolean r32) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ChatObject.Call.processParticipantsUpdate(org.telegram.tgnet.tl.TL_update$TL_updateGroupCallParticipants, boolean):void");
        }

        public void processTypingsUpdate(AccountInstance accountInstance, ArrayList<Long> arrayList, int i10) {
            this.currentAccount.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.applyGroupCallVisibleParticipants, Long.valueOf(SystemClock.elapsedRealtime()));
            int size = arrayList.size();
            ArrayList<Long> arrayList2 = null;
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                Long l4 = arrayList.get(i11);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.participants.f(l4.longValue());
                if (groupCallParticipant != null) {
                    if (i10 - groupCallParticipant.lastTypingDate > 10) {
                        if (groupCallParticipant.lastVisibleDate != i10) {
                            groupCallParticipant.active_date = i10;
                        }
                        groupCallParticipant.lastTypingDate = i10;
                        z10 = true;
                    }
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    arrayList2.add(l4);
                }
            }
            if (arrayList2 != null) {
                loadUnknownParticipants(arrayList2, true, null);
            }
            if (z10) {
                sortParticipants();
                this.currentAccount.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.f19879id), Boolean.FALSE);
            }
        }

        public void processUnknownVideoParticipants(int[] iArr, OnParticipantsLoad onParticipantsLoad) {
            ArrayList<Long> arrayList = null;
            for (int i10 = 0; i10 < iArr.length; i10++) {
                if (this.participantsBySources.get(iArr[i10]) == null && this.participantsByVideoSources.get(iArr[i10]) == null && this.participantsByPresentationSources.get(iArr[i10]) == null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(Long.valueOf(iArr[i10]));
                }
            }
            if (arrayList != null) {
                loadUnknownParticipants(arrayList, false, onParticipantsLoad);
            } else {
                onParticipantsLoad.onLoad(null);
            }
        }

        public void processVoiceLevelsUpdate(int[] iArr, float[] fArr, boolean[] zArr) {
            boolean z10;
            TLRPC.GroupCallParticipant groupCallParticipant;
            int i10;
            long j3;
            boolean z11;
            String str;
            String str2;
            String str3;
            String str4;
            int[] iArr2 = iArr;
            int currentTime = this.currentAccount.getConnectionsManager().getCurrentTime();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long uptimeMillis = SystemClock.uptimeMillis();
            this.currentAccount.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.applyGroupCallVisibleParticipants, Long.valueOf(elapsedRealtime));
            int i11 = 0;
            ArrayList<Long> arrayList = null;
            boolean z12 = false;
            boolean z13 = false;
            while (i11 < iArr2.length) {
                int i12 = iArr2[i11];
                if (i12 == 0) {
                    z10 = z12;
                    groupCallParticipant = (TLRPC.GroupCallParticipant) this.participants.f(getSelfId());
                } else {
                    z10 = z12;
                    groupCallParticipant = this.participantsBySources.get(i12);
                }
                if (groupCallParticipant != null) {
                    boolean z14 = zArr[i11];
                    groupCallParticipant.hasVoice = z14;
                    z11 = z13;
                    if (z14 || elapsedRealtime - groupCallParticipant.lastVoiceUpdateTime > 500) {
                        groupCallParticipant.hasVoiceDelayed = z14;
                        groupCallParticipant.lastVoiceUpdateTime = elapsedRealtime;
                    }
                    long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                    float f7 = fArr[i11];
                    if (f7 > 0.1f) {
                        if (zArr[i11] && groupCallParticipant.lastTypingDate + 1 < currentTime) {
                            j3 = elapsedRealtime;
                            if (j3 != groupCallParticipant.lastVisibleDate) {
                                groupCallParticipant.active_date = currentTime;
                            }
                            groupCallParticipant.lastTypingDate = currentTime;
                            z10 = true;
                        } else {
                            j3 = elapsedRealtime;
                        }
                        groupCallParticipant.lastSpeakTime = uptimeMillis;
                        groupCallParticipant.amplitude = f7;
                        if (this.currentSpeakingPeers.g(null, peerId) == null) {
                            if (peerId > 0) {
                                TLRPC.User user = MessagesController.getInstance(this.currentAccount.getCurrentAccount()).getUser(Long.valueOf(peerId));
                                StringBuilder t10 = a4.a.t(peerId, "add to current speaking ", " ");
                                if (user == null) {
                                    str4 = null;
                                } else {
                                    str4 = user.first_name;
                                }
                                t10.append(str4);
                                Log.d("GroupCall", t10.toString());
                                i10 = currentTime;
                            } else {
                                i10 = currentTime;
                                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount.getCurrentAccount()).getChat(Long.valueOf(-peerId));
                                StringBuilder t11 = a4.a.t(peerId, "add to current speaking ", " ");
                                if (chat == null) {
                                    str3 = null;
                                } else {
                                    str3 = chat.title;
                                }
                                t11.append(str3);
                                Log.d("GroupCall", t11.toString());
                            }
                            this.currentSpeakingPeers.k(groupCallParticipant, peerId);
                            z12 = z10;
                            z13 = true;
                        } else {
                            i10 = currentTime;
                        }
                    } else {
                        i10 = currentTime;
                        j3 = elapsedRealtime;
                        if (uptimeMillis - groupCallParticipant.lastSpeakTime >= 500 && this.currentSpeakingPeers.g(null, peerId) != null) {
                            this.currentSpeakingPeers.l(peerId);
                            if (peerId > 0) {
                                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount.getCurrentAccount()).getUser(Long.valueOf(peerId));
                                StringBuilder t12 = a4.a.t(peerId, "remove from speaking ", " ");
                                if (user2 == null) {
                                    str2 = null;
                                } else {
                                    str2 = user2.first_name;
                                }
                                t12.append(str2);
                                Log.d("GroupCall", t12.toString());
                            } else {
                                TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount.getCurrentAccount()).getChat(Long.valueOf(-peerId));
                                StringBuilder t13 = a4.a.t(peerId, "remove from speaking ", " ");
                                if (chat2 == null) {
                                    str = null;
                                } else {
                                    str = chat2.title;
                                }
                                t13.append(str);
                                Log.d("GroupCall", t13.toString());
                            }
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        groupCallParticipant.amplitude = 0.0f;
                        z12 = z10;
                    }
                    i11++;
                    iArr2 = iArr;
                    currentTime = i10;
                    elapsedRealtime = j3;
                } else {
                    i10 = currentTime;
                    j3 = elapsedRealtime;
                    z11 = z13;
                    if (iArr[i11] != 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        arrayList.add(Long.valueOf(iArr[i11]));
                    }
                }
                z12 = z10;
                z13 = z11;
                i11++;
                iArr2 = iArr;
                currentTime = i10;
                elapsedRealtime = j3;
            }
            boolean z15 = z12;
            boolean z16 = z13;
            if (arrayList != null) {
                loadUnknownParticipants(arrayList, false, null);
            }
            if (z15) {
                sortParticipants();
                this.currentAccount.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.f19879id), Boolean.FALSE);
            }
            if (z16) {
                if (this.currentSpeakingPeers.m() > 0) {
                    AndroidUtilities.cancelRunOnUIThread(this.updateCurrentSpeakingRunnable);
                    AndroidUtilities.runOnUIThread(this.updateCurrentSpeakingRunnable, 550L);
                }
                this.currentAccount.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallSpeakingUsersUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.f19879id), Boolean.FALSE);
            }
        }

        public void reloadGroupCall() {
            TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
            getgroupcall.call = getInputGroupCall();
            getgroupcall.limit = 100;
            this.currentAccount.getConnectionsManager().sendRequest(getgroupcall, new v0(this, 1));
        }

        public void removeInvitedUser(long j3) {
            this.invitedUsersMap.remove(Long.valueOf(j3));
            this.invitedUsers.remove(Long.valueOf(j3));
            sortParticipants();
            this.currentAccount.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.f19879id), Boolean.FALSE);
        }

        public void saveActiveDates() {
            int size = this.sortedParticipants.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.GroupCallParticipant groupCallParticipant = this.sortedParticipants.get(i10);
                groupCallParticipant.lastActiveDate = groupCallParticipant.active_date;
            }
        }

        public void setCall(AccountInstance accountInstance, long j3, TLRPC.GroupCall groupCall) {
            this.chatId = j3;
            this.currentAccount = accountInstance;
            zf.d.a(this.call, groupCall);
            this.call = groupCall;
            this.recording = groupCall.record_start_date != 0;
            sortParticipants();
            loadMembers(true);
            createNoVideoParticipant();
            if (groupCall.rtmp_stream) {
                createRtmpStreamParticipant(Collections.EMPTY_LIST);
            }
        }

        public void setSelfPeer(TLRPC.InputPeer inputPeer) {
            if (inputPeer == null) {
                this.selfPeer = null;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
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

        public void setTitle(String str) {
            TL_phone.editGroupCallTitle editgroupcalltitle = new TL_phone.editGroupCallTitle();
            editgroupcalltitle.call = getInputGroupCall();
            editgroupcalltitle.title = str;
            this.currentAccount.getConnectionsManager().sendRequest(editgroupcalltitle, new v0(this, 2));
        }

        public boolean shouldShowPanel() {
            TLRPC.GroupCall groupCall = this.call;
            if (groupCall.participants_count <= 0 && !groupCall.rtmp_stream && !isScheduled()) {
                return false;
            }
            return true;
        }

        public void sortParticipants() {
            TLRPC.GroupCallParticipant groupCallParticipant;
            int i10;
            String str;
            int size;
            String str2;
            VideoParticipant videoParticipant;
            this.visibleVideoParticipants.clear();
            this.visibleParticipants.clear();
            TLRPC.Chat chat = this.currentAccount.getMessagesController().getChat(Long.valueOf(this.chatId));
            final boolean canManageCalls = ChatObject.canManageCalls(chat);
            VideoParticipant videoParticipant2 = this.rtmpStreamParticipant;
            if (videoParticipant2 != null) {
                this.visibleVideoParticipants.add(videoParticipant2);
            }
            final long selfId = getSelfId();
            VoIPService.getSharedInstance();
            TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.participants.f(selfId);
            this.canStreamVideo = true;
            int i11 = 0;
            this.activeVideos = 0;
            int i12 = 0;
            boolean z10 = false;
            while (i12 < this.sortedParticipants.size()) {
                TLRPC.GroupCallParticipant groupCallParticipant3 = this.sortedParticipants.get(i12);
                boolean videoIsActive = videoIsActive(groupCallParticipant3, false, this);
                boolean videoIsActive2 = videoIsActive(groupCallParticipant3, true, this);
                if (!groupCallParticipant3.self && (videoIsActive || videoIsActive2)) {
                    this.activeVideos++;
                }
                if (this.kickedUsers.contains(Long.valueOf(DialogObject.getPeerDialogId(groupCallParticipant3.peer)))) {
                    this.sortedParticipants.remove(i12);
                    i12--;
                }
                if (!videoIsActive && !videoIsActive2) {
                    if (groupCallParticipant3.self || !this.canStreamVideo || (groupCallParticipant3.video == null && groupCallParticipant3.presentation == null)) {
                        groupCallParticipant3.videoIndex = 0;
                    }
                } else {
                    if (this.canStreamVideo) {
                        if (groupCallParticipant3.videoIndex == 0) {
                            if (groupCallParticipant3.self) {
                                groupCallParticipant3.videoIndex = Integer.MAX_VALUE;
                            } else {
                                int i13 = videoPointer + 1;
                                videoPointer = i13;
                                groupCallParticipant3.videoIndex = i13;
                            }
                        }
                    } else {
                        groupCallParticipant3.videoIndex = 0;
                    }
                    z10 = true;
                }
                i12++;
            }
            try {
                Collections.sort(this.sortedParticipants, new Comparator() {
                    @Override
                    public final int compare(Object obj, Object obj2) {
                        int lambda$sortParticipants$12;
                        lambda$sortParticipants$12 = ChatObject.Call.this.lambda$sortParticipants$12(selfId, canManageCalls, (TLRPC.GroupCallParticipant) obj, (TLRPC.GroupCallParticipant) obj2);
                        return lambda$sortParticipants$12;
                    }
                });
            } catch (Exception unused) {
            }
            if (this.sortedParticipants.isEmpty()) {
                groupCallParticipant = null;
            } else {
                groupCallParticipant = (TLRPC.GroupCallParticipant) i2.g.h(1, this.sortedParticipants);
            }
            if ((videoIsActive(groupCallParticipant, false, this) || videoIsActive(groupCallParticipant, true, this)) && (i10 = this.call.unmuted_video_count) > this.activeVideos) {
                this.activeVideos = i10;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null && sharedInstance.groupCall == this && (sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(true) == 2)) {
                    this.activeVideos--;
                }
            }
            if (this.sortedParticipants.size() > 5000 && (!ChatObject.canManageCalls(chat) || groupCallParticipant.raise_hand_rating == 0)) {
                int size2 = this.sortedParticipants.size();
                for (int i14 = 5000; i14 < size2; i14++) {
                    TLRPC.GroupCallParticipant groupCallParticipant4 = this.sortedParticipants.get(5000);
                    if (groupCallParticipant4.raise_hand_rating == 0) {
                        processAllSources(groupCallParticipant4, false);
                        this.participants.l(MessageObject.getPeerId(groupCallParticipant4.peer));
                        this.sortedParticipants.remove(5000);
                    }
                }
            }
            checkOnlineParticipants();
            if (!this.canStreamVideo && z10 && (videoParticipant = this.videoNotAvailableParticipant) != null) {
                this.visibleVideoParticipants.add(videoParticipant);
            }
            int i15 = 0;
            for (int i16 = 0; i16 < this.sortedParticipants.size(); i16++) {
                TLRPC.GroupCallParticipant groupCallParticipant5 = this.sortedParticipants.get(i16);
                if (this.canStreamVideo && groupCallParticipant5.videoIndex != 0) {
                    if (!groupCallParticipant5.self && videoIsActive(groupCallParticipant5, true, this) && videoIsActive(groupCallParticipant5, false, this)) {
                        VideoParticipant videoParticipant3 = this.videoParticipantsCache.get(groupCallParticipant5.videoEndpoint);
                        if (videoParticipant3 == null) {
                            videoParticipant3 = new VideoParticipant(groupCallParticipant5, false, true);
                            this.videoParticipantsCache.put(groupCallParticipant5.videoEndpoint, videoParticipant3);
                        } else {
                            videoParticipant3.participant = groupCallParticipant5;
                            videoParticipant3.presentation = false;
                            videoParticipant3.hasSame = true;
                        }
                        VideoParticipant videoParticipant4 = this.videoParticipantsCache.get(groupCallParticipant5.presentationEndpoint);
                        if (videoParticipant4 == null) {
                            videoParticipant4 = new VideoParticipant(groupCallParticipant5, true, true);
                        } else {
                            videoParticipant4.participant = groupCallParticipant5;
                            videoParticipant4.presentation = true;
                            videoParticipant4.hasSame = true;
                        }
                        this.visibleVideoParticipants.add(videoParticipant3);
                        if (videoParticipant3.aspectRatio > 1.0f) {
                            i15 = this.visibleVideoParticipants.size() - 1;
                        }
                        this.visibleVideoParticipants.add(videoParticipant4);
                        if (videoParticipant4.aspectRatio > 1.0f) {
                            size = this.visibleVideoParticipants.size();
                            i15 = size - 1;
                        }
                    } else if (groupCallParticipant5.self) {
                        if (videoIsActive(groupCallParticipant5, true, this)) {
                            this.visibleVideoParticipants.add(new VideoParticipant(groupCallParticipant5, true, false));
                        }
                        if (videoIsActive(groupCallParticipant5, false, this)) {
                            this.visibleVideoParticipants.add(new VideoParticipant(groupCallParticipant5, false, false));
                        }
                    } else {
                        boolean videoIsActive3 = videoIsActive(groupCallParticipant5, true, this);
                        HashMap<String, VideoParticipant> hashMap = this.videoParticipantsCache;
                        if (videoIsActive3) {
                            str = groupCallParticipant5.presentationEndpoint;
                        } else {
                            str = groupCallParticipant5.videoEndpoint;
                        }
                        VideoParticipant videoParticipant5 = hashMap.get(str);
                        if (videoParticipant5 == null) {
                            videoParticipant5 = new VideoParticipant(groupCallParticipant5, videoIsActive3, false);
                            HashMap<String, VideoParticipant> hashMap2 = this.videoParticipantsCache;
                            if (videoIsActive3) {
                                str2 = groupCallParticipant5.presentationEndpoint;
                            } else {
                                str2 = groupCallParticipant5.videoEndpoint;
                            }
                            hashMap2.put(str2, videoParticipant5);
                        } else {
                            videoParticipant5.participant = groupCallParticipant5;
                            videoParticipant5.presentation = videoIsActive3;
                            videoParticipant5.hasSame = false;
                        }
                        this.visibleVideoParticipants.add(videoParticipant5);
                        if (videoParticipant5.aspectRatio > 1.0f) {
                            size = this.visibleVideoParticipants.size();
                            i15 = size - 1;
                        }
                    }
                } else {
                    this.visibleParticipants.add(groupCallParticipant5);
                }
            }
            ArrayList<TLRPC.GroupCallParticipant> arrayList = this.sortedParticipants;
            int size3 = arrayList.size();
            int i17 = 0;
            while (i17 < size3) {
                TLRPC.GroupCallParticipant groupCallParticipant6 = arrayList.get(i17);
                i17++;
                this.kickedUsers.remove(Long.valueOf(DialogObject.getPeerDialogId(groupCallParticipant6.peer)));
            }
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (this.call != null && sharedInstance2 != null && sharedInstance2.isConference() && sharedInstance2.groupCall == this) {
                ArrayList<TLRPC.GroupCallParticipant> arrayList2 = this.sortedParticipants;
                int size4 = arrayList2.size();
                int i18 = 0;
                while (i18 < size4) {
                    TLRPC.GroupCallParticipant groupCallParticipant7 = arrayList2.get(i18);
                    i18++;
                    sharedInstance2.conference.joiningBlockchainParticipants.remove(Long.valueOf(DialogObject.getPeerDialogId(groupCallParticipant7.peer)));
                }
                this.shadyLeftParticipants.clear();
                this.shadyLeftParticipants.addAll(sharedInstance2.conference.getShadyLeftParticipants(this.sortedParticipants));
                this.shadyJoinParticipants.clear();
                this.shadyJoinParticipants.addAll(sharedInstance2.conference.getShadyJoiningParticipants(this.sortedParticipants));
                ArrayList<TLRPC.GroupCallParticipant> arrayList3 = this.sortedParticipants;
                int size5 = arrayList3.size();
                while (i11 < size5) {
                    TLRPC.GroupCallParticipant groupCallParticipant8 = arrayList3.get(i11);
                    i11++;
                    long peerDialogId = DialogObject.getPeerDialogId(groupCallParticipant8.peer);
                    if (this.invitedUsersMap.contains(Long.valueOf(peerDialogId))) {
                        this.invitedUsersMap.remove(Long.valueOf(peerDialogId));
                        this.invitedUsers.remove(Long.valueOf(peerDialogId));
                    }
                }
            }
            if (!j60.F3 && this.visibleVideoParticipants.size() % 2 == 1) {
                this.visibleVideoParticipants.add(this.visibleVideoParticipants.remove(i15));
            }
        }

        public void toggleRecord(String str, int i10) {
            boolean z10;
            this.recording = !this.recording;
            TL_phone.toggleGroupCallRecord togglegroupcallrecord = new TL_phone.toggleGroupCallRecord();
            togglegroupcallrecord.call = getInputGroupCall();
            togglegroupcallrecord.start = this.recording;
            if (str != null) {
                togglegroupcallrecord.title = str;
                togglegroupcallrecord.flags |= 2;
            }
            if (i10 == 1 || i10 == 2) {
                togglegroupcallrecord.flags |= 4;
                togglegroupcallrecord.video = true;
                if (i10 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                togglegroupcallrecord.video_portrait = z10;
            }
            this.currentAccount.getConnectionsManager().sendRequest(togglegroupcallrecord, new v0(this, 3));
            this.currentAccount.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.f19879id), Boolean.FALSE);
        }

        public void updateVisibleParticipants() {
            sortParticipants();
            this.currentAccount.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.f19879id), Boolean.FALSE, 0L);
        }

        public TLRPC.InputGroupCall getInputGroupCall(boolean z10) {
            TLRPC.GroupCall groupCall = this.call;
            if (groupCall == null) {
                return null;
            }
            if (z10) {
                if (groupCall.invite_link == null) {
                    return null;
                }
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                tL_inputGroupCallSlug.slug = (String) org.telegram.ui.Cells.p6.g(1, Uri.parse(this.call.invite_link).getPathSegments());
                return tL_inputGroupCallSlug;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall2 = this.call;
            tL_inputGroupCall.f19886id = groupCall2.f19879id;
            tL_inputGroupCall.access_hash = groupCall2.access_hash;
            return tL_inputGroupCall;
        }

        public void processGroupCallUpdate(TLRPC.GroupCall groupCall) {
            if (this.call.version < groupCall.version) {
                this.nextLoadOffset = null;
                loadMembers(true);
            }
            zf.d.a(this.call, groupCall);
            this.call = groupCall;
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.participants.f(getSelfId());
            this.recording = this.call.record_start_date != 0;
            this.currentAccount.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(this.chatId), Long.valueOf(this.call.f19879id), Boolean.FALSE);
        }

        public void setCall(AccountInstance accountInstance, long j3, TL_phone.groupCall groupcall) {
            this.chatId = j3;
            this.currentAccount = accountInstance;
            TLRPC.GroupCall groupCall = this.call;
            TLRPC.GroupCall groupCall2 = groupcall.call;
            zf.d.a(groupCall, groupCall2);
            this.call = groupCall2;
            int i10 = groupCall2.record_start_date;
            this.recording = i10 != 0;
            int size = groupcall.participants.size();
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.GroupCallParticipant groupCallParticipant = groupcall.participants.get(i12);
                this.participants.k(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer));
                this.sortedParticipants.add(groupCallParticipant);
                processAllSources(groupCallParticipant, true);
                i11 = Math.min(i11, groupCallParticipant.date);
            }
            sortParticipants();
            this.nextLoadOffset = groupcall.participants_next_offset;
            loadMembers(true);
            createNoVideoParticipant();
            if (this.call.rtmp_stream) {
                createRtmpStreamParticipant(Collections.EMPTY_LIST);
            }
        }
    }

    public static boolean areTabsEnabled(TLRPC.Chat chat) {
        if (!SharedConfig.forceForumTabs) {
            if (chat == null || !chat.forum_tabs) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean canAddAdmins(TLRPC.Chat chat) {
        return canUserDoAction(chat, 4);
    }

    public static boolean canAddBotsToChat(TLRPC.Chat chat) {
        if (isChannel(chat)) {
            if (chat.megagroup) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
                if ((tL_chatAdminRights != null && (tL_chatAdminRights.post_messages || tL_chatAdminRights.add_admins)) || chat.creator) {
                    return true;
                }
                return false;
            }
            return false;
        } else if (chat.migrated_to == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean canAddChatToCommunity(TLRPC.Chat chat) {
        return canUserDoAction(chat, 27);
    }

    public static boolean canAddUsers(TLRPC.Chat chat) {
        return canUserDoAction(chat, 3);
    }

    public static boolean canBlockUsers(TLRPC.Chat chat) {
        return canUserDoAction(chat, 2);
    }

    public static boolean canChangeChatInfo(TLRPC.Chat chat) {
        return canUserDoAction(chat, 1);
    }

    public static boolean canCreateTopic(TLRPC.Chat chat) {
        return canUserDoAction(chat, 15);
    }

    public static boolean canDeleteTopic(int i10, TLRPC.Chat chat, long j3) {
        return (j3 == 1 || chat == null || !canDeleteTopic(i10, chat, MessagesController.getInstance(i10).getTopicsController().findTopic(chat.f19869id, j3))) ? false : true;
    }

    public static boolean canManageCalls(TLRPC.Chat chat) {
        return canUserDoAction(chat, 14);
    }

    public static boolean canManageMonoForum(int i10, long j3) {
        return canUserDoChannelDirectAdminAction(i10, j3, 24);
    }

    public static boolean canManageMyTag(TLRPC.Chat chat) {
        boolean z10;
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
            z10 = tL_chatBannedRights2.edit_rank;
        } else {
            z10 = tL_chatBannedRights.edit_rank;
        }
        return !z10;
    }

    public static boolean canManageTags(TLRPC.Chat chat) {
        return canUserDoAction(chat, 25);
    }

    public static boolean canManageTopic(int i10, TLRPC.Chat chat, TLRPC.TL_forumTopic tL_forumTopic) {
        return canManageTopics(chat) || isMyTopic(i10, tL_forumTopic);
    }

    public static boolean canManageTopics(TLRPC.Chat chat) {
        return canUserDoAdminAction(chat, 15);
    }

    public static boolean canPinMessages(TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (!canUserDoAction(chat, 0)) {
            if (!isChannel(chat) || chat.megagroup || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.edit_messages) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean canPost(TLRPC.Chat chat) {
        return canUserDoAction(chat, 5);
    }

    public static boolean canRemoveBotFromCommunity(TLRPC.User user, TLRPC.Chat chat) {
        if (user != null && chat != null) {
            if ((user.bot && user.bot_can_edit) || canUserDoAdminAction(chat, 27)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean canRemoveChatFromCommunity(TLRPC.Chat chat, TLRPC.Chat chat2) {
        if (chat != null && chat2 != null) {
            if (chat.creator || canUserDoAdminAction(chat2, 27)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean canSendAnyMedia(TLRPC.Chat chat) {
        if (!canSendPhoto(chat) && !canSendVideo(chat) && !canSendRoundVideo(chat) && !canSendVoice(chat) && !canSendDocument(chat) && !canSendMusic(chat) && !canSendStickers(chat)) {
            return false;
        }
        return true;
    }

    public static boolean canSendAsPeers(TLRPC.Chat chat) {
        if (isChannel(chat)) {
            if (chat.megagroup || !chat.signatures || !hasAdminRights(chat) || !canWriteToChat(chat)) {
                if (chat.megagroup) {
                    if (isPublic(chat) || chat.has_geo || chat.has_link) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean canSendDocument(TLRPC.Chat chat) {
        if (isIgnoredChatRestrictionsForBoosters(chat)) {
            return true;
        }
        return canUserDoAction(chat, 19);
    }

    public static boolean canSendEmbed(TLRPC.Chat chat) {
        if (isIgnoredChatRestrictionsForBoosters(chat)) {
            return true;
        }
        return canUserDoAction(chat, 9);
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

    public static boolean canSendMusic(TLRPC.Chat chat) {
        if (isIgnoredChatRestrictionsForBoosters(chat)) {
            return true;
        }
        return canUserDoAction(chat, 18);
    }

    public static boolean canSendPhoto(TLRPC.Chat chat) {
        if (isIgnoredChatRestrictionsForBoosters(chat)) {
            return true;
        }
        return canUserDoAction(chat, 16);
    }

    public static boolean canSendPlain(TLRPC.Chat chat) {
        if (isIgnoredChatRestrictionsForBoosters(chat)) {
            return true;
        }
        return canUserDoAction(chat, 22);
    }

    public static boolean canSendPolls(TLRPC.Chat chat) {
        if (!isMonoForum(chat)) {
            if (isIgnoredChatRestrictionsForBoosters(chat)) {
                return true;
            }
            return canUserDoAction(chat, 10);
        }
        return false;
    }

    public static boolean canSendRoundVideo(TLRPC.Chat chat) {
        if (isIgnoredChatRestrictionsForBoosters(chat)) {
            return true;
        }
        return canUserDoAction(chat, 21);
    }

    public static boolean canSendStickers(TLRPC.Chat chat) {
        if (isIgnoredChatRestrictionsForBoosters(chat)) {
            return true;
        }
        return canUserDoAction(chat, 8);
    }

    public static boolean canSendVideo(TLRPC.Chat chat) {
        if (isIgnoredChatRestrictionsForBoosters(chat)) {
            return true;
        }
        return canUserDoAction(chat, 17);
    }

    public static boolean canSendVoice(TLRPC.Chat chat) {
        if (isIgnoredChatRestrictionsForBoosters(chat)) {
            return true;
        }
        return canUserDoAction(chat, 20);
    }

    public static boolean canUserDoAction(TLRPC.Chat chat, TLRPC.ChannelParticipant channelParticipant, int i10) {
        if (chat == null) {
            return true;
        }
        if (channelParticipant == null) {
            return false;
        }
        if (canUserDoAdminAction(channelParticipant.admin_rights, i10)) {
            return true;
        }
        if (!getBannedRight(channelParticipant.banned_rights, i10) && isBannableAction(i10)) {
            if (channelParticipant.admin_rights != null && !isAdminAction(i10)) {
                return true;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
            if (tL_chatBannedRights == null && ((chat instanceof TLRPC.TL_chat_layer92) || (chat instanceof TLRPC.TL_chat_old) || (chat instanceof TLRPC.TL_chat_old2) || (chat instanceof TLRPC.TL_channel_layer92) || (chat instanceof TLRPC.TL_channel_layer77) || (chat instanceof TLRPC.TL_channel_layer72) || (chat instanceof TLRPC.TL_channel_layer67) || (chat instanceof TLRPC.TL_channel_layer48) || (chat instanceof TLRPC.TL_channel_old))) {
                return true;
            }
            if (tL_chatBannedRights != null && !getBannedRight(tL_chatBannedRights, i10)) {
                return true;
            }
        }
        return false;
    }

    public static boolean canUserDoAdminAction(TLRPC.TL_chatAdminRights tL_chatAdminRights, int i10) {
        boolean z10;
        if (tL_chatAdminRights != null) {
            if (i10 == 0) {
                z10 = tL_chatAdminRights.pin_messages;
            } else if (i10 == 1) {
                z10 = tL_chatAdminRights.change_info;
            } else if (i10 == 2) {
                z10 = tL_chatAdminRights.ban_users;
            } else if (i10 == 3) {
                z10 = tL_chatAdminRights.invite_users;
            } else if (i10 == 4) {
                z10 = tL_chatAdminRights.add_admins;
            } else if (i10 == 5) {
                z10 = tL_chatAdminRights.post_messages;
            } else if (i10 != 27) {
                switch (i10) {
                    case 12:
                        z10 = tL_chatAdminRights.edit_messages;
                        break;
                    case 13:
                        z10 = tL_chatAdminRights.delete_messages;
                        break;
                    case 14:
                        z10 = tL_chatAdminRights.manage_call;
                        break;
                    case 15:
                        z10 = tL_chatAdminRights.manage_topics;
                        break;
                    default:
                        z10 = false;
                        break;
                }
            } else {
                z10 = tL_chatAdminRights.manage_linked_peers;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public static boolean canUserDoChannelDirectAdminAction(int i10, long j3, int i11) {
        return canUserDoAdminAction(getChannelDirectChatInternal(i10, j3), i11);
    }

    public static boolean canWriteToChat(TLRPC.Chat chat) {
        if (isChannel(chat) && !chat.creator) {
            TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
            if (tL_chatAdminRights == null || !tL_chatAdminRights.post_messages) {
                if (chat.broadcast || chat.gigagroup) {
                    if (!chat.gigagroup || !hasAdminRights(chat)) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static String getAllowedSendString(TLRPC.Chat chat) {
        StringBuilder sb2 = new StringBuilder();
        if (canSendPhoto(chat)) {
            sb2.append(LocaleController.getString(R.string.SendMediaPermissionPhotos));
        }
        if (canSendVideo(chat)) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(LocaleController.getString(R.string.SendMediaPermissionVideos));
        }
        if (canSendStickers(chat)) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(LocaleController.getString(R.string.SendMediaPermissionStickersGifs));
        }
        if (canSendMusic(chat)) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(LocaleController.getString(R.string.SendMediaPermissionMusic));
        }
        if (canSendDocument(chat)) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(LocaleController.getString(R.string.SendMediaPermissionFiles));
        }
        if (canSendVoice(chat)) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(LocaleController.getString(R.string.SendMediaPermissionVoice));
        }
        if (canSendRoundVideo(chat)) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(LocaleController.getString(R.string.SendMediaPermissionRound));
        }
        if (canSendEmbed(chat)) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(LocaleController.getString(R.string.SendMediaEmbededLinks));
        }
        return sb2.toString();
    }

    private static boolean getBannedRight(TLRPC.TL_chatBannedRights tL_chatBannedRights, int i10) {
        if (tL_chatBannedRights == null) {
            return false;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 26) {
                        if (i10 != 27) {
                            switch (i10) {
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
                                    switch (i10) {
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
                    return tL_chatBannedRights.send_reactions;
                }
                return tL_chatBannedRights.invite_users;
            }
            return tL_chatBannedRights.change_info;
        }
        return tL_chatBannedRights.pin_messages;
    }

    public static String getBannedRightsString(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        StringBuilder u10 = a4.a.u("" + (tL_chatBannedRights.view_messages ? 1 : 0));
        u10.append(tL_chatBannedRights.send_messages ? 1 : 0);
        StringBuilder u11 = a4.a.u(u10.toString());
        u11.append(tL_chatBannedRights.send_media ? 1 : 0);
        StringBuilder u12 = a4.a.u(u11.toString());
        u12.append(tL_chatBannedRights.send_stickers ? 1 : 0);
        StringBuilder u13 = a4.a.u(u12.toString());
        u13.append(tL_chatBannedRights.send_gifs ? 1 : 0);
        StringBuilder u14 = a4.a.u(u13.toString());
        u14.append(tL_chatBannedRights.send_games ? 1 : 0);
        StringBuilder u15 = a4.a.u(u14.toString());
        u15.append(tL_chatBannedRights.send_inline ? 1 : 0);
        StringBuilder u16 = a4.a.u(u15.toString());
        u16.append(tL_chatBannedRights.embed_links ? 1 : 0);
        StringBuilder u17 = a4.a.u(u16.toString());
        u17.append(tL_chatBannedRights.send_polls ? 1 : 0);
        StringBuilder u18 = a4.a.u(u17.toString());
        u18.append(tL_chatBannedRights.invite_users ? 1 : 0);
        StringBuilder u19 = a4.a.u(u18.toString());
        u19.append(tL_chatBannedRights.change_info ? 1 : 0);
        StringBuilder u20 = a4.a.u(u19.toString());
        u20.append(tL_chatBannedRights.pin_messages ? 1 : 0);
        StringBuilder u21 = a4.a.u(u20.toString());
        u21.append(tL_chatBannedRights.manage_topics ? 1 : 0);
        StringBuilder u22 = a4.a.u(u21.toString());
        u22.append(tL_chatBannedRights.send_photos ? 1 : 0);
        StringBuilder u23 = a4.a.u(u22.toString());
        u23.append(tL_chatBannedRights.send_videos ? 1 : 0);
        StringBuilder u24 = a4.a.u(u23.toString());
        u24.append(tL_chatBannedRights.send_roundvideos ? 1 : 0);
        StringBuilder u25 = a4.a.u(u24.toString());
        u25.append(tL_chatBannedRights.send_voices ? 1 : 0);
        StringBuilder u26 = a4.a.u(u25.toString());
        u26.append(tL_chatBannedRights.send_audios ? 1 : 0);
        StringBuilder u27 = a4.a.u(u26.toString());
        u27.append(tL_chatBannedRights.send_docs ? 1 : 0);
        StringBuilder u28 = a4.a.u(u27.toString());
        u28.append(tL_chatBannedRights.send_plain ? 1 : 0);
        StringBuilder u29 = a4.a.u(u28.toString());
        u29.append(tL_chatBannedRights.edit_rank ? 1 : 0);
        StringBuilder u30 = a4.a.u(u29.toString());
        u30.append(tL_chatBannedRights.send_reactions ? 1 : 0);
        StringBuilder u31 = a4.a.u(u30.toString());
        u31.append(tL_chatBannedRights.manage_linked_peers ? 1 : 0);
        StringBuilder u32 = a4.a.u(u31.toString());
        u32.append(tL_chatBannedRights.until_date);
        return u32.toString();
    }

    private static TLRPC.Chat getChannelDirectChatInternal(int i10, long j3) {
        return getChannelDirectChatInternal(i10, MessagesController.getInstance(i10).getChat(Long.valueOf(-j3)));
    }

    public static int getColorId(TLRPC.Chat chat) {
        if (chat == null) {
            return 0;
        }
        TLRPC.PeerColor peerColor = chat.color;
        if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0) {
            return peerColor.color;
        }
        return (int) (chat.f19869id % 7);
    }

    public static long getEmojiId(TLRPC.Chat chat) {
        if (chat != null) {
            TLRPC.PeerColor peerColor = chat.color;
            if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 2) != 0) {
                return peerColor.background_emoji_id;
            }
            return 0L;
        }
        return 0L;
    }

    public static long getOnlyProfileEmojiId(TLRPC.Chat chat) {
        if (chat != null) {
            TLRPC.PeerColor peerColor = chat.profile_color;
            if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 2) != 0) {
                return peerColor.background_emoji_id;
            }
            return 0L;
        }
        return 0L;
    }

    public static int getParticipantVolume(TLRPC.GroupCallParticipant groupCallParticipant) {
        if ((groupCallParticipant.flags & 128) != 0) {
            return groupCallParticipant.volume;
        }
        return 10000;
    }

    public static MessagesController.PeerColor getPeerColorForAvatar(int i10, TLRPC.Chat chat) {
        return null;
    }

    public static TLRPC.ChatPhoto getPhoto(TLRPC.Chat chat) {
        if (hasPhoto(chat)) {
            return chat.photo;
        }
        return null;
    }

    public static long getProfileCollectibleId(TLRPC.Chat chat) {
        if (chat != null) {
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                return ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id;
            }
            return 0L;
        }
        return 0L;
    }

    public static int getProfileColorId(TLRPC.Chat chat) {
        if (chat == null) {
            return 0;
        }
        TLRPC.PeerColor peerColor = chat.profile_color;
        if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0) {
            return peerColor.color;
        }
        return -1;
    }

    public static long getProfileEmojiId(TLRPC.Chat chat) {
        if (chat != null) {
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                return ((TLRPC.TL_emojiStatusCollectible) emojiStatus).pattern_document_id;
            }
        }
        if (chat != null) {
            TLRPC.PeerColor peerColor = chat.profile_color;
            if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 2) != 0) {
                return peerColor.background_emoji_id;
            }
            return 0L;
        }
        return 0L;
    }

    public static String getPublicUsername(TLRPC.Chat chat) {
        return getPublicUsername(chat, false);
    }

    public static TL_account.RequirementToContact getRequirementToContact(TLRPC.Chat chat) {
        if (chat == null || chat.send_paid_messages_stars == 0) {
            return null;
        }
        TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = new TL_account.requirementToContactPaidMessages();
        requirementtocontactpaidmessages.stars_amount = chat.send_paid_messages_stars;
        return requirementtocontactpaidmessages;
    }

    public static String getRestrictedErrorText(TLRPC.Chat chat, int i10) {
        if (i10 == 23) {
            if (chat != null && !isActionBannedByDefault(chat, i10)) {
                if (AndroidUtilities.isBannedForever(chat.banned_rights)) {
                    return LocaleController.formatString("AttachGifRestrictedForever", R.string.AttachGifRestrictedForever, new Object[0]);
                }
                return LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date));
            }
            return LocaleController.getString(R.string.GlobalAttachGifRestricted);
        } else if (i10 == 8) {
            if (chat != null && !isActionBannedByDefault(chat, i10)) {
                if (AndroidUtilities.isBannedForever(chat.banned_rights)) {
                    return LocaleController.formatString("AttachStickersRestrictedForever", R.string.AttachStickersRestrictedForever, new Object[0]);
                }
                return LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date));
            }
            return LocaleController.getString(R.string.GlobalAttachStickersRestricted);
        } else if (i10 == 16) {
            if (chat != null && !isActionBannedByDefault(chat, i10)) {
                if (AndroidUtilities.isBannedForever(chat.banned_rights)) {
                    return LocaleController.formatString("AttachPhotoRestrictedForever", R.string.AttachPhotoRestrictedForever, new Object[0]);
                }
                return LocaleController.formatString("AttachPhotoRestricted", R.string.AttachPhotoRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date));
            }
            return LocaleController.getString(R.string.GlobalAttachPhotoRestricted);
        } else if (i10 == 17) {
            if (chat != null && !isActionBannedByDefault(chat, i10)) {
                if (AndroidUtilities.isBannedForever(chat.banned_rights)) {
                    return LocaleController.formatString("AttachVideoRestrictedForever", R.string.AttachVideoRestrictedForever, new Object[0]);
                }
                return LocaleController.formatString("AttachVideoRestricted", R.string.AttachVideoRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date));
            }
            return LocaleController.getString(R.string.GlobalAttachVideoRestricted);
        } else if (i10 == 19) {
            if (chat != null && !isActionBannedByDefault(chat, i10)) {
                if (AndroidUtilities.isBannedForever(chat.banned_rights)) {
                    return LocaleController.formatString("AttachDocumentsRestrictedForever", R.string.AttachDocumentsRestrictedForever, new Object[0]);
                }
                return LocaleController.formatString("AttachDocumentsRestricted", R.string.AttachDocumentsRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date));
            }
            return LocaleController.getString(R.string.GlobalAttachDocumentsRestricted);
        } else if (i10 == 7) {
            if (chat != null && !isActionBannedByDefault(chat, i10)) {
                if (AndroidUtilities.isBannedForever(chat.banned_rights)) {
                    return LocaleController.formatString("AttachMediaRestrictedForever", R.string.AttachMediaRestrictedForever, new Object[0]);
                }
                return LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date));
            }
            return LocaleController.getString(R.string.GlobalAttachMediaRestricted);
        } else if (i10 == 18) {
            if (chat != null && !isActionBannedByDefault(chat, i10)) {
                if (AndroidUtilities.isBannedForever(chat.banned_rights)) {
                    return LocaleController.formatString("AttachAudioRestrictedForever", R.string.AttachAudioRestrictedForever, new Object[0]);
                }
                return LocaleController.formatString("AttachAudioRestricted", R.string.AttachAudioRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date));
            }
            return LocaleController.getString(R.string.GlobalAttachAudioRestricted);
        } else if (i10 == 22) {
            if (chat != null && !isActionBannedByDefault(chat, i10)) {
                if (AndroidUtilities.isBannedForever(chat.banned_rights)) {
                    return LocaleController.formatString("AttachPlainRestrictedForever", R.string.AttachPlainRestrictedForever, new Object[0]);
                }
                return LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date));
            }
            return LocaleController.getString(R.string.GlobalAttachPlainRestricted);
        } else if (i10 == 21) {
            if (chat != null && !isActionBannedByDefault(chat, i10)) {
                if (AndroidUtilities.isBannedForever(chat.banned_rights)) {
                    return LocaleController.formatString("AttachRoundRestrictedForever", R.string.AttachRoundRestrictedForever, new Object[0]);
                }
                return LocaleController.formatString("AttachRoundRestricted", R.string.AttachRoundRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date));
            }
            return LocaleController.getString(R.string.GlobalAttachRoundRestricted);
        } else if (i10 == 20) {
            if (chat != null && !isActionBannedByDefault(chat, i10)) {
                if (AndroidUtilities.isBannedForever(chat.banned_rights)) {
                    return LocaleController.formatString("AttachVoiceRestrictedForever", R.string.AttachVoiceRestrictedForever, new Object[0]);
                }
                return LocaleController.formatString("AttachVoiceRestricted", R.string.AttachVoiceRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date));
            }
            return LocaleController.getString(R.string.GlobalAttachVoiceRestricted);
        } else {
            return "";
        }
    }

    public static long getSendAsPeerId(TLRPC.Chat chat, TLRPC.ChatFull chatFull) {
        return getSendAsPeerId(chat, chatFull, false);
    }

    public static boolean hasAdminRights(TLRPC.Chat chat) {
        if (chat != null) {
            if (!chat.creator) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
                if (tL_chatAdminRights != null && tL_chatAdminRights.flags != 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean hasPhoto(TLRPC.Chat chat) {
        TLRPC.ChatPhoto chatPhoto;
        if (chat != null && (chatPhoto = chat.photo) != null && !(chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) {
            return true;
        }
        return false;
    }

    public static boolean hasPublicLink(TLRPC.Chat chat, String str) {
        if (chat == null) {
            return false;
        }
        if (!TextUtils.isEmpty(chat.username)) {
            return chat.username.equalsIgnoreCase(str);
        }
        if (chat.usernames != null) {
            for (int i10 = 0; i10 < chat.usernames.size(); i10++) {
                TLRPC.TL_username tL_username = chat.usernames.get(i10);
                if (tL_username != null && tL_username.active && !TextUtils.isEmpty(tL_username.username) && tL_username.username.equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasStories(TLRPC.Chat chat) {
        if (chat != null && MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(-chat.f19869id)) {
            return true;
        }
        return false;
    }

    public static boolean isActionBanned(TLRPC.Chat chat, int i10) {
        if (chat != null) {
            if (getBannedRight(chat.banned_rights, i10) || getBannedRight(chat.default_banned_rights, i10)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isActionBannedByDefault(TLRPC.Chat chat, int i10) {
        if (chat == null) {
            return false;
        }
        if (getBannedRight(chat.banned_rights, i10) && getBannedRight(chat.default_banned_rights, i10)) {
            return true;
        }
        return getBannedRight(chat.default_banned_rights, i10);
    }

    private static boolean isAdminAction(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 12 || i10 == 13 || i10 == 15) {
            return true;
        }
        return false;
    }

    private static boolean isBannableAction(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 3 && i10 != 26 && i10 != 27) {
            switch (i10) {
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    break;
                default:
                    switch (i10) {
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
            }
        }
        return true;
    }

    public static boolean isBoostSupported(TLRPC.Chat chat) {
        if ((isChannelAndNotMegaGroup(chat) || isMegagroup(chat)) && !isMonoForum(chat)) {
            return true;
        }
        return false;
    }

    public static boolean isBoosted(TLRPC.ChatFull chatFull) {
        if (chatFull != null && chatFull.boosts_applied > 0) {
            return true;
        }
        return false;
    }

    public static boolean isCanWriteToChannel(long j3, int i10) {
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        if (!canSendMessages(chat) && !chat.megagroup) {
            return false;
        }
        return true;
    }

    public static boolean isChannel(TLRPC.Chat chat) {
        return (chat instanceof TLRPC.TL_channel) || (chat instanceof TLRPC.TL_channelForbidden) || isCommunity(chat);
    }

    public static boolean isChannelAndNotMegaGroup(TLRPC.Chat chat) {
        return isChannel(chat) && !isMegagroup(chat);
    }

    public static boolean isChannelOrGiga(TLRPC.Chat chat) {
        if (isChannel(chat)) {
            if (!chat.megagroup || chat.gigagroup) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isChatCollapsedInCommunity(a0.i iVar, TLRPC.Chat chat) {
        TLRPC.Chat chat2;
        if (chat != null) {
            long j3 = chat.linked_community_id;
            if (j3 != 0 && iVar != null && (chat2 = (TLRPC.Chat) iVar.f(j3)) != null && chat2.collapsed_in_dialogs) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCollapsedInCommunity(int i10, long j3) {
        if (j3 > 0) {
            return isUserCollapsedInCommunity(i10, MessagesController.getInstance(i10).getUser(Long.valueOf(j3)));
        }
        return isChatCollapsedInCommunity(i10, MessagesController.getInstance(i10).getChat(Long.valueOf(-j3)));
    }

    public static boolean isCommunity(TLRPC.Chat chat) {
        return (chat instanceof TLRPC.TL_community) || (chat instanceof TLRPC.TL_communityForbidden);
    }

    public static boolean isCommunityPeerHidden(TL_communities.CommunityPeer communityPeer) {
        if (communityPeer != null && w7.b0.a(communityPeer.flags, 1) && !communityPeer.visible) {
            return true;
        }
        return false;
    }

    public static boolean isCreator(TLRPC.Chat chat) {
        if (chat != null && chat.creator) {
            return true;
        }
        return false;
    }

    public static boolean isDiscussionGroup(int i10, long j3) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        return isDiscussionGroup(messagesController.getChat(Long.valueOf(j3)), messagesController.getChatFull(j3));
    }

    private static boolean isForbidden(TLRPC.Chat chat) {
        if (!(chat instanceof TLRPC.TL_chatForbidden) && !(chat instanceof TLRPC.TL_channelForbidden) && !(chat instanceof TLRPC.TL_communityForbidden)) {
            return false;
        }
        return true;
    }

    public static boolean isForum(int i10, long j3) {
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        if (chat != null) {
            return chat.forum;
        }
        return false;
    }

    public static boolean isHiddenInCommunity(int i10, long j3) {
        if (j3 > 0) {
            return isHiddenInCommunity(i10, MessagesController.getInstance(i10).getUser(Long.valueOf(j3)));
        }
        return isHiddenInCommunity(i10, MessagesController.getInstance(i10).getChat(Long.valueOf(-j3)));
    }

    public static boolean isIgnoredChatRestrictionsForBoosters(TLRPC.ChatFull chatFull) {
        int i10;
        return chatFull != null && (i10 = chatFull.boosts_unrestrict) > 0 && chatFull.boosts_applied - i10 >= 0;
    }

    public static boolean isInChat(TLRPC.Chat chat) {
        if (chat == null || (chat instanceof TLRPC.TL_chatEmpty) || isForbidden(chat) || chat.left || chat.kicked || chat.deactivated) {
            return false;
        }
        return true;
    }

    public static boolean isKickedFromChat(TLRPC.Chat chat) {
        if (chat != null && !(chat instanceof TLRPC.TL_chatEmpty) && !isForbidden(chat) && !chat.kicked && !chat.deactivated) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.banned_rights;
            if (tL_chatBannedRights == null || !tL_chatBannedRights.view_messages) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean isLeftFromChat(TLRPC.Chat chat) {
        if (chat != null && !(chat instanceof TLRPC.TL_chatEmpty) && !isForbidden(chat) && !chat.left && !chat.deactivated) {
            return false;
        }
        return true;
    }

    public static boolean isMegagroup(TLRPC.Chat chat) {
        return isChannel(chat) && chat.megagroup;
    }

    public static boolean isMonoForum(int i10, long j3) {
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        if (chat != null) {
            return chat.monoforum;
        }
        return false;
    }

    public static boolean isMyTopic(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic != null) {
            if (tL_forumTopic.my) {
                return true;
            }
            TLRPC.Peer peer = tL_forumTopic.from_id;
            return (peer instanceof TLRPC.TL_peerUser) && peer.user_id == UserConfig.getInstance(i10).clientUserId;
        }
        return false;
    }

    public static boolean isNotInChat(TLRPC.Chat chat) {
        if (chat != null && !(chat instanceof TLRPC.TL_chatEmpty) && !isForbidden(chat) && !chat.left && !chat.kicked && !chat.deactivated) {
            return false;
        }
        return true;
    }

    public static boolean isPossibleRemoveChatRestrictionsByBoosts(TLRPC.Chat chat) {
        if (chat != null) {
            return isPossibleRemoveChatRestrictionsByBoosts(MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f19869id));
        }
        return false;
    }

    public static boolean isPublic(TLRPC.Chat chat) {
        return !TextUtils.isEmpty(getPublicUsername(chat));
    }

    public static boolean isUserCollapsedInCommunity(a0.i iVar, TLRPC.User user) {
        TLRPC.Chat chat;
        if (user != null) {
            long j3 = user.linked_community_id;
            if (j3 != 0 && iVar != null && (chat = (TLRPC.Chat) iVar.f(j3)) != null && chat.collapsed_in_dialogs) {
                return true;
            }
        }
        return false;
    }

    public static boolean reactionIsAvailable(TLRPC.ChatFull chatFull, String str) {
        TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
            return true;
        }
        if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
            for (int i10 = 0; i10 < tL_chatReactionsSome.reactions.size(); i10++) {
                if ((tL_chatReactionsSome.reactions.get(i10) instanceof TLRPC.TL_reactionEmoji) && TextUtils.equals(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i10)).emoticon, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean shouldSendAnonymously(TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (chat != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.anonymous) {
            return true;
        }
        return false;
    }

    public static boolean canDeleteTopic(int i10, TLRPC.Chat chat, TLRPC.TL_forumTopic tL_forumTopic) {
        TLRPC.Message message;
        TLRPC.Message message2;
        if (tL_forumTopic == null || tL_forumTopic.f19921id != 1) {
            if (!canUserDoAction(chat, 13)) {
                if (isMyTopic(i10, tL_forumTopic) && (message = tL_forumTopic.topMessage) != null && (message2 = tL_forumTopic.topicStartMessage) != null) {
                    int i11 = message.f19890id - message2.f19890id;
                    ArrayList<MessageObject> arrayList = tL_forumTopic.groupedMessages;
                    if (i11 > Math.max(1, arrayList == null ? 0 : arrayList.size()) || !MessageObject.peersEqual(tL_forumTopic.from_id, tL_forumTopic.topMessage.from_id)) {
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean canManageMonoForum(int i10, TLRPC.Chat chat) {
        return canUserDoChannelDirectAdminAction(i10, chat, 24);
    }

    public static boolean canManageTopic(int i10, TLRPC.Chat chat, long j3) {
        return canManageTopics(chat) || isMyTopic(i10, chat, j3);
    }

    public static boolean canUserDoChannelDirectAdminAction(int i10, TLRPC.Chat chat, int i11) {
        return canUserDoAdminAction(getChannelDirectChatInternal(i10, chat), i11);
    }

    public static String getPublicUsername(TLRPC.Chat chat, boolean z10) {
        ArrayList<TLRPC.TL_username> arrayList;
        if (chat == null) {
            return null;
        }
        if (!TextUtils.isEmpty(chat.username) && !z10) {
            return chat.username;
        }
        if (chat.usernames != null) {
            for (int i10 = 0; i10 < chat.usernames.size(); i10++) {
                TLRPC.TL_username tL_username = chat.usernames.get(i10);
                if (tL_username != null && (((tL_username.active && !z10) || tL_username.editable) && !TextUtils.isEmpty(tL_username.username))) {
                    return tL_username.username;
                }
            }
        }
        if (TextUtils.isEmpty(chat.username) || !z10 || ((arrayList = chat.usernames) != null && arrayList.size() > 0)) {
            return null;
        }
        return chat.username;
    }

    public static long getSendAsPeerId(TLRPC.Chat chat, TLRPC.ChatFull chatFull, boolean z10) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.Peer peer;
        if (chat != null && chatFull != null && (peer = chatFull.default_send_as) != null) {
            long j3 = peer.user_id;
            if (j3 != 0) {
                return j3;
            }
            long j10 = peer.channel_id;
            return z10 ? -j10 : j10;
        } else if (chat != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.anonymous) {
            long j11 = chat.f19869id;
            return z10 ? -j11 : j11;
        } else if (chat != null && isChannelAndNotMegaGroup(chat) && !chat.signatures) {
            long j12 = chat.f19869id;
            return z10 ? -j12 : j12;
        } else {
            return UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        }
    }

    public static boolean isChannelAndNotMegaGroup(long j3, int i10) {
        return isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(j3)));
    }

    public static boolean isCommunity(int i10, long j3) {
        return j3 < 0 && isCommunity(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3)));
    }

    public static boolean isIgnoredChatRestrictionsForBoosters(TLRPC.Chat chat) {
        if (chat != null) {
            return isIgnoredChatRestrictionsForBoosters(MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f19869id));
        }
        return false;
    }

    public static boolean isMegagroup(int i10, long j3) {
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        return isChannel(chat) && chat.megagroup;
    }

    public static boolean isMyTopic(int i10, TLRPC.Chat chat, long j3) {
        return chat != null && chat.forum && isMyTopic(i10, chat.f19869id, j3);
    }

    public static class VideoParticipant {
        public float aspectRatio;
        public int aspectRatioFromHeight;
        public int aspectRatioFromWidth;
        public boolean hasSame;
        public TLRPC.GroupCallParticipant participant;
        public boolean presentation;

        public VideoParticipant(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10, boolean z11) {
            this.participant = groupCallParticipant;
            this.presentation = z10;
            this.hasSame = z11;
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

        public void setAspectRatio(int i10, int i11, Call call) {
            this.aspectRatioFromWidth = i10;
            this.aspectRatioFromHeight = i11;
            setAspectRatio(i10 / i11, call);
        }

        private void setAspectRatio(float f7, Call call) {
            if (this.aspectRatio != f7) {
                this.aspectRatio = f7;
                if (j60.F3 || call.visibleVideoParticipants.size() % 2 != 1) {
                    return;
                }
                call.updateVisibleParticipants();
            }
        }
    }

    private static TLRPC.Chat getChannelDirectChatInternal(int i10, TLRPC.Chat chat) {
        if (chat == null || chat.linked_monoforum_id == 0) {
            return null;
        }
        return chat.monoforum ? MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id)) : chat;
    }

    public static boolean isChannel(long j3, int i10) {
        return isChannel(MessagesController.getInstance(i10).getChat(Long.valueOf(j3)));
    }

    public static boolean isCommunity(long j3, int i10) {
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        return (chat instanceof TLRPC.TL_community) || (chat instanceof TLRPC.TL_communityForbidden);
    }

    public static boolean isDiscussionGroup(TLRPC.Chat chat, TLRPC.ChatFull chatFull) {
        return (!isMegagroup(chat) || chatFull == null || chatFull.linked_chat_id == 0) ? false : true;
    }

    public static boolean isForum(TLRPC.Chat chat) {
        return chat != null && chat.forum;
    }

    public static boolean isHiddenInCommunity(int i10, TLRPC.User user) {
        return user != null && isHiddenInCommunity(i10, user.linked_community_id, user.f20016id);
    }

    public static boolean isMonoForum(TLRPC.Chat chat) {
        return chat != null && chat.monoforum;
    }

    public static boolean isMyTopic(int i10, long j3, long j10) {
        return isMyTopic(i10, MessagesController.getInstance(i10).getTopicsController().findTopic(j3, j10));
    }

    public static boolean isPossibleRemoveChatRestrictionsByBoosts(TLRPC.ChatFull chatFull) {
        return chatFull != null && chatFull.boosts_unrestrict > 0;
    }

    public static boolean isChatCollapsedInCommunity(int i10, TLRPC.Chat chat) {
        TLRPC.Chat chat2;
        return (chat == null || chat.linked_community_id == 0 || (chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_community_id))) == null || !chat2.collapsed_in_dialogs) ? false : true;
    }

    public static boolean isHiddenInCommunity(int i10, TLRPC.Chat chat) {
        return chat != null && isHiddenInCommunity(i10, chat.linked_community_id, -chat.f19869id);
    }

    public static boolean isUserCollapsedInCommunity(int i10, TLRPC.User user) {
        TLRPC.Chat chat;
        return (user == null || user.linked_community_id == 0 || (chat = MessagesController.getInstance(i10).getChat(Long.valueOf(user.linked_community_id))) == null || !chat.collapsed_in_dialogs) ? false : true;
    }

    private static boolean isHiddenInCommunity(int i10, long j3, long j10) {
        TLRPC.ChatFull chatFull;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        if (j3 != 0 && j10 != 0 && (chatFull = MessagesController.getInstance(i10).getChatFull(j3)) != null && (arrayList = chatFull.linked_peers) != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                i11++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (DialogObject.getPeerDialogId(communityPeer2.peer) == j10 && isCommunityPeerHidden(communityPeer2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean canUserDoAction(TLRPC.Chat chat, int i10) {
        if (chat == null || canUserDoAdminAction(chat, i10)) {
            return true;
        }
        if (!getBannedRight(chat.banned_rights, i10) && isBannableAction(i10)) {
            if (chat.admin_rights != null && !isAdminAction(i10)) {
                return true;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
            if (tL_chatBannedRights == null && ((chat instanceof TLRPC.TL_chat_layer92) || (chat instanceof TLRPC.TL_chat_old) || (chat instanceof TLRPC.TL_chat_old2) || (chat instanceof TLRPC.TL_channel_layer92) || (chat instanceof TLRPC.TL_channel_layer77) || (chat instanceof TLRPC.TL_channel_layer72) || (chat instanceof TLRPC.TL_channel_layer67) || (chat instanceof TLRPC.TL_channel_layer48) || (chat instanceof TLRPC.TL_channel_old))) {
                return true;
            }
            if (tL_chatBannedRights != null && !getBannedRight(tL_chatBannedRights, i10)) {
                return true;
            }
        }
        return false;
    }

    public static boolean canUserDoAdminAction(TLRPC.Chat chat, int i10) {
        boolean z10;
        if (chat == null) {
            return false;
        }
        if (chat.creator) {
            return true;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
        if (tL_chatAdminRights != null) {
            if (i10 == 0) {
                z10 = tL_chatAdminRights.pin_messages;
            } else if (i10 == 1) {
                z10 = tL_chatAdminRights.change_info;
            } else if (i10 == 2) {
                z10 = tL_chatAdminRights.ban_users;
            } else if (i10 == 3) {
                z10 = tL_chatAdminRights.invite_users;
            } else if (i10 == 4) {
                z10 = tL_chatAdminRights.add_admins;
            } else if (i10 == 5) {
                z10 = tL_chatAdminRights.post_messages;
            } else if (i10 == 24) {
                z10 = tL_chatAdminRights.manage_direct_messages;
            } else if (i10 == 25) {
                z10 = tL_chatAdminRights.manage_ranks;
            } else if (i10 == 27) {
                z10 = tL_chatAdminRights.manage_linked_peers;
            } else if (i10 != 28) {
                switch (i10) {
                    case 12:
                        z10 = tL_chatAdminRights.edit_messages;
                        break;
                    case 13:
                        z10 = tL_chatAdminRights.delete_messages;
                        break;
                    case 14:
                        z10 = tL_chatAdminRights.manage_call;
                        break;
                    case 15:
                        z10 = tL_chatAdminRights.manage_topics;
                        break;
                    default:
                        z10 = false;
                        break;
                }
            } else {
                z10 = tL_chatAdminRights.manage_welcome_messages;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }
}
