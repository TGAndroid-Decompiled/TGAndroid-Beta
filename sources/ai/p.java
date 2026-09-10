package ai;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.u7;
import s4.n0;
import s4.z0;
public final class p extends n0 {
    public final int f462a;
    public final a0 f463b;

    public p(a0 a0Var, int i10) {
        this.f462a = i10;
        this.f463b = a0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, z0 z0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f462a) {
            case 0:
                if (view instanceof u7) {
                    u7 u7Var = (u7) view;
                    a0 a0Var = this.f463b;
                    a0Var.f414f.getClass();
                    int R = RecyclerView.R(u7Var);
                    int i10 = a0Var.h.J;
                    boolean z14 = true;
                    if (R < i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u7Var.f20494a0 = z10;
                    int i11 = R % i10;
                    if (i11 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    u7Var.V = z11;
                    if (i11 != i10 - 1) {
                        z14 = false;
                    }
                    u7Var.W = z14;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    return;
                }
                rect.left = 0;
                rect.top = 0;
                rect.bottom = 0;
                rect.right = 0;
                return;
            default:
                if (view instanceof u7) {
                    u7 u7Var2 = (u7) view;
                    a0 a0Var2 = this.f463b;
                    a0Var2.f416r.getClass();
                    int R2 = RecyclerView.R(u7Var2);
                    int i12 = a0Var2.f417s.J;
                    boolean z15 = true;
                    if (R2 < i12) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    u7Var2.f20494a0 = z12;
                    int i13 = R2 % i12;
                    if (i13 == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    u7Var2.V = z13;
                    if (i13 != i12 - 1) {
                        z15 = false;
                    }
                    u7Var2.W = z15;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    return;
                }
                rect.left = 0;
                rect.top = 0;
                rect.bottom = 0;
                rect.right = 0;
                return;
        }
    }
}
