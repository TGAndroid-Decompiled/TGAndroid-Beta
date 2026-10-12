package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fj implements Runnable {
    public final int f17620a;
    public final Object f17621b;
    public final Object f17622c;
    public final Object d;
    public final Object f17623e;

    public fj(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17620a = i10;
        this.f17621b = obj;
        this.f17622c = obj2;
        this.d = obj3;
        this.f17623e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f17620a) {
            case 0:
                ((SendMessagesHelper) this.f17621b).lambda$performSendDelayedMessage$60((TLObject) this.f17622c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f17623e);
                return;
            case 1:
                ((SendMessagesHelper) this.f17621b).lambda$sendMessage$22((TLRPC.TL_messages_forwardMessages) this.f17622c, (ArrayList) this.d, (yj) this.f17623e);
                return;
            case 2:
                ((SendMessagesHelper) this.f17621b).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.d, (File) this.f17622c, (MessageObject) this.f17623e);
                return;
            case 3:
                ((UnconfirmedAuthController) this.f17621b).lambda$readCache$0((ArrayList) this.f17622c, (HashSet) this.d, (ArrayList) this.f17623e);
                return;
            default:
                ((UserNameResolver) this.f17621b).lambda$resolve$0((String) this.f17623e, (TLRPC.TL_error) this.d, (TLObject) this.f17622c);
                return;
        }
    }

    public fj(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17620a = 4;
        this.f17621b = userNameResolver;
        this.f17623e = str;
        this.d = tL_error;
        this.f17622c = tLObject;
    }

    public fj(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.DelayedMessage delayedMessage, File file, MessageObject messageObject) {
        this.f17620a = 2;
        this.f17621b = sendMessagesHelper;
        this.d = delayedMessage;
        this.f17622c = file;
        this.f17623e = messageObject;
    }
}
