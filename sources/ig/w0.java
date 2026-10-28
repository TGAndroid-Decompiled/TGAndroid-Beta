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
    public final int f14279a = 0;
    public final boolean f14280b;
    public final NotificationCenter.NotificationCenterDelegate f14281c;
    public final Serializable d;
    public final Object e;
    public final Serializable f14282f;
    public final Object f14283g;
    public final Object h;

    public w0(j1 j1Var, String str, boolean z10, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f14281c = j1Var;
        this.d = str;
        this.f14280b = z10;
        this.f14283g = user;
        this.e = str2;
        this.h = messagesStorage;
        this.f14282f = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14279a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x0((j1) this.f14281c, (String) this.d, this.f14280b, tLObject, (TLRPC.User) this.f14283g, (String) this.e, (MessagesStorage) this.h, (String) this.f14282f));
                return;
            default:
                ((SendMessagesHelper) this.f14281c).lambda$performSendMessageRequestMulti$77((ArrayList) this.d, (TLObject) this.e, (ArrayList) this.f14282f, (ArrayList) this.f14283g, (SendMessagesHelper.DelayedMessage) this.h, this.f14280b, tLObject, tL_error);
                return;
        }
    }

    public w0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z10) {
        this.f14281c = sendMessagesHelper;
        this.d = arrayList;
        this.e = tLObject;
        this.f14282f = arrayList2;
        this.f14283g = arrayList3;
        this.h = delayedMessage;
        this.f14280b = z10;
    }
}
