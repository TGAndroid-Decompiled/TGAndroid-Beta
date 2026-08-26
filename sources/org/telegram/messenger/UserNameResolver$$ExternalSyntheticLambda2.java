package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class UserNameResolver$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public UserNameResolver$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((UserNameResolver) this.f$0).lambda$resolve$0((String) this.f$1, (TLRPC.TL_error) this.f$2, (TLObject) this.f$3);
                break;
            case 1:
                ((SendMessagesHelper) this.f$0).lambda$performSendDelayedMessage$57((TLObject) this.f$3, (SendMessagesHelper.DelayedMessage) this.f$2, (String) this.f$1);
                break;
            case 2:
                ((SendMessagesHelper) this.f$0).lambda$sendMessage$19((TLRPC.TL_messages_forwardMessages) this.f$1, (ArrayList) this.f$2, (SendMessagesHelper$$ExternalSyntheticLambda15) this.f$3);
                break;
            case 3:
                ((SendMessagesHelper) this.f$0).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.f$1, (File) this.f$2, (MessageObject) this.f$3);
                break;
            case 4:
                ((TelegramMediaSession) this.f$0).lambda$loadBrowseChildren$4((MessagesStorage) this.f$2, (TelegramMediaSession.BrowseChildrenCallback) this.f$3, (String) this.f$1);
                break;
            default:
                ((UnconfirmedAuthController) this.f$0).lambda$readCache$0((ArrayList) this.f$1, (HashSet) this.f$2, (ArrayList) this.f$3);
                break;
        }
    }

    public UserNameResolver$$ExternalSyntheticLambda2(SendMessagesHelper sendMessagesHelper, TLObject tLObject, SendMessagesHelper.DelayedMessage delayedMessage, String str) {
        this.$r8$classId = 1;
        this.f$0 = sendMessagesHelper;
        this.f$3 = tLObject;
        this.f$2 = delayedMessage;
        this.f$1 = str;
    }

    public UserNameResolver$$ExternalSyntheticLambda2(TelegramMediaSession telegramMediaSession, MessagesStorage messagesStorage, TelegramMediaSession.BrowseChildrenCallback browseChildrenCallback, String str) {
        this.$r8$classId = 4;
        this.f$0 = telegramMediaSession;
        this.f$2 = messagesStorage;
        this.f$3 = browseChildrenCallback;
        this.f$1 = str;
    }
}
