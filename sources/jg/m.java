package jg;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.l71;
public final class m extends g3 {
    public final int E;
    public final n F;

    public m(n nVar, Context context, String str, int i10, u6 u6Var, int i11) {
        super(context, str, false, false, i10, u6Var);
        this.E = i11;
        switch (i11) {
            case 1:
                this.F = nVar;
                super(context, str, true, false, i10, u6Var);
                return;
            default:
                this.F = nVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        l71 l71Var;
        l71 l71Var2;
        switch (this.E) {
            case 0:
                if (z10 && (l71Var = this.F.f30419a) != null) {
                    l71Var.y0(2);
                    return;
                }
                return;
            default:
                if (z10 && (l71Var2 = this.F.f30419a) != null) {
                    l71Var2.y0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.E) {
            case 0:
                n nVar = this.F;
                nVar.f15781n.d(nVar.f15783s.getText().toString(), nVar.v.getText().toString());
                nVar.f0(true);
                return;
            default:
                n nVar2 = this.F;
                nVar2.f15781n.d(nVar2.f15783s.getText().toString(), nVar2.v.getText().toString());
                nVar2.f0(true);
                return;
        }
    }
}
