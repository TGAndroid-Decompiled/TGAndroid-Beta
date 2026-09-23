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
    public final int f9960a = 0;
    public final boolean f9961b;
    public final NotificationCenter.NotificationCenterDelegate f9962c;
    public final Serializable d;
    public final Object e;
    public final Serializable f9963f;
    public final Object f9964g;
    public final Object h;

    public x0(k1 k1Var, String str, boolean z10, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f9962c = k1Var;
        this.d = str;
        this.f9961b = z10;
        this.f9964g = user;
        this.e = str2;
        this.h = messagesStorage;
        this.f9963f = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9960a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y0((k1) this.f9962c, (String) this.d, this.f9961b, tLObject, (TLRPC.User) this.f9964g, (String) this.e, (MessagesStorage) this.h, (String) this.f9963f));
                return;
            default:
                ((SendMessagesHelper) this.f9962c).lambda$performSendMessageRequestMulti$74((ArrayList) this.d, (TLObject) this.e, (ArrayList) this.f9963f, (ArrayList) this.f9964g, (SendMessagesHelper.DelayedMessage) this.h, this.f9961b, tLObject, tL_error);
                return;
        }
    }

    public x0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z10) {
        this.f9962c = sendMessagesHelper;
        this.d = arrayList;
        this.e = tLObject;
        this.f9963f = arrayList2;
        this.f9964g = arrayList3;
        this.h = delayedMessage;
        this.f9961b = z10;
    }
}
