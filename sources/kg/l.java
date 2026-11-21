package kg;

import android.content.Context;
import android.text.Editable;
import bi.g6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.l3;
public final class l extends l3 {
    public final int F;
    public final n G;

    public l(n nVar, Context context, String str, int i7, h6 h6Var, int i10) {
        super(context, str, false, false, i7, h6Var);
        this.F = i10;
        switch (i10) {
            case 1:
                this.G = nVar;
                super(context, str, true, false, i7, h6Var);
                return;
            default:
                this.G = nVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        g6 g6Var;
        g6 g6Var2;
        switch (this.F) {
            case 0:
                if (z10 && (g6Var = this.G.f34683a) != null) {
                    g6Var.y0(2);
                    return;
                }
                return;
            default:
                if (z10 && (g6Var2 = this.G.f34683a) != null) {
                    g6Var2.y0(3);
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
                nVar.f18417n.d(nVar.f18419s.getText().toString(), nVar.f18420w.getText().toString());
                nVar.j0(true);
                return;
            default:
                n nVar2 = this.G;
                nVar2.f18417n.d(nVar2.f18419s.getText().toString(), nVar2.f18420w.getText().toString());
                nVar2.j0(true);
                return;
        }
    }
}
