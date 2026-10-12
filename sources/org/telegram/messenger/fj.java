package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fj implements Runnable {
    public final int f17621a;
    public final Object f17622b;
    public final Object f17623c;
    public final Object d;
    public final Object f17624e;

    public fj(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17621a = i10;
        this.f17622b = obj;
        this.f17623c = obj2;
        this.d = obj3;
        this.f17624e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f17621a) {
            case 0:
                ((SendMessagesHelper) this.f17622b).lambda$performSendDelayedMessage$60((TLObject) this.f17623c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f17624e);
                return;
            case 1:
                ((SendMessagesHelper) this.f17622b).lambda$sendMessage$22((TLRPC.TL_messages_forwardMessages) this.f17623c, (ArrayList) this.d, (yj) this.f17624e);
                return;
            case 2:
                ((SendMessagesHelper) this.f17622b).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.d, (File) this.f17623c, (MessageObject) this.f17624e);
                return;
            case 3:
                ((UnconfirmedAuthController) this.f17622b).lambda$readCache$0((ArrayList) this.f17623c, (HashSet) this.d, (ArrayList) this.f17624e);
                return;
            default:
                ((UserNameResolver) this.f17622b).lambda$resolve$0((String) this.f17624e, (TLRPC.TL_error) this.d, (TLObject) this.f17623c);
                return;
        }
    }

    public fj(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17621a = 4;
        this.f17622b = userNameResolver;
        this.f17624e = str;
        this.d = tL_error;
        this.f17623c = tLObject;
    }

    public fj(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.DelayedMessage delayedMessage, File file, MessageObject messageObject) {
        this.f17621a = 2;
        this.f17622b = sendMessagesHelper;
        this.d = delayedMessage;
        this.f17623c = file;
        this.f17624e = messageObject;
    }
}
