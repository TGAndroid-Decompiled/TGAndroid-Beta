package gg;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x0 implements RequestDelegate {
    public final int f9973a = 0;
    public final boolean f9974b;
    public final NotificationCenter.NotificationCenterDelegate f9975c;
    public final Serializable d;
    public final Object e;
    public final Serializable f9976f;
    public final Object f9977g;
    public final Object h;

    public x0(k1 k1Var, String str, boolean z10, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f9975c = k1Var;
        this.d = str;
        this.f9974b = z10;
        this.f9977g = user;
        this.e = str2;
        this.h = messagesStorage;
        this.f9976f = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9973a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y0((k1) this.f9975c, (String) this.d, this.f9974b, tLObject, (TLRPC.User) this.f9977g, (String) this.e, (MessagesStorage) this.h, (String) this.f9976f));
                return;
            default:
                ((SendMessagesHelper) this.f9975c).lambda$performSendMessageRequestMulti$74((ArrayList) this.d, (TLObject) this.e, (ArrayList) this.f9976f, (ArrayList) this.f9977g, (SendMessagesHelper.DelayedMessage) this.h, this.f9974b, tLObject, tL_error);
                return;
        }
    }

    public x0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z10) {
        this.f9975c = sendMessagesHelper;
        this.d = arrayList;
        this.e = tLObject;
        this.f9976f = arrayList2;
        this.f9977g = arrayList3;
        this.h = delayedMessage;
        this.f9974b = z10;
    }
}
