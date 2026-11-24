package defpackage;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class d19 {
    public static d19 B;
    public static d19 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int a;
    public final b19 b;
    public final b19 c;
    public final b19 d;
    public final FrameLayout e;
    public final d19 f;
    public float g;
    public float h;
    public final a19 i;
    public WindowManager k;
    public boolean l;
    public float m;
    public final int n;
    public final long o;
    public final h19 p;
    public float q;
    public float r;
    public boolean s;
    public final r09 t;
    public boolean u;
    public final View v;
    public boolean w;
    public long y;
    public boolean z;
    public final int[] j = new int[2];
    public final ArrayList x = new ArrayList();

    public d19(android.content.Context r34, org.telegram.ui.ActionBar.d r35, defpackage.t09 r36, android.view.View r37, android.view.View r38, float r39, float r40, defpackage.h19 r41, int r42, int r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d19.<init>(android.content.Context, org.telegram.ui.ActionBar.d, t09, android.view.View, android.view.View, float, float, h19, int, int, boolean):void");
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z) {
        d19 d19Var;
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                d19Var = B;
            } else {
                d19Var = C;
            }
            if (d19Var != null) {
                if (z) {
                    d19Var.c();
                } else {
                    d19Var.l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.d r14, defpackage.t09 r15, defpackage.hf0 r16, android.view.View r17, float r18, float r19, defpackage.h19 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d19.d(org.telegram.ui.ActionBar.d, t09, hf0, android.view.View, float, float, h19, int, int):void");
    }

    public static int e() {
        return (int) ((gl.L(40.0f) * 2.0f) / gl.p);
    }

    public static void f() {
        d19 d19Var = B;
        if (d19Var != null) {
            d19Var.s = true;
            d19Var.y = System.currentTimeMillis();
            if (B.a == 0 && System.currentTimeMillis() - E > 200) {
                E = System.currentTimeMillis();
                B.v.performHapticFeedback(3);
                return;
            }
            return;
        }
        g();
        d19 d19Var2 = C;
        if (d19Var2 != null) {
            View view = d19Var2.v;
            if (view instanceof gb2) {
                ((gb2) view).O.b(d19Var2.p);
            } else if (view instanceof uk1) {
                ((uk1) view).F0.b(d19Var2.p);
            }
        }
    }

    public static void g() {
        d19 d19Var = C;
        if (d19Var != null && !d19Var.s) {
            d19Var.s = true;
            d19Var.y = System.currentTimeMillis();
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
            a19 a19Var = this.i;
            if (z) {
                this.k.removeView(a19Var);
            } else {
                gl.B2(a19Var);
            }
        } catch (Exception unused) {
        }
    }
}
