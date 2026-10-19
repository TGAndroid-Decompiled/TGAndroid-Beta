package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ui implements Runnable {
    public final int f19683a;
    public final Object f19684b;
    public final Object f19685c;
    public final Object d;
    public final Object e;

    public ui(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19683a = i10;
        this.f19684b = obj;
        this.f19685c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f19683a) {
            case 0:
                ((SendMessagesHelper) this.f19684b).lambda$performSendDelayedMessage$60((TLObject) this.f19685c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e);
                return;
            case 1:
                ((SendMessagesHelper) this.f19684b).lambda$sendMessage$22((TLRPC.TL_messages_forwardMessages) this.f19685c, (ArrayList) this.d, (nj) this.e);
                return;
            case 2:
                ((SendMessagesHelper) this.f19684b).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.d, (File) this.f19685c, (MessageObject) this.e);
                return;
            case 3:
                ((UnconfirmedAuthController) this.f19684b).lambda$readCache$0((ArrayList) this.f19685c, (HashSet) this.d, (ArrayList) this.e);
                return;
            default:
                ((UserNameResolver) this.f19684b).lambda$resolve$0((String) this.e, (TLRPC.TL_error) this.d, (TLObject) this.f19685c);
                return;
        }
    }

    public ui(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19683a = 4;
        this.f19684b = userNameResolver;
        this.e = str;
        this.d = tL_error;
        this.f19685c = tLObject;
    }

    public ui(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.DelayedMessage delayedMessage, File file, MessageObject messageObject) {
        this.f19683a = 2;
        this.f19684b = sendMessagesHelper;
        this.d = delayedMessage;
        this.f19685c = file;
        this.e = messageObject;
    }
}
