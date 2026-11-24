package defpackage;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ta7 implements RequestDelegate {
    public final byte a = 2;
    public final Object b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final boolean g;
    public final Object h;

    public ta7(oc7 oc7Var, long j, int i, int i2, long j2, boolean z, ho1 ho1Var) {
        this.b = oc7Var;
        this.c = j;
        this.e = i;
        this.f = i2;
        this.d = j2;
        this.g = z;
        this.h = ho1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                oc7 oc7Var = (oc7) obj2;
                ho1 ho1Var = (ho1) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    oc7Var.R3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    oc7Var.getMessagesStorage().a.c(new xa7(oc7Var, this.c, this.e, this.f, this.d, tL_messages_affectedHistory, this.g, ho1Var));
                    return;
                }
                gm.c3(new pg6(ho1Var, (byte) 22));
                return;
            case 1:
                oc7 oc7Var2 = (oc7) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                long j = this.c;
                if (j != 0) {
                    oc7Var2.getMessagesStorage().n1(j);
                }
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory2 = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i = tL_messages_affectedHistory2.offset;
                    long j2 = this.d;
                    if (i > 0) {
                        oc7Var2.U(j2, 0, this.e, this.f, this.g, inputPeer, 0L);
                    }
                    oc7Var2.R3(tL_messages_affectedHistory2.pts, -1, tL_messages_affectedHistory2.pts_count);
                    cf7 messagesStorage = oc7Var2.getMessagesStorage();
                    messagesStorage.a.c(new vc7(messagesStorage, j2, (byte) 5));
                    return;
                }
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.e, this.c, this.d, this.f, this.g, (Context) obj2, (String) obj, tLObject, tL_error);
                return;
        }
    }

    public ta7(oc7 oc7Var, long j, long j2, int i, int i2, boolean z, TLRPC.InputPeer inputPeer) {
        this.b = oc7Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = inputPeer;
    }

    public ta7(Context context, int i, long j, String str, long j2, int i2, boolean z) {
        this.e = i;
        this.c = j;
        this.d = j2;
        this.f = i2;
        this.g = z;
        this.b = context;
        this.h = str;
    }
}
