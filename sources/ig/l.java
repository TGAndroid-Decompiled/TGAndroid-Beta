package ig;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Components.c71;
public final class l extends h3 {
    public final int E;
    public final m F;

    public l(m mVar, Context context, String str, int i10, g6 g6Var, int i11) {
        super(context, str, false, false, i10, g6Var);
        this.E = i11;
        switch (i11) {
            case 1:
                this.F = mVar;
                super(context, str, true, false, i10, g6Var);
                return;
            default:
                this.F = mVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        c71 c71Var;
        c71 c71Var2;
        switch (this.E) {
            case 0:
                if (z10 && (c71Var = this.F.f25615a) != null) {
                    c71Var.x0(2);
                    return;
                }
                return;
            default:
                if (z10 && (c71Var2 = this.F.f25615a) != null) {
                    c71Var2.x0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.E) {
            case 0:
                m mVar = this.F;
                mVar.v.d(mVar.f12996x.getText().toString(), mVar.f12997y.getText().toString());
                mVar.e0(true);
                return;
            default:
                m mVar2 = this.F;
                mVar2.v.d(mVar2.f12996x.getText().toString(), mVar2.f12997y.getText().toString());
                mVar2.e0(true);
                return;
        }
    }
}
