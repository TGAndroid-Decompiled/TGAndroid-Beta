package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class wca extends c49 {
    public final pca a;
    public final nfa b;

    public wca(nfa nfaVar, pca pcaVar) {
        this.b = nfaVar;
        this.a = pcaVar;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, p49 p49Var) {
        boolean z;
        boolean z2;
        pca pcaVar = this.a;
        int i = 0;
        if (pcaVar.h.getAdapter() == this.b.R) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            qca qcaVar = pcaVar.x;
            qcaVar.z1();
            if (R <= qcaVar.U) {
                rect.top = 0;
            } else {
                rect.top = gl.L(2.0f);
            }
            if (!pcaVar.x.C1(R)) {
                i = gl.L(2.0f);
            }
            rect.right = i;
        } else if (view instanceof qfa) {
            qfa qfaVar = (qfa) view;
            pcaVar.h.getClass();
            int R2 = RecyclerView.R(qfaVar);
            int i2 = pcaVar.x.J;
            boolean z3 = true;
            if (R2 < i2) {
                z = true;
            } else {
                z = false;
            }
            qfaVar.b0 = z;
            int i3 = R2 % i2;
            if (i3 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            qfaVar.W = z2;
            if (i3 != i2 - 1) {
                z3 = false;
            }
            qfaVar.a0 = z3;
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
        } else {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
        }
    }
}
