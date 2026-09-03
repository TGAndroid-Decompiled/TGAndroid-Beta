package mg;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.nk0;
public final class m0 {
    public static m0 B;
    public static m0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int f14036a;
    public final k0 f14037b;
    public final k0 f14038c;
    public final k0 d;
    public final FrameLayout e;
    public final m0 f14039f;
    public float f14040g;
    public float h;
    public final j0 f14041i;
    public WindowManager f14043k;
    public boolean f14044l;
    public float f14045m;
    public final int f14046n;
    public final long f14047o;
    public final q0 f14048p;
    public float f14049q;
    public float f14050r;
    public boolean f14051s;
    public final nk0 f14052t;
    public boolean f14053u;
    public final View v;
    public boolean f14054w;
    public long f14056y;
    public boolean f14057z;
    public final int[] f14042j = new int[2];
    public final ArrayList f14055x = new ArrayList();

    public m0(android.content.Context r32, org.telegram.ui.ActionBar.p2 r33, org.telegram.ui.Components.pk0 r34, android.view.View r35, android.view.View r36, float r37, float r38, mg.q0 r39, int r40, int r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: mg.m0.<init>(android.content.Context, org.telegram.ui.ActionBar.p2, org.telegram.ui.Components.pk0, android.view.View, android.view.View, float, float, mg.q0, int, int, boolean):void");
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
                    m0Var.f14044l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.p2 r14, org.telegram.ui.Components.pk0 r15, android.view.View r16, android.view.View r17, float r18, float r19, mg.q0 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: mg.m0.d(org.telegram.ui.ActionBar.p2, org.telegram.ui.Components.pk0, android.view.View, android.view.View, float, float, mg.q0, int, int):void");
    }

    public static int e() {
        return (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
    }

    public static void f() {
        m0 m0Var = B;
        if (m0Var != null) {
            m0Var.f14051s = true;
            m0Var.f14056y = System.currentTimeMillis();
            if (B.f14036a == 0 && System.currentTimeMillis() - E > 200) {
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
                ((s1) view).K.b(m0Var2.f14048p);
            } else if (view instanceof v0) {
                ((v0) view).f22454z0.b(m0Var2.f14048p);
            }
        }
    }

    public static void g() {
        m0 m0Var = C;
        if (m0Var != null && !m0Var.f14051s) {
            m0Var.f14051s = true;
            m0Var.f14056y = System.currentTimeMillis();
            if (C.f14036a == 1 && System.currentTimeMillis() - E > 200) {
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
            boolean z4 = this.f14054w;
            j0 j0Var = this.f14041i;
            if (z4) {
                this.f14043k.removeView(j0Var);
            } else {
                AndroidUtilities.removeFromParent(j0Var);
            }
        } catch (Exception unused) {
        }
    }
}
