package defpackage;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class rh8 extends zh8 {
    public final uh8 G;

    public rh8(uh8 uh8Var, Context context, int i) {
        super(context, i, null, null);
        this.G = uh8Var;
    }

    @Override
    public final void j(boolean z) {
        this.G.d.n0(this, z);
    }

    @Override
    public final void k(zh8 zh8Var) {
        this.G.d.o0(zh8Var);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        wh8 wh8Var = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        qy qyVar = this.d;
        qyVar.getText().replace(qyVar.getSelectionStart(), qyVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i = 0;
        while (!arrayList.isEmpty() && i < wh8Var.n) {
            for (int length = wh8Var.w.length - 1; length > i; length--) {
                CharSequence[] charSequenceArr = wh8Var.w;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            wh8Var.w[i] = (CharSequence) arrayList.remove(0);
            wh8Var.E++;
            i++;
        }
        wh8Var.u0();
        wh8Var.h0 = (wh8Var.o0 + i) - 1;
        wh8Var.b.f();
        return true;
    }

    @Override
    public final void h(qy qyVar, ActionMode actionMode) {
    }
}
