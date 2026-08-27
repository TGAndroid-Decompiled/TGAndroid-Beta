package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ik implements RequestDelegate {

    public final int f20606a = 0;

    public final boolean f20607b;

    public final NotificationCenter.NotificationCenterDelegate f20608c;
    public final Serializable d;

    public final Object f20609e;

    public final Serializable f20610f;

    public final Object f20611g;
    public final Object h;

    public ik(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z10) {
        this.f20608c = sendMessagesHelper;
        this.d = arrayList;
        this.f20611g = tLObject;
        this.f20609e = arrayList2;
        this.f20610f = arrayList3;
        this.h = delayedMessage;
        this.f20607b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20606a) {
            case 0:
                ((SendMessagesHelper) this.f20608c).lambda$performSendMessageRequestMulti$74((ArrayList) this.d, (TLObject) this.f20611g, (ArrayList) this.f20609e, (ArrayList) this.f20610f, (SendMessagesHelper.DelayedMessage) this.h, this.f20607b, tLObject, tL_error);
                break;
            default:
                AndroidUtilities.runOnUIThread(new s1((pf.u0) this.f20608c, (String) this.d, this.f20607b, tLObject, (TLRPC.User) this.f20609e, (String) this.f20610f, (MessagesStorage) this.f20611g, (String) this.h));
                break;
        }
    }

    public ik(pf.u0 u0Var, String str, boolean z10, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f20608c = u0Var;
        this.d = str;
        this.f20607b = z10;
        this.f20609e = user;
        this.f20610f = str2;
        this.f20611g = messagesStorage;
        this.h = str3;
    }
}
