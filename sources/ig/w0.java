package ig;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w0 implements RequestDelegate {
    public final int f14280a = 0;
    public final boolean f14281b;
    public final NotificationCenter.NotificationCenterDelegate f14282c;
    public final Serializable d;
    public final Object e;
    public final Serializable f14283f;
    public final Object f14284g;
    public final Object h;

    public w0(j1 j1Var, String str, boolean z10, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f14282c = j1Var;
        this.d = str;
        this.f14281b = z10;
        this.f14284g = user;
        this.e = str2;
        this.h = messagesStorage;
        this.f14283f = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14280a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x0((j1) this.f14282c, (String) this.d, this.f14281b, tLObject, (TLRPC.User) this.f14284g, (String) this.e, (MessagesStorage) this.h, (String) this.f14283f));
                return;
            default:
                ((SendMessagesHelper) this.f14282c).lambda$performSendMessageRequestMulti$77((ArrayList) this.d, (TLObject) this.e, (ArrayList) this.f14283f, (ArrayList) this.f14284g, (SendMessagesHelper.DelayedMessage) this.h, this.f14281b, tLObject, tL_error);
                return;
        }
    }

    public w0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z10) {
        this.f14282c = sendMessagesHelper;
        this.d = arrayList;
        this.e = tLObject;
        this.f14283f = arrayList2;
        this.f14284g = arrayList3;
        this.h = delayedMessage;
        this.f14281b = z10;
    }
}
