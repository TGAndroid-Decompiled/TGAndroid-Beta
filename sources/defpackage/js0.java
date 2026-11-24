package defpackage;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class js0 implements RequestDelegate {
    public final byte a;
    public final long b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;

    public js0(ss0 ss0Var, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z, long j) {
        this.a = (byte) 0;
        this.d = ss0Var;
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
                gl.d3(new ks0((ss0) obj3, tL_error, (TwoStepVerificationActivity) obj2, (Activity) obj, this.c, this.b, tLObject));
                return;
            case 1:
                gl.d3(new fe2((je2) obj3, tLObject, this.b, this.c, (String) obj2, (jc) obj));
                return;
            case 2:
                ny6 ny6Var = (ny6) obj3;
                ny6Var.getClass();
                gl.d3(new ks0(ny6Var, tL_error, tLObject, (TLRPC.TL_chatInviteImporter) obj2, this.c, this.b, (py6) obj));
                return;
            case 3:
                na7 na7Var = (na7) obj3;
                vf6 vf6Var = (vf6) obj2;
                ja7 ja7Var = (ja7) obj;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = null;
                if (tLObject != null) {
                    TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers2 = (TLRPC.TL_channels_sendAsPeers) tLObject;
                    if (!tL_channels_sendAsPeers2.peers.isEmpty()) {
                        gl.d3(new t67(na7Var, tL_channels_sendAsPeers2, (byte) 6));
                        tL_channels_sendAsPeers = tL_channels_sendAsPeers2;
                    }
                }
                gl.d3(new ms0(na7Var, tL_channels_sendAsPeers, vf6Var, this.b, ja7Var, this.c, (byte) 4));
                return;
            case 4:
                gl.d3(new ms0((g2b) obj3, tL_error, this.c, this.b, (p8c) obj2, (wjb) obj));
                return;
            case 5:
                gl.d3(new ms0((pub) obj3, tLObject, this.c, this.b, (HashSet) obj2, (n30) obj));
                return;
            default:
                gl.d3(new ks0((b1c) obj3, (x0c) obj2, tLObject, this.c, tL_error, this.b, (HashSet) obj));
                return;
        }
    }

    public js0(pf0 pf0Var, Object obj, boolean z, long j, Object obj2, byte b) {
        this.a = b;
        this.d = pf0Var;
        this.e = obj;
        this.c = z;
        this.b = j;
        this.f = obj2;
    }

    public js0(je2 je2Var, long j, boolean z, String str, jc jcVar) {
        this.a = (byte) 1;
        this.d = je2Var;
        this.b = j;
        this.c = z;
        this.e = str;
        this.f = jcVar;
    }

    public js0(na7 na7Var, vf6 vf6Var, long j, ja7 ja7Var, boolean z) {
        this.a = (byte) 3;
        this.d = na7Var;
        this.e = vf6Var;
        this.b = j;
        this.f = ja7Var;
        this.c = z;
    }

    public js0(Object obj, boolean z, long j, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.c = z;
        this.b = j;
        this.e = obj2;
        this.f = obj3;
    }
}
