package hg;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.o61;
public final class m extends j3 {
    public final int f10347x;
    public final n f10348y;

    public m(n nVar, Context context, String str, int i10, d6 d6Var, int i11) {
        super(context, str, false, false, i10, d6Var);
        this.f10347x = i11;
        switch (i11) {
            case 1:
                this.f10348y = nVar;
                super(context, str, true, false, i10, d6Var);
                return;
            default:
                this.f10348y = nVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        o61 o61Var;
        o61 o61Var2;
        switch (this.f10347x) {
            case 0:
                if (z10 && (o61Var = this.f10348y.f27258a) != null) {
                    o61Var.y0(2);
                    return;
                }
                return;
            default:
                if (z10 && (o61Var2 = this.f10348y.f27258a) != null) {
                    o61Var2.y0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f10347x) {
            case 0:
                n nVar = this.f10348y;
                nVar.f10360n.d(nVar.f10362s.getText().toString(), nVar.v.getText().toString());
                nVar.e0(true);
                return;
            default:
                n nVar2 = this.f10348y;
                nVar2.f10360n.d(nVar2.f10362s.getText().toString(), nVar2.v.getText().toString());
                nVar2.e0(true);
                return;
        }
    }
}
