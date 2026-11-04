package dh;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Components.ji0;
public final class j0 {
    public static j0 B;
    public static j0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int f9034a;
    public final h0 f9035b;
    public final h0 f9036c;
    public final h0 d;
    public final FrameLayout f9037e;
    public final j0 f9038f;
    public float f9039g;
    public float h;
    public final g0 f9040i;
    public WindowManager f9042k;
    public boolean f9043l;
    public float f9044m;
    public final int f9045n;
    public final long f9046o;
    public final n0 f9047p;
    public float f9048q;
    public float f9049r;
    public boolean f9050s;
    public final ji0 f9051t;
    public boolean f9052u;
    public final View v;
    public boolean f9053w;
    public long f9055y;
    public boolean f9056z;
    public final int[] f9041j = new int[2];
    public final ArrayList f9054x = new ArrayList();

    public j0(android.content.Context r33, org.telegram.ui.ActionBar.d2 r34, org.telegram.ui.Components.li0 r35, android.view.View r36, android.view.View r37, float r38, float r39, dh.n0 r40, int r41, int r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: dh.j0.<init>(android.content.Context, org.telegram.ui.ActionBar.d2, org.telegram.ui.Components.li0, android.view.View, android.view.View, float, float, dh.n0, int, int, boolean):void");
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z10) {
        j0 j0Var;
        for (int i3 = 0; i3 < 2; i3++) {
            if (i3 == 0) {
                j0Var = B;
            } else {
                j0Var = C;
            }
            if (j0Var != null) {
                if (z10) {
                    j0Var.c();
                } else {
                    j0Var.f9043l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.d2 r14, org.telegram.ui.Components.li0 r15, android.view.View r16, android.view.View r17, float r18, float r19, dh.n0 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: dh.j0.d(org.telegram.ui.ActionBar.d2, org.telegram.ui.Components.li0, android.view.View, android.view.View, float, float, dh.n0, int, int):void");
    }

    public static int e() {
        return (int) ((org.telegram.messenger.g0.L(40.0f) * 2.0f) / org.telegram.messenger.g0.f22607p);
    }

    public static void f() {
        j0 j0Var = B;
        if (j0Var != null) {
            j0Var.f9050s = true;
            j0Var.f9055y = System.currentTimeMillis();
            if (B.f9034a == 0 && System.currentTimeMillis() - E > 200) {
                E = System.currentTimeMillis();
                B.v.performHapticFeedback(3);
                return;
            }
            return;
        }
        g();
        j0 j0Var2 = C;
        if (j0Var2 != null) {
            View view = j0Var2.v;
            if (view instanceof q1) {
                ((q1) view).O.b(j0Var2.f9047p);
            } else if (view instanceof t0) {
                ((t0) view).F0.b(j0Var2.f9047p);
            }
        }
    }

    public static void g() {
        j0 j0Var = C;
        if (j0Var != null && !j0Var.f9050s) {
            j0Var.f9050s = true;
            j0Var.f9055y = System.currentTimeMillis();
            if (C.f9034a == 1 && System.currentTimeMillis() - E > 200) {
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
            boolean z10 = this.f9053w;
            g0 g0Var = this.f9040i;
            if (z10) {
                this.f9042k.removeView(g0Var);
            } else {
                org.telegram.messenger.g0.E2(g0Var);
            }
        } catch (Exception unused) {
        }
    }
}
