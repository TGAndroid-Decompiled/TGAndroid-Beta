package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pk implements RequestDelegate {
    public final int f18137a = 0;
    public final boolean f18138b;
    public final NotificationCenter.NotificationCenterDelegate f18139c;
    public final Serializable d;
    public final Object e;
    public final Serializable f18140f;
    public final Object f18141g;
    public final Object h;

    public pk(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z4) {
        this.f18139c = sendMessagesHelper;
        this.d = arrayList;
        this.f18141g = tLObject;
        this.e = arrayList2;
        this.f18140f = arrayList3;
        this.h = delayedMessage;
        this.f18138b = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18137a) {
            case 0:
                ((SendMessagesHelper) this.f18139c).lambda$performSendMessageRequestMulti$74((ArrayList) this.d, (TLObject) this.f18141g, (ArrayList) this.e, (ArrayList) this.f18140f, (SendMessagesHelper.DelayedMessage) this.h, this.f18138b, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new t1((tf.u0) this.f18139c, (String) this.d, this.f18138b, tLObject, (TLRPC.User) this.e, (String) this.f18140f, (MessagesStorage) this.f18141g, (String) this.h));
                return;
        }
    }

    public pk(tf.u0 u0Var, String str, boolean z4, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f18139c = u0Var;
        this.d = str;
        this.f18138b = z4;
        this.e = user;
        this.f18140f = str2;
        this.f18141g = messagesStorage;
        this.h = str3;
    }
}
