package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
public final class wx0 extends m74 {
    public final RectF o;
    public final Rect p;
    public final yx0 q;

    public wx0(yx0 yx0Var, yx0 yx0Var2) {
        super(yx0Var2);
        this.q = yx0Var;
        this.o = new RectF();
        this.p = new Rect();
    }

    @Override
    public final int g(float f, float f2) {
        vx0 c;
        yx0 yx0Var = this.q;
        if (yx0Var.b) {
            ArrayList<xx0> tabs = yx0Var.getTabs();
            if (!tabs.isEmpty() && (c = yx0Var.c(tabs.get(0))) != null) {
                float c2 = c.c();
                RectF rectF = this.o;
                yx0Var.d(rectF, c2);
                Rect bounds = c.l.getBounds();
                if (!bounds.isEmpty() && bounds.contains((int) (f - rectF.left), (int) (f2 - rectF.centerY()))) {
                    return 2;
                }
                if (rectF.contains(f, f2)) {
                    return 1;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        yx0 yx0Var = this.q;
        if (yx0Var.b) {
            ArrayList<xx0> tabs = yx0Var.getTabs();
            if (tabs.isEmpty() || yx0Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i, int i2) {
        if (i2 == 16) {
            yx0 yx0Var = this.q;
            ArrayList<xx0> tabs = yx0Var.getTabs();
            if (!tabs.isEmpty()) {
                xx0 xx0Var = tabs.get(0);
                if (i == 1) {
                    yx0Var.b();
                    return true;
                } else if (i == 2) {
                    yx0Var.g(xx0Var, new bm0((byte) 2));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void l(int i, v4 v4Var) {
        xx0 xx0Var;
        vx0 c;
        String k;
        String k2;
        yx0 yx0Var = this.q;
        ArrayList<xx0> tabs = yx0Var.getTabs();
        if (tabs.isEmpty()) {
            xx0Var = null;
        } else {
            xx0Var = tabs.get(0);
        }
        if (xx0Var == null) {
            c = null;
        } else {
            c = yx0Var.c(xx0Var);
        }
        v4Var.i("android.widget.Button");
        v4Var.b(s4.e);
        String str = "";
        Rect rect = this.p;
        if (c == null) {
            rect.set(0, 0, 1, 1);
            v4Var.h(rect);
            v4Var.j("");
            v4Var.p(false);
            return;
        }
        float c2 = c.c();
        RectF rectF = this.o;
        yx0Var.d(rectF, c2);
        if (xx0Var.b() != null) {
            str = xx0Var.b();
        }
        if (i == 2) {
            Rect bounds = c.l.getBounds();
            rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
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
    }
}
