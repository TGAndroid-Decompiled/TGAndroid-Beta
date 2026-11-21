package ii;

import ai.x1;
import bi.e0;
import bi.w4;
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
    public final long f16329a;
    public final long f16330b;
    public final int f16331c;
    public final Object d;
    public final Object f16332e;
    public final Object f16333f;
    public final Object h;

    public j(xb xbVar, long j3, long j10, int i7, tb0 tb0Var, u4 u4Var, v4 v4Var) {
        this.d = xbVar;
        this.f16329a = j3;
        this.f16330b = j10;
        this.f16331c = i7;
        this.f16332e = tb0Var;
        this.f16333f = u4Var;
        this.h = v4Var;
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        g2 g2Var = (g2) this.d;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f16332e;
        e0 e0Var = new e0((x1) this.f16333f, this.f16331c, this.f16330b, g2Var, (w4) this.h);
        int currentAccount = g2Var.getCurrentAccount();
        boolean[] zArr = n.f16347a;
        if (zArr[currentAccount]) {
            return;
        }
        zArr[currentAccount] = true;
        n.b(g2Var, this.f16329a, tL_inputCheckPasswordSRP, twoStepVerificationActivity, null, e0Var);
    }

    @Override
    public void n(tb0 tb0Var, int i7) {
        c5.g((xb) this.d, null, this.f16329a, this.f16330b, this.f16331c, (tb0) this.f16332e, (u4) this.f16333f, (v4) this.h);
    }

    public j(g2 g2Var, long j3, TwoStepVerificationActivity twoStepVerificationActivity, x1 x1Var, int i7, long j10, w4 w4Var) {
        this.d = g2Var;
        this.f16329a = j3;
        this.f16332e = twoStepVerificationActivity;
        this.f16333f = x1Var;
        this.f16331c = i7;
        this.f16330b = j10;
        this.h = w4Var;
    }
}
