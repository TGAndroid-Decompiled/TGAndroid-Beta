package hg;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.y51;
public final class l extends i3 {
    public final int f10337x;
    public final m f10338y;

    public l(m mVar, Context context, String str, int i10, e6 e6Var, int i11) {
        super(context, str, false, false, i10, e6Var);
        this.f10337x = i11;
        switch (i11) {
            case 1:
                this.f10338y = mVar;
                super(context, str, true, false, i10, e6Var);
                return;
            default:
                this.f10338y = mVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        y51 y51Var;
        y51 y51Var2;
        switch (this.f10337x) {
            case 0:
                if (z10 && (y51Var = this.f10338y.f30485a) != null) {
                    y51Var.x0(2);
                    return;
                }
                return;
            default:
                if (z10 && (y51Var2 = this.f10338y.f30485a) != null) {
                    y51Var2.x0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f10337x) {
            case 0:
                m mVar = this.f10338y;
                mVar.f10351r.d(mVar.v.getText().toString(), mVar.f10353w.getText().toString());
                mVar.e0(true);
                return;
            default:
                m mVar2 = this.f10338y;
                mVar2.f10351r.d(mVar2.v.getText().toString(), mVar2.f10353w.getText().toString());
                mVar2.e0(true);
                return;
        }
    }
}
