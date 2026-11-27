package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
public final class cy0 extends m74 {
    public final byte o = 0;
    public final Rect p;
    public final View q;

    public cy0(gy0 gy0Var, gy0 gy0Var2) {
        super(gy0Var2);
        this.q = gy0Var;
        this.p = new Rect();
    }

    @Override
    public final int g(float f, float f2) {
        byte b = this.o;
        View view = this.q;
        switch (b) {
            case 0:
                gy0 gy0Var = (gy0) view;
                ArrayList arrayList = gy0Var.S;
                if (gy0Var.W >= 0.5f) {
                    hf0 hf0Var = gy0Var.j0;
                    if (hf0Var != null && hf0Var.getBounds().contains((int) f, (int) f2)) {
                        return 1;
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        fy0 fy0Var = (fy0) arrayList.get(size);
                        float f3 = fy0Var.i;
                        RectF rectF = fy0Var.a;
                        if (Math.abs(f3) < 0.4f && rectF.contains(f, f2)) {
                            Rect bounds = fy0Var.d.l.getBounds();
                            if (!bounds.isEmpty() && bounds.contains((int) (f - rectF.left), (int) ((f2 - rectF.top) - hl.L(24.0f)))) {
                                return size + 2000;
                            }
                            return size + 1000;
                        }
                    }
                }
                return -1;
            default:
                u59 u59Var = (u59) view;
                if (Math.abs(f - u59Var.l0) <= hl.L(30.0f) && Math.abs(f2 - u59Var.k0) <= hl.L(30.0f) && !u59Var.b() && !u59Var.v0) {
                    return 0;
                }
                if (Math.abs(f - u59Var.m0) <= hl.L(30.0f) && Math.abs(f2 - u59Var.k0) <= hl.L(30.0f) && !u59Var.b() && !u59Var.v0) {
                    return 2;
                }
                if (Math.abs(f - u59Var.j0) <= hl.L(60.0f) && Math.abs(f2 - u59Var.k0) <= hl.L(60.0f)) {
                    return 1;
                }
                return Integer.MIN_VALUE;
        }
    }

    @Override
    public final void h(ArrayList arrayList) {
        byte b = this.o;
        View view = this.q;
        switch (b) {
            case 0:
                gy0 gy0Var = (gy0) view;
                ArrayList arrayList2 = gy0Var.S;
                if (gy0Var.W >= 0.5f) {
                    hf0 hf0Var = gy0Var.j0;
                    if (hf0Var != null && !hf0Var.getBounds().isEmpty()) {
                        arrayList.add(1);
                    }
                    for (int i = 0; i < arrayList2.size(); i++) {
                        fy0 fy0Var = (fy0) arrayList2.get(i);
                        if (Math.abs(fy0Var.i) < 0.4f && !fy0Var.a.isEmpty()) {
                            arrayList.add(Integer.valueOf(i + 1000));
                            if (!fy0Var.d.l.getBounds().isEmpty()) {
                                arrayList.add(Integer.valueOf(i + 2000));
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                u59 u59Var = (u59) view;
                if (!u59Var.b() && !u59Var.v0) {
                    arrayList.add(0);
                }
                arrayList.add(1);
                if (!u59Var.b() && !u59Var.v0) {
                    arrayList.add(2);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean k(int i, int i2) {
        int i3;
        boolean z;
        byte b = this.o;
        View view = this.q;
        switch (b) {
            case 0:
                gy0 gy0Var = (gy0) view;
                ArrayList arrayList = gy0Var.S;
                if (i2 != 16) {
                    return false;
                }
                if (i == 1) {
                    yx0 yx0Var = gy0Var.a;
                    if (yx0Var != null) {
                        yx0Var.f();
                    }
                    gy0Var.a(false);
                } else {
                    if (i >= 2000) {
                        i3 = i - 2000;
                        z = true;
                    } else if (i < 1000) {
                        return false;
                    } else {
                        i3 = i - 1000;
                        z = false;
                    }
                    if (i3 < 0 || i3 >= arrayList.size()) {
                        return false;
                    }
                    fy0 fy0Var = (fy0) arrayList.get(i3);
                    yx0 yx0Var2 = gy0Var.a;
                    if (z) {
                        if (yx0Var2 != null) {
                            yx0Var2.g(fy0Var.c, new y0(this, fy0Var, (byte) 10));
                        }
                    } else if (yx0Var2 != null) {
                        gy0Var.a(false);
                        fy0Var.getClass();
                        gy0Var.a.e(fy0Var.c);
                    }
                }
                return true;
            default:
                u59 u59Var = (u59) view;
                if (u59Var.a == null || u59Var.v0 || i2 != 16) {
                    return false;
                }
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2 || u59Var.b()) {
                            return false;
                        }
                        u59Var.d(180.0f);
                        ((rab) u59Var.a).b();
                    } else if (u59Var.b()) {
                        ((rab) u59Var.a).a();
                    } else if (u59Var.s0) {
                        u59Var.s0 = false;
                        u59Var.A0 = false;
                        u59Var.w0 = SystemClock.elapsedRealtime();
                        u59Var.v0 = true;
                        ((rab) u59Var.a).e(false);
                        u59Var.invalidate();
                    } else {
                        boolean z2 = u59Var.p0;
                        t59 t59Var = u59Var.a;
                        if (z2) {
                            if (((rab) t59Var).a.Y()) {
                                u59Var.S = 0L;
                                u59Var.R = System.currentTimeMillis();
                                u59Var.B0 = false;
                                ((rab) u59Var.a).f(new uk8(this, (byte) 28), false);
                            }
                        } else {
                            ((rab) t59Var).d();
                        }
                    }
                } else if (u59Var.b()) {
                    return false;
                } else {
                    if (u59Var.s0 && u59Var.B0) {
                        u59Var.A0 = false;
                        u59Var.H0.e(true, 1.0f);
                        hg5 hg5Var = ((rab) u59Var.a).a.U0;
                        hg5Var.a.t(ob6.M0(2131744315, null), true, true);
                        hg5Var.invalidate();
                        u59Var.invalidate();
                    } else {
                        ((rab) u59Var.a).c();
                    }
                }
                return true;
        }
    }

    @Override
    public final void l(int i, v4 v4Var) {
        int i2;
        boolean z;
        String k;
        String k2;
        String M0;
        String M02;
        byte b = this.o;
        String str = "";
        View view = this.q;
        Rect rect = this.p;
        boolean z2 = true;
        switch (b) {
            case 0:
                gy0 gy0Var = (gy0) view;
                ArrayList arrayList = gy0Var.S;
                v4Var.i("android.widget.Button");
                v4Var.b(s4.e);
                if (i == 1) {
                    hf0 hf0Var = gy0Var.j0;
                    if (hf0Var != null) {
                        rect.set(hf0Var.getBounds());
                    } else {
                        rect.set(0, 0, 1, 1);
                        v4Var.p(false);
                    }
                    v4Var.h(rect);
                    v4Var.j(ob6.M0(2131753092, null));
                    return;
                }
                if (i >= 2000) {
                    i2 = i - 2000;
                    z = true;
                } else if (i >= 1000) {
                    i2 = i - 1000;
                    z = false;
                } else {
                    rect.set(0, 0, 1, 1);
                    v4Var.h(rect);
                    v4Var.p(false);
                    return;
                }
                if (i2 >= 0 && i2 < arrayList.size()) {
                    fy0 fy0Var = (fy0) arrayList.get(i2);
                    xx0 xx0Var = fy0Var.c;
                    RectF rectF = fy0Var.a;
                    if (xx0Var != null && xx0Var.b() != null) {
                        str = fy0Var.c.b();
                    }
                    if (z) {
                        Rect bounds = fy0Var.d.l.getBounds();
                        rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + hl.L(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + hl.L(24.0f) + bounds.bottom));
                        v4Var.h(rect);
                        if (TextUtils.isEmpty(str)) {
                            k2 = ob6.M0(2131752006, null);
                        } else {
                            k2 = c00.k(new StringBuilder(ob6.M0(2131752006, null)), ", ", str);
                        }
                        v4Var.j(k2);
                        return;
                    }
                    rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    v4Var.h(rect);
                    if (TextUtils.isEmpty(str)) {
                        k = ob6.M0(2131747544, null);
                    } else {
                        k = c00.k(new StringBuilder(ob6.M0(2131747544, null)), ", ", str);
                    }
                    v4Var.j(k);
                    return;
                }
                rect.set(0, 0, 1, 1);
                v4Var.h(rect);
                v4Var.p(false);
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = v4Var.a;
                u59 u59Var = (u59) view;
                v4Var.i("android.widget.Button");
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            rect.set(0, 0, 1, 1);
                            v4Var.h(rect);
                            v4Var.p(false);
                            v4Var.j("");
                            return;
                        }
                        int L = hl.L(22.0f);
                        float f = u59Var.m0;
                        float f2 = L;
                        float f3 = u59Var.k0;
                        rect.set((int) (f - f2), (int) (f3 - f2), (int) (f + f2), (int) (f3 + f2));
                        v4Var.h(rect);
                        v4Var.j(ob6.M0(2131754747, null));
                        if (u59Var.v0 || u59Var.b()) {
                            z2 = false;
                        }
                        accessibilityNodeInfo.setEnabled(z2);
                        if (z2) {
                            v4Var.b(s4.e);
                            return;
                        }
                        return;
                    }
                    int L2 = hl.L(40.0f);
                    float f4 = u59Var.j0;
                    float f5 = L2;
                    float f6 = u59Var.k0;
                    rect.set((int) (f4 - f5), (int) (f6 - f5), (int) (f4 + f5), (int) (f6 + f5));
                    v4Var.h(rect);
                    if (u59Var.b()) {
                        M02 = ob6.M0(2131745368, null);
                    } else if (u59Var.s0) {
                        M02 = ob6.M0(2131754749, null);
                    } else if (u59Var.p0) {
                        M02 = ob6.M0(2131754753, null);
                    } else {
                        M02 = ob6.M0(2131754742, null);
                    }
                    v4Var.j(M02);
                    accessibilityNodeInfo.setEnabled(!u59Var.v0);
                    if (!u59Var.v0) {
                        v4Var.b(s4.e);
                        return;
                    }
                    return;
                }
                int L3 = hl.L(22.0f);
                float f7 = u59Var.l0;
                float f8 = L3;
                float f9 = u59Var.k0;
                rect.set((int) (f7 - f8), (int) (f9 - f8), (int) (f7 + f8), (int) (f9 + f8));
                v4Var.h(rect);
                if (u59Var.s0 && u59Var.B0) {
                    M0 = ob6.M0(2131754841, null);
                } else {
                    M0 = ob6.M0(2131754908, null);
                }
                v4Var.j(M0);
                if (u59Var.v0 || u59Var.b()) {
                    z2 = false;
                }
                accessibilityNodeInfo.setEnabled(z2);
                if (z2) {
                    v4Var.b(s4.e);
                    return;
                }
                return;
        }
    }

    public cy0(u59 u59Var, u59 u59Var2) {
        super(u59Var2);
        this.q = u59Var;
        this.p = new Rect();
    }
}
