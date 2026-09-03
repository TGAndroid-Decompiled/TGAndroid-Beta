package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pk implements RequestDelegate {
    public final int f19721a = 0;
    public final boolean f19722b;
    public final NotificationCenter.NotificationCenterDelegate f19723c;
    public final Serializable d;
    public final Object f19724e;
    public final Serializable f19725f;
    public final Object f19726g;
    public final Object h;

    public pk(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z4) {
        this.f19723c = sendMessagesHelper;
        this.d = arrayList;
        this.f19726g = tLObject;
        this.f19724e = arrayList2;
        this.f19725f = arrayList3;
        this.h = delayedMessage;
        this.f19722b = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19721a) {
            case 0:
                ((SendMessagesHelper) this.f19723c).lambda$performSendMessageRequestMulti$74((ArrayList) this.d, (TLObject) this.f19726g, (ArrayList) this.f19724e, (ArrayList) this.f19725f, (SendMessagesHelper.DelayedMessage) this.h, this.f19722b, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new t1((uf.u0) this.f19723c, (String) this.d, this.f19722b, tLObject, (TLRPC.User) this.f19724e, (String) this.f19725f, (MessagesStorage) this.f19726g, (String) this.h));
                return;
        }
    }

    public pk(uf.u0 u0Var, String str, boolean z4, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f19723c = u0Var;
        this.d = str;
        this.f19722b = z4;
        this.f19724e = user;
        this.f19725f = str2;
        this.f19726g = messagesStorage;
        this.h = str3;
    }
}
