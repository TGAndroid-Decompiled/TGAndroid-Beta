package lg;

import ai.h4;
import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.k3;
public final class l extends k3 {
    public final int F;
    public final m G;

    public l(m mVar, Context context, String str, int i3, e6 e6Var, int i10) {
        super(context, str, false, false, i3, e6Var);
        this.F = i10;
        switch (i10) {
            case 1:
                this.G = mVar;
                super(context, str, true, false, i3, e6Var);
                return;
            default:
                this.G = mVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        h4 h4Var;
        h4 h4Var2;
        switch (this.F) {
            case 0:
                if (z10 && (h4Var = this.G.f34298a) != null) {
                    h4Var.y0(2);
                    return;
                }
                return;
            default:
                if (z10 && (h4Var2 = this.G.f34298a) != null) {
                    h4Var2.y0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.F) {
            case 0:
                m mVar = this.G;
                mVar.f18359n.d(mVar.f18361s.getText().toString(), mVar.f18362w.getText().toString());
                mVar.j0(true);
                return;
            default:
                m mVar2 = this.G;
                mVar2.f18359n.d(mVar2.f18361s.getText().toString(), mVar2.f18362w.getText().toString());
                mVar2.j0(true);
                return;
        }
    }
}
