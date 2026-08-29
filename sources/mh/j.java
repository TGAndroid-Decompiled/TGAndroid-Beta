package mh;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f2.k1;
import f2.v0;
import org.telegram.ui.Cells.p7;
public final class j extends v0 {
    public final int f17028a;
    public final r f17029b;

    public j(r rVar, int i10) {
        this.f17028a = i10;
        this.f17029b = rVar;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, k1 k1Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f17028a) {
            case 0:
                if (view instanceof p7) {
                    p7 p7Var = (p7) view;
                    r rVar = this.f17029b;
                    rVar.f17045f.getClass();
                    int R = RecyclerView.R(p7Var);
                    int i10 = rVar.h.J;
                    boolean z14 = true;
                    if (R < i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    p7Var.T = z10;
                    int i11 = R % i10;
                    if (i11 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    p7Var.R = z11;
                    if (i11 != i10 - 1) {
                        z14 = false;
                    }
                    p7Var.S = z14;
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
                if (view instanceof p7) {
                    p7 p7Var2 = (p7) view;
                    r rVar2 = this.f17029b;
                    rVar2.f17047r.getClass();
                    int R2 = RecyclerView.R(p7Var2);
                    int i12 = rVar2.f17048s.J;
                    boolean z15 = true;
                    if (R2 < i12) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    p7Var2.T = z12;
                    int i13 = R2 % i12;
                    if (i13 == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    p7Var2.R = z13;
                    if (i13 != i12 - 1) {
                        z15 = false;
                    }
                    p7Var2.S = z15;
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
