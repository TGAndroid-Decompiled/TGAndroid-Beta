package kg;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.dk0;
public final class m0 {
    public static m0 B;
    public static m0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int f13764a;
    public final k0 f13765b;
    public final k0 f13766c;
    public final k0 d;
    public final FrameLayout f13767e;
    public final m0 f13768f;
    public float f13769g;
    public float h;
    public final j0 f13770i;
    public WindowManager f13772k;
    public boolean f13773l;
    public float f13774m;
    public final int f13775n;
    public final long f13776o;
    public final q0 f13777p;
    public float f13778q;
    public float f13779r;
    public boolean f13780s;
    public final dk0 f13781t;
    public boolean f13782u;
    public final View v;
    public boolean f13783w;
    public long f13785y;
    public boolean f13786z;
    public final int[] f13771j = new int[2];
    public final ArrayList f13784x = new ArrayList();

    public m0(android.content.Context r32, org.telegram.ui.ActionBar.o2 r33, org.telegram.ui.Components.fk0 r34, android.view.View r35, android.view.View r36, float r37, float r38, kg.q0 r39, int r40, int r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: kg.m0.<init>(android.content.Context, org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.fk0, android.view.View, android.view.View, float, float, kg.q0, int, int, boolean):void");
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z10) {
        m0 m0Var;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                m0Var = B;
            } else {
                m0Var = C;
            }
            if (m0Var != null) {
                if (z10) {
                    m0Var.c();
                } else {
                    m0Var.f13773l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.o2 r14, org.telegram.ui.Components.fk0 r15, android.view.View r16, android.view.View r17, float r18, float r19, kg.q0 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: kg.m0.d(org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.fk0, android.view.View, android.view.View, float, float, kg.q0, int, int):void");
    }

    public static int e() {
        return (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
    }

    public static void f() {
        m0 m0Var = B;
        if (m0Var != null) {
            m0Var.f13780s = true;
            m0Var.f13785y = System.currentTimeMillis();
            if (B.f13764a == 0 && System.currentTimeMillis() - E > 200) {
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
            if (view instanceof s1) {
                ((s1) view).J.b(m0Var2.f13777p);
            } else if (view instanceof v0) {
                ((v0) view).f25815y0.b(m0Var2.f13777p);
            }
        }
    }

    public static void g() {
        m0 m0Var = C;
        if (m0Var != null && !m0Var.f13780s) {
            m0Var.f13780s = true;
            m0Var.f13785y = System.currentTimeMillis();
            if (C.f13764a == 1 && System.currentTimeMillis() - E > 200) {
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
            boolean z10 = this.f13783w;
            j0 j0Var = this.f13770i;
            if (z10) {
                this.f13772k.removeView(j0Var);
            } else {
                AndroidUtilities.removeFromParent(j0Var);
            }
        } catch (Exception unused) {
        }
    }
}
