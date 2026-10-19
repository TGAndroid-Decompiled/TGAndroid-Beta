package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vi implements Runnable {
    public final int f19764a;
    public final Object f19765b;
    public final Object f19766c;
    public final Object d;
    public final Object e;

    public vi(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19764a = i10;
        this.f19765b = obj;
        this.f19766c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f19764a) {
            case 0:
                ((SendMessagesHelper) this.f19765b).lambda$performSendDelayedMessage$60((TLObject) this.f19766c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e);
                return;
            case 1:
                ((SendMessagesHelper) this.f19765b).lambda$sendMessage$22((TLRPC.TL_messages_forwardMessages) this.f19766c, (ArrayList) this.d, (oj) this.e);
                return;
            case 2:
                ((SendMessagesHelper) this.f19765b).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.d, (File) this.f19766c, (MessageObject) this.e);
                return;
            case 3:
                ((UnconfirmedAuthController) this.f19765b).lambda$readCache$0((ArrayList) this.f19766c, (HashSet) this.d, (ArrayList) this.e);
                return;
            default:
                ((UserNameResolver) this.f19765b).lambda$resolve$0((String) this.e, (TLRPC.TL_error) this.d, (TLObject) this.f19766c);
                return;
        }
    }

    public vi(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19764a = 4;
        this.f19765b = userNameResolver;
        this.e = str;
        this.d = tL_error;
        this.f19766c = tLObject;
    }

    public vi(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.DelayedMessage delayedMessage, File file, MessageObject messageObject) {
        this.f19764a = 2;
        this.f19765b = sendMessagesHelper;
        this.d = delayedMessage;
        this.f19766c = file;
        this.e = messageObject;
    }
}
