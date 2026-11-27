package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
public final class v62 extends zh8 {
    public final int G;
    public final t20 H;

    public v62(t20 t20Var, Context context, int i, vnb vnbVar, int i2) {
        super(context, i, null, vnbVar);
        this.H = t20Var;
        this.G = i2;
    }

    @Override
    public final void h(qy qyVar, ActionMode actionMode) {
        a72 a72Var = (a72) this.H.e;
        if (!a72Var.n && this.G == 11 && qyVar.isFocused() && qyVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                zu1.E6(menu, ((zu1) a72Var.b.Z1).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void j(boolean z) {
        ((a72) this.H.e).a0(this, z);
    }

    @Override
    public final void k(zh8 zh8Var) {
        ((a72) this.H.e).b0(zh8Var);
    }

    @Override
    public final void l(qy qyVar) {
        ((a72) this.H.e).b.d1(qyVar, true);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        a72 a72Var = (a72) this.H.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        qy qyVar = this.d;
        qyVar.getText().replace(qyVar.getSelectionStart(), qyVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i = 0;
        while (!arrayList.isEmpty() && i < a72Var.K) {
            for (int length = a72Var.L.length - 1; length > i; length--) {
                CharSequence[] charSequenceArr = a72Var.L;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            a72Var.L[i] = (CharSequence) arrayList.remove(0);
            a72Var.N++;
            i++;
        }
        a72Var.m0();
        a72Var.l0 = (a72Var.u0 + i) - 1;
        a72Var.s.setItemAnimator(a72Var.w);
        a72Var.r.f();
        return true;
    }
}
