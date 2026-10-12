package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f17017a;
    public final Object f17018b;
    public final Object f17019c;
    public final Object d;
    public final Object e;

    public cj(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17017a = i10;
        this.f17018b = obj;
        this.f17019c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f17017a) {
            case 0:
                ((SendMessagesHelper) this.f17018b).lambda$performSendDelayedMessage$60((TLObject) this.f17019c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e);
                return;
            case 1:
                ((SendMessagesHelper) this.f17018b).lambda$sendMessage$22((TLRPC.TL_messages_forwardMessages) this.f17019c, (ArrayList) this.d, (vj) this.e);
                return;
            case 2:
                ((SendMessagesHelper) this.f17018b).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.d, (File) this.f17019c, (MessageObject) this.e);
                return;
            case 3:
                ((UnconfirmedAuthController) this.f17018b).lambda$readCache$0((ArrayList) this.f17019c, (HashSet) this.d, (ArrayList) this.e);
                return;
            default:
                ((UserNameResolver) this.f17018b).lambda$resolve$0((String) this.e, (TLRPC.TL_error) this.d, (TLObject) this.f17019c);
                return;
        }
    }

    public cj(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17017a = 4;
        this.f17018b = userNameResolver;
        this.e = str;
        this.d = tL_error;
        this.f17019c = tLObject;
    }

    public cj(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.DelayedMessage delayedMessage, File file, MessageObject messageObject) {
        this.f17017a = 2;
        this.f17018b = sendMessagesHelper;
        this.d = delayedMessage;
        this.f17019c = file;
        this.e = messageObject;
    }
}
