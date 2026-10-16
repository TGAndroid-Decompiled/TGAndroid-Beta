package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f16713a;
    public final Object f16714b;
    public final Object f16715c;
    public final Object d;
    public final Object e;

    public cj(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f16713a = i10;
        this.f16714b = obj;
        this.f16715c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f16713a) {
            case 0:
                ((SendMessagesHelper) this.f16714b).lambda$performSendDelayedMessage$60((TLObject) this.f16715c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e);
                return;
            case 1:
                ((SendMessagesHelper) this.f16714b).lambda$sendMessage$22((TLRPC.TL_messages_forwardMessages) this.f16715c, (ArrayList) this.d, (vj) this.e);
                return;
            case 2:
                ((SendMessagesHelper) this.f16714b).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.d, (File) this.f16715c, (MessageObject) this.e);
                return;
            case 3:
                ((UnconfirmedAuthController) this.f16714b).lambda$readCache$0((ArrayList) this.f16715c, (HashSet) this.d, (ArrayList) this.e);
                return;
            default:
                ((UserNameResolver) this.f16714b).lambda$resolve$0((String) this.e, (TLRPC.TL_error) this.d, (TLObject) this.f16715c);
                return;
        }
    }

    public cj(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f16713a = 4;
        this.f16714b = userNameResolver;
        this.e = str;
        this.d = tL_error;
        this.f16715c = tLObject;
    }

    public cj(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.DelayedMessage delayedMessage, File file, MessageObject messageObject) {
        this.f16713a = 2;
        this.f16714b = sendMessagesHelper;
        this.d = delayedMessage;
        this.f16715c = file;
        this.e = messageObject;
    }
}
