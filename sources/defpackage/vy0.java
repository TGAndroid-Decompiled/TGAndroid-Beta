package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
public final class vy0 extends b84 {
    public final RectF o;
    public final Rect p;
    public final xy0 q;

    public vy0(xy0 xy0Var, xy0 xy0Var2) {
        super(xy0Var2);
        this.q = xy0Var;
        this.o = new RectF();
        this.p = new Rect();
    }

    @Override
    public final int g(float f, float f2) {
        uy0 c;
        xy0 xy0Var = this.q;
        if (xy0Var.b) {
            ArrayList<wy0> tabs = xy0Var.getTabs();
            if (!tabs.isEmpty() && (c = xy0Var.c(tabs.get(0))) != null) {
                float c2 = c.c();
                RectF rectF = this.o;
                xy0Var.d(rectF, c2);
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
        xy0 xy0Var = this.q;
        if (xy0Var.b) {
            ArrayList<wy0> tabs = xy0Var.getTabs();
            if (tabs.isEmpty() || xy0Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i, int i2) {
        if (i2 == 16) {
            xy0 xy0Var = this.q;
            ArrayList<wy0> tabs = xy0Var.getTabs();
            if (!tabs.isEmpty()) {
                wy0 wy0Var = tabs.get(0);
                if (i == 1) {
                    xy0Var.b();
                    return true;
                } else if (i == 2) {
                    xy0Var.g(wy0Var, new bn0((byte) 2));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void l(int i, u4 u4Var) {
        wy0 wy0Var;
        uy0 c;
        String j;
        String j2;
        xy0 xy0Var = this.q;
        ArrayList<wy0> tabs = xy0Var.getTabs();
        if (tabs.isEmpty()) {
            wy0Var = null;
        } else {
            wy0Var = tabs.get(0);
        }
        if (wy0Var == null) {
            c = null;
        } else {
            c = xy0Var.c(wy0Var);
        }
        u4Var.i("android.widget.Button");
        u4Var.b(r4.d);
        String str = "";
        Rect rect = this.p;
        if (c == null) {
            rect.set(0, 0, 1, 1);
            u4Var.h(rect);
            u4Var.j("");
            u4Var.p(false);
            return;
        }
        float c2 = c.c();
        RectF rectF = this.o;
        xy0Var.d(rectF, c2);
        if (wy0Var.b() != null) {
            str = wy0Var.b();
        }
        if (i == 2) {
            Rect bounds = c.l.getBounds();
            rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
            u4Var.h(rect);
            if (TextUtils.isEmpty(str)) {
                j2 = jb6.M0(2131751978, null);
            } else {
                j2 = b10.j(new StringBuilder(jb6.M0(2131751978, null)), ", ", str);
            }
            u4Var.j(j2);
            return;
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        u4Var.h(rect);
        if (TextUtils.isEmpty(str)) {
            j = jb6.M0(2131747550, null);
        } else {
            j = b10.j(new StringBuilder(jb6.M0(2131747550, null)), ", ", str);
        }
        u4Var.j(j);
    }
}
