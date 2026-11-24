package defpackage;

import android.os.Bundle;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class rz5 implements ca7 {
    public final kz5 a;
    public final String b;
    public final d c;
    public final long d;
    public final Integer e;
    public final Bundle f;
    public final LaunchActivity h;

    public rz5(LaunchActivity launchActivity, kz5 kz5Var, String str, d dVar, long j, Integer num, Bundle bundle) {
        this.h = launchActivity;
        this.a = kz5Var;
        this.b = str;
        this.c = dVar;
        this.d = j;
        this.e = num;
        this.f = bundle;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            ij.r0((d) b00.f(1, launchActivity.e0), null, k96.M0(2131748883, null), null);
        }
        try {
            this.a.run();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void m(boolean z) {
        try {
            this.a.run();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            String str = this.b;
            long j = this.d;
            d dVar = this.c;
            if (str == null || !(dVar instanceof mu1) || ((mu1) dVar).a() != j) {
                if (dVar instanceof mu1) {
                    mu1 mu1Var = (mu1) dVar;
                    if (mu1Var.a() == j && this.e == null) {
                        gl.A3(5.0f, mu1Var.A0, null);
                        pw0.APP_ERROR.a();
                        ar1 ar1Var = mu1Var.a0;
                        for (int i = 0; i < ar1Var.getChildCount(); i++) {
                            gl.A3(5.0f, ar1Var.getChildAt(i), null);
                        }
                        a actionBar = mu1Var.getActionBar();
                        for (int i2 = 0; i2 < actionBar.getChildCount(); i2++) {
                            gl.A3(5.0f, actionBar.getChildAt(i2), null);
                        }
                    }
                }
                dVar = new mu1(this.f);
                ((ActionBarLayout) launchActivity.N()).S(dVar);
            }
            gl.d3(new m77(this, this.b, this.d, dVar, (byte) 13), 150L);
        }
    }
}
