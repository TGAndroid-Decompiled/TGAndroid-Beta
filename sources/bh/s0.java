package bh;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.dl0;
public final class s0 {
    public static s0 B;
    public static s0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int f4125a;
    public final q0 f4126b;
    public final q0 f4127c;
    public final q0 d;
    public final FrameLayout e;
    public final s0 f4128f;
    public float f4129g;
    public float h;
    public final p0 f4130i;
    public WindowManager f4132k;
    public boolean f4133l;
    public float f4134m;
    public final int f4135n;
    public final long f4136o;
    public final x0 f4137p;
    public float f4138q;
    public float f4139r;
    public boolean f4140s;
    public final dl0 f4141t;
    public boolean f4142u;
    public final View v;
    public boolean f4143w;
    public long f4145y;
    public boolean f4146z;
    public final int[] f4131j = new int[2];
    public final ArrayList f4144x = new ArrayList();

    public s0(android.content.Context r32, org.telegram.ui.ActionBar.r2 r33, org.telegram.ui.Components.fl0 r34, android.view.View r35, android.view.View r36, float r37, float r38, bh.x0 r39, int r40, int r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: bh.s0.<init>(android.content.Context, org.telegram.ui.ActionBar.r2, org.telegram.ui.Components.fl0, android.view.View, android.view.View, float, float, bh.x0, int, int, boolean):void");
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z10) {
        s0 s0Var;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                s0Var = B;
            } else {
                s0Var = C;
            }
            if (s0Var != null) {
                if (z10) {
                    s0Var.c();
                } else {
                    s0Var.f4133l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.r2 r14, org.telegram.ui.Components.fl0 r15, android.view.View r16, android.view.View r17, float r18, float r19, bh.x0 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: bh.s0.d(org.telegram.ui.ActionBar.r2, org.telegram.ui.Components.fl0, android.view.View, android.view.View, float, float, bh.x0, int, int):void");
    }

    public static int e() {
        return (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
    }

    public static void f() {
        s0 s0Var = B;
        if (s0Var != null) {
            s0Var.f4140s = true;
            s0Var.f4145y = System.currentTimeMillis();
            if (B.f4125a == 0 && System.currentTimeMillis() - E > 200) {
                E = System.currentTimeMillis();
                B.v.performHapticFeedback(3);
                return;
            }
            return;
        }
        g();
        s0 s0Var2 = C;
        if (s0Var2 != null) {
            View view = s0Var2.v;
            if (view instanceof s1) {
                ((s1) view).N.b(s0Var2.f4137p);
            } else if (view instanceof org.telegram.ui.Cells.v0) {
                ((org.telegram.ui.Cells.v0) view).E0.b(s0Var2.f4137p);
            }
        }
    }

    public static void g() {
        s0 s0Var = C;
        if (s0Var != null && !s0Var.f4140s) {
            s0Var.f4140s = true;
            s0Var.f4145y = System.currentTimeMillis();
            if (C.f4125a == 1 && System.currentTimeMillis() - E > 200) {
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
            boolean z10 = this.f4143w;
            p0 p0Var = this.f4130i;
            if (z10) {
                this.f4132k.removeView(p0Var);
            } else {
                AndroidUtilities.removeFromParent(p0Var);
            }
        } catch (Exception unused) {
        }
    }
}
