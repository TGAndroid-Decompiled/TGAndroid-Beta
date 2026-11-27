package defpackage;

import android.os.Bundle;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class u16 implements jc7 {
    public final tg5 a;
    public final String b;
    public final e c;
    public final long d;
    public final Integer e;
    public final Bundle f;
    public final LaunchActivity h;

    public u16(LaunchActivity launchActivity, tg5 tg5Var, String str, e eVar, long j, Integer num, Bundle bundle) {
        this.h = launchActivity;
        this.a = tg5Var;
        this.b = str;
        this.c = eVar;
        this.d = j;
        this.e = num;
        this.f = bundle;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            jj.r0((e) c00.g(1, launchActivity.e0), null, ob6.M0(2131748829, null), null);
        }
        try {
            this.a.run();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void l(boolean z) {
        try {
            this.a.run();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            String str = this.b;
            long j = this.d;
            e eVar = this.c;
            if (str == null || !(eVar instanceof zu1) || ((zu1) eVar).a() != j) {
                if (eVar instanceof zu1) {
                    zu1 zu1Var = (zu1) eVar;
                    if (zu1Var.a() == j && this.e == null) {
                        hl.A3(5.0f, zu1Var.A0, null);
                        yw0.APP_ERROR.a();
                        nr1 nr1Var = zu1Var.a0;
                        for (int i = 0; i < nr1Var.getChildCount(); i++) {
                            hl.A3(5.0f, nr1Var.getChildAt(i), null);
                        }
                        a actionBar = zu1Var.getActionBar();
                        for (int i2 = 0; i2 < actionBar.getChildCount(); i2++) {
                            hl.A3(5.0f, actionBar.getChildAt(i2), null);
                        }
                    }
                }
                eVar = new zu1(this.f);
                ((ActionBarLayout) launchActivity.N()).S(eVar);
            }
            hl.d3(new ba7(this, this.b, this.d, eVar, (byte) 13), 150L);
        }
    }
}
