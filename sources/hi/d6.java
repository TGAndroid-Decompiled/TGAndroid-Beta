package hi;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.gd;
public final class d6 extends k1.b {
    public final int f14382o = 0;
    public final Rect f14383p;
    public final View f14384q;

    public d6(org.telegram.ui.ActionBar.n3 n3Var, org.telegram.ui.ActionBar.n3 n3Var2) {
        super(n3Var2);
        this.f14384q = n3Var;
        this.f14383p = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        switch (this.f14382o) {
            case 0:
                e6 e6Var = (e6) this.f14384q;
                if (Math.abs(f10 - e6Var.f14574l0) <= org.telegram.messenger.g0.L(30.0f) && Math.abs(f11 - e6Var.f14573k0) <= org.telegram.messenger.g0.L(30.0f) && !e6Var.b() && !e6Var.f14586v0) {
                    return 0;
                }
                if (Math.abs(f10 - e6Var.m0) <= org.telegram.messenger.g0.L(30.0f) && Math.abs(f11 - e6Var.f14573k0) <= org.telegram.messenger.g0.L(30.0f) && !e6Var.b() && !e6Var.f14586v0) {
                    return 2;
                }
                if (Math.abs(f10 - e6Var.f14572j0) <= org.telegram.messenger.g0.L(60.0f) && Math.abs(f11 - e6Var.f14573k0) <= org.telegram.messenger.g0.L(60.0f)) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            default:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) this.f14384q;
                ArrayList arrayList = n3Var.S;
                if (n3Var.W >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = n3Var.f29284j0;
                    if (yVar != null && yVar.getBounds().contains((int) f10, (int) f11)) {
                        return 1;
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) arrayList.get(size);
                        float f12 = m3Var.f29221i;
                        RectF rectF = m3Var.f29215a;
                        if (Math.abs(f12) < 0.4f && rectF.contains(f10, f11)) {
                            Rect bounds = m3Var.d.f28843l.getBounds();
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
        switch (this.f14382o) {
            case 0:
                e6 e6Var = (e6) this.f14384q;
                if (!e6Var.b() && !e6Var.f14586v0) {
                    arrayList.add(0);
                }
                arrayList.add(1);
                if (!e6Var.b() && !e6Var.f14586v0) {
                    arrayList.add(2);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) this.f14384q;
                ArrayList arrayList2 = n3Var.S;
                if (n3Var.W >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = n3Var.f29284j0;
                    if (yVar != null && !yVar.getBounds().isEmpty()) {
                        arrayList.add(1);
                    }
                    for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                        org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) arrayList2.get(i7);
                        if (Math.abs(m3Var.f29221i) < 0.4f && !m3Var.f29215a.isEmpty()) {
                            arrayList.add(Integer.valueOf(i7 + 1000));
                            org.telegram.ui.ActionBar.d3 d3Var = m3Var.d;
                            if (d3Var != null && !d3Var.f28843l.getBounds().isEmpty()) {
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
        boolean z10;
        int i12 = this.f14382o;
        View view = this.f14384q;
        switch (i12) {
            case 0:
                e6 e6Var = (e6) view;
                if (e6Var.f14558a == null || e6Var.f14586v0 || i10 != 16) {
                    return false;
                }
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2 || e6Var.b()) {
                            return false;
                        }
                        e6Var.d(180.0f);
                        ((q9) e6Var.f14558a).b();
                    } else if (e6Var.b()) {
                        ((q9) e6Var.f14558a).a();
                    } else if (e6Var.f14583s0) {
                        e6Var.f14583s0 = false;
                        e6Var.A0 = false;
                        e6Var.f14588w0 = SystemClock.elapsedRealtime();
                        e6Var.f14586v0 = true;
                        ((q9) e6Var.f14558a).e(false);
                        e6Var.invalidate();
                    } else if (e6Var.f14578p0) {
                        if (ta.c(((q9) e6Var.f14558a).f15293a)) {
                            e6Var.S = 0L;
                            e6Var.R = System.currentTimeMillis();
                            e6Var.B0 = false;
                            ((q9) e6Var.f14558a).f(new k(this, 13), false);
                        }
                    } else {
                        ((q9) e6Var.f14558a).d();
                    }
                } else if (e6Var.b()) {
                    return false;
                } else {
                    if (e6Var.f14583s0 && e6Var.B0) {
                        e6Var.A0 = false;
                        e6Var.H0.e(true, 1.0f);
                        j3 j3Var = ((q9) e6Var.f14558a).f15293a.U0;
                        j3Var.f14806a.t(gd.M0(2131744426, null), true, true);
                        j3Var.invalidate();
                        e6Var.invalidate();
                    } else {
                        ((q9) e6Var.f14558a).c();
                    }
                }
                return true;
            default:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) view;
                ArrayList arrayList = n3Var.S;
                if (i10 != 16) {
                    return false;
                }
                if (i7 == 1) {
                    org.telegram.ui.ActionBar.g3 g3Var = n3Var.f29270a;
                    if (g3Var != null) {
                        g3Var.f();
                    }
                    n3Var.a(false);
                } else {
                    if (i7 >= 2000) {
                        i11 = i7 - 2000;
                        z10 = true;
                    } else if (i7 < 1000) {
                        return false;
                    } else {
                        i11 = i7 - 1000;
                        z10 = false;
                    }
                    if (i11 < 0 || i11 >= arrayList.size()) {
                        return false;
                    }
                    org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) arrayList.get(i11);
                    if (z10) {
                        org.telegram.ui.ActionBar.g3 g3Var2 = n3Var.f29270a;
                        if (g3Var2 != null) {
                            g3Var2.g(m3Var.f29217c, new org.telegram.ui.ActionBar.c3(2, this, m3Var));
                        }
                    } else if (n3Var.f29270a != null) {
                        n3Var.a(false);
                        m3Var.getClass();
                        n3Var.f29270a.e(m3Var.f29217c);
                    }
                }
                return true;
        }
    }

    @Override
    public final void l(int i7, s0.c cVar) {
        String M0;
        String M02;
        int i10;
        boolean z10;
        String str;
        String str2;
        int i11 = this.f14382o;
        String str3 = "";
        boolean z11 = true;
        Rect rect = this.f14383p;
        View view = this.f14384q;
        switch (i11) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.f56740a;
                e6 e6Var = (e6) view;
                cVar.i("android.widget.Button");
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            rect.set(0, 0, 1, 1);
                            cVar.h(rect);
                            cVar.p(false);
                            cVar.j("");
                            return;
                        }
                        int L = org.telegram.messenger.g0.L(22.0f);
                        float f10 = e6Var.m0;
                        float f11 = L;
                        float f12 = e6Var.f14573k0;
                        rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
                        cVar.h(rect);
                        cVar.j(gd.M0(2131754752, null));
                        if (e6Var.f14586v0 || e6Var.b()) {
                            z11 = false;
                        }
                        accessibilityNodeInfo.setEnabled(z11);
                        if (z11) {
                            cVar.b(s0.b.f56733c);
                            return;
                        }
                        return;
                    }
                    int L2 = org.telegram.messenger.g0.L(40.0f);
                    float f13 = e6Var.f14572j0;
                    float f14 = L2;
                    float f15 = e6Var.f14573k0;
                    rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
                    cVar.h(rect);
                    if (e6Var.b()) {
                        M02 = gd.M0(2131745445, null);
                    } else if (e6Var.f14583s0) {
                        M02 = gd.M0(2131754754, null);
                    } else if (e6Var.f14578p0) {
                        M02 = gd.M0(2131754758, null);
                    } else {
                        M02 = gd.M0(2131754747, null);
                    }
                    cVar.j(M02);
                    accessibilityNodeInfo.setEnabled(!e6Var.f14586v0);
                    if (!e6Var.f14586v0) {
                        cVar.b(s0.b.f56733c);
                        return;
                    }
                    return;
                }
                int L3 = org.telegram.messenger.g0.L(22.0f);
                float f16 = e6Var.f14574l0;
                float f17 = L3;
                float f18 = e6Var.f14573k0;
                rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
                cVar.h(rect);
                if (e6Var.f14583s0 && e6Var.B0) {
                    M0 = gd.M0(2131754846, null);
                } else {
                    M0 = gd.M0(2131754912, null);
                }
                cVar.j(M0);
                if (e6Var.f14586v0 || e6Var.b()) {
                    z11 = false;
                }
                accessibilityNodeInfo.setEnabled(z11);
                if (z11) {
                    cVar.b(s0.b.f56733c);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) view;
                ArrayList arrayList = n3Var.S;
                cVar.i("android.widget.Button");
                cVar.b(s0.b.f56733c);
                if (i7 == 1) {
                    org.telegram.ui.Cells.y yVar = n3Var.f29284j0;
                    if (yVar != null) {
                        rect.set(yVar.getBounds());
                    } else {
                        rect.set(0, 0, 1, 1);
                        cVar.p(false);
                    }
                    cVar.h(rect);
                    cVar.j(gd.M0(2131753097, null));
                    return;
                }
                if (i7 >= 2000) {
                    i10 = i7 - 2000;
                    z10 = true;
                } else if (i7 >= 1000) {
                    i10 = i7 - 1000;
                    z10 = false;
                } else {
                    rect.set(0, 0, 1, 1);
                    cVar.h(rect);
                    cVar.p(false);
                    return;
                }
                if (i10 >= 0 && i10 < arrayList.size()) {
                    org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) arrayList.get(i10);
                    org.telegram.ui.ActionBar.f3 f3Var = m3Var.f29217c;
                    RectF rectF = m3Var.f29215a;
                    if (f3Var != null && f3Var.b() != null) {
                        str3 = m3Var.f29217c.b();
                    }
                    if (z10) {
                        Rect bounds = m3Var.d.f28843l.getBounds();
                        rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + org.telegram.messenger.g0.L(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + org.telegram.messenger.g0.L(24.0f) + bounds.bottom));
                        cVar.h(rect);
                        if (TextUtils.isEmpty(str3)) {
                            str2 = gd.M0(2131752030, null);
                        } else {
                            str2 = gd.M0(2131752030, null) + ", " + str3;
                        }
                        cVar.j(str2);
                        return;
                    }
                    rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    cVar.h(rect);
                    if (TextUtils.isEmpty(str3)) {
                        str = gd.M0(2131747624, null);
                    } else {
                        str = gd.M0(2131747624, null) + ", " + str3;
                    }
                    cVar.j(str);
                    return;
                }
                rect.set(0, 0, 1, 1);
                cVar.h(rect);
                cVar.p(false);
                return;
        }
    }

    public d6(e6 e6Var, e6 e6Var2) {
        super(e6Var2);
        this.f14384q = e6Var;
        this.f14383p = new Rect();
    }
}
