package defpackage;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class g39 {
    public static g39 B;
    public static g39 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int a;
    public final e39 b;
    public final e39 c;
    public final e39 d;
    public final FrameLayout e;
    public final g39 f;
    public float g;
    public float h;
    public final d39 i;
    public WindowManager k;
    public boolean l;
    public float m;
    public final int n;
    public final long o;
    public final k39 p;
    public float q;
    public float r;
    public boolean s;
    public final t29 t;
    public boolean u;
    public final View v;
    public boolean w;
    public long y;
    public boolean z;
    public final int[] j = new int[2];
    public final ArrayList x = new ArrayList();

    public g39(android.content.Context r34, org.telegram.ui.ActionBar.d r35, defpackage.v29 r36, android.view.View r37, android.view.View r38, float r39, float r40, defpackage.k39 r41, int r42, int r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g39.<init>(android.content.Context, org.telegram.ui.ActionBar.d, v29, android.view.View, android.view.View, float, float, k39, int, int, boolean):void");
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z) {
        g39 g39Var;
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                g39Var = B;
            } else {
                g39Var = C;
            }
            if (g39Var != null) {
                if (z) {
                    g39Var.c();
                } else {
                    g39Var.l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.d r14, defpackage.v29 r15, defpackage.hg0 r16, android.view.View r17, float r18, float r19, defpackage.k39 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g39.d(org.telegram.ui.ActionBar.d, v29, hg0, android.view.View, float, float, k39, int, int):void");
    }

    public static int e() {
        return (int) ((gm.L(40.0f) * 2.0f) / gm.p);
    }

    public static void f() {
        g39 g39Var = B;
        if (g39Var != null) {
            g39Var.s = true;
            g39Var.y = System.currentTimeMillis();
            if (B.a == 0 && System.currentTimeMillis() - E > 200) {
                E = System.currentTimeMillis();
                B.v.performHapticFeedback(3);
                return;
            }
            return;
        }
        g();
        g39 g39Var2 = C;
        if (g39Var2 != null) {
            View view = g39Var2.v;
            if (view instanceof rc2) {
                ((rc2) view).O.b(g39Var2.p);
            } else if (view instanceof cm1) {
                ((cm1) view).F0.b(g39Var2.p);
            }
        }
    }

    public static void g() {
        g39 g39Var = C;
        if (g39Var != null && !g39Var.s) {
            g39Var.s = true;
            g39Var.y = System.currentTimeMillis();
            if (C.a == 1 && System.currentTimeMillis() - E > 200) {
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
            boolean z = this.w;
            d39 d39Var = this.i;
            if (z) {
                this.k.removeView(d39Var);
            } else {
                gm.B2(d39Var);
            }
        } catch (Exception unused) {
        }
    }
}
