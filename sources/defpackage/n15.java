package defpackage;

import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.TwoStepVerificationActivity;
public final class n15 implements RequestDelegate {
    public final byte a = 1;
    public final long b;
    public final int c;
    public final jm7 d;
    public final Object e;
    public final Object f;
    public final Object g;

    public n15(oc7 oc7Var, HashMap hashMap, String str, vh6 vh6Var, long j, int i) {
        this.d = oc7Var;
        this.e = hashMap;
        this.f = str;
        this.g = vh6Var;
        this.b = j;
        this.c = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        jm7 jm7Var = this.d;
        switch (b) {
            case 0:
                gm.c3(new at0(tL_error, tLObject, (TwoStepVerificationActivity) jm7Var, (d) obj3, this.b, (qt0) obj2, (wz) obj, this.c));
                return;
            default:
                gm.c3(new pf((oc7) jm7Var, (HashMap) obj3, (String) obj2, tLObject, (vh6) obj, this.b, this.c));
                return;
        }
    }

    public n15(TwoStepVerificationActivity twoStepVerificationActivity, d dVar, long j, qt0 qt0Var, wz wzVar, int i) {
        this.d = twoStepVerificationActivity;
        this.e = dVar;
        this.b = j;
        this.f = qt0Var;
        this.g = wzVar;
        this.c = i;
    }
}
