package jh;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f2.n1;
import f2.y0;
import org.telegram.ui.Cells.r7;
public final class j extends y0 {
    public final int f14352a;
    public final q f14353b;

    public j(q qVar, int i9) {
        this.f14352a = i9;
        this.f14353b = qVar;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, n1 n1Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f14352a) {
            case 0:
                if (view instanceof r7) {
                    r7 r7Var = (r7) view;
                    q qVar = this.f14353b;
                    qVar.f14367f.getClass();
                    int R = RecyclerView.R(r7Var);
                    int i9 = qVar.h.J;
                    boolean z14 = true;
                    if (R < i9) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    r7Var.T = z10;
                    int i10 = R % i9;
                    if (i10 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    r7Var.R = z11;
                    if (i10 != i9 - 1) {
                        z14 = false;
                    }
                    r7Var.S = z14;
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
                if (view instanceof r7) {
                    r7 r7Var2 = (r7) view;
                    q qVar2 = this.f14353b;
                    qVar2.f14369r.getClass();
                    int R2 = RecyclerView.R(r7Var2);
                    int i11 = qVar2.f14370s.J;
                    boolean z15 = true;
                    if (R2 < i11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    r7Var2.T = z12;
                    int i12 = R2 % i11;
                    if (i12 == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    r7Var2.R = z13;
                    if (i12 != i11 - 1) {
                        z15 = false;
                    }
                    r7Var2.S = z15;
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
