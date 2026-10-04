package hg;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.w61;
public final class m extends j3 {
    public final int f11261x;
    public final n f11262y;

    public m(n nVar, Context context, String str, int i10, d6 d6Var, int i11) {
        super(context, str, false, false, i10, d6Var);
        this.f11261x = i11;
        switch (i11) {
            case 1:
                this.f11262y = nVar;
                super(context, str, true, false, i10, d6Var);
                return;
            default:
                this.f11262y = nVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        w61 w61Var;
        w61 w61Var2;
        switch (this.f11261x) {
            case 0:
                if (z10 && (w61Var = this.f11262y.f32731a) != null) {
                    w61Var.y0(2);
                    return;
                }
                return;
            default:
                if (z10 && (w61Var2 = this.f11262y.f32731a) != null) {
                    w61Var2.y0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f11261x) {
            case 0:
                n nVar = this.f11262y;
                nVar.f11270r.d(nVar.v.getText().toString(), nVar.f11272w.getText().toString());
                nVar.e0(true);
                return;
            default:
                n nVar2 = this.f11262y;
                nVar2.f11270r.d(nVar2.v.getText().toString(), nVar2.f11272w.getText().toString());
                nVar2.e0(true);
                return;
        }
    }
}
