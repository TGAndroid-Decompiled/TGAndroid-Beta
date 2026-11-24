package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
public final class ox0 extends s64 {
    public final RectF o;
    public final Rect p;
    public final qx0 q;

    public ox0(qx0 qx0Var, qx0 qx0Var2) {
        super(qx0Var2);
        this.q = qx0Var;
        this.o = new RectF();
        this.p = new Rect();
    }

    @Override
    public final int g(float f, float f2) {
        nx0 c;
        qx0 qx0Var = this.q;
        if (qx0Var.b) {
            ArrayList<px0> tabs = qx0Var.getTabs();
            if (!tabs.isEmpty() && (c = qx0Var.c(tabs.get(0))) != null) {
                float c2 = c.c();
                RectF rectF = this.o;
                qx0Var.d(rectF, c2);
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
        qx0 qx0Var = this.q;
        if (qx0Var.b) {
            ArrayList<px0> tabs = qx0Var.getTabs();
            if (tabs.isEmpty() || qx0Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i, int i2) {
        if (i2 == 16) {
            qx0 qx0Var = this.q;
            ArrayList<px0> tabs = qx0Var.getTabs();
            if (!tabs.isEmpty()) {
                px0 px0Var = tabs.get(0);
                if (i == 1) {
                    qx0Var.b();
                    return true;
                } else if (i == 2) {
                    qx0Var.g(px0Var, new bm0((byte) 2));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void l(int i, u4 u4Var) {
        px0 px0Var;
        nx0 c;
        String j;
        String j2;
        qx0 qx0Var = this.q;
        ArrayList<px0> tabs = qx0Var.getTabs();
        if (tabs.isEmpty()) {
            px0Var = null;
        } else {
            px0Var = tabs.get(0);
        }
        if (px0Var == null) {
            c = null;
        } else {
            c = qx0Var.c(px0Var);
        }
        u4Var.i("android.widget.Button");
        u4Var.b(r4.c);
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
        qx0Var.d(rectF, c2);
        if (px0Var.b() != null) {
            str = px0Var.b();
        }
        if (i == 2) {
            Rect bounds = c.l.getBounds();
            rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
            u4Var.h(rect);
            if (TextUtils.isEmpty(str)) {
                j2 = k96.M0(2131752029, null);
            } else {
                j2 = b00.j(new StringBuilder(k96.M0(2131752029, null)), ", ", str);
            }
            u4Var.j(j2);
            return;
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        u4Var.h(rect);
        if (TextUtils.isEmpty(str)) {
            j = k96.M0(2131747624, null);
        } else {
            j = b00.j(new StringBuilder(k96.M0(2131747624, null)), ", ", str);
        }
        u4Var.j(j);
    }
}
