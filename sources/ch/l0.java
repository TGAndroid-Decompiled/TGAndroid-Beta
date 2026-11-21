package ch;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.vi0;
public final class l0 {
    public static l0 B;
    public static l0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int f5429a;
    public final j0 f5430b;
    public final j0 f5431c;
    public final j0 d;
    public final FrameLayout f5432e;
    public final l0 f5433f;
    public float f5434g;
    public float h;
    public final i0 f5435i;
    public WindowManager f5437k;
    public boolean f5438l;
    public float f5439m;
    public final int f5440n;
    public final long f5441o;
    public final p0 f5442p;
    public float f5443q;
    public float f5444r;
    public boolean f5445s;
    public final vi0 f5446t;
    public boolean f5447u;
    public final View v;
    public boolean f5448w;
    public long f5450y;
    public boolean f5451z;
    public final int[] f5436j = new int[2];
    public final ArrayList f5449x = new ArrayList();

    public l0(android.content.Context r33, org.telegram.ui.ActionBar.g2 r34, org.telegram.ui.Components.xi0 r35, android.view.View r36, android.view.View r37, float r38, float r39, ch.p0 r40, int r41, int r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: ch.l0.<init>(android.content.Context, org.telegram.ui.ActionBar.g2, org.telegram.ui.Components.xi0, android.view.View, android.view.View, float, float, ch.p0, int, int, boolean):void");
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
                    l0Var.f5438l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.g2 r14, org.telegram.ui.Components.xi0 r15, android.view.View r16, android.view.View r17, float r18, float r19, ch.p0 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: ch.l0.d(org.telegram.ui.ActionBar.g2, org.telegram.ui.Components.xi0, android.view.View, android.view.View, float, float, ch.p0, int, int):void");
    }

    public static int e() {
        return (int) ((org.telegram.messenger.g0.L(40.0f) * 2.0f) / org.telegram.messenger.g0.f24145p);
    }

    public static void f() {
        l0 l0Var = B;
        if (l0Var != null) {
            l0Var.f5445s = true;
            l0Var.f5450y = System.currentTimeMillis();
            if (B.f5429a == 0 && System.currentTimeMillis() - E > 200) {
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
            if (view instanceof r1) {
                ((r1) view).O.b(l0Var2.f5442p);
            } else if (view instanceof v0) {
                ((v0) view).F0.b(l0Var2.f5442p);
            }
        }
    }

    public static void g() {
        l0 l0Var = C;
        if (l0Var != null && !l0Var.f5445s) {
            l0Var.f5445s = true;
            l0Var.f5450y = System.currentTimeMillis();
            if (C.f5429a == 1 && System.currentTimeMillis() - E > 200) {
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
            boolean z10 = this.f5448w;
            i0 i0Var = this.f5435i;
            if (z10) {
                this.f5437k.removeView(i0Var);
            } else {
                org.telegram.messenger.g0.E2(i0Var);
            }
        } catch (Exception unused) {
        }
    }
}
