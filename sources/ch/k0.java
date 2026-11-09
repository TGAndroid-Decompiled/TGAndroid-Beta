package ch;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Components.hi0;
public final class k0 {
    public static k0 B;
    public static k0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int f6280a;
    public final i0 f6281b;
    public final i0 f6282c;
    public final i0 d;
    public final FrameLayout f6283e;
    public final k0 f6284f;
    public float f6285g;
    public float h;
    public final h0 f6286i;
    public WindowManager f6288k;
    public boolean f6289l;
    public float f6290m;
    public final int f6291n;
    public final long f6292o;
    public final o0 f6293p;
    public float f6294q;
    public float f6295r;
    public boolean f6296s;
    public final hi0 f6297t;
    public boolean f6298u;
    public final View v;
    public boolean f6299w;
    public long f6301y;
    public boolean f6302z;
    public final int[] f6287j = new int[2];
    public final ArrayList f6300x = new ArrayList();

    public k0(android.content.Context r33, org.telegram.ui.ActionBar.f2 r34, org.telegram.ui.Components.ji0 r35, android.view.View r36, android.view.View r37, float r38, float r39, ch.o0 r40, int r41, int r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: ch.k0.<init>(android.content.Context, org.telegram.ui.ActionBar.f2, org.telegram.ui.Components.ji0, android.view.View, android.view.View, float, float, ch.o0, int, int, boolean):void");
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z9) {
        k0 k0Var;
        for (int i7 = 0; i7 < 2; i7++) {
            if (i7 == 0) {
                k0Var = B;
            } else {
                k0Var = C;
            }
            if (k0Var != null) {
                if (z9) {
                    k0Var.c();
                } else {
                    k0Var.f6289l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.f2 r14, org.telegram.ui.Components.ji0 r15, android.view.View r16, android.view.View r17, float r18, float r19, ch.o0 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: ch.k0.d(org.telegram.ui.ActionBar.f2, org.telegram.ui.Components.ji0, android.view.View, android.view.View, float, float, ch.o0, int, int):void");
    }

    public static int e() {
        return (int) ((org.telegram.messenger.g0.L(40.0f) * 2.0f) / org.telegram.messenger.g0.f22562p);
    }

    public static void f() {
        k0 k0Var = B;
        if (k0Var != null) {
            k0Var.f6296s = true;
            k0Var.f6301y = System.currentTimeMillis();
            if (B.f6280a == 0 && System.currentTimeMillis() - E > 200) {
                E = System.currentTimeMillis();
                B.v.performHapticFeedback(3);
                return;
            }
            return;
        }
        g();
        k0 k0Var2 = C;
        if (k0Var2 != null) {
            View view = k0Var2.v;
            if (view instanceof q1) {
                ((q1) view).N.b(k0Var2.f6293p);
            } else if (view instanceof t0) {
                ((t0) view).E0.b(k0Var2.f6293p);
            }
        }
    }

    public static void g() {
        k0 k0Var = C;
        if (k0Var != null && !k0Var.f6296s) {
            k0Var.f6296s = true;
            k0Var.f6301y = System.currentTimeMillis();
            if (C.f6280a == 1 && System.currentTimeMillis() - E > 200) {
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
            boolean z9 = this.f6299w;
            h0 h0Var = this.f6286i;
            if (z9) {
                this.f6288k.removeView(h0Var);
            } else {
                org.telegram.messenger.g0.E2(h0Var);
            }
        } catch (Exception unused) {
        }
    }
}
