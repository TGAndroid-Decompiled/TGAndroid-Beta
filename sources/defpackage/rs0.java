package defpackage;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class rs0 implements RequestDelegate {
    public final byte a;
    public final long b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;

    public rs0(at0 at0Var, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z, long j) {
        this.a = (byte) 0;
        this.d = at0Var;
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
                hl.c3(new ss0((at0) obj3, tL_error, (TwoStepVerificationActivity) obj2, (Activity) obj, this.c, this.b, tLObject));
                return;
            case 1:
                hl.c3(new re2((af2) obj3, tLObject, this.b, this.c, (String) obj2, (kc) obj));
                return;
            case 2:
                u07 u07Var = (u07) obj3;
                u07Var.getClass();
                hl.c3(new ss0(u07Var, tL_error, tLObject, (TLRPC.TL_chatInviteImporter) obj2, this.c, this.b, (w07) obj));
                return;
            case 3:
                uc7 uc7Var = (uc7) obj3;
                zh6 zh6Var = (zh6) obj2;
                qc7 qc7Var = (qc7) obj;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = null;
                if (tLObject != null) {
                    TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers2 = (TLRPC.TL_channels_sendAsPeers) tLObject;
                    if (!tL_channels_sendAsPeers2.peers.isEmpty()) {
                        hl.c3(new t87(uc7Var, tL_channels_sendAsPeers2, (byte) 3));
                        tL_channels_sendAsPeers = tL_channels_sendAsPeers2;
                    }
                }
                hl.c3(new us0(uc7Var, tL_channels_sendAsPeers, zh6Var, this.b, qc7Var, this.c, (byte) 4));
                return;
            case 4:
                hl.c3(new us0((c6b) obj3, tL_error, this.c, this.b, (pcc) obj2, (vnb) obj));
                return;
            case 5:
                hl.c3(new us0((qyb) obj3, tLObject, this.c, this.b, (HashSet) obj2, (o30) obj));
                return;
            default:
                hl.c3(new ss0((a5c) obj3, (w4c) obj2, tLObject, this.c, tL_error, this.b, (HashSet) obj));
                return;
        }
    }

    public rs0(rf0 rf0Var, Object obj, boolean z, long j, Object obj2, byte b) {
        this.a = b;
        this.d = rf0Var;
        this.e = obj;
        this.c = z;
        this.b = j;
        this.f = obj2;
    }

    public rs0(af2 af2Var, long j, boolean z, String str, kc kcVar) {
        this.a = (byte) 1;
        this.d = af2Var;
        this.b = j;
        this.c = z;
        this.e = str;
        this.f = kcVar;
    }

    public rs0(uc7 uc7Var, zh6 zh6Var, long j, qc7 qc7Var, boolean z) {
        this.a = (byte) 3;
        this.d = uc7Var;
        this.e = zh6Var;
        this.b = j;
        this.f = qc7Var;
        this.c = z;
    }

    public rs0(Object obj, boolean z, long j, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.c = z;
        this.b = j;
        this.e = obj2;
        this.f = obj3;
    }
}
