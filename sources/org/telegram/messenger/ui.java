package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ui implements Runnable {
    public final int f19686a;
    public final Object f19687b;
    public final Object f19688c;
    public final Object d;
    public final Object e;

    public ui(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19686a = i10;
        this.f19687b = obj;
        this.f19688c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f19686a) {
            case 0:
                ((SendMessagesHelper) this.f19687b).lambda$performSendDelayedMessage$60((TLObject) this.f19688c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e);
                return;
            case 1:
                ((SendMessagesHelper) this.f19687b).lambda$sendMessage$22((TLRPC.TL_messages_forwardMessages) this.f19688c, (ArrayList) this.d, (nj) this.e);
                return;
            case 2:
                ((SendMessagesHelper) this.f19687b).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.d, (File) this.f19688c, (MessageObject) this.e);
                return;
            case 3:
                ((UnconfirmedAuthController) this.f19687b).lambda$readCache$0((ArrayList) this.f19688c, (HashSet) this.d, (ArrayList) this.e);
                return;
            default:
                ((UserNameResolver) this.f19687b).lambda$resolve$0((String) this.e, (TLRPC.TL_error) this.d, (TLObject) this.f19688c);
                return;
        }
    }

    public ui(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19686a = 4;
        this.f19687b = userNameResolver;
        this.e = str;
        this.d = tL_error;
        this.f19688c = tLObject;
    }

    public ui(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.DelayedMessage delayedMessage, File file, MessageObject messageObject) {
        this.f19686a = 2;
        this.f19687b = sendMessagesHelper;
        this.d = delayedMessage;
        this.f19688c = file;
        this.e = messageObject;
    }
}
