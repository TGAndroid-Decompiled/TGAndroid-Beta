package defpackage;

import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.TwoStepVerificationActivity;
public final class s15 implements RequestDelegate {
    public final byte a = 0;
    public final long b;
    public final int c;
    public final fn7 d;
    public final Object e;
    public final Object f;
    public final Object g;

    public s15(uc7 uc7Var, HashMap hashMap, String str, zh6 zh6Var, long j, int i) {
        this.d = uc7Var;
        this.e = hashMap;
        this.f = str;
        this.g = zh6Var;
        this.b = j;
        this.c = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        fn7 fn7Var = this.d;
        switch (b) {
            case 0:
                hl.c3(new as0(tL_error, tLObject, (TwoStepVerificationActivity) fn7Var, (e) obj3, this.b, (qs0) obj2, (wy) obj, this.c));
                return;
            default:
                hl.c3(new qe((uc7) fn7Var, (HashMap) obj3, (String) obj2, tLObject, (zh6) obj, this.b, this.c));
                return;
        }
    }

    public s15(TwoStepVerificationActivity twoStepVerificationActivity, e eVar, long j, qs0 qs0Var, wy wyVar, int i) {
        this.d = twoStepVerificationActivity;
        this.e = eVar;
        this.b = j;
        this.f = qs0Var;
        this.g = wyVar;
        this.c = i;
    }
}
