package hg;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.n61;
public final class l extends j3 {
    public final int f10342x;
    public final m f10343y;

    public l(m mVar, Context context, String str, int i10, e6 e6Var, int i11) {
        super(context, str, false, false, i10, e6Var);
        this.f10342x = i11;
        switch (i11) {
            case 1:
                this.f10343y = mVar;
                super(context, str, true, false, i10, e6Var);
                return;
            default:
                this.f10343y = mVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        n61 n61Var;
        n61 n61Var2;
        switch (this.f10342x) {
            case 0:
                if (z10 && (n61Var = this.f10343y.f26891a) != null) {
                    n61Var.y0(2);
                    return;
                }
                return;
            default:
                if (z10 && (n61Var2 = this.f10343y.f26891a) != null) {
                    n61Var2.y0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f10342x) {
            case 0:
                m mVar = this.f10343y;
                mVar.f10356r.d(mVar.v.getText().toString(), mVar.f10358w.getText().toString());
                mVar.e0(true);
                return;
            default:
                m mVar2 = this.f10343y;
                mVar2.f10356r.d(mVar2.v.getText().toString(), mVar2.f10358w.getText().toString());
                mVar2.e0(true);
                return;
        }
    }
}
