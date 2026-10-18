package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class w0 implements Runnable {
    public final int f19947a;
    public final long f19948b;
    public final Object f19949c;
    public final Object d;
    public final Object e;

    public w0(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f19947a = i10;
        this.f19949c = obj;
        this.d = obj2;
        this.f19948b = j10;
        this.e = obj3;
    }

    @Override
    public final void run() {
        switch (this.f19947a) {
            case 0:
                ((ChatMessagesMetadataController) this.f19949c).lambda$loadStoriesForMessages$1((MessageObject) this.d, this.f19948b, (TL_stories.StoryItem) this.e);
                return;
            case 1:
                ((MediaDataController) this.f19949c).lambda$loadReplyMessagesForMessages$170((Timer.Task) this.d, this.f19948b, (ArrayList) this.e);
                return;
            case 2:
                ((MediaDataController) this.f19949c).lambda$loadMusic$141(this.f19948b, (ArrayList) this.d, (ArrayList) this.e);
                return;
            case 3:
                ((MessagesController) this.f19949c).lambda$addUserToChat$299((Utilities.Callback) this.d, (TLRPC.TL_messages_invitedUsers) this.e, this.f19948b);
                return;
            case 4:
                ((MessagesController) this.f19949c).lambda$checkChatInviter$373(this.f19948b, (ArrayList) this.d, (TLRPC.TL_channels_channelParticipant) this.e);
                return;
            case 5:
                ((MessagesController) this.f19949c).lambda$getGroupCall$61((TLObject) this.d, this.f19948b, (Runnable) this.e);
                return;
            case 6:
                ((MessagesController) this.f19949c).lambda$reloadMessages$72(this.f19948b, (ArrayList) this.d, (ArrayList) this.e);
                return;
            case 7:
                ((MessagesController) this.f19949c).lambda$checkPromoInfoInternal$164((TLRPC.TL_help_promoData) this.d, (TLRPC.TL_messages_peerDialogs) this.e, this.f19948b);
                return;
            case 8:
                ((MessagesController) this.f19949c).lambda$updateChannelUserName$290(this.f19948b, (String) this.d, (Runnable) this.e);
                return;
            case 9:
                ((MessagesStorage) this.f19949c).lambda$deleteUserChatHistory$85((ArrayList) this.d, this.f19948b, (ArrayList) this.e);
                return;
            case 10:
                ((MessagesStorage) this.f19949c).lambda$updateMessagePollResults$101(this.f19948b, (TLRPC.Poll) this.d, (TLRPC.PollResults) this.e);
                return;
            case 11:
                ((MessagesStorage) this.f19949c).lambda$onReactionsUpdate$106((TLRPC.TL_messageReactions) this.d, (TLRPC.TL_messageReactions) this.e, this.f19948b);
                return;
            case 12:
                ((MessagesStorage) this.f19949c).lambda$getUserSync$258((TLRPC.User[]) this.d, this.f19948b, (CountDownLatch) this.e);
                return;
            case 13:
                ((MessagesStorage) this.f19949c).lambda$containsLocalDialog$179(this.f19948b, (Boolean[]) this.d, (CountDownLatch) this.e);
                return;
            case 14:
                ((MessagesStorage) this.f19949c).lambda$getChannelPtsSync$257(this.f19948b, (Integer[]) this.d, (CountDownLatch) this.e);
                return;
            case 15:
                ((MessagesStorage) this.f19949c).lambda$getChatSync$259((TLRPC.Chat[]) this.d, this.f19948b, (CountDownLatch) this.e);
                return;
            case 16:
                ((MessagesStorage) this.f19949c).lambda$loadPendingTasks$14((TLRPC.TL_dialog) this.d, (TLRPC.InputPeer) this.e, this.f19948b);
                return;
            case 17:
                ((MessagesStorage) this.f19949c).lambda$getEncryptedChat$177(this.f19948b, (ArrayList) this.d, (CountDownLatch) this.e);
                return;
            case 18:
                ((SavedMessagesController) this.f19949c).lambda$updateDialogsLastMessage$9((MessagesStorage) this.d, (ArrayList) this.e, this.f19948b);
                return;
            default:
                ((SavedMessagesController) this.f19949c).lambda$loadCache$7((MessagesStorage) this.d, this.f19948b, (Runnable) this.e);
                return;
        }
    }

    public w0(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f19947a = i10;
        this.f19949c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f19948b = j10;
    }

    public w0(BaseController baseController, long j10, Object obj, Object obj2, int i10) {
        this.f19947a = i10;
        this.f19949c = baseController;
        this.f19948b = j10;
        this.d = obj;
        this.e = obj2;
    }
}
