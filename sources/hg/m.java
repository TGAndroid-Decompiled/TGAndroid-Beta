package hg;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.x51;
public final class m extends i3 {
    public final int f10333x;
    public final n f10334y;

    public m(n nVar, Context context, String str, int i10, d6 d6Var, int i11) {
        super(context, str, false, false, i10, d6Var);
        this.f10333x = i11;
        switch (i11) {
            case 1:
                this.f10334y = nVar;
                super(context, str, true, false, i10, d6Var);
                return;
            default:
                this.f10334y = nVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        x51 x51Var;
        x51 x51Var2;
        switch (this.f10333x) {
            case 0:
                if (z10 && (x51Var = this.f10334y.f30163a) != null) {
                    x51Var.x0(2);
                    return;
                }
                return;
            default:
                if (z10 && (x51Var2 = this.f10334y.f30163a) != null) {
                    x51Var2.x0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f10333x) {
            case 0:
                n nVar = this.f10334y;
                nVar.f10346n.d(nVar.f10348s.getText().toString(), nVar.v.getText().toString());
                nVar.e0(true);
                return;
            default:
                n nVar2 = this.f10334y;
                nVar2.f10346n.d(nVar2.f10348s.getText().toString(), nVar2.v.getText().toString());
                nVar2.e0(true);
                return;
        }
    }
}
