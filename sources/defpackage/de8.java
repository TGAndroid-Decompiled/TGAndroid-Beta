package defpackage;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class de8 extends le8 {
    public final ge8 G;

    public de8(ge8 ge8Var, Context context, int i) {
        super(context, i, null, null);
        this.G = ge8Var;
    }

    @Override
    public final void j(boolean z) {
        this.G.d.n0(this, z);
    }

    @Override
    public final void k(le8 le8Var) {
        this.G.d.o0(le8Var);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        ie8 ie8Var = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        py pyVar = this.d;
        pyVar.getText().replace(pyVar.getSelectionStart(), pyVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i = 0;
        while (!arrayList.isEmpty() && i < ie8Var.n) {
            for (int length = ie8Var.w.length - 1; length > i; length--) {
                CharSequence[] charSequenceArr = ie8Var.w;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            ie8Var.w[i] = (CharSequence) arrayList.remove(0);
            ie8Var.E++;
            i++;
        }
        ie8Var.u0();
        ie8Var.h0 = (ie8Var.o0 + i) - 1;
        ie8Var.b.f();
        return true;
    }

    @Override
    public final void h(py pyVar, ActionMode actionMode) {
    }
}
