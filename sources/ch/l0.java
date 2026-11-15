package ch;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ki0;
public final class l0 {
    public static l0 B;
    public static l0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int f5112a;
    public final j0 f5113b;
    public final j0 f5114c;
    public final j0 d;
    public final FrameLayout f5115e;
    public final l0 f5116f;
    public float f5117g;
    public float h;
    public final i0 f5118i;
    public WindowManager f5120k;
    public boolean f5121l;
    public float f5122m;
    public final int f5123n;
    public final long f5124o;
    public final p0 f5125p;
    public float f5126q;
    public float f5127r;
    public boolean f5128s;
    public final ki0 f5129t;
    public boolean f5130u;
    public final View v;
    public boolean f5131w;
    public long f5133y;
    public boolean f5134z;
    public final int[] f5119j = new int[2];
    public final ArrayList f5132x = new ArrayList();

    public l0(android.content.Context r33, org.telegram.ui.ActionBar.e2 r34, org.telegram.ui.Components.mi0 r35, android.view.View r36, android.view.View r37, float r38, float r39, ch.p0 r40, int r41, int r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: ch.l0.<init>(android.content.Context, org.telegram.ui.ActionBar.e2, org.telegram.ui.Components.mi0, android.view.View, android.view.View, float, float, ch.p0, int, int, boolean):void");
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z10) {
        l0 l0Var;
        for (int i7 = 0; i7 < 2; i7++) {
            if (i7 == 0) {
                l0Var = B;
            } else {
                l0Var = C;
            }
            if (l0Var != null) {
                if (z10) {
                    l0Var.c();
                } else {
                    l0Var.f5121l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.e2 r14, org.telegram.ui.Components.mi0 r15, android.view.View r16, android.view.View r17, float r18, float r19, ch.p0 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: ch.l0.d(org.telegram.ui.ActionBar.e2, org.telegram.ui.Components.mi0, android.view.View, android.view.View, float, float, ch.p0, int, int):void");
    }

    public static int e() {
        return (int) ((org.telegram.messenger.g0.L(40.0f) * 2.0f) / org.telegram.messenger.g0.f23608p);
    }

    public static void f() {
        l0 l0Var = B;
        if (l0Var != null) {
            l0Var.f5128s = true;
            l0Var.f5133y = System.currentTimeMillis();
            if (B.f5112a == 0 && System.currentTimeMillis() - E > 200) {
                E = System.currentTimeMillis();
                B.v.performHapticFeedback(3);
                return;
            }
            return;
        }
        g();
        l0 l0Var2 = C;
        if (l0Var2 != null) {
            View view = l0Var2.v;
            if (view instanceof q1) {
                ((q1) view).O.b(l0Var2.f5125p);
            } else if (view instanceof org.telegram.ui.Cells.t0) {
                ((org.telegram.ui.Cells.t0) view).F0.b(l0Var2.f5125p);
            }
        }
    }

    public static void g() {
        l0 l0Var = C;
        if (l0Var != null && !l0Var.f5128s) {
            l0Var.f5128s = true;
            l0Var.f5133y = System.currentTimeMillis();
            if (C.f5112a == 1 && System.currentTimeMillis() - E > 200) {
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
            boolean z10 = this.f5131w;
            i0 i0Var = this.f5118i;
            if (z10) {
                this.f5120k.removeView(i0Var);
            } else {
                org.telegram.messenger.g0.E2(i0Var);
            }
        } catch (Exception unused) {
        }
    }
}
