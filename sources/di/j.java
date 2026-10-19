package di;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.s7;
import s4.m0;
import s4.y0;
public final class j extends m0 {
    public final int f8040a;
    public final r f8041b;

    public j(r rVar, int i10) {
        this.f8040a = i10;
        this.f8041b = rVar;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, y0 y0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f8040a) {
            case 0:
                if (view instanceof s7) {
                    s7 s7Var = (s7) view;
                    r rVar = this.f8041b;
                    rVar.f8057f.getClass();
                    int R = RecyclerView.R(s7Var);
                    int i10 = rVar.h.J;
                    boolean z14 = true;
                    if (R < i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    s7Var.f23021a0 = z10;
                    int i11 = R % i10;
                    if (i11 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    s7Var.V = z11;
                    if (i11 != i10 - 1) {
                        z14 = false;
                    }
                    s7Var.W = z14;
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
                if (view instanceof s7) {
                    s7 s7Var2 = (s7) view;
                    r rVar2 = this.f8041b;
                    rVar2.f8059r.getClass();
                    int R2 = RecyclerView.R(s7Var2);
                    int i12 = rVar2.f8060s.J;
                    boolean z15 = true;
                    if (R2 < i12) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    s7Var2.f23021a0 = z12;
                    int i13 = R2 % i12;
                    if (i13 == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    s7Var2.V = z13;
                    if (i13 != i12 - 1) {
                        z15 = false;
                    }
                    s7Var2.W = z15;
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
