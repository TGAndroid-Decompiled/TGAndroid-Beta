package ii;

import ai.s1;
import bi.e0;
import bi.z4;
import di.xb;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.u4;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ma1;
public final class j implements ma1, ob0 {
    public final long f16395a;
    public final long f16396b;
    public final int f16397c;
    public final Object d;
    public final Object f16398e;
    public final Object f16399f;
    public final Object h;

    public j(xb xbVar, long j3, long j10, int i7, qb0 qb0Var, t4 t4Var, u4 u4Var) {
        this.d = xbVar;
        this.f16395a = j3;
        this.f16396b = j10;
        this.f16397c = i7;
        this.f16398e = qb0Var;
        this.f16399f = t4Var;
        this.h = u4Var;
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        g2 g2Var = (g2) this.d;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f16398e;
        e0 e0Var = new e0((s1) this.f16399f, this.f16397c, this.f16396b, g2Var, (z4) this.h);
        int currentAccount = g2Var.getCurrentAccount();
        boolean[] zArr = n.f16413a;
        if (zArr[currentAccount]) {
            return;
        }
        zArr[currentAccount] = true;
        n.b(g2Var, this.f16395a, tL_inputCheckPasswordSRP, twoStepVerificationActivity, null, e0Var);
    }

    @Override
    public void o(qb0 qb0Var, int i7) {
        b5.g((xb) this.d, null, this.f16395a, this.f16396b, this.f16397c, (qb0) this.f16398e, (t4) this.f16399f, (u4) this.h);
    }

    public j(g2 g2Var, long j3, TwoStepVerificationActivity twoStepVerificationActivity, s1 s1Var, int i7, long j10, z4 z4Var) {
        this.d = g2Var;
        this.f16395a = j3;
        this.f16398e = twoStepVerificationActivity;
        this.f16399f = s1Var;
        this.f16397c = i7;
        this.f16396b = j10;
        this.h = z4Var;
    }
}
