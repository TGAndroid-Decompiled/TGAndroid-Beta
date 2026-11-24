package defpackage;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class rt0 implements RequestDelegate {
    public final byte a;
    public final long b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;

    public rt0(au0 au0Var, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z, long j) {
        this.a = (byte) 0;
        this.d = au0Var;
        this.e = twoStepVerificationActivity;
        this.f = activity;
        this.c = z;
        this.b = j;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                gm.c3(new st0((au0) obj3, tL_error, (TwoStepVerificationActivity) obj2, (Activity) obj, this.c, this.b, tLObject));
                return;
            case 1:
                gm.c3(new qf2((uf2) obj3, tLObject, this.b, this.c, (String) obj2, (jd) obj));
                return;
            case 2:
                n07 n07Var = (n07) obj3;
                n07Var.getClass();
                gm.c3(new st0(n07Var, tL_error, tLObject, (TLRPC.TL_chatInviteImporter) obj2, this.c, this.b, (p07) obj));
                return;
            case 3:
                oc7 oc7Var = (oc7) obj3;
                vh6 vh6Var = (vh6) obj2;
                kc7 kc7Var = (kc7) obj;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = null;
                if (tLObject != null) {
                    TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers2 = (TLRPC.TL_channels_sendAsPeers) tLObject;
                    if (!tL_channels_sendAsPeers2.peers.isEmpty()) {
                        gm.c3(new q87(oc7Var, tL_channels_sendAsPeers2, (byte) 7));
                        tL_channels_sendAsPeers = tL_channels_sendAsPeers2;
                    }
                }
                gm.c3(new ut0(oc7Var, tL_channels_sendAsPeers, vh6Var, this.b, kc7Var, this.c, (byte) 4));
                return;
            case 4:
                gm.c3(new ut0((h4b) obj3, tL_error, this.c, this.b, (qac) obj2, (ylb) obj));
                return;
            case 5:
                gm.c3(new ut0((qwb) obj3, tLObject, this.c, this.b, (HashSet) obj2, (n40) obj));
                return;
            default:
                gm.c3(new st0((b3c) obj3, (x2c) obj2, tLObject, this.c, tL_error, this.b, (HashSet) obj));
                return;
        }
    }

    public rt0(pg0 pg0Var, Object obj, boolean z, long j, Object obj2, byte b) {
        this.a = b;
        this.d = pg0Var;
        this.e = obj;
        this.c = z;
        this.b = j;
        this.f = obj2;
    }

    public rt0(uf2 uf2Var, long j, boolean z, String str, jd jdVar) {
        this.a = (byte) 1;
        this.d = uf2Var;
        this.b = j;
        this.c = z;
        this.e = str;
        this.f = jdVar;
    }

    public rt0(oc7 oc7Var, vh6 vh6Var, long j, kc7 kc7Var, boolean z) {
        this.a = (byte) 3;
        this.d = oc7Var;
        this.e = vh6Var;
        this.b = j;
        this.f = kc7Var;
        this.c = z;
    }

    public rt0(Object obj, boolean z, long j, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.c = z;
        this.b = j;
        this.e = obj2;
        this.f = obj3;
    }
}
