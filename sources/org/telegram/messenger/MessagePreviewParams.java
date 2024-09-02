package org.telegram.messenger;

import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageEntity;
import org.telegram.tgnet.TLRPC$MessageFwdHeader;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$MessageReplyHeader;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageEntitySpoiler;
import org.telegram.tgnet.TLRPC$TL_messageFwdHeader;
import org.telegram.tgnet.TLRPC$TL_messageMediaPoll;
import org.telegram.tgnet.TLRPC$TL_messageMediaWebPage;
import org.telegram.tgnet.TLRPC$TL_messageReplyHeader;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_pollAnswerVoters;
import org.telegram.tgnet.TLRPC$TL_pollResults;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.MessagePreviewView;

public class MessagePreviewParams {
    public CharacterStyle currentLink;
    public Messages forwardMessages;
    public boolean hasCaption;
    public boolean hasMedia;
    public boolean hasSecretMessages;
    public boolean hasSenders;
    public boolean hideCaption;
    public boolean hideForwardSendersName;
    public boolean isSecret;
    public boolean isVideo;
    public TLRPC$WebPage linkMedia;
    public Messages linkMessage;
    public boolean multipleUsers;
    public boolean noforwards;
    private MessagePreviewView previewView;
    public ChatActivity.ReplyQuote quote;
    public int quoteEnd;
    public int quoteStart;
    public Messages replyMessage;
    public boolean singleLink;
    public TLRPC$WebPage webpage;
    public boolean webpagePhoto;
    public boolean webpageSmall;
    public boolean webpageTop;
    public boolean willSeeSenders;

    public static class PreviewMediaPoll extends TLRPC$TL_messageMediaPoll {
        public int totalVotersCached;
    }

    public static ArrayList<MessageObject> singletonArrayList(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        arrayList.add(messageObject);
        return arrayList;
    }

    public class Messages {
        private long dialogId;
        public LongSparseArray<MessageObject.GroupedMessages> groupedMessagesMap;
        public boolean hasSpoilers;
        public boolean hasText;
        public ArrayList<MessageObject> messages;
        private Boolean out;
        public ArrayList<TLRPC$TL_pollAnswerVoters> pollChosenAnswers;
        public ArrayList<MessageObject> previewMessages;
        public SparseBooleanArray selectedIds;
        private int type;

        public Messages(MessagePreviewParams messagePreviewParams, Boolean bool, int i, MessageObject messageObject) {
            this(bool, i, MessagePreviewParams.singletonArrayList(messageObject), messageObject.getDialogId(), null);
        }

        public Messages(MessagePreviewParams messagePreviewParams, Boolean bool, int i, MessageObject messageObject, long j) {
            this(bool, i, MessagePreviewParams.singletonArrayList(messageObject), j, null);
        }

        public Messages(Boolean bool, int i, ArrayList<MessageObject> arrayList, long j, SparseBooleanArray sparseBooleanArray) {
            this.groupedMessagesMap = new LongSparseArray<>();
            this.previewMessages = new ArrayList<>();
            this.selectedIds = new SparseBooleanArray();
            this.pollChosenAnswers = new ArrayList<>();
            this.out = bool;
            this.type = i;
            this.dialogId = j;
            this.messages = arrayList;
            if (sparseBooleanArray != null) {
                this.selectedIds = sparseBooleanArray;
            }
            int i2 = 0;
            int i3 = 0;
            while (i3 < arrayList.size()) {
                MessageObject messageObject = arrayList.get(i3);
                if (i == 0 && sparseBooleanArray == null) {
                    this.selectedIds.put(messageObject.getId(), true);
                }
                MessageObject previewMessage = MessagePreviewParams.this.toPreviewMessage(messageObject, bool, i);
                if (!this.hasSpoilers) {
                    Iterator<TLRPC$MessageEntity> it = previewMessage.messageOwner.entities.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next() instanceof TLRPC$TL_messageEntitySpoiler) {
                                this.hasSpoilers = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                previewMessage.messageOwner.dialog_id = j;
                if (previewMessage.getGroupId() != 0) {
                    MessageObject.GroupedMessages groupedMessages = this.groupedMessagesMap.get(previewMessage.getGroupId(), null);
                    if (groupedMessages == null) {
                        groupedMessages = new MessageObject.GroupedMessages();
                        this.groupedMessagesMap.put(previewMessage.getGroupId(), groupedMessages);
                    }
                    groupedMessages.messages.add(previewMessage);
                }
                this.previewMessages.add(i2, previewMessage);
                if (messageObject.isPoll()) {
                    TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll = (TLRPC$TL_messageMediaPoll) messageObject.messageOwner.media;
                    PreviewMediaPoll previewMediaPoll = new PreviewMediaPoll();
                    previewMediaPoll.poll = tLRPC$TL_messageMediaPoll.poll;
                    previewMediaPoll.provider = tLRPC$TL_messageMediaPoll.provider;
                    TLRPC$TL_pollResults tLRPC$TL_pollResults = new TLRPC$TL_pollResults();
                    previewMediaPoll.results = tLRPC$TL_pollResults;
                    int i4 = tLRPC$TL_messageMediaPoll.results.total_voters;
                    tLRPC$TL_pollResults.total_voters = i4;
                    previewMediaPoll.totalVotersCached = i4;
                    previewMessage.messageOwner.media = previewMediaPoll;
                    if (messageObject.canUnvote()) {
                        int size = tLRPC$TL_messageMediaPoll.results.results.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            TLRPC$TL_pollAnswerVoters tLRPC$TL_pollAnswerVoters = tLRPC$TL_messageMediaPoll.results.results.get(i5);
                            if (tLRPC$TL_pollAnswerVoters.chosen) {
                                TLRPC$TL_pollAnswerVoters tLRPC$TL_pollAnswerVoters2 = new TLRPC$TL_pollAnswerVoters();
                                tLRPC$TL_pollAnswerVoters2.chosen = tLRPC$TL_pollAnswerVoters.chosen;
                                tLRPC$TL_pollAnswerVoters2.correct = tLRPC$TL_pollAnswerVoters.correct;
                                tLRPC$TL_pollAnswerVoters2.flags = tLRPC$TL_pollAnswerVoters.flags;
                                tLRPC$TL_pollAnswerVoters2.option = tLRPC$TL_pollAnswerVoters.option;
                                tLRPC$TL_pollAnswerVoters2.voters = tLRPC$TL_pollAnswerVoters.voters;
                                this.pollChosenAnswers.add(tLRPC$TL_pollAnswerVoters2);
                                previewMediaPoll.results.results.add(tLRPC$TL_pollAnswerVoters2);
                            } else {
                                previewMediaPoll.results.results.add(tLRPC$TL_pollAnswerVoters);
                            }
                        }
                    }
                }
                i3++;
                i2 = 0;
            }
            for (int i6 = 0; i6 < this.groupedMessagesMap.size(); i6++) {
                this.groupedMessagesMap.valueAt(i6).calculate();
            }
            LongSparseArray<MessageObject.GroupedMessages> longSparseArray = this.groupedMessagesMap;
            if (longSparseArray != null && longSparseArray.size() > 0) {
                this.hasText = this.groupedMessagesMap.valueAt(0).findCaptionMessageObject() != null;
                return;
            }
            if (arrayList.size() == 1) {
                int i7 = arrayList.get(0).type;
                if (i7 == 0 || i7 == 19) {
                    this.hasText = !TextUtils.isEmpty(r1.messageText);
                } else {
                    this.hasText = !TextUtils.isEmpty(r1.caption);
                }
            }
        }

        public void getSelectedMessages(ArrayList<MessageObject> arrayList) {
            arrayList.clear();
            for (int i = 0; i < this.messages.size(); i++) {
                MessageObject messageObject = this.messages.get(i);
                if (this.selectedIds.get(messageObject.getId(), false)) {
                    arrayList.add(messageObject);
                }
            }
        }

        public Messages checkEdits(ArrayList<MessageObject> arrayList) {
            ArrayList<MessageObject> arrayList2 = this.messages;
            if (arrayList2 != null && arrayList2.size() <= 1 && arrayList != null) {
                boolean z = false;
                for (int i = 0; i < this.messages.size(); i++) {
                    MessageObject messageObject = this.messages.get(i);
                    if (messageObject != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= arrayList.size()) {
                                break;
                            }
                            MessageObject messageObject2 = arrayList.get(i2);
                            if (messageObject2 != null && messageObject.getId() == messageObject2.getId() && messageObject.getDialogId() == messageObject2.getDialogId()) {
                                this.messages.set(i, messageObject2);
                                z = true;
                                break;
                            }
                            i2++;
                        }
                    }
                }
                if (z) {
                    return new Messages(this.out, this.type, this.messages, this.dialogId, null);
                }
            }
            return null;
        }
    }

    public MessagePreviewParams(boolean z, boolean z2) {
        this.isSecret = z;
        this.noforwards = z || z2;
    }

    public void updateReply(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, long j, ChatActivity.ReplyQuote replyQuote) {
        ChatActivity.ReplyQuote replyQuote2;
        int i;
        MessageObject messageObject2 = messageObject;
        if (this.isSecret || messageObject2 == null || (i = messageObject2.type) == 10 || i == 11 || i == 22 || i == 21 || i == 18 || i == 25 || i == 16) {
            messageObject2 = null;
            replyQuote2 = null;
        } else {
            replyQuote2 = replyQuote;
        }
        this.hasSecretMessages = messageObject2 != null && (messageObject2.isVoiceOnce() || messageObject2.isRoundOnce() || messageObject2.type == 30);
        if (messageObject2 != null || replyQuote2 != null) {
            if (groupedMessages != null) {
                this.replyMessage = new Messages(null, 1, groupedMessages.messages, j, null);
            } else {
                if (messageObject2 == null) {
                    messageObject2 = replyQuote2.message;
                }
                this.replyMessage = new Messages(this, null, 1, messageObject2, j);
            }
            if (!this.replyMessage.messages.isEmpty()) {
                this.quote = replyQuote2;
                if (replyQuote2 != null) {
                    this.quoteStart = replyQuote2.start;
                    this.quoteEnd = replyQuote2.end;
                    return;
                }
                return;
            }
            this.replyMessage = null;
            return;
        }
        this.replyMessage = null;
        this.quote = null;
    }

    public void updateLinkInvertMedia(boolean z) {
        this.webpageTop = z;
    }

    public void updateLink(int i, TLRPC$WebPage tLRPC$WebPage, CharSequence charSequence, MessageObject messageObject, ChatActivity.ReplyQuote replyQuote, MessageObject messageObject2) {
        TLRPC$MessageMedia tLRPC$MessageMedia;
        TLRPC$Message tLRPC$Message;
        TLRPC$MessageMedia tLRPC$MessageMedia2;
        TLRPC$Message tLRPC$Message2;
        boolean z = false;
        this.hasMedia = false;
        this.isVideo = false;
        this.singleLink = true;
        boolean z2 = this.webpage != tLRPC$WebPage;
        this.webpage = tLRPC$WebPage;
        if (TextUtils.isEmpty(charSequence) && this.webpage == null) {
            this.linkMessage = null;
        } else {
            if (charSequence == null) {
                charSequence = "";
            }
            Messages messages = this.linkMessage;
            boolean z3 = messages == null || z2;
            if (messages == null && messageObject2 != null && (tLRPC$Message2 = messageObject2.messageOwner) != null) {
                this.webpageTop = tLRPC$Message2.invert_media;
                TLRPC$MessageMedia tLRPC$MessageMedia3 = tLRPC$Message2.media;
                if (tLRPC$MessageMedia3 != null && tLRPC$MessageMedia3.force_small_media) {
                    this.webpageSmall = true;
                }
            }
            TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
            CharSequence[] charSequenceArr = {new SpannableStringBuilder(AndroidUtilities.getTrimmedString(charSequence))};
            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
            tLRPC$TL_message.peer_id = tLRPC$TL_peerUser;
            tLRPC$TL_peerUser.user_id = UserConfig.getInstance(i).getClientUserId();
            TLRPC$TL_peerUser tLRPC$TL_peerUser2 = new TLRPC$TL_peerUser();
            tLRPC$TL_message.from_id = tLRPC$TL_peerUser2;
            tLRPC$TL_peerUser2.user_id = UserConfig.getInstance(i).getClientUserId();
            tLRPC$TL_message.entities = MediaDataController.getInstance(i).getEntities(charSequenceArr, true);
            tLRPC$TL_message.message = charSequenceArr[0].toString();
            tLRPC$TL_message.invert_media = this.webpageTop;
            if (tLRPC$WebPage != null) {
                tLRPC$TL_message.flags |= 512;
                TLRPC$TL_messageMediaWebPage tLRPC$TL_messageMediaWebPage = new TLRPC$TL_messageMediaWebPage();
                tLRPC$TL_message.media = tLRPC$TL_messageMediaWebPage;
                tLRPC$TL_messageMediaWebPage.webpage = tLRPC$WebPage;
                boolean z4 = this.webpageSmall;
                tLRPC$TL_messageMediaWebPage.force_large_media = !z4;
                tLRPC$TL_messageMediaWebPage.force_small_media = z4;
                this.hasMedia = tLRPC$WebPage.photo != null;
                this.isVideo = MessageObject.isVideoDocument(tLRPC$WebPage.document);
            } else {
                this.hasMedia = false;
            }
            tLRPC$TL_message.out = true;
            tLRPC$TL_message.unread = false;
            if (messageObject != null) {
                tLRPC$TL_message.replyMessage = messageObject.messageOwner;
                TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = new TLRPC$TL_messageReplyHeader();
                tLRPC$TL_message.reply_to = tLRPC$TL_messageReplyHeader;
                if (replyQuote != null) {
                    tLRPC$TL_messageReplyHeader.quote_text = replyQuote.getText();
                    TLRPC$MessageReplyHeader tLRPC$MessageReplyHeader = tLRPC$TL_message.reply_to;
                    tLRPC$MessageReplyHeader.flags |= 64;
                    tLRPC$MessageReplyHeader.quote_entities = replyQuote.getEntities();
                    TLRPC$MessageReplyHeader tLRPC$MessageReplyHeader2 = tLRPC$TL_message.reply_to;
                    if (tLRPC$MessageReplyHeader2.quote_entities != null) {
                        tLRPC$MessageReplyHeader2.flags |= 128;
                    }
                }
            }
            Messages messages2 = new Messages(this, Boolean.TRUE, 2, new MessageObject(i, tLRPC$TL_message, true, false));
            this.linkMessage = messages2;
            if (messages2.messages.isEmpty()) {
                this.linkMessage = null;
            } else {
                MessageObject messageObject3 = this.linkMessage.messages.get(0);
                CharSequence charSequence2 = messageObject3.messageText;
                if ((charSequence2 instanceof Spanned) && !TextUtils.isEmpty(charSequence2)) {
                    CharSequence charSequence3 = messageObject3.messageText;
                    URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) charSequence3).getSpans(0, charSequence3.length(), URLSpan.class);
                    this.singleLink = uRLSpanArr == null || uRLSpanArr.length <= 1;
                } else {
                    CharSequence charSequence4 = messageObject3.caption;
                    if ((charSequence4 instanceof Spanned) && !TextUtils.isEmpty(charSequence4)) {
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) messageObject3.messageText).getSpans(0, messageObject3.caption.length(), URLSpan.class);
                        this.singleLink = uRLSpanArr2 == null || uRLSpanArr2.length <= 1;
                    }
                }
                this.hasMedia = messageObject3.hasLinkMediaToMakeSmall();
                if (z3 && messageObject2 != null && (tLRPC$Message = messageObject2.messageOwner) != null && (tLRPC$MessageMedia2 = tLRPC$Message.media) != null) {
                    if (tLRPC$MessageMedia2.force_small_media || (messageObject3.isLinkMediaSmall() && !messageObject2.messageOwner.media.force_large_media)) {
                        z = true;
                    }
                    this.webpageSmall = z;
                } else if (z3) {
                    this.webpageSmall = messageObject3.isLinkMediaSmall();
                }
                TLRPC$Message tLRPC$Message3 = messageObject3.messageOwner;
                if (tLRPC$Message3 != null && (tLRPC$MessageMedia = tLRPC$Message3.media) != null) {
                    boolean z5 = this.webpageSmall;
                    tLRPC$MessageMedia.force_large_media = !z5;
                    tLRPC$MessageMedia.force_small_media = z5;
                }
            }
        }
        MessagePreviewView messagePreviewView = this.previewView;
        if (messagePreviewView != null) {
            messagePreviewView.updateLink();
        }
    }

    public void checkCurrentLink(MessageObject messageObject) {
        TLRPC$WebPage tLRPC$WebPage;
        this.currentLink = null;
        if (messageObject != null) {
            CharSequence charSequence = messageObject.messageText;
            if (!(charSequence instanceof Spanned) || (tLRPC$WebPage = this.webpage) == null || tLRPC$WebPage.url == null) {
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
            for (int i = 0; i < uRLSpanArr.length; i++) {
                if (areUrlsEqual(uRLSpanArr[i].getURL(), this.webpage.url)) {
                    this.currentLink = uRLSpanArr[i];
                    return;
                }
            }
        }
    }

    public boolean hasLink(CharSequence charSequence, String str) {
        if (str != null) {
            try {
                SpannableString valueOf = SpannableString.valueOf(charSequence);
                try {
                    AndroidUtilities.addLinksSafe(valueOf, 1, false, true);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                for (URLSpan uRLSpan : (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class)) {
                    if (areUrlsEqual(uRLSpan.getURL(), str)) {
                        return true;
                    }
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        return false;
    }

    public static boolean areUrlsEqual(String str, String str2) {
        if (str == null || str2 == null) {
            return str == null;
        }
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(str2);
        if (parse == parse2) {
            return true;
        }
        if (parse != null && parse2 != null && parse.getHost() != null && parse.getHost().equalsIgnoreCase(parse2.getHost()) && parse.getPort() == parse2.getPort() && normalizePath(parse.getPath()).equals(normalizePath(parse2.getPath()))) {
            if (parse.getQuery() == null) {
                if (parse2.getQuery() == null) {
                    return true;
                }
            } else if (parse.getQuery().equals(parse2.getQuery())) {
                return true;
            }
        }
        return false;
    }

    private static String normalizePath(String str) {
        if (str == null) {
            return "";
        }
        if (str.endsWith("/")) {
            return str;
        }
        return str + "/";
    }

    public void updateForward(ArrayList<MessageObject> arrayList, long j) {
        long j2;
        long j3;
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader;
        this.hasCaption = false;
        this.hasSenders = false;
        this.isSecret = DialogObject.isEncryptedDialog(j);
        this.multipleUsers = false;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                MessageObject messageObject = arrayList.get(i);
                if (!TextUtils.isEmpty(messageObject.caption)) {
                    this.hasCaption = true;
                }
                if (!this.isSecret && (tLRPC$MessageFwdHeader = messageObject.messageOwner.fwd_from) != null && tLRPC$MessageFwdHeader.from_id == null && !arrayList2.contains(tLRPC$MessageFwdHeader.from_name)) {
                    arrayList2.add(tLRPC$MessageFwdHeader.from_name);
                }
            }
            Boolean bool = Boolean.TRUE;
            Messages messages = this.forwardMessages;
            Messages messages2 = new Messages(bool, 0, arrayList, j, messages != null ? messages.selectedIds : null);
            this.forwardMessages = messages2;
            if (messages2.messages.isEmpty()) {
                this.forwardMessages = null;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                MessageObject messageObject2 = arrayList.get(i2);
                if (messageObject2.isFromUser()) {
                    j3 = messageObject2.messageOwner.from_id.user_id;
                } else {
                    TLRPC$Chat chat = MessagesController.getInstance(messageObject2.currentAccount).getChat(Long.valueOf(messageObject2.messageOwner.peer_id.channel_id));
                    if (ChatObject.isChannel(chat) && chat.megagroup && messageObject2.isForwardedChannelPost()) {
                        j2 = messageObject2.messageOwner.fwd_from.from_id.channel_id;
                    } else {
                        j2 = messageObject2.messageOwner.peer_id.channel_id;
                    }
                    j3 = -j2;
                }
                if (!arrayList3.contains(Long.valueOf(j3))) {
                    arrayList3.add(Long.valueOf(j3));
                }
            }
            if (arrayList3.size() + arrayList2.size() > 1) {
                this.multipleUsers = true;
                return;
            }
            return;
        }
        this.forwardMessages = null;
    }

    public MessageObject toPreviewMessage(MessageObject messageObject, Boolean bool, final int i) {
        MessageObject messageObject2;
        TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
        if (i != 1) {
            tLRPC$TL_message.date = ConnectionsManager.getInstance(messageObject.currentAccount).getCurrentTime();
        } else {
            tLRPC$TL_message.date = messageObject.messageOwner.date;
        }
        TLRPC$Message tLRPC$Message = messageObject.messageOwner;
        tLRPC$TL_message.id = tLRPC$Message.id;
        tLRPC$TL_message.grouped_id = tLRPC$Message.grouped_id;
        tLRPC$TL_message.peer_id = tLRPC$Message.peer_id;
        tLRPC$TL_message.from_id = tLRPC$Message.from_id;
        tLRPC$TL_message.message = tLRPC$Message.message;
        tLRPC$TL_message.media = tLRPC$Message.media;
        tLRPC$TL_message.action = tLRPC$Message.action;
        tLRPC$TL_message.edit_date = 0;
        ArrayList<TLRPC$MessageEntity> arrayList = tLRPC$Message.entities;
        if (arrayList != null) {
            tLRPC$TL_message.entities.addAll(arrayList);
        }
        boolean booleanValue = bool == null ? messageObject.messageOwner.out : bool.booleanValue();
        tLRPC$TL_message.out = booleanValue;
        if (booleanValue) {
            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
            tLRPC$TL_message.from_id = tLRPC$TL_peerUser;
            tLRPC$TL_peerUser.user_id = UserConfig.getInstance(messageObject.currentAccount).getClientUserId();
        }
        tLRPC$TL_message.unread = false;
        TLRPC$Message tLRPC$Message2 = messageObject.messageOwner;
        tLRPC$TL_message.via_bot_id = tLRPC$Message2.via_bot_id;
        tLRPC$TL_message.reply_markup = tLRPC$Message2.reply_markup;
        tLRPC$TL_message.post = tLRPC$Message2.post;
        tLRPC$TL_message.legacy = tLRPC$Message2.legacy;
        tLRPC$TL_message.restriction_reason = tLRPC$Message2.restriction_reason;
        TLRPC$Message tLRPC$Message3 = tLRPC$Message2.replyMessage;
        tLRPC$TL_message.replyMessage = tLRPC$Message3;
        if (tLRPC$Message3 == null && (messageObject2 = messageObject.replyMessageObject) != null) {
            tLRPC$TL_message.replyMessage = messageObject2.messageOwner;
        }
        tLRPC$TL_message.reply_to = tLRPC$Message2.reply_to;
        tLRPC$TL_message.invert_media = tLRPC$Message2.invert_media;
        if (i == 0) {
            TLRPC$TL_messageFwdHeader tLRPC$TL_messageFwdHeader = null;
            long clientUserId = UserConfig.getInstance(messageObject.currentAccount).getClientUserId();
            if (!this.isSecret) {
                TLRPC$Message tLRPC$Message4 = messageObject.messageOwner;
                ?? r4 = tLRPC$Message4.fwd_from;
                if (r4 != 0) {
                    if (!messageObject.isDice()) {
                        this.hasSenders = true;
                    } else {
                        this.willSeeSenders = true;
                    }
                    tLRPC$TL_messageFwdHeader = r4;
                } else {
                    long j = tLRPC$Message4.from_id.user_id;
                    if (j == 0 || tLRPC$Message4.dialog_id != clientUserId || j != clientUserId) {
                        tLRPC$TL_messageFwdHeader = new TLRPC$TL_messageFwdHeader();
                        tLRPC$TL_messageFwdHeader.from_id = messageObject.messageOwner.from_id;
                        if (!messageObject.isDice()) {
                            this.hasSenders = true;
                        } else {
                            this.willSeeSenders = true;
                        }
                    }
                }
            }
            if (tLRPC$TL_messageFwdHeader != null) {
                tLRPC$TL_message.fwd_from = tLRPC$TL_messageFwdHeader;
                tLRPC$TL_message.flags |= 4;
            }
        }
        MessageObject messageObject3 = new MessageObject(messageObject.currentAccount, tLRPC$TL_message, true, false) {
            @Override
            public void generateLayout(TLRPC$User tLRPC$User) {
                super.generateLayout(tLRPC$User);
                if (i == 2) {
                    MessagePreviewParams.this.checkCurrentLink(this);
                }
            }

            @Override
            public boolean needDrawForwarded() {
                if (MessagePreviewParams.this.hideForwardSendersName) {
                    return false;
                }
                return super.needDrawForwarded();
            }
        };
        messageObject3.previewForward = i == 0;
        messageObject3.preview = true;
        return messageObject3;
    }

    public boolean isEmpty() {
        Messages messages;
        Messages messages2;
        ArrayList<MessageObject> arrayList;
        ArrayList<MessageObject> arrayList2;
        ArrayList<MessageObject> arrayList3;
        Messages messages3 = this.forwardMessages;
        return (messages3 == null || (arrayList3 = messages3.messages) == null || arrayList3.isEmpty()) && ((messages = this.replyMessage) == null || (arrayList2 = messages.messages) == null || arrayList2.isEmpty()) && ((messages2 = this.linkMessage) == null || (arrayList = messages2.messages) == null || arrayList.isEmpty());
    }

    public void attach(MessagePreviewView messagePreviewView) {
        this.previewView = messagePreviewView;
    }

    public void checkEdits(ArrayList<MessageObject> arrayList) {
        boolean z;
        MessagePreviewView messagePreviewView;
        Messages checkEdits;
        Messages checkEdits2;
        Messages checkEdits3;
        Messages messages = this.forwardMessages;
        boolean z2 = true;
        if (messages == null || (checkEdits3 = messages.checkEdits(arrayList)) == null) {
            z = false;
        } else {
            this.forwardMessages = checkEdits3;
            z = true;
        }
        Messages messages2 = this.replyMessage;
        if (messages2 != null && (checkEdits2 = messages2.checkEdits(arrayList)) != null) {
            this.replyMessage = checkEdits2;
            z = true;
        }
        Messages messages3 = this.linkMessage;
        if (messages3 == null || (checkEdits = messages3.checkEdits(arrayList)) == null) {
            z2 = z;
        } else {
            this.linkMessage = checkEdits;
        }
        if (!z2 || (messagePreviewView = this.previewView) == null) {
            return;
        }
        messagePreviewView.updateAll();
    }
}
