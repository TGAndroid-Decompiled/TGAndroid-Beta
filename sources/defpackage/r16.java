package defpackage;

import android.os.Bundle;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class r16 implements dc7 {
    public final k16 a;
    public final String b;
    public final d c;
    public final long d;
    public final Integer e;
    public final Bundle f;
    public final LaunchActivity h;

    public r16(LaunchActivity launchActivity, k16 k16Var, String str, d dVar, long j, Integer num, Bundle bundle) {
        this.h = launchActivity;
        this.a = k16Var;
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
            ik.r0((d) b10.f(1, launchActivity.e0), null, jb6.M0(2131748832, null), null);
        }
        try {
            this.a.run();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void l(boolean z) {
        try {
            this.a.run();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            String str = this.b;
            long j = this.d;
            d dVar = this.c;
            if (str == null || !(dVar instanceof yv1) || ((yv1) dVar).a() != j) {
                if (dVar instanceof yv1) {
                    yv1 yv1Var = (yv1) dVar;
                    if (yv1Var.a() == j && this.e == null) {
                        gm.A3(5.0f, yv1Var.A0, null);
                        xx0.APP_ERROR.a();
                        ms1 ms1Var = yv1Var.a0;
                        for (int i = 0; i < ms1Var.getChildCount(); i++) {
                            gm.A3(5.0f, ms1Var.getChildAt(i), null);
                        }
                        a actionBar = yv1Var.getActionBar();
                        for (int i2 = 0; i2 < actionBar.getChildCount(); i2++) {
                            gm.A3(5.0f, actionBar.getChildAt(i2), null);
                        }
                    }
                }
                dVar = new yv1(this.f);
                ((ActionBarLayout) launchActivity.N()).S(dVar);
            }
            gm.d3(new p97(this, this.b, this.d, dVar, (byte) 13), 150L);
        }
    }
}
