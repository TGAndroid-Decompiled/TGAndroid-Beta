package fi;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.n7;
import u4.a1;
import u4.n0;
public final class f extends n0 {
    public final int f11602a;
    public final m f11603b;

    public f(m mVar, int i3) {
        this.f11602a = i3;
        this.f11603b = mVar;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, a1 a1Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f11602a) {
            case 0:
                if (view instanceof n7) {
                    n7 n7Var = (n7) view;
                    m mVar = this.f11603b;
                    mVar.f11620f.getClass();
                    int R = RecyclerView.R(n7Var);
                    int i3 = mVar.h.J;
                    boolean z14 = true;
                    if (R < i3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    n7Var.f29682b0 = z10;
                    int i10 = R % i3;
                    if (i10 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    n7Var.W = z11;
                    if (i10 != i3 - 1) {
                        z14 = false;
                    }
                    n7Var.f29680a0 = z14;
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
                if (view instanceof n7) {
                    n7 n7Var2 = (n7) view;
                    m mVar2 = this.f11603b;
                    mVar2.f11622r.getClass();
                    int R2 = RecyclerView.R(n7Var2);
                    int i11 = mVar2.f11623s.J;
                    boolean z15 = true;
                    if (R2 < i11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    n7Var2.f29682b0 = z12;
                    int i12 = R2 % i11;
                    if (i12 == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    n7Var2.W = z13;
                    if (i12 != i11 - 1) {
                        z15 = false;
                    }
                    n7Var2.f29680a0 = z15;
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
