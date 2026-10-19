package ig;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.v61;
public final class l extends i3 {
    public final int f12953x;
    public final m f12954y;

    public l(m mVar, Context context, String str, int i10, d6 d6Var, int i11) {
        super(context, str, false, false, i10, d6Var);
        this.f12953x = i11;
        switch (i11) {
            case 1:
                this.f12954y = mVar;
                super(context, str, true, false, i10, d6Var);
                return;
            default:
                this.f12954y = mVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        v61 v61Var;
        v61 v61Var2;
        switch (this.f12953x) {
            case 0:
                if (z10 && (v61Var = this.f12954y.f32027a) != null) {
                    v61Var.x0(2);
                    return;
                }
                return;
            default:
                if (z10 && (v61Var2 = this.f12954y.f32027a) != null) {
                    v61Var2.x0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f12953x) {
            case 0:
                m mVar = this.f12954y;
                mVar.f12959n.d(mVar.f12961s.getText().toString(), mVar.v.getText().toString());
                mVar.e0(true);
                return;
            default:
                m mVar2 = this.f12954y;
                mVar2.f12959n.d(mVar2.f12961s.getText().toString(), mVar2.v.getText().toString());
                mVar2.e0(true);
                return;
        }
    }
}
