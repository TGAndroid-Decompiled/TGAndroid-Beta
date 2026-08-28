package hg;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.sj0;
public final class n0 {
    public static n0 B;
    public static n0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int f10656a;
    public final l0 f10657b;
    public final l0 f10658c;
    public final l0 d;
    public final FrameLayout f10659e;
    public final n0 f10660f;
    public float f10661g;
    public float h;
    public final k0 f10662i;
    public WindowManager f10664k;
    public boolean f10665l;
    public float f10666m;
    public final int f10667n;
    public final long f10668o;
    public final r0 f10669p;
    public float f10670q;
    public float f10671r;
    public boolean f10672s;
    public final sj0 f10673t;
    public boolean f10674u;
    public final View v;
    public boolean f10675w;
    public long f10677y;
    public boolean f10678z;
    public final int[] f10663j = new int[2];
    public final ArrayList f10676x = new ArrayList();

    public n0(android.content.Context r32, org.telegram.ui.ActionBar.o2 r33, org.telegram.ui.Components.uj0 r34, android.view.View r35, android.view.View r36, float r37, float r38, hg.r0 r39, int r40, int r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: hg.n0.<init>(android.content.Context, org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.uj0, android.view.View, android.view.View, float, float, hg.r0, int, int, boolean):void");
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z10) {
        n0 n0Var;
        for (int i9 = 0; i9 < 2; i9++) {
            if (i9 == 0) {
                n0Var = B;
            } else {
                n0Var = C;
            }
            if (n0Var != null) {
                if (z10) {
                    n0Var.c();
                } else {
                    n0Var.f10665l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.o2 r14, org.telegram.ui.Components.uj0 r15, android.view.View r16, android.view.View r17, float r18, float r19, hg.r0 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: hg.n0.d(org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.uj0, android.view.View, android.view.View, float, float, hg.r0, int, int):void");
    }

    public static int e() {
        return (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
    }

    public static void f() {
        n0 n0Var = B;
        if (n0Var != null) {
            n0Var.f10672s = true;
            n0Var.f10677y = System.currentTimeMillis();
            if (B.f10656a == 0 && System.currentTimeMillis() - E > 200) {
                E = System.currentTimeMillis();
                B.v.performHapticFeedback(3);
                return;
            }
            return;
        }
        g();
        n0 n0Var2 = C;
        if (n0Var2 != null) {
            View view = n0Var2.v;
            if (view instanceof t1) {
                ((t1) view).J.b(n0Var2.f10669p);
            } else if (view instanceof w0) {
                ((w0) view).f25882y0.b(n0Var2.f10669p);
            }
        }
    }

    public static void g() {
        n0 n0Var = C;
        if (n0Var != null && !n0Var.f10672s) {
            n0Var.f10672s = true;
            n0Var.f10677y = System.currentTimeMillis();
            if (C.f10656a == 1 && System.currentTimeMillis() - E > 200) {
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
            boolean z10 = this.f10675w;
            k0 k0Var = this.f10662i;
            if (z10) {
                this.f10664k.removeView(k0Var);
            } else {
                AndroidUtilities.removeFromParent(k0Var);
            }
        } catch (Exception unused) {
        }
    }
}
