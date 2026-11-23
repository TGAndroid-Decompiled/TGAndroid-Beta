package ii;

import ai.r1;
import bi.e0;
import bi.z4;
import di.xb;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.u4;
import org.telegram.ui.Components.v4;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.oa1;
public final class j implements oa1, rb0 {
    public final long f16298a;
    public final long f16299b;
    public final int f16300c;
    public final Object d;
    public final Object f16301e;
    public final Object f16302f;
    public final Object h;

    public j(xb xbVar, long j3, long j10, int i7, tb0 tb0Var, u4 u4Var, v4 v4Var) {
        this.d = xbVar;
        this.f16298a = j3;
        this.f16299b = j10;
        this.f16300c = i7;
        this.f16301e = tb0Var;
        this.f16302f = u4Var;
        this.h = v4Var;
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        g2 g2Var = (g2) this.d;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f16301e;
        e0 e0Var = new e0((r1) this.f16302f, this.f16300c, this.f16299b, g2Var, (z4) this.h);
        int currentAccount = g2Var.getCurrentAccount();
        boolean[] zArr = n.f16316a;
        if (zArr[currentAccount]) {
            return;
        }
        zArr[currentAccount] = true;
        n.b(g2Var, this.f16298a, tL_inputCheckPasswordSRP, twoStepVerificationActivity, null, e0Var);
    }

    @Override
    public void n(tb0 tb0Var, int i7) {
        c5.g((xb) this.d, null, this.f16298a, this.f16299b, this.f16300c, (tb0) this.f16301e, (u4) this.f16302f, (v4) this.h);
    }

    public j(g2 g2Var, long j3, TwoStepVerificationActivity twoStepVerificationActivity, r1 r1Var, int i7, long j10, z4 z4Var) {
        this.d = g2Var;
        this.f16298a = j3;
        this.f16301e = twoStepVerificationActivity;
        this.f16302f = r1Var;
        this.f16300c = i7;
        this.f16299b = j10;
        this.h = z4Var;
    }
}
