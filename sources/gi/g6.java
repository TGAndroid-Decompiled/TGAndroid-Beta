package gi;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.bd;
public final class g6 extends j1.b {
    public final int f12834o = 0;
    public final Rect f12835p;
    public final View f12836q;

    public g6(org.telegram.ui.ActionBar.j3 j3Var, org.telegram.ui.ActionBar.j3 j3Var2) {
        super(j3Var2);
        this.f12836q = j3Var;
        this.f12835p = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        switch (this.f12834o) {
            case 0:
                h6 h6Var = (h6) this.f12836q;
                if (Math.abs(f10 - h6Var.f12899l0) <= org.telegram.messenger.g0.L(30.0f) && Math.abs(f11 - h6Var.f12898k0) <= org.telegram.messenger.g0.L(30.0f) && !h6Var.b() && !h6Var.f12911v0) {
                    return 0;
                }
                if (Math.abs(f10 - h6Var.m0) <= org.telegram.messenger.g0.L(30.0f) && Math.abs(f11 - h6Var.f12898k0) <= org.telegram.messenger.g0.L(30.0f) && !h6Var.b() && !h6Var.f12911v0) {
                    return 2;
                }
                if (Math.abs(f10 - h6Var.f12897j0) <= org.telegram.messenger.g0.L(60.0f) && Math.abs(f11 - h6Var.f12898k0) <= org.telegram.messenger.g0.L(60.0f)) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            default:
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) this.f12836q;
                ArrayList arrayList = j3Var.S;
                if (j3Var.W >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = j3Var.f27667j0;
                    if (yVar != null && yVar.getBounds().contains((int) f10, (int) f11)) {
                        return 1;
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        org.telegram.ui.ActionBar.i3 i3Var = (org.telegram.ui.ActionBar.i3) arrayList.get(size);
                        float f12 = i3Var.f27598i;
                        RectF rectF = i3Var.f27592a;
                        if (Math.abs(f12) < 0.4f && rectF.contains(f10, f11)) {
                            Rect bounds = i3Var.d.f28834l.getBounds();
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
        switch (this.f12834o) {
            case 0:
                h6 h6Var = (h6) this.f12836q;
                if (!h6Var.b() && !h6Var.f12911v0) {
                    arrayList.add(0);
                }
                arrayList.add(1);
                if (!h6Var.b() && !h6Var.f12911v0) {
                    arrayList.add(2);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) this.f12836q;
                ArrayList arrayList2 = j3Var.S;
                if (j3Var.W >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = j3Var.f27667j0;
                    if (yVar != null && !yVar.getBounds().isEmpty()) {
                        arrayList.add(1);
                    }
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        org.telegram.ui.ActionBar.i3 i3Var = (org.telegram.ui.ActionBar.i3) arrayList2.get(i3);
                        if (Math.abs(i3Var.f27598i) < 0.4f && !i3Var.f27592a.isEmpty()) {
                            arrayList.add(Integer.valueOf(i3 + 1000));
                            org.telegram.ui.ActionBar.y2 y2Var = i3Var.d;
                            if (y2Var != null && !y2Var.f28834l.getBounds().isEmpty()) {
                                arrayList.add(Integer.valueOf(i3 + 2000));
                            }
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean k(int i3, int i10) {
        int i11;
        boolean z10;
        int i12 = this.f12834o;
        View view = this.f12836q;
        switch (i12) {
            case 0:
                h6 h6Var = (h6) view;
                if (h6Var.f12883a != null && !h6Var.f12911v0 && i10 == 16) {
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 == 2 && !h6Var.b()) {
                                h6Var.d(180.0f);
                                ((s9) h6Var.f12883a).b();
                                return true;
                            }
                        } else if (h6Var.b()) {
                            ((s9) h6Var.f12883a).a();
                            return true;
                        } else if (h6Var.f12908s0) {
                            h6Var.f12908s0 = false;
                            h6Var.A0 = false;
                            h6Var.f12913w0 = SystemClock.elapsedRealtime();
                            h6Var.f12911v0 = true;
                            ((s9) h6Var.f12883a).e(false);
                            h6Var.invalidate();
                            return true;
                        } else if (h6Var.f12903p0) {
                            if (!va.c(((s9) h6Var.f12883a).f13580a)) {
                                return true;
                            }
                            h6Var.S = 0L;
                            h6Var.R = System.currentTimeMillis();
                            h6Var.B0 = false;
                            ((s9) h6Var.f12883a).f(new f6(this, 0), false);
                            return true;
                        } else {
                            ((s9) h6Var.f12883a).d();
                            return true;
                        }
                    } else if (!h6Var.b()) {
                        if (h6Var.f12908s0 && h6Var.B0) {
                            h6Var.A0 = false;
                            h6Var.H0.e(true, 1.0f);
                            i3 i3Var = ((s9) h6Var.f12883a).f13580a.U0;
                            i3Var.f12965a.t(bd.M0(2131744671, null), true, true);
                            i3Var.invalidate();
                            h6Var.invalidate();
                            return true;
                        }
                        ((s9) h6Var.f12883a).c();
                        return true;
                    }
                }
                return false;
            default:
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) view;
                ArrayList arrayList = j3Var.S;
                if (i10 == 16) {
                    if (i3 == 1) {
                        org.telegram.ui.ActionBar.b3 b3Var = j3Var.f27653a;
                        if (b3Var != null) {
                            b3Var.f();
                        }
                        j3Var.a(false);
                        return true;
                    }
                    if (i3 >= 2000) {
                        i11 = i3 - 2000;
                        z10 = true;
                    } else if (i3 >= 1000) {
                        i11 = i3 - 1000;
                        z10 = false;
                    }
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.ActionBar.i3 i3Var2 = (org.telegram.ui.ActionBar.i3) arrayList.get(i11);
                        if (z10) {
                            org.telegram.ui.ActionBar.b3 b3Var2 = j3Var.f27653a;
                            if (b3Var2 == null) {
                                return true;
                            }
                            b3Var2.g(i3Var2.f27594c, new mi.f(7, this, i3Var2));
                            return true;
                        } else if (j3Var.f27653a == null) {
                            return true;
                        } else {
                            j3Var.a(false);
                            i3Var2.getClass();
                            j3Var.f27653a.e(i3Var2.f27594c);
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public final void l(int i3, s0.d dVar) {
        String M0;
        String M02;
        int i10;
        boolean z10;
        String str;
        String str2;
        int i11 = this.f12834o;
        String str3 = "";
        boolean z11 = true;
        Rect rect = this.f12835p;
        View view = this.f12836q;
        switch (i11) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f54570a;
                h6 h6Var = (h6) view;
                dVar.i("android.widget.Button");
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            rect.set(0, 0, 1, 1);
                            dVar.h(rect);
                            dVar.p(false);
                            dVar.j("");
                            return;
                        }
                        int L = org.telegram.messenger.g0.L(22.0f);
                        float f10 = h6Var.m0;
                        float f11 = L;
                        float f12 = h6Var.f12898k0;
                        rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
                        dVar.h(rect);
                        dVar.j(bd.M0(2131754752, null));
                        if (h6Var.f12911v0 || h6Var.b()) {
                            z11 = false;
                        }
                        accessibilityNodeInfo.setEnabled(z11);
                        if (z11) {
                            dVar.b(s0.c.f54563c);
                            return;
                        }
                        return;
                    }
                    int L2 = org.telegram.messenger.g0.L(40.0f);
                    float f13 = h6Var.f12897j0;
                    float f14 = L2;
                    float f15 = h6Var.f12898k0;
                    rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
                    dVar.h(rect);
                    if (h6Var.b()) {
                        M02 = bd.M0(2131745650, null);
                    } else if (h6Var.f12908s0) {
                        M02 = bd.M0(2131754754, null);
                    } else if (h6Var.f12903p0) {
                        M02 = bd.M0(2131754758, null);
                    } else {
                        M02 = bd.M0(2131754747, null);
                    }
                    dVar.j(M02);
                    accessibilityNodeInfo.setEnabled(!h6Var.f12911v0);
                    if (!h6Var.f12911v0) {
                        dVar.b(s0.c.f54563c);
                        return;
                    }
                    return;
                }
                int L3 = org.telegram.messenger.g0.L(22.0f);
                float f16 = h6Var.f12899l0;
                float f17 = L3;
                float f18 = h6Var.f12898k0;
                rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
                dVar.h(rect);
                if (h6Var.f12908s0 && h6Var.B0) {
                    M0 = bd.M0(2131754846, null);
                } else {
                    M0 = bd.M0(2131754912, null);
                }
                dVar.j(M0);
                if (h6Var.f12911v0 || h6Var.b()) {
                    z11 = false;
                }
                accessibilityNodeInfo.setEnabled(z11);
                if (z11) {
                    dVar.b(s0.c.f54563c);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) view;
                ArrayList arrayList = j3Var.S;
                dVar.i("android.widget.Button");
                dVar.b(s0.c.f54563c);
                if (i3 == 1) {
                    org.telegram.ui.Cells.y yVar = j3Var.f27667j0;
                    if (yVar != null) {
                        rect.set(yVar.getBounds());
                    } else {
                        rect.set(0, 0, 1, 1);
                        dVar.p(false);
                    }
                    dVar.h(rect);
                    dVar.j(bd.M0(2131753099, null));
                    return;
                }
                if (i3 >= 2000) {
                    i10 = i3 - 2000;
                    z10 = true;
                } else if (i3 >= 1000) {
                    i10 = i3 - 1000;
                    z10 = false;
                } else {
                    rect.set(0, 0, 1, 1);
                    dVar.h(rect);
                    dVar.p(false);
                    return;
                }
                if (i10 >= 0 && i10 < arrayList.size()) {
                    org.telegram.ui.ActionBar.i3 i3Var = (org.telegram.ui.ActionBar.i3) arrayList.get(i10);
                    org.telegram.ui.ActionBar.a3 a3Var = i3Var.f27594c;
                    RectF rectF = i3Var.f27592a;
                    if (a3Var != null && a3Var.b() != null) {
                        str3 = i3Var.f27594c.b();
                    }
                    if (z10) {
                        Rect bounds = i3Var.d.f28834l.getBounds();
                        rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + org.telegram.messenger.g0.L(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + org.telegram.messenger.g0.L(24.0f) + bounds.bottom));
                        dVar.h(rect);
                        if (TextUtils.isEmpty(str3)) {
                            str2 = bd.M0(2131752041, null);
                        } else {
                            str2 = bd.M0(2131752041, null) + ", " + str3;
                        }
                        dVar.j(str2);
                        return;
                    }
                    rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    dVar.h(rect);
                    if (TextUtils.isEmpty(str3)) {
                        str = bd.M0(2131747825, null);
                    } else {
                        str = bd.M0(2131747825, null) + ", " + str3;
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

    public g6(h6 h6Var, h6 h6Var2) {
        super(h6Var2);
        this.f12836q = h6Var;
        this.f12835p = new Rect();
    }
}
