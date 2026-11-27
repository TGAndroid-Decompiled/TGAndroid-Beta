package defpackage;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class s49 {
    public static s49 B;
    public static s49 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int a;
    public final q49 b;
    public final q49 c;
    public final q49 d;
    public final FrameLayout e;
    public final s49 f;
    public float g;
    public float h;
    public final p49 i;
    public WindowManager k;
    public boolean l;
    public float m;
    public final int n;
    public final long o;
    public final w49 p;
    public float q;
    public float r;
    public boolean s;
    public final g49 t;
    public boolean u;
    public final View v;
    public boolean w;
    public long y;
    public boolean z;
    public final int[] j = new int[2];
    public final ArrayList x = new ArrayList();

    public s49(android.content.Context r34, org.telegram.ui.ActionBar.e r35, defpackage.i49 r36, android.view.View r37, android.view.View r38, float r39, float r40, defpackage.w49 r41, int r42, int r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s49.<init>(android.content.Context, org.telegram.ui.ActionBar.e, i49, android.view.View, android.view.View, float, float, w49, int, int, boolean):void");
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z) {
        s49 s49Var;
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                s49Var = B;
            } else {
                s49Var = C;
            }
            if (s49Var != null) {
                if (z) {
                    s49Var.c();
                } else {
                    s49Var.l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.e r14, defpackage.i49 r15, defpackage.jf0 r16, android.view.View r17, float r18, float r19, defpackage.w49 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s49.d(org.telegram.ui.ActionBar.e, i49, jf0, android.view.View, float, float, w49, int, int):void");
    }

    public static int e() {
        return (int) ((hl.L(40.0f) * 2.0f) / hl.p);
    }

    public static void f() {
        s49 s49Var = B;
        if (s49Var != null) {
            s49Var.s = true;
            s49Var.y = System.currentTimeMillis();
            if (B.a == 0 && System.currentTimeMillis() - E > 200) {
                E = System.currentTimeMillis();
                B.v.performHapticFeedback(3);
                return;
            }
            return;
        }
        g();
        s49 s49Var2 = C;
        if (s49Var2 != null) {
            View view = s49Var2.v;
            if (view instanceof wb2) {
                ((wb2) view).O.b(s49Var2.p);
            } else if (view instanceof dl1) {
                ((dl1) view).F0.b(s49Var2.p);
            }
        }
    }

    public static void g() {
        s49 s49Var = C;
        if (s49Var != null && !s49Var.s) {
            s49Var.s = true;
            s49Var.y = System.currentTimeMillis();
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
            p49 p49Var = this.i;
            if (z) {
                this.k.removeView(p49Var);
            } else {
                hl.B2(p49Var);
            }
        } catch (Exception unused) {
        }
    }
}
