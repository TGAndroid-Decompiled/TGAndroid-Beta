package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class f62 extends le8 {
    public final int G;
    public final s20 H;

    public f62(s20 s20Var, Context context, int i, wjb wjbVar, int i2) {
        super(context, i, null, wjbVar);
        this.H = s20Var;
        this.G = i2;
    }

    @Override
    public final void h(py pyVar, ActionMode actionMode) {
        k62 k62Var = (k62) this.H.e;
        if (!k62Var.n && this.G == 11 && pyVar.isFocused() && pyVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                mu1.v6(menu, ((mu1) k62Var.b.Z1).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void j(boolean z) {
        ((k62) this.H.e).b0(this, z);
    }

    @Override
    public final void k(le8 le8Var) {
        ((k62) this.H.e).c0(le8Var);
    }

    @Override
    public final void l(py pyVar) {
        ((k62) this.H.e).b.c1(pyVar, true);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        k62 k62Var = (k62) this.H.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        py pyVar = this.d;
        pyVar.getText().replace(pyVar.getSelectionStart(), pyVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i = 0;
        while (!arrayList.isEmpty() && i < k62Var.K) {
            for (int length = k62Var.L.length - 1; length > i; length--) {
                CharSequence[] charSequenceArr = k62Var.L;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            k62Var.L[i] = (CharSequence) arrayList.remove(0);
            k62Var.N++;
            i++;
        }
        k62Var.n0();
        k62Var.l0 = (k62Var.u0 + i) - 1;
        k62Var.s.setItemAnimator(k62Var.w);
        k62Var.r.f();
        return true;
    }
}
