package bi;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.t7;
import s4.a1;
import s4.o0;
public final class k extends o0 {
    public final int f3905a;
    public final u f3906b;

    public k(u uVar, int i10) {
        this.f3905a = i10;
        this.f3906b = uVar;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, a1 a1Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f3905a) {
            case 0:
                if (view instanceof t7) {
                    t7 t7Var = (t7) view;
                    u uVar = this.f3906b;
                    uVar.f3927f.getClass();
                    int R = RecyclerView.R(t7Var);
                    int i10 = uVar.h.J;
                    boolean z14 = true;
                    if (R < i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t7Var.f23062a0 = z10;
                    int i11 = R % i10;
                    if (i11 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    t7Var.V = z11;
                    if (i11 != i10 - 1) {
                        z14 = false;
                    }
                    t7Var.W = z14;
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
                if (view instanceof t7) {
                    t7 t7Var2 = (t7) view;
                    u uVar2 = this.f3906b;
                    uVar2.f3929r.getClass();
                    int R2 = RecyclerView.R(t7Var2);
                    int i12 = uVar2.f3930s.J;
                    boolean z15 = true;
                    if (R2 < i12) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    t7Var2.f23062a0 = z12;
                    int i13 = R2 % i12;
                    if (i13 == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    t7Var2.V = z13;
                    if (i13 != i12 - 1) {
                        z15 = false;
                    }
                    t7Var2.W = z15;
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
