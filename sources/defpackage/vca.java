package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class vca extends c49 {
    public final pca a;

    public vca(pca pcaVar) {
        this.a = pcaVar;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, p49 p49Var) {
        boolean z;
        boolean z2;
        if (view instanceof qfa) {
            qfa qfaVar = (qfa) view;
            pca pcaVar = this.a;
            pcaVar.n.getClass();
            int R = RecyclerView.R(qfaVar);
            int i = pcaVar.r.J;
            boolean z3 = true;
            if (R < i) {
                z = true;
            } else {
                z = false;
            }
            qfaVar.b0 = z;
            int i2 = R % i;
            if (i2 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            qfaVar.W = z2;
            if (i2 != i - 1) {
                z3 = false;
            }
            qfaVar.a0 = z3;
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
    }
}
