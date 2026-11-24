package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class gv extends e69 {
    public final mv a;

    public gv(mv mvVar) {
        this.a = mvVar;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        c47 c47Var;
        float[] fArr;
        lv lvVar = this.a.w;
        int i = 0;
        rect.bottom = 0;
        if (view instanceof cw) {
            c47Var = (c47) lvVar.b.get(((cw) view).O);
        } else if (view instanceof xw) {
            c47Var = (c47) lvVar.b.get(((xw) view).M);
        } else {
            c47Var = null;
        }
        if (c47Var != null && c47Var.m != null) {
            Point point = gm.q;
            float max = Math.max(point.x, point.y) * 0.5f;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= c47Var.m.length) {
                    break;
                }
                i3 += (int) Math.ceil(fArr[i2] * max);
                i2++;
            }
            int M = (gm.M(11.0f) * (c47Var.d - c47Var.c)) + i3;
            int size = lvVar.a.size();
            while (true) {
                if (i < size) {
                    c47 c47Var2 = (c47) lvVar.a.get(i);
                    byte b = c47Var2.c;
                    byte b2 = c47Var.c;
                    if (b == b2 && ((c47Var2.a != c47Var.a || c47Var2.b != c47Var.b || b != b2 || c47Var2.d != c47Var.d) && b == b2)) {
                        M = hg9.f(4.0f, (int) Math.ceil(max * c47Var2.f), M);
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            rect.bottom = -M;
        }
    }
}
