package ei;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.w7;
import s4.b1;
import s4.n0;
public final class j extends n0 {
    public final int f9987a;
    public final r f9988b;

    public j(r rVar, int i10) {
        this.f9987a = i10;
        this.f9988b = rVar;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, b1 b1Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f9987a) {
            case 0:
                if (view instanceof w7) {
                    w7 w7Var = (w7) view;
                    r rVar = this.f9988b;
                    rVar.f10004f.getClass();
                    int R = RecyclerView.R(w7Var);
                    int i10 = rVar.h.J;
                    boolean z14 = true;
                    if (R < i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    w7Var.f25633a0 = z10;
                    int i11 = R % i10;
                    if (i11 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    w7Var.V = z11;
                    if (i11 != i10 - 1) {
                        z14 = false;
                    }
                    w7Var.W = z14;
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
                if (view instanceof w7) {
                    w7 w7Var2 = (w7) view;
                    r rVar2 = this.f9988b;
                    rVar2.f10006r.getClass();
                    int R2 = RecyclerView.R(w7Var2);
                    int i12 = rVar2.f10007s.J;
                    boolean z15 = true;
                    if (R2 < i12) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    w7Var2.f25633a0 = z12;
                    int i13 = R2 % i12;
                    if (i13 == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    w7Var2.V = z13;
                    if (i13 != i12 - 1) {
                        z15 = false;
                    }
                    w7Var2.W = z15;
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
