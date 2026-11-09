package ei;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.o7;
import v4.a1;
import v4.m0;
public final class g extends m0 {
    public final int f10816a;
    public final n f10817b;

    public g(n nVar, int i7) {
        this.f10816a = i7;
        this.f10817b = nVar;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, a1 a1Var) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f10816a) {
            case 0:
                if (view instanceof o7) {
                    o7 o7Var = (o7) view;
                    n nVar = this.f10817b;
                    nVar.f10833f.getClass();
                    int R = RecyclerView.R(o7Var);
                    int i7 = nVar.h.J;
                    boolean z13 = true;
                    if (R < i7) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    o7Var.f29665a0 = z9;
                    int i10 = R % i7;
                    if (i10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o7Var.V = z10;
                    if (i10 != i7 - 1) {
                        z13 = false;
                    }
                    o7Var.W = z13;
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
                if (view instanceof o7) {
                    o7 o7Var2 = (o7) view;
                    n nVar2 = this.f10817b;
                    nVar2.f10835r.getClass();
                    int R2 = RecyclerView.R(o7Var2);
                    int i11 = nVar2.f10836s.J;
                    boolean z14 = true;
                    if (R2 < i11) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    o7Var2.f29665a0 = z11;
                    int i12 = R2 % i11;
                    if (i12 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    o7Var2.V = z12;
                    if (i12 != i11 - 1) {
                        z14 = false;
                    }
                    o7Var2.W = z14;
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
