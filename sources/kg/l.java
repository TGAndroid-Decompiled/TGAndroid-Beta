package kg;

import android.content.Context;
import android.text.Editable;
import fi.w3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.k3;
public final class l extends k3 {
    public final int E;
    public final m F;

    public l(m mVar, Context context, String str, int i7, h6 h6Var, int i10) {
        super(context, str, false, false, i7, h6Var);
        this.E = i10;
        switch (i10) {
            case 1:
                this.F = mVar;
                super(context, str, true, false, i7, h6Var);
                return;
            default:
                this.F = mVar;
                return;
        }
    }

    @Override
    public final void a(boolean z9) {
        w3 w3Var;
        w3 w3Var2;
        switch (this.E) {
            case 0:
                if (z9 && (w3Var = this.F.f36518a) != null) {
                    w3Var.y0(2);
                    return;
                }
                return;
            default:
                if (z9 && (w3Var2 = this.F.f36518a) != null) {
                    w3Var2.y0(3);
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
                mVar.f17433n.d(mVar.f17435s.getText().toString(), mVar.f17436w.getText().toString());
                mVar.j0(true);
                return;
            default:
                m mVar2 = this.F;
                mVar2.f17433n.d(mVar2.f17435s.getText().toString(), mVar2.f17436w.getText().toString());
                mVar2.j0(true);
                return;
        }
    }
}
