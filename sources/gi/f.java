package gi;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.p7;
import v4.c1;
import v4.o0;
public final class f extends o0 {
    public final int f13664a;
    public final m f13665b;

    public f(m mVar, int i7) {
        this.f13664a = i7;
        this.f13665b = mVar;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, c1 c1Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f13664a) {
            case 0:
                if (view instanceof p7) {
                    p7 p7Var = (p7) view;
                    m mVar = this.f13665b;
                    mVar.f13682f.getClass();
                    int R = RecyclerView.R(p7Var);
                    int i7 = mVar.h.J;
                    boolean z14 = true;
                    if (R < i7) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    p7Var.f31253b0 = z10;
                    int i10 = R % i7;
                    if (i10 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    p7Var.W = z11;
                    if (i10 != i7 - 1) {
                        z14 = false;
                    }
                    p7Var.f31251a0 = z14;
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
                    m mVar2 = this.f13665b;
                    mVar2.f13684r.getClass();
                    int R2 = RecyclerView.R(p7Var2);
                    int i11 = mVar2.f13685s.J;
                    boolean z15 = true;
                    if (R2 < i11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    p7Var2.f31253b0 = z12;
                    int i12 = R2 % i11;
                    if (i12 == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    p7Var2.W = z13;
                    if (i12 != i11 - 1) {
                        z15 = false;
                    }
                    p7Var2.f31251a0 = z15;
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
