package hg;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.w61;
public final class l extends j3 {
    public final int f11250x;
    public final m f11251y;

    public l(m mVar, Context context, String str, int i10, d6 d6Var, int i11) {
        super(context, str, false, false, i10, d6Var);
        this.f11250x = i11;
        switch (i11) {
            case 1:
                this.f11251y = mVar;
                super(context, str, true, false, i10, d6Var);
                return;
            default:
                this.f11251y = mVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        w61 w61Var;
        w61 w61Var2;
        switch (this.f11250x) {
            case 0:
                if (z10 && (w61Var = this.f11251y.f32724a) != null) {
                    w61Var.y0(2);
                    return;
                }
                return;
            default:
                if (z10 && (w61Var2 = this.f11251y.f32724a) != null) {
                    w61Var2.y0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f11250x) {
            case 0:
                m mVar = this.f11251y;
                mVar.f11265r.d(mVar.v.getText().toString(), mVar.f11267w.getText().toString());
                mVar.e0(true);
                return;
            default:
                m mVar2 = this.f11251y;
                mVar2.f11265r.d(mVar2.v.getText().toString(), mVar2.f11267w.getText().toString());
                mVar2.e0(true);
                return;
        }
    }
}
