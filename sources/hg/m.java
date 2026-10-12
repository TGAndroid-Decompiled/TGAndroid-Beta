package hg;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.j71;
public final class m extends j3 {
    public final int f11311x;
    public final n f11312y;

    public m(n nVar, Context context, String str, int i10, c6 c6Var, int i11) {
        super(context, str, false, false, i10, c6Var);
        this.f11311x = i11;
        switch (i11) {
            case 1:
                this.f11312y = nVar;
                super(context, str, true, false, i10, c6Var);
                return;
            default:
                this.f11312y = nVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        j71 j71Var;
        j71 j71Var2;
        switch (this.f11311x) {
            case 0:
                if (z10 && (j71Var = this.f11312y.f27776a) != null) {
                    j71Var.x0(2);
                    return;
                }
                return;
            default:
                if (z10 && (j71Var2 = this.f11312y.f27776a) != null) {
                    j71Var2.x0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f11311x) {
            case 0:
                n nVar = this.f11312y;
                nVar.f11319n.d(nVar.f11321s.getText().toString(), nVar.v.getText().toString());
                nVar.e0(true);
                return;
            default:
                n nVar2 = this.f11312y;
                nVar2.f11319n.d(nVar2.f11321s.getText().toString(), nVar2.v.getText().toString());
                nVar2.e0(true);
                return;
        }
    }
}
