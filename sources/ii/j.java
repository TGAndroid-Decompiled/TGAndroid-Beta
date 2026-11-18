package ii;

import ai.v1;
import bi.e0;
import bi.s4;
import di.xb;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.u4;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.oa1;
public final class j implements oa1, qb0 {
    public final long f16304a;
    public final long f16305b;
    public final int f16306c;
    public final Object d;
    public final Object f16307e;
    public final Object f16308f;
    public final Object h;

    public j(xb xbVar, long j3, long j10, int i7, sb0 sb0Var, t4 t4Var, u4 u4Var) {
        this.d = xbVar;
        this.f16304a = j3;
        this.f16305b = j10;
        this.f16306c = i7;
        this.f16307e = sb0Var;
        this.f16308f = t4Var;
        this.h = u4Var;
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        h2 h2Var = (h2) this.d;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f16307e;
        e0 e0Var = new e0((v1) this.f16308f, this.f16306c, this.f16305b, h2Var, (s4) this.h);
        int currentAccount = h2Var.getCurrentAccount();
        boolean[] zArr = n.f16322a;
        if (zArr[currentAccount]) {
            return;
        }
        zArr[currentAccount] = true;
        n.b(h2Var, this.f16304a, tL_inputCheckPasswordSRP, twoStepVerificationActivity, null, e0Var);
    }

    @Override
    public void n(sb0 sb0Var, int i7) {
        b5.g((xb) this.d, null, this.f16304a, this.f16305b, this.f16306c, (sb0) this.f16307e, (t4) this.f16308f, (u4) this.h);
    }

    public j(h2 h2Var, long j3, TwoStepVerificationActivity twoStepVerificationActivity, v1 v1Var, int i7, long j10, s4 s4Var) {
        this.d = h2Var;
        this.f16304a = j3;
        this.f16307e = twoStepVerificationActivity;
        this.f16308f = v1Var;
        this.f16306c = i7;
        this.f16305b = j10;
        this.h = s4Var;
    }
}
