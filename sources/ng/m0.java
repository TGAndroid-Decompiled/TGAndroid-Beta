package ng;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.pk0;
public final class m0 {
    public static m0 B;
    public static m0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int f16116a;
    public final k0 f16117b;
    public final k0 f16118c;
    public final k0 d;
    public final FrameLayout f16119e;
    public final m0 f16120f;
    public float f16121g;
    public float h;
    public final j0 f16122i;
    public WindowManager f16124k;
    public boolean f16125l;
    public float f16126m;
    public final int f16127n;
    public final long f16128o;
    public final q0 f16129p;
    public float f16130q;
    public float f16131r;
    public boolean f16132s;
    public final pk0 f16133t;
    public boolean f16134u;
    public final View v;
    public boolean f16135w;
    public long f16137y;
    public boolean f16138z;
    public final int[] f16123j = new int[2];
    public final ArrayList f16136x = new ArrayList();

    public m0(android.content.Context r32, org.telegram.ui.ActionBar.p2 r33, org.telegram.ui.Components.rk0 r34, android.view.View r35, android.view.View r36, float r37, float r38, ng.q0 r39, int r40, int r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: ng.m0.<init>(android.content.Context, org.telegram.ui.ActionBar.p2, org.telegram.ui.Components.rk0, android.view.View, android.view.View, float, float, ng.q0, int, int, boolean):void");
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z4) {
        m0 m0Var;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                m0Var = B;
            } else {
                m0Var = C;
            }
            if (m0Var != null) {
                if (z4) {
                    m0Var.c();
                } else {
                    m0Var.f16125l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.p2 r14, org.telegram.ui.Components.rk0 r15, android.view.View r16, android.view.View r17, float r18, float r19, ng.q0 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: ng.m0.d(org.telegram.ui.ActionBar.p2, org.telegram.ui.Components.rk0, android.view.View, android.view.View, float, float, ng.q0, int, int):void");
    }

    public static int e() {
        return (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
    }

    public static void f() {
        m0 m0Var = B;
        if (m0Var != null) {
            m0Var.f16132s = true;
            m0Var.f16137y = System.currentTimeMillis();
            if (B.f16116a == 0 && System.currentTimeMillis() - E > 200) {
                E = System.currentTimeMillis();
                B.v.performHapticFeedback(3);
                return;
            }
            return;
        }
        g();
        m0 m0Var2 = C;
        if (m0Var2 != null) {
            View view = m0Var2.v;
            if (view instanceof t1) {
                ((t1) view).K.b(m0Var2.f16129p);
            } else if (view instanceof v0) {
                ((v0) view).f24298z0.b(m0Var2.f16129p);
            }
        }
    }

    public static void g() {
        m0 m0Var = C;
        if (m0Var != null && !m0Var.f16132s) {
            m0Var.f16132s = true;
            m0Var.f16137y = System.currentTimeMillis();
            if (C.f16116a == 1 && System.currentTimeMillis() - E > 200) {
                E = System.currentTimeMillis();
                View view = C.v;
                if (view != null) {
                    view.performHapticFeedback(3);
                }
            }
        }
    }

    public final void c() {
        try {
            boolean z4 = this.f16135w;
            j0 j0Var = this.f16122i;
            if (z4) {
                this.f16124k.removeView(j0Var);
            } else {
                AndroidUtilities.removeFromParent(j0Var);
            }
        } catch (Exception unused) {
        }
    }
}
