package defpackage;

import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.TwoStepVerificationActivity;
public final class oz4 implements RequestDelegate {
    public final byte a = 1;
    public final long b;
    public final int c;
    public final gk7 d;
    public final Object e;
    public final Object f;
    public final Object g;

    public oz4(na7 na7Var, HashMap hashMap, String str, vf6 vf6Var, long j, int i) {
        this.d = na7Var;
        this.e = hashMap;
        this.f = str;
        this.g = vf6Var;
        this.b = j;
        this.c = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        gk7 gk7Var = this.d;
        switch (b) {
            case 0:
                gl.d3(new sr0(tL_error, tLObject, (TwoStepVerificationActivity) gk7Var, (d) obj3, this.b, (is0) obj2, (wy) obj, this.c));
                return;
            default:
                gl.d3(new pe((na7) gk7Var, (HashMap) obj3, (String) obj2, tLObject, (vf6) obj, this.b, this.c));
                return;
        }
    }

    public oz4(TwoStepVerificationActivity twoStepVerificationActivity, d dVar, long j, is0 is0Var, wy wyVar, int i) {
        this.d = twoStepVerificationActivity;
        this.e = dVar;
        this.b = j;
        this.f = is0Var;
        this.g = wyVar;
        this.c = i;
    }
}
