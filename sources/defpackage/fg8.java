package defpackage;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class fg8 extends ng8 {
    public final ig8 G;

    public fg8(ig8 ig8Var, Context context, int i) {
        super(context, i, null, null);
        this.G = ig8Var;
    }

    @Override
    public final void j(boolean z) {
        this.G.d.o0(this, z);
    }

    @Override
    public final void k(ng8 ng8Var) {
        this.G.d.p0(ng8Var);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        kg8 kg8Var = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        pz pzVar = this.d;
        pzVar.getText().replace(pzVar.getSelectionStart(), pzVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i = 0;
        while (!arrayList.isEmpty() && i < kg8Var.n) {
            for (int length = kg8Var.w.length - 1; length > i; length--) {
                CharSequence[] charSequenceArr = kg8Var.w;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            kg8Var.w[i] = (CharSequence) arrayList.remove(0);
            kg8Var.E++;
            i++;
        }
        kg8Var.v0();
        kg8Var.h0 = (kg8Var.o0 + i) - 1;
        kg8Var.b.f();
        return true;
    }

    @Override
    public final void h(pz pzVar, ActionMode actionMode) {
    }
}
