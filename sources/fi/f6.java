package fi;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.id;
public final class f6 extends k1.b {
    public final int f11986o = 0;
    public final Rect f11987p;
    public final View f11988q;

    public f6(org.telegram.ui.ActionBar.l3 l3Var, org.telegram.ui.ActionBar.l3 l3Var2) {
        super(l3Var2);
        this.f11988q = l3Var;
        this.f11987p = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        switch (this.f11986o) {
            case 0:
                g6 g6Var = (g6) this.f11988q;
                if (Math.abs(f10 - g6Var.f12090k0) <= org.telegram.messenger.g0.L(30.0f) && Math.abs(f11 - g6Var.f12089j0) <= org.telegram.messenger.g0.L(30.0f) && !g6Var.b() && !g6Var.f12102u0) {
                    return 0;
                }
                if (Math.abs(f10 - g6Var.f12091l0) <= org.telegram.messenger.g0.L(30.0f) && Math.abs(f11 - g6Var.f12089j0) <= org.telegram.messenger.g0.L(30.0f) && !g6Var.b() && !g6Var.f12102u0) {
                    return 2;
                }
                if (Math.abs(f10 - g6Var.f12088i0) <= org.telegram.messenger.g0.L(60.0f) && Math.abs(f11 - g6Var.f12089j0) <= org.telegram.messenger.g0.L(60.0f)) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            default:
                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) this.f11988q;
                ArrayList arrayList = l3Var.R;
                if (l3Var.V >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = l3Var.f27741i0;
                    if (yVar != null && yVar.getBounds().contains((int) f10, (int) f11)) {
                        return 1;
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) arrayList.get(size);
                        float f12 = k3Var.f27644i;
                        RectF rectF = k3Var.f27638a;
                        if (Math.abs(f12) < 0.4f && rectF.contains(f10, f11)) {
                            Rect bounds = k3Var.d.f27336l.getBounds();
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
        switch (this.f11986o) {
            case 0:
                g6 g6Var = (g6) this.f11988q;
                if (!g6Var.b() && !g6Var.f12102u0) {
                    arrayList.add(0);
                }
                arrayList.add(1);
                if (!g6Var.b() && !g6Var.f12102u0) {
                    arrayList.add(2);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) this.f11988q;
                ArrayList arrayList2 = l3Var.R;
                if (l3Var.V >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = l3Var.f27741i0;
                    if (yVar != null && !yVar.getBounds().isEmpty()) {
                        arrayList.add(1);
                    }
                    for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                        org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) arrayList2.get(i7);
                        if (Math.abs(k3Var.f27644i) < 0.4f && !k3Var.f27638a.isEmpty()) {
                            arrayList.add(Integer.valueOf(i7 + 1000));
                            org.telegram.ui.ActionBar.b3 b3Var = k3Var.d;
                            if (b3Var != null && !b3Var.f27336l.getBounds().isEmpty()) {
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
        int i12 = this.f11986o;
        View view = this.f11988q;
        switch (i12) {
            case 0:
                g6 g6Var = (g6) view;
                if (g6Var.f12075a == null || g6Var.f12102u0 || i10 != 16) {
                    return false;
                }
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2 || g6Var.b()) {
                            return false;
                        }
                        g6Var.d(180.0f);
                        ((r9) g6Var.f12075a).b();
                    } else if (g6Var.b()) {
                        ((r9) g6Var.f12075a).a();
                    } else if (g6Var.f12098r0) {
                        g6Var.f12098r0 = false;
                        g6Var.f12110z0 = false;
                        g6Var.f12103v0 = SystemClock.elapsedRealtime();
                        g6Var.f12102u0 = true;
                        ((r9) g6Var.f12075a).e(false);
                        g6Var.invalidate();
                    } else if (g6Var.f12094o0) {
                        if (va.c(((r9) g6Var.f12075a).f12762a)) {
                            g6Var.R = 0L;
                            g6Var.Q = System.currentTimeMillis();
                            g6Var.A0 = false;
                            ((r9) g6Var.f12075a).f(new di.f8(this, 25), false);
                        }
                    } else {
                        ((r9) g6Var.f12075a).d();
                    }
                } else if (g6Var.b()) {
                    return false;
                } else {
                    if (g6Var.f12098r0 && g6Var.A0) {
                        g6Var.f12110z0 = false;
                        g6Var.G0.e(true, 1.0f);
                        k3 k3Var = ((r9) g6Var.f12075a).f12762a.T0;
                        k3Var.f12267a.t(id.M0(2131744661, null), true, true);
                        k3Var.invalidate();
                        g6Var.invalidate();
                    } else {
                        ((r9) g6Var.f12075a).c();
                    }
                }
                return true;
            default:
                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) view;
                ArrayList arrayList = l3Var.R;
                if (i10 != 16) {
                    return false;
                }
                if (i7 == 1) {
                    org.telegram.ui.ActionBar.e3 e3Var = l3Var.f27728a;
                    if (e3Var != null) {
                        e3Var.f();
                    }
                    l3Var.a(false);
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
                    org.telegram.ui.ActionBar.k3 k3Var2 = (org.telegram.ui.ActionBar.k3) arrayList.get(i11);
                    if (z9) {
                        org.telegram.ui.ActionBar.e3 e3Var2 = l3Var.f27728a;
                        if (e3Var2 != null) {
                            e3Var2.g(k3Var2.f27640c, new org.telegram.messenger.voip.k(3, this, k3Var2));
                        }
                    } else if (l3Var.f27728a != null) {
                        l3Var.a(false);
                        k3Var2.getClass();
                        l3Var.f27728a.e(k3Var2.f27640c);
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
        int i11 = this.f11986o;
        String str3 = "";
        boolean z10 = true;
        Rect rect = this.f11987p;
        View view = this.f11988q;
        switch (i11) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f54612a;
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
                        float f10 = g6Var.f12091l0;
                        float f11 = L;
                        float f12 = g6Var.f12089j0;
                        rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
                        dVar.h(rect);
                        dVar.j(id.M0(2131754752, null));
                        if (g6Var.f12102u0 || g6Var.b()) {
                            z10 = false;
                        }
                        accessibilityNodeInfo.setEnabled(z10);
                        if (z10) {
                            dVar.b(s0.c.f54605c);
                            return;
                        }
                        return;
                    }
                    int L2 = org.telegram.messenger.g0.L(40.0f);
                    float f13 = g6Var.f12088i0;
                    float f14 = L2;
                    float f15 = g6Var.f12089j0;
                    rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
                    dVar.h(rect);
                    if (g6Var.b()) {
                        M02 = id.M0(2131745640, null);
                    } else if (g6Var.f12098r0) {
                        M02 = id.M0(2131754754, null);
                    } else if (g6Var.f12094o0) {
                        M02 = id.M0(2131754758, null);
                    } else {
                        M02 = id.M0(2131754747, null);
                    }
                    dVar.j(M02);
                    accessibilityNodeInfo.setEnabled(!g6Var.f12102u0);
                    if (!g6Var.f12102u0) {
                        dVar.b(s0.c.f54605c);
                        return;
                    }
                    return;
                }
                int L3 = org.telegram.messenger.g0.L(22.0f);
                float f16 = g6Var.f12090k0;
                float f17 = L3;
                float f18 = g6Var.f12089j0;
                rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
                dVar.h(rect);
                if (g6Var.f12098r0 && g6Var.A0) {
                    M0 = id.M0(2131754846, null);
                } else {
                    M0 = id.M0(2131754912, null);
                }
                dVar.j(M0);
                if (g6Var.f12102u0 || g6Var.b()) {
                    z10 = false;
                }
                accessibilityNodeInfo.setEnabled(z10);
                if (z10) {
                    dVar.b(s0.c.f54605c);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) view;
                ArrayList arrayList = l3Var.R;
                dVar.i("android.widget.Button");
                dVar.b(s0.c.f54605c);
                if (i7 == 1) {
                    org.telegram.ui.Cells.y yVar = l3Var.f27741i0;
                    if (yVar != null) {
                        rect.set(yVar.getBounds());
                    } else {
                        rect.set(0, 0, 1, 1);
                        dVar.p(false);
                    }
                    dVar.h(rect);
                    dVar.j(id.M0(2131753099, null));
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
                    org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) arrayList.get(i10);
                    org.telegram.ui.ActionBar.d3 d3Var = k3Var.f27640c;
                    RectF rectF = k3Var.f27638a;
                    if (d3Var != null && d3Var.b() != null) {
                        str3 = k3Var.f27640c.b();
                    }
                    if (z9) {
                        Rect bounds = k3Var.d.f27336l.getBounds();
                        rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + org.telegram.messenger.g0.L(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + org.telegram.messenger.g0.L(24.0f) + bounds.bottom));
                        dVar.h(rect);
                        if (TextUtils.isEmpty(str3)) {
                            str2 = id.M0(2131752041, null);
                        } else {
                            str2 = id.M0(2131752041, null) + ", " + str3;
                        }
                        dVar.j(str2);
                        return;
                    }
                    rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    dVar.h(rect);
                    if (TextUtils.isEmpty(str3)) {
                        str = id.M0(2131747817, null);
                    } else {
                        str = id.M0(2131747817, null) + ", " + str3;
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
        this.f11988q = g6Var;
        this.f11987p = new Rect();
    }
}
