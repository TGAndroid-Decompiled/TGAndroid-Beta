package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fj implements Runnable {
    public final int f17243a;
    public final Object f17244b;
    public final Object f17245c;
    public final Object d;
    public final Object e;

    public fj(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17243a = i10;
        this.f17244b = obj;
        this.f17245c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f17243a) {
            case 0:
                ((SendMessagesHelper) this.f17244b).lambda$performSendDelayedMessage$57((TLObject) this.f17245c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e);
                return;
            case 1:
                ((SendMessagesHelper) this.f17244b).lambda$sendMessage$19((TLRPC.TL_messages_forwardMessages) this.f17245c, (ArrayList) this.d, (jj) this.e);
                return;
            case 2:
                ((SendMessagesHelper) this.f17244b).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.d, (File) this.f17245c, (MessageObject) this.e);
                return;
            case 3:
                ((TelegramMediaSession) this.f17244b).lambda$loadBrowseChildren$4((MessagesStorage) this.f17245c, (TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.e);
                return;
            case 4:
                ((UnconfirmedAuthController) this.f17244b).lambda$readCache$0((ArrayList) this.f17245c, (HashSet) this.d, (ArrayList) this.e);
                return;
            default:
                ((UserNameResolver) this.f17244b).lambda$resolve$0((String) this.e, (TLRPC.TL_error) this.d, (TLObject) this.f17245c);
                return;
        }
    }

    public fj(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17243a = 5;
        this.f17244b = userNameResolver;
        this.e = str;
        this.d = tL_error;
        this.f17245c = tLObject;
    }

    public fj(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.DelayedMessage delayedMessage, File file, MessageObject messageObject) {
        this.f17243a = 2;
        this.f17244b = sendMessagesHelper;
        this.d = delayedMessage;
        this.f17245c = file;
        this.e = messageObject;
    }
}
