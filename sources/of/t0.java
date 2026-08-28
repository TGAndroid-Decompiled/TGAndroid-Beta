package of;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t0 implements RequestDelegate {
    public final int f19504a = 1;
    public final boolean f19505b;
    public final NotificationCenter.NotificationCenterDelegate f19506c;
    public final Serializable d;
    public final Object f19507e;
    public final Serializable f19508f;
    public final Object f19509g;
    public final Object h;

    public t0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z10) {
        this.f19506c = sendMessagesHelper;
        this.d = arrayList;
        this.f19507e = tLObject;
        this.f19508f = arrayList2;
        this.f19509g = arrayList3;
        this.h = delayedMessage;
        this.f19505b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19504a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u0((f1) this.f19506c, (String) this.d, this.f19505b, tLObject, (TLRPC.User) this.f19509g, (String) this.f19507e, (MessagesStorage) this.h, (String) this.f19508f));
                return;
            default:
                ((SendMessagesHelper) this.f19506c).lambda$performSendMessageRequestMulti$74((ArrayList) this.d, (TLObject) this.f19507e, (ArrayList) this.f19508f, (ArrayList) this.f19509g, (SendMessagesHelper.DelayedMessage) this.h, this.f19505b, tLObject, tL_error);
                return;
        }
    }

    public t0(f1 f1Var, String str, boolean z10, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f19506c = f1Var;
        this.d = str;
        this.f19505b = z10;
        this.f19509g = user;
        this.f19507e = str2;
        this.h = messagesStorage;
        this.f19508f = str3;
    }
}
