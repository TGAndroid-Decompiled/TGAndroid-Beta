package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class hu extends p79 {
    public final nu a;

    public hu(nu nuVar) {
        this.a = nuVar;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, c89 c89Var) {
        j47 j47Var;
        float[] fArr;
        mu muVar = this.a.w;
        int i = 0;
        rect.bottom = 0;
        if (view instanceof dv) {
            j47Var = (j47) muVar.b.get(((dv) view).O);
        } else if (view instanceof yv) {
            j47Var = (j47) muVar.b.get(((yv) view).M);
        } else {
            j47Var = null;
        }
        if (j47Var != null && j47Var.m != null) {
            Point point = hl.q;
            float max = Math.max(point.x, point.y) * 0.5f;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= j47Var.m.length) {
                    break;
                }
                i3 += (int) Math.ceil(fArr[i2] * max);
                i2++;
            }
            int M = (hl.M(11.0f) * (j47Var.d - j47Var.c)) + i3;
            int size = muVar.a.size();
            while (true) {
                if (i < size) {
                    j47 j47Var2 = (j47) muVar.a.get(i);
                    byte b = j47Var2.c;
                    byte b2 = j47Var.c;
                    if (b == b2 && ((j47Var2.a != j47Var.a || j47Var2.b != j47Var.b || b != b2 || j47Var2.d != j47Var.d) && b == b2)) {
                        M = uh9.f(4.0f, (int) Math.ceil(max * j47Var2.f), M);
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
