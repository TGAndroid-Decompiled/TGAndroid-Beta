package hi;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.hd;
public final class c6 extends k1.b {
    public final int f14335o = 0;
    public final Rect f14336p;
    public final View f14337q;

    public c6(org.telegram.ui.ActionBar.m3 m3Var, org.telegram.ui.ActionBar.m3 m3Var2) {
        super(m3Var2);
        this.f14337q = m3Var;
        this.f14336p = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        switch (this.f14335o) {
            case 0:
                d6 d6Var = (d6) this.f14337q;
                if (Math.abs(f10 - d6Var.f14528l0) <= org.telegram.messenger.g0.L(30.0f) && Math.abs(f11 - d6Var.f14527k0) <= org.telegram.messenger.g0.L(30.0f) && !d6Var.b() && !d6Var.f14540v0) {
                    return 0;
                }
                if (Math.abs(f10 - d6Var.m0) <= org.telegram.messenger.g0.L(30.0f) && Math.abs(f11 - d6Var.f14527k0) <= org.telegram.messenger.g0.L(30.0f) && !d6Var.b() && !d6Var.f14540v0) {
                    return 2;
                }
                if (Math.abs(f10 - d6Var.f14526j0) <= org.telegram.messenger.g0.L(60.0f) && Math.abs(f11 - d6Var.f14527k0) <= org.telegram.messenger.g0.L(60.0f)) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            default:
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) this.f14337q;
                ArrayList arrayList = m3Var.S;
                if (m3Var.W >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = m3Var.f29271j0;
                    if (yVar != null && yVar.getBounds().contains((int) f10, (int) f11)) {
                        return 1;
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) arrayList.get(size);
                        float f12 = l3Var.f29206i;
                        RectF rectF = l3Var.f29200a;
                        if (Math.abs(f12) < 0.4f && rectF.contains(f10, f11)) {
                            Rect bounds = l3Var.d.f28831l.getBounds();
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
        switch (this.f14335o) {
            case 0:
                d6 d6Var = (d6) this.f14337q;
                if (!d6Var.b() && !d6Var.f14540v0) {
                    arrayList.add(0);
                }
                arrayList.add(1);
                if (!d6Var.b() && !d6Var.f14540v0) {
                    arrayList.add(2);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) this.f14337q;
                ArrayList arrayList2 = m3Var.S;
                if (m3Var.W >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = m3Var.f29271j0;
                    if (yVar != null && !yVar.getBounds().isEmpty()) {
                        arrayList.add(1);
                    }
                    for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                        org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) arrayList2.get(i7);
                        if (Math.abs(l3Var.f29206i) < 0.4f && !l3Var.f29200a.isEmpty()) {
                            arrayList.add(Integer.valueOf(i7 + 1000));
                            org.telegram.ui.ActionBar.c3 c3Var = l3Var.d;
                            if (c3Var != null && !c3Var.f28831l.getBounds().isEmpty()) {
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
        int i12 = this.f14335o;
        View view = this.f14337q;
        switch (i12) {
            case 0:
                d6 d6Var = (d6) view;
                if (d6Var.f14512a == null || d6Var.f14540v0 || i10 != 16) {
                    return false;
                }
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2 || d6Var.b()) {
                            return false;
                        }
                        d6Var.d(180.0f);
                        ((p9) d6Var.f14512a).b();
                    } else if (d6Var.b()) {
                        ((p9) d6Var.f14512a).a();
                    } else if (d6Var.f14537s0) {
                        d6Var.f14537s0 = false;
                        d6Var.A0 = false;
                        d6Var.f14542w0 = SystemClock.elapsedRealtime();
                        d6Var.f14540v0 = true;
                        ((p9) d6Var.f14512a).e(false);
                        d6Var.invalidate();
                    } else if (d6Var.f14532p0) {
                        if (sa.c(((p9) d6Var.f14512a).f15282a)) {
                            d6Var.S = 0L;
                            d6Var.R = System.currentTimeMillis();
                            d6Var.B0 = false;
                            ((p9) d6Var.f14512a).f(new l(this, 13), false);
                        }
                    } else {
                        ((p9) d6Var.f14512a).d();
                    }
                } else if (d6Var.b()) {
                    return false;
                } else {
                    if (d6Var.f14537s0 && d6Var.B0) {
                        d6Var.A0 = false;
                        d6Var.H0.e(true, 1.0f);
                        i3 i3Var = ((p9) d6Var.f14512a).f15282a.U0;
                        i3Var.f14787a.t(hd.N0(2131744418, null), true, true);
                        i3Var.invalidate();
                        d6Var.invalidate();
                    } else {
                        ((p9) d6Var.f14512a).c();
                    }
                }
                return true;
            default:
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) view;
                ArrayList arrayList = m3Var.S;
                if (i10 != 16) {
                    return false;
                }
                if (i7 == 1) {
                    org.telegram.ui.ActionBar.f3 f3Var = m3Var.f29257a;
                    if (f3Var != null) {
                        f3Var.f();
                    }
                    m3Var.a(false);
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
                    org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) arrayList.get(i11);
                    if (z10) {
                        org.telegram.ui.ActionBar.f3 f3Var2 = m3Var.f29257a;
                        if (f3Var2 != null) {
                            f3Var2.g(l3Var.f29202c, new org.telegram.ui.ActionBar.b3(2, this, l3Var));
                        }
                    } else if (m3Var.f29257a != null) {
                        m3Var.a(false);
                        l3Var.getClass();
                        m3Var.f29257a.e(l3Var.f29202c);
                    }
                }
                return true;
        }
    }

    @Override
    public final void l(int i7, s0.c cVar) {
        String N0;
        String N02;
        int i10;
        boolean z10;
        String str;
        String str2;
        int i11 = this.f14335o;
        String str3 = "";
        boolean z11 = true;
        Rect rect = this.f14336p;
        View view = this.f14337q;
        switch (i11) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.f56785a;
                d6 d6Var = (d6) view;
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
                        float f10 = d6Var.m0;
                        float f11 = L;
                        float f12 = d6Var.f14527k0;
                        rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
                        cVar.h(rect);
                        cVar.j(hd.N0(2131754751, null));
                        if (d6Var.f14540v0 || d6Var.b()) {
                            z11 = false;
                        }
                        accessibilityNodeInfo.setEnabled(z11);
                        if (z11) {
                            cVar.b(s0.b.f56778c);
                            return;
                        }
                        return;
                    }
                    int L2 = org.telegram.messenger.g0.L(40.0f);
                    float f13 = d6Var.f14526j0;
                    float f14 = L2;
                    float f15 = d6Var.f14527k0;
                    rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
                    cVar.h(rect);
                    if (d6Var.b()) {
                        N02 = hd.N0(2131745444, null);
                    } else if (d6Var.f14537s0) {
                        N02 = hd.N0(2131754753, null);
                    } else if (d6Var.f14532p0) {
                        N02 = hd.N0(2131754757, null);
                    } else {
                        N02 = hd.N0(2131754746, null);
                    }
                    cVar.j(N02);
                    accessibilityNodeInfo.setEnabled(!d6Var.f14540v0);
                    if (!d6Var.f14540v0) {
                        cVar.b(s0.b.f56778c);
                        return;
                    }
                    return;
                }
                int L3 = org.telegram.messenger.g0.L(22.0f);
                float f16 = d6Var.f14528l0;
                float f17 = L3;
                float f18 = d6Var.f14527k0;
                rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
                cVar.h(rect);
                if (d6Var.f14537s0 && d6Var.B0) {
                    N0 = hd.N0(2131754845, null);
                } else {
                    N0 = hd.N0(2131754912, null);
                }
                cVar.j(N0);
                if (d6Var.f14540v0 || d6Var.b()) {
                    z11 = false;
                }
                accessibilityNodeInfo.setEnabled(z11);
                if (z11) {
                    cVar.b(s0.b.f56778c);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) view;
                ArrayList arrayList = m3Var.S;
                cVar.i("android.widget.Button");
                cVar.b(s0.b.f56778c);
                if (i7 == 1) {
                    org.telegram.ui.Cells.y yVar = m3Var.f29271j0;
                    if (yVar != null) {
                        rect.set(yVar.getBounds());
                    } else {
                        rect.set(0, 0, 1, 1);
                        cVar.p(false);
                    }
                    cVar.h(rect);
                    cVar.j(hd.N0(2131753096, null));
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
                    org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) arrayList.get(i10);
                    org.telegram.ui.ActionBar.e3 e3Var = l3Var.f29202c;
                    RectF rectF = l3Var.f29200a;
                    if (e3Var != null && e3Var.b() != null) {
                        str3 = l3Var.f29202c.b();
                    }
                    if (z10) {
                        Rect bounds = l3Var.d.f28831l.getBounds();
                        rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + org.telegram.messenger.g0.L(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + org.telegram.messenger.g0.L(24.0f) + bounds.bottom));
                        cVar.h(rect);
                        if (TextUtils.isEmpty(str3)) {
                            str2 = hd.N0(2131752029, null);
                        } else {
                            str2 = hd.N0(2131752029, null) + ", " + str3;
                        }
                        cVar.j(str2);
                        return;
                    }
                    rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    cVar.h(rect);
                    if (TextUtils.isEmpty(str3)) {
                        str = hd.N0(2131747623, null);
                    } else {
                        str = hd.N0(2131747623, null) + ", " + str3;
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

    public c6(d6 d6Var, d6 d6Var2) {
        super(d6Var2);
        this.f14337q = d6Var;
        this.f14336p = new Rect();
    }
}
