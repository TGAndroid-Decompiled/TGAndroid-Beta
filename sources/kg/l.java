package kg;

import android.content.Context;
import android.text.Editable;
import bi.v3;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.k3;
public final class l extends k3 {
    public final int F;
    public final n G;

    public l(n nVar, Context context, String str, int i7, e6 e6Var, int i10) {
        super(context, str, false, false, i7, e6Var);
        this.F = i10;
        switch (i10) {
            case 1:
                this.G = nVar;
                super(context, str, true, false, i7, e6Var);
                return;
            default:
                this.G = nVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        v3 v3Var;
        v3 v3Var2;
        switch (this.F) {
            case 0:
                if (z10 && (v3Var = this.G.f38880a) != null) {
                    v3Var.y0(2);
                    return;
                }
                return;
            default:
                if (z10 && (v3Var2 = this.G.f38880a) != null) {
                    v3Var2.y0(3);
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
                nVar.f17999n.d(nVar.f18001s.getText().toString(), nVar.f18002w.getText().toString());
                nVar.j0(true);
                return;
            default:
                n nVar2 = this.G;
                nVar2.f17999n.d(nVar2.f18001s.getText().toString(), nVar2.f18002w.getText().toString());
                nVar2.j0(true);
                return;
        }
    }
}
