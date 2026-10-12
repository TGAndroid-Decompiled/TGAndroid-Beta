package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class x0 implements Runnable {
    public final int f19513a;
    public final long f19514b;
    public final Object f19515c;
    public final Object d;
    public final Object f19516e;

    public x0(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f19513a = i10;
        this.f19515c = obj;
        this.d = obj2;
        this.f19514b = j3;
        this.f19516e = obj3;
    }

    @Override
    public final void run() {
        switch (this.f19513a) {
            case 0:
                ((ChatMessagesMetadataController) this.f19515c).lambda$loadStoriesForMessages$1((MessageObject) this.d, this.f19514b, (TL_stories.StoryItem) this.f19516e);
                return;
            case 1:
                ((MediaDataController) this.f19515c).lambda$loadReplyMessagesForMessages$170((Timer.Task) this.d, this.f19514b, (ArrayList) this.f19516e);
                return;
            case 2:
                ((MediaDataController) this.f19515c).lambda$loadMusic$141(this.f19514b, (ArrayList) this.d, (ArrayList) this.f19516e);
                return;
            case 3:
                ((MessagesController) this.f19515c).lambda$addUserToChat$299((Utilities.Callback) this.d, (TLRPC.TL_messages_invitedUsers) this.f19516e, this.f19514b);
                return;
            case 4:
                ((MessagesController) this.f19515c).lambda$checkChatInviter$373(this.f19514b, (ArrayList) this.d, (TLRPC.TL_channels_channelParticipant) this.f19516e);
                return;
            case 5:
                ((MessagesController) this.f19515c).lambda$getGroupCall$61((TLObject) this.d, this.f19514b, (Runnable) this.f19516e);
                return;
            case 6:
                ((MessagesController) this.f19515c).lambda$reloadMessages$72(this.f19514b, (ArrayList) this.d, (ArrayList) this.f19516e);
                return;
            case 7:
                ((MessagesController) this.f19515c).lambda$checkPromoInfoInternal$164((TLRPC.TL_help_promoData) this.d, (TLRPC.TL_messages_peerDialogs) this.f19516e, this.f19514b);
                return;
            case 8:
                ((MessagesController) this.f19515c).lambda$updateChannelUserName$290(this.f19514b, (String) this.d, (Runnable) this.f19516e);
                return;
            case 9:
                ((MessagesStorage) this.f19515c).lambda$deleteUserChatHistory$85((ArrayList) this.d, this.f19514b, (ArrayList) this.f19516e);
                return;
            case 10:
                ((MessagesStorage) this.f19515c).lambda$updateMessagePollResults$101(this.f19514b, (TLRPC.Poll) this.d, (TLRPC.PollResults) this.f19516e);
                return;
            case 11:
                ((MessagesStorage) this.f19515c).lambda$onReactionsUpdate$106((TLRPC.TL_messageReactions) this.d, (TLRPC.TL_messageReactions) this.f19516e, this.f19514b);
                return;
            case 12:
                ((MessagesStorage) this.f19515c).lambda$getUserSync$258((TLRPC.User[]) this.d, this.f19514b, (CountDownLatch) this.f19516e);
                return;
            case 13:
                ((MessagesStorage) this.f19515c).lambda$containsLocalDialog$179(this.f19514b, (Boolean[]) this.d, (CountDownLatch) this.f19516e);
                return;
            case 14:
                ((MessagesStorage) this.f19515c).lambda$getChannelPtsSync$257(this.f19514b, (Integer[]) this.d, (CountDownLatch) this.f19516e);
                return;
            case 15:
                ((MessagesStorage) this.f19515c).lambda$getChatSync$259((TLRPC.Chat[]) this.d, this.f19514b, (CountDownLatch) this.f19516e);
                return;
            case 16:
                ((MessagesStorage) this.f19515c).lambda$loadPendingTasks$14((TLRPC.TL_dialog) this.d, (TLRPC.InputPeer) this.f19516e, this.f19514b);
                return;
            case 17:
                ((MessagesStorage) this.f19515c).lambda$getEncryptedChat$177(this.f19514b, (ArrayList) this.d, (CountDownLatch) this.f19516e);
                return;
            case 18:
                ((SavedMessagesController) this.f19515c).lambda$updateDialogsLastMessage$9((MessagesStorage) this.d, (ArrayList) this.f19516e, this.f19514b);
                return;
            default:
                ((SavedMessagesController) this.f19515c).lambda$loadCache$7((MessagesStorage) this.d, this.f19514b, (Runnable) this.f19516e);
                return;
        }
    }

    public x0(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f19513a = i10;
        this.f19515c = obj;
        this.d = obj2;
        this.f19516e = obj3;
        this.f19514b = j3;
    }

    public x0(BaseController baseController, long j3, Object obj, Object obj2, int i10) {
        this.f19513a = i10;
        this.f19515c = baseController;
        this.f19514b = j3;
        this.d = obj;
        this.f19516e = obj2;
    }
}
