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
    public final int f9978a = 0;
    public final boolean f9979b;
    public final NotificationCenter.NotificationCenterDelegate f9980c;
    public final Serializable d;
    public final Object e;
    public final Serializable f9981f;
    public final Object f9982g;
    public final Object h;

    public x0(k1 k1Var, String str, boolean z10, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f9980c = k1Var;
        this.d = str;
        this.f9979b = z10;
        this.f9982g = user;
        this.e = str2;
        this.h = messagesStorage;
        this.f9981f = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9978a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y0((k1) this.f9980c, (String) this.d, this.f9979b, tLObject, (TLRPC.User) this.f9982g, (String) this.e, (MessagesStorage) this.h, (String) this.f9981f));
                return;
            default:
                ((SendMessagesHelper) this.f9980c).lambda$performSendMessageRequestMulti$74((ArrayList) this.d, (TLObject) this.e, (ArrayList) this.f9981f, (ArrayList) this.f9982g, (SendMessagesHelper.DelayedMessage) this.h, this.f9979b, tLObject, tL_error);
                return;
        }
    }

    public x0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z10) {
        this.f9980c = sendMessagesHelper;
        this.d = arrayList;
        this.e = tLObject;
        this.f9981f = arrayList2;
        this.f9982g = arrayList3;
        this.h = delayedMessage;
        this.f9979b = z10;
    }
}
