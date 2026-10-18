package ah;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.al0;
public final class d1 {
    public static d1 B;
    public static d1 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int f690a;
    public final b1 f691b;
    public final b1 f692c;
    public final b1 d;
    public final FrameLayout e;
    public final d1 f693f;
    public float f694g;
    public float h;
    public final a1 f695i;
    public WindowManager f697k;
    public boolean f698l;
    public float f699m;
    public final int f700n;
    public final long f701o;
    public final i1 f702p;
    public float f703q;
    public float f704r;
    public boolean f705s;
    public final al0 f706t;
    public boolean f707u;
    public final View v;
    public boolean f708w;
    public long f710y;
    public boolean f711z;
    public final int[] f696j = new int[2];
    public final ArrayList f709x = new ArrayList();

    public d1(android.content.Context r32, org.telegram.ui.ActionBar.n2 r33, org.telegram.ui.Components.cl0 r34, android.view.View r35, android.view.View r36, float r37, float r38, ah.i1 r39, int r40, int r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: ah.d1.<init>(android.content.Context, org.telegram.ui.ActionBar.n2, org.telegram.ui.Components.cl0, android.view.View, android.view.View, float, float, ah.i1, int, int, boolean):void");
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z10) {
        d1 d1Var;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                d1Var = B;
            } else {
                d1Var = C;
            }
            if (d1Var != null) {
                if (z10) {
                    d1Var.c();
                } else {
                    d1Var.f698l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.n2 r14, org.telegram.ui.Components.cl0 r15, android.view.View r16, android.view.View r17, float r18, float r19, ah.i1 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: ah.d1.d(org.telegram.ui.ActionBar.n2, org.telegram.ui.Components.cl0, android.view.View, android.view.View, float, float, ah.i1, int, int):void");
    }

    public static int e() {
        return (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
    }

    public static void f() {
        d1 d1Var = B;
        if (d1Var != null) {
            d1Var.f705s = true;
            d1Var.f710y = System.currentTimeMillis();
            if (B.f690a == 0 && System.currentTimeMillis() - E > 200) {
                E = System.currentTimeMillis();
                B.v.performHapticFeedback(3);
                return;
            }
            return;
        }
        g();
        d1 d1Var2 = C;
        if (d1Var2 != null) {
            View view = d1Var2.v;
            if (view instanceof u1) {
                ((u1) view).N.b(d1Var2.f702p);
            } else if (view instanceof org.telegram.ui.Cells.w0) {
                ((org.telegram.ui.Cells.w0) view).E0.b(d1Var2.f702p);
            }
        }
    }

    public static void g() {
        d1 d1Var = C;
        if (d1Var != null && !d1Var.f705s) {
            d1Var.f705s = true;
            d1Var.f710y = System.currentTimeMillis();
            if (C.f690a == 1 && System.currentTimeMillis() - E > 200) {
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
            boolean z10 = this.f708w;
            a1 a1Var = this.f695i;
            if (z10) {
                this.f697k.removeView(a1Var);
            } else {
                AndroidUtilities.removeFromParent(a1Var);
            }
        } catch (Exception unused) {
        }
    }
}
