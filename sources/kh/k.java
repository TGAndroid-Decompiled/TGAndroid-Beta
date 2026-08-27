package kh;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f2.l1;
import f2.w0;
import org.telegram.ui.Cells.o7;

public final class k extends w0 {

    public final int f15203a;

    public final r f15204b;

    public k(r rVar, int i10) {
        this.f15203a = i10;
        this.f15204b = rVar;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, l1 l1Var) {
        switch (this.f15203a) {
            case 0:
                if (!(view instanceof o7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                } else {
                    o7 o7Var = (o7) view;
                    r rVar = this.f15204b;
                    rVar.f15218f.getClass();
                    int iR = RecyclerView.R(o7Var);
                    int i10 = rVar.h.J;
                    o7Var.T = iR < i10;
                    int i11 = iR % i10;
                    o7Var.R = i11 == 0;
                    o7Var.S = i11 == i10 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                }
                break;
            default:
                if (!(view instanceof o7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                } else {
                    o7 o7Var2 = (o7) view;
                    r rVar2 = this.f15204b;
                    rVar2.f15220r.getClass();
                    int iR2 = RecyclerView.R(o7Var2);
                    int i12 = rVar2.f15221s.J;
                    o7Var2.T = iR2 < i12;
                    int i13 = iR2 % i12;
                    o7Var2.R = i13 == 0;
                    o7Var2.S = i13 == i12 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                }
                break;
        }
    }
}
