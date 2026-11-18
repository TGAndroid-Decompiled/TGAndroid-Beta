package kg;

import android.content.Context;
import android.text.Editable;
import bi.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.k3;
public final class l extends k3 {
    public final int F;
    public final n G;

    public l(n nVar, Context context, String str, int i7, i6 i6Var, int i10) {
        super(context, str, false, false, i7, i6Var);
        this.F = i10;
        switch (i10) {
            case 1:
                this.G = nVar;
                super(context, str, true, false, i7, i6Var);
                return;
            default:
                this.G = nVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        d6 d6Var;
        d6 d6Var2;
        switch (this.F) {
            case 0:
                if (z10 && (d6Var = this.G.f33530a) != null) {
                    d6Var.y0(2);
                    return;
                }
                return;
            default:
                if (z10 && (d6Var2 = this.G.f33530a) != null) {
                    d6Var2.y0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.F) {
            case 0:
                n nVar = this.G;
                nVar.f18391n.d(nVar.f18393s.getText().toString(), nVar.f18394w.getText().toString());
                nVar.j0(true);
                return;
            default:
                n nVar2 = this.G;
                nVar2.f18391n.d(nVar2.f18393s.getText().toString(), nVar2.f18394w.getText().toString());
                nVar2.j0(true);
                return;
        }
    }
}
