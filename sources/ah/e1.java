package ah;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.dk0;
public final class e1 {
    public static e1 B;
    public static e1 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int f506a;
    public final c1 f507b;
    public final c1 f508c;
    public final c1 d;
    public final FrameLayout f509e;
    public final e1 f510f;
    public float f511g;
    public float h;
    public final b1 f512i;
    public WindowManager f514k;
    public boolean f515l;
    public float f516m;
    public final int f517n;
    public final long f518o;
    public final j1 f519p;
    public float f520q;
    public float f521r;
    public boolean f522s;
    public final dk0 f523t;
    public boolean f524u;
    public final View v;
    public boolean f525w;
    public long f527y;
    public boolean f528z;
    public final int[] f513j = new int[2];
    public final ArrayList f526x = new ArrayList();

    public e1(android.content.Context r32, org.telegram.ui.ActionBar.n2 r33, org.telegram.ui.Components.fk0 r34, android.view.View r35, android.view.View r36, float r37, float r38, ah.j1 r39, int r40, int r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: ah.e1.<init>(android.content.Context, org.telegram.ui.ActionBar.n2, org.telegram.ui.Components.fk0, android.view.View, android.view.View, float, float, ah.j1, int, int, boolean):void");
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z10) {
        e1 e1Var;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                e1Var = B;
            } else {
                e1Var = C;
            }
            if (e1Var != null) {
                if (z10) {
                    e1Var.c();
                } else {
                    e1Var.f515l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.n2 r14, org.telegram.ui.Components.fk0 r15, android.view.View r16, android.view.View r17, float r18, float r19, ah.j1 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: ah.e1.d(org.telegram.ui.ActionBar.n2, org.telegram.ui.Components.fk0, android.view.View, android.view.View, float, float, ah.j1, int, int):void");
    }

    public static int e() {
        return (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
    }

    public static void f() {
        e1 e1Var = B;
        if (e1Var != null) {
            e1Var.f522s = true;
            e1Var.f527y = System.currentTimeMillis();
            if (B.f506a == 0 && System.currentTimeMillis() - E > 200) {
                E = System.currentTimeMillis();
                B.v.performHapticFeedback(3);
                return;
            }
            return;
        }
        g();
        e1 e1Var2 = C;
        if (e1Var2 != null) {
            View view = e1Var2.v;
            if (view instanceof t1) {
                ((t1) view).N.b(e1Var2.f519p);
            } else if (view instanceof org.telegram.ui.Cells.w0) {
                ((org.telegram.ui.Cells.w0) view).C0.b(e1Var2.f519p);
            }
        }
    }

    public static void g() {
        e1 e1Var = C;
        if (e1Var != null && !e1Var.f522s) {
            e1Var.f522s = true;
            e1Var.f527y = System.currentTimeMillis();
            if (C.f506a == 1 && System.currentTimeMillis() - E > 200) {
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
            boolean z10 = this.f525w;
            b1 b1Var = this.f512i;
            if (z10) {
                this.f514k.removeView(b1Var);
            } else {
                AndroidUtilities.removeFromParent(b1Var);
            }
        } catch (Exception unused) {
        }
    }
}
