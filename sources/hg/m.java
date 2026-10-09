package hg;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.e71;
public final class m extends j3 {
    public final int f11313x;
    public final n f11314y;

    public m(n nVar, Context context, String str, int i10, e6 e6Var, int i11) {
        super(context, str, false, false, i10, e6Var);
        this.f11313x = i11;
        switch (i11) {
            case 1:
                this.f11314y = nVar;
                super(context, str, true, false, i10, e6Var);
                return;
            default:
                this.f11314y = nVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        e71 e71Var;
        e71 e71Var2;
        switch (this.f11313x) {
            case 0:
                if (z10 && (e71Var = this.f11314y.f26290a) != null) {
                    e71Var.x0(2);
                    return;
                }
                return;
            default:
                if (z10 && (e71Var2 = this.f11314y.f26290a) != null) {
                    e71Var2.x0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f11313x) {
            case 0:
                n nVar = this.f11314y;
                nVar.f11321n.d(nVar.f11323s.getText().toString(), nVar.v.getText().toString());
                nVar.e0(true);
                return;
            default:
                n nVar2 = this.f11314y;
                nVar2.f11321n.d(nVar2.f11323s.getText().toString(), nVar2.v.getText().toString());
                nVar2.e0(true);
                return;
        }
    }
}
