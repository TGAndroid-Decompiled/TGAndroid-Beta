package fi;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.hd;
public final class f6 extends k1.b {
    public final int f11982o = 0;
    public final Rect f11983p;
    public final View f11984q;

    public f6(org.telegram.ui.ActionBar.k3 k3Var, org.telegram.ui.ActionBar.k3 k3Var2) {
        super(k3Var2);
        this.f11984q = k3Var;
        this.f11983p = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        switch (this.f11982o) {
            case 0:
                g6 g6Var = (g6) this.f11984q;
                if (Math.abs(f10 - g6Var.f12086k0) <= org.telegram.messenger.g0.L(30.0f) && Math.abs(f11 - g6Var.f12085j0) <= org.telegram.messenger.g0.L(30.0f) && !g6Var.b() && !g6Var.f12098u0) {
                    return 0;
                }
                if (Math.abs(f10 - g6Var.f12087l0) <= org.telegram.messenger.g0.L(30.0f) && Math.abs(f11 - g6Var.f12085j0) <= org.telegram.messenger.g0.L(30.0f) && !g6Var.b() && !g6Var.f12098u0) {
                    return 2;
                }
                if (Math.abs(f10 - g6Var.f12084i0) <= org.telegram.messenger.g0.L(60.0f) && Math.abs(f11 - g6Var.f12085j0) <= org.telegram.messenger.g0.L(60.0f)) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            default:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.f11984q;
                ArrayList arrayList = k3Var.R;
                if (k3Var.V >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = k3Var.f27724i0;
                    if (yVar != null && yVar.getBounds().contains((int) f10, (int) f11)) {
                        return 1;
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) arrayList.get(size);
                        float f12 = j3Var.f27615i;
                        RectF rectF = j3Var.f27609a;
                        if (Math.abs(f12) < 0.4f && rectF.contains(f10, f11)) {
                            Rect bounds = j3Var.d.f27311l.getBounds();
                            if (!bounds.isEmpty() && bounds.contains((int) (f10 - rectF.left), (int) ((f11 - rectF.top) - org.telegram.messenger.g0.L(24.0f)))) {
                                return size + 2000;
                            }
                            return size + 1000;
                        }
                    }
                }
                return -1;
        }
    }

    @Override
    public final void h(ArrayList arrayList) {
        switch (this.f11982o) {
            case 0:
                g6 g6Var = (g6) this.f11984q;
                if (!g6Var.b() && !g6Var.f12098u0) {
                    arrayList.add(0);
                }
                arrayList.add(1);
                if (!g6Var.b() && !g6Var.f12098u0) {
                    arrayList.add(2);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.f11984q;
                ArrayList arrayList2 = k3Var.R;
                if (k3Var.V >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = k3Var.f27724i0;
                    if (yVar != null && !yVar.getBounds().isEmpty()) {
                        arrayList.add(1);
                    }
                    for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                        org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) arrayList2.get(i7);
                        if (Math.abs(j3Var.f27615i) < 0.4f && !j3Var.f27609a.isEmpty()) {
                            arrayList.add(Integer.valueOf(i7 + 1000));
                            org.telegram.ui.ActionBar.a3 a3Var = j3Var.d;
                            if (a3Var != null && !a3Var.f27311l.getBounds().isEmpty()) {
                                arrayList.add(Integer.valueOf(i7 + 2000));
                            }
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean k(int i7, int i10) {
        int i11;
        boolean z9;
        int i12 = this.f11982o;
        View view = this.f11984q;
        switch (i12) {
            case 0:
                g6 g6Var = (g6) view;
                if (g6Var.f12071a == null || g6Var.f12098u0 || i10 != 16) {
                    return false;
                }
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2 || g6Var.b()) {
                            return false;
                        }
                        g6Var.d(180.0f);
                        ((s9) g6Var.f12071a).b();
                    } else if (g6Var.b()) {
                        ((s9) g6Var.f12071a).a();
                    } else if (g6Var.f12094r0) {
                        g6Var.f12094r0 = false;
                        g6Var.f12106z0 = false;
                        g6Var.f12099v0 = SystemClock.elapsedRealtime();
                        g6Var.f12098u0 = true;
                        ((s9) g6Var.f12071a).e(false);
                        g6Var.invalidate();
                    } else if (g6Var.f12090o0) {
                        if (va.c(((s9) g6Var.f12071a).f12819a)) {
                            g6Var.R = 0L;
                            g6Var.Q = System.currentTimeMillis();
                            g6Var.A0 = false;
                            ((s9) g6Var.f12071a).f(new di.s7(this, 26), false);
                        }
                    } else {
                        ((s9) g6Var.f12071a).d();
                    }
                } else if (g6Var.b()) {
                    return false;
                } else {
                    if (g6Var.f12094r0 && g6Var.A0) {
                        g6Var.f12106z0 = false;
                        g6Var.G0.e(true, 1.0f);
                        k3 k3Var = ((s9) g6Var.f12071a).f12819a.T0;
                        k3Var.f12266a.t(hd.M0(2131744662, null), true, true);
                        k3Var.invalidate();
                        g6Var.invalidate();
                    } else {
                        ((s9) g6Var.f12071a).c();
                    }
                }
                return true;
            default:
                org.telegram.ui.ActionBar.k3 k3Var2 = (org.telegram.ui.ActionBar.k3) view;
                ArrayList arrayList = k3Var2.R;
                if (i10 != 16) {
                    return false;
                }
                if (i7 == 1) {
                    org.telegram.ui.ActionBar.d3 d3Var = k3Var2.f27711a;
                    if (d3Var != null) {
                        d3Var.f();
                    }
                    k3Var2.a(false);
                } else {
                    if (i7 >= 2000) {
                        i11 = i7 - 2000;
                        z9 = true;
                    } else if (i7 < 1000) {
                        return false;
                    } else {
                        i11 = i7 - 1000;
                        z9 = false;
                    }
                    if (i11 < 0 || i11 >= arrayList.size()) {
                        return false;
                    }
                    org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) arrayList.get(i11);
                    if (z9) {
                        org.telegram.ui.ActionBar.d3 d3Var2 = k3Var2.f27711a;
                        if (d3Var2 != null) {
                            d3Var2.g(j3Var.f27611c, new org.telegram.messenger.voip.k(3, this, j3Var));
                        }
                    } else if (k3Var2.f27711a != null) {
                        k3Var2.a(false);
                        j3Var.getClass();
                        k3Var2.f27711a.e(j3Var.f27611c);
                    }
                }
                return true;
        }
    }

    @Override
    public final void l(int i7, s0.d dVar) {
        String M0;
        String M02;
        int i10;
        boolean z9;
        String str;
        String str2;
        int i11 = this.f11982o;
        String str3 = "";
        boolean z10 = true;
        Rect rect = this.f11983p;
        View view = this.f11984q;
        switch (i11) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f54484a;
                g6 g6Var = (g6) view;
                dVar.i("android.widget.Button");
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            rect.set(0, 0, 1, 1);
                            dVar.h(rect);
                            dVar.p(false);
                            dVar.j("");
                            return;
                        }
                        int L = org.telegram.messenger.g0.L(22.0f);
                        float f10 = g6Var.f12087l0;
                        float f11 = L;
                        float f12 = g6Var.f12085j0;
                        rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
                        dVar.h(rect);
                        dVar.j(hd.M0(2131754752, null));
                        if (g6Var.f12098u0 || g6Var.b()) {
                            z10 = false;
                        }
                        accessibilityNodeInfo.setEnabled(z10);
                        if (z10) {
                            dVar.b(s0.c.f54477c);
                            return;
                        }
                        return;
                    }
                    int L2 = org.telegram.messenger.g0.L(40.0f);
                    float f13 = g6Var.f12084i0;
                    float f14 = L2;
                    float f15 = g6Var.f12085j0;
                    rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
                    dVar.h(rect);
                    if (g6Var.b()) {
                        M02 = hd.M0(2131745641, null);
                    } else if (g6Var.f12094r0) {
                        M02 = hd.M0(2131754754, null);
                    } else if (g6Var.f12090o0) {
                        M02 = hd.M0(2131754758, null);
                    } else {
                        M02 = hd.M0(2131754747, null);
                    }
                    dVar.j(M02);
                    accessibilityNodeInfo.setEnabled(!g6Var.f12098u0);
                    if (!g6Var.f12098u0) {
                        dVar.b(s0.c.f54477c);
                        return;
                    }
                    return;
                }
                int L3 = org.telegram.messenger.g0.L(22.0f);
                float f16 = g6Var.f12086k0;
                float f17 = L3;
                float f18 = g6Var.f12085j0;
                rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
                dVar.h(rect);
                if (g6Var.f12094r0 && g6Var.A0) {
                    M0 = hd.M0(2131754846, null);
                } else {
                    M0 = hd.M0(2131754912, null);
                }
                dVar.j(M0);
                if (g6Var.f12098u0 || g6Var.b()) {
                    z10 = false;
                }
                accessibilityNodeInfo.setEnabled(z10);
                if (z10) {
                    dVar.b(s0.c.f54477c);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) view;
                ArrayList arrayList = k3Var.R;
                dVar.i("android.widget.Button");
                dVar.b(s0.c.f54477c);
                if (i7 == 1) {
                    org.telegram.ui.Cells.y yVar = k3Var.f27724i0;
                    if (yVar != null) {
                        rect.set(yVar.getBounds());
                    } else {
                        rect.set(0, 0, 1, 1);
                        dVar.p(false);
                    }
                    dVar.h(rect);
                    dVar.j(hd.M0(2131753099, null));
                    return;
                }
                if (i7 >= 2000) {
                    i10 = i7 - 2000;
                    z9 = true;
                } else if (i7 >= 1000) {
                    i10 = i7 - 1000;
                    z9 = false;
                } else {
                    rect.set(0, 0, 1, 1);
                    dVar.h(rect);
                    dVar.p(false);
                    return;
                }
                if (i10 >= 0 && i10 < arrayList.size()) {
                    org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) arrayList.get(i10);
                    org.telegram.ui.ActionBar.c3 c3Var = j3Var.f27611c;
                    RectF rectF = j3Var.f27609a;
                    if (c3Var != null && c3Var.b() != null) {
                        str3 = j3Var.f27611c.b();
                    }
                    if (z9) {
                        Rect bounds = j3Var.d.f27311l.getBounds();
                        rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + org.telegram.messenger.g0.L(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + org.telegram.messenger.g0.L(24.0f) + bounds.bottom));
                        dVar.h(rect);
                        if (TextUtils.isEmpty(str3)) {
                            str2 = hd.M0(2131752041, null);
                        } else {
                            str2 = hd.M0(2131752041, null) + ", " + str3;
                        }
                        dVar.j(str2);
                        return;
                    }
                    rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    dVar.h(rect);
                    if (TextUtils.isEmpty(str3)) {
                        str = hd.M0(2131747816, null);
                    } else {
                        str = hd.M0(2131747816, null) + ", " + str3;
                    }
                    dVar.j(str);
                    return;
                }
                rect.set(0, 0, 1, 1);
                dVar.h(rect);
                dVar.p(false);
                return;
        }
    }

    public f6(g6 g6Var, g6 g6Var2) {
        super(g6Var2);
        this.f11984q = g6Var;
        this.f11983p = new Rect();
    }
}
