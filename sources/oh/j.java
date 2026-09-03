package oh;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f2.i1;
import f2.u0;
import org.telegram.ui.Cells.q7;
public final class j extends u0 {
    public final int f16569a;
    public final r f16570b;

    public j(r rVar, int i10) {
        this.f16569a = i10;
        this.f16570b = rVar;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, i1 i1Var) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f16569a) {
            case 0:
                if (view instanceof q7) {
                    q7 q7Var = (q7) view;
                    r rVar = this.f16570b;
                    rVar.f16584f.getClass();
                    int R = RecyclerView.R(q7Var);
                    int i10 = rVar.h.J;
                    boolean z13 = true;
                    if (R < i10) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    q7Var.U = z4;
                    int i11 = R % i10;
                    if (i11 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q7Var.S = z10;
                    if (i11 != i10 - 1) {
                        z13 = false;
                    }
                    q7Var.T = z13;
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
                if (view instanceof q7) {
                    q7 q7Var2 = (q7) view;
                    r rVar2 = this.f16570b;
                    rVar2.f16586r.getClass();
                    int R2 = RecyclerView.R(q7Var2);
                    int i12 = rVar2.f16587s.J;
                    boolean z14 = true;
                    if (R2 < i12) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    q7Var2.U = z11;
                    int i13 = R2 % i12;
                    if (i13 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    q7Var2.S = z12;
                    if (i13 != i12 - 1) {
                        z14 = false;
                    }
                    q7Var2.T = z14;
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
