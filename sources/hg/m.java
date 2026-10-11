package hg;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.g71;
public final class m extends j3 {
    public final int f11312x;
    public final n f11313y;

    public m(n nVar, Context context, String str, int i10, d6 d6Var, int i11) {
        super(context, str, false, false, i10, d6Var);
        this.f11312x = i11;
        switch (i11) {
            case 1:
                this.f11313y = nVar;
                super(context, str, true, false, i10, d6Var);
                return;
            default:
                this.f11313y = nVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        g71 g71Var;
        g71 g71Var2;
        switch (this.f11312x) {
            case 0:
                if (z10 && (g71Var = this.f11313y.f26922a) != null) {
                    g71Var.x0(2);
                    return;
                }
                return;
            default:
                if (z10 && (g71Var2 = this.f11313y.f26922a) != null) {
                    g71Var2.x0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f11312x) {
            case 0:
                n nVar = this.f11313y;
                nVar.f11320n.d(nVar.f11322s.getText().toString(), nVar.v.getText().toString());
                nVar.e0(true);
                return;
            default:
                n nVar2 = this.f11313y;
                nVar2.f11320n.d(nVar2.f11322s.getText().toString(), nVar2.v.getText().toString());
                nVar2.e0(true);
                return;
        }
    }
}
