package gg;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.l61;
public final class l extends i3 {
    public final int f8941x;
    public final n f8942y;

    public l(n nVar, Context context, String str, int i10, f6 f6Var, int i11) {
        super(context, str, false, false, i10, f6Var);
        this.f8941x = i11;
        switch (i11) {
            case 1:
                this.f8942y = nVar;
                super(context, str, true, false, i10, f6Var);
                return;
            default:
                this.f8942y = nVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        l61 l61Var;
        l61 l61Var2;
        switch (this.f8941x) {
            case 0:
                if (z10 && (l61Var = this.f8942y.f25171a) != null) {
                    l61Var.x0(2);
                    return;
                }
                return;
            default:
                if (z10 && (l61Var2 = this.f8942y.f25171a) != null) {
                    l61Var2.x0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f8941x) {
            case 0:
                n nVar = this.f8942y;
                nVar.f8956n.d(nVar.f8958s.getText().toString(), nVar.v.getText().toString());
                nVar.e0(true);
                return;
            default:
                n nVar2 = this.f8942y;
                nVar2.f8956n.d(nVar2.f8958s.getText().toString(), nVar2.v.getText().toString());
                nVar2.e0(true);
                return;
        }
    }
}
