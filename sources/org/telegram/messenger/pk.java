package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pk implements RequestDelegate {
    public final int f19719a = 0;
    public final boolean f19720b;
    public final NotificationCenter.NotificationCenterDelegate f19721c;
    public final Serializable d;
    public final Object f19722e;
    public final Serializable f19723f;
    public final Object f19724g;
    public final Object h;

    public pk(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z4) {
        this.f19721c = sendMessagesHelper;
        this.d = arrayList;
        this.f19724g = tLObject;
        this.f19722e = arrayList2;
        this.f19723f = arrayList3;
        this.h = delayedMessage;
        this.f19720b = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19719a) {
            case 0:
                ((SendMessagesHelper) this.f19721c).lambda$performSendMessageRequestMulti$74((ArrayList) this.d, (TLObject) this.f19724g, (ArrayList) this.f19722e, (ArrayList) this.f19723f, (SendMessagesHelper.DelayedMessage) this.h, this.f19720b, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new t1((uf.u0) this.f19721c, (String) this.d, this.f19720b, tLObject, (TLRPC.User) this.f19722e, (String) this.f19723f, (MessagesStorage) this.f19724g, (String) this.h));
                return;
        }
    }

    public pk(uf.u0 u0Var, String str, boolean z4, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f19721c = u0Var;
        this.d = str;
        this.f19720b = z4;
        this.f19722e = user;
        this.f19723f = str2;
        this.f19724g = messagesStorage;
        this.h = str3;
    }
}
