package hg;

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
    public final int f11331a = 0;
    public final boolean f11332b;
    public final NotificationCenter.NotificationCenterDelegate f11333c;
    public final Serializable d;
    public final Object f11334e;
    public final Serializable f11335f;
    public final Object f11336g;
    public final Object h;

    public x0(k1 k1Var, String str, boolean z10, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f11333c = k1Var;
        this.d = str;
        this.f11332b = z10;
        this.f11336g = user;
        this.f11334e = str2;
        this.h = messagesStorage;
        this.f11335f = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f11331a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y0((k1) this.f11333c, (String) this.d, this.f11332b, tLObject, (TLRPC.User) this.f11336g, (String) this.f11334e, (MessagesStorage) this.h, (String) this.f11335f));
                return;
            default:
                ((SendMessagesHelper) this.f11333c).lambda$performSendMessageRequestMulti$74((ArrayList) this.d, (TLObject) this.f11334e, (ArrayList) this.f11335f, (ArrayList) this.f11336g, (SendMessagesHelper.DelayedMessage) this.h, this.f11332b, tLObject, tL_error);
                return;
        }
    }

    public x0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z10) {
        this.f11333c = sendMessagesHelper;
        this.d = arrayList;
        this.f11334e = tLObject;
        this.f11335f = arrayList2;
        this.f11336g = arrayList3;
        this.h = delayedMessage;
        this.f11332b = z10;
    }
}
