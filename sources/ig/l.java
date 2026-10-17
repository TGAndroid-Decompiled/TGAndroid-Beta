package ig;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.u61;
public final class l extends i3 {
    public final int f12951x;
    public final m f12952y;

    public l(m mVar, Context context, String str, int i10, d6 d6Var, int i11) {
        super(context, str, false, false, i10, d6Var);
        this.f12951x = i11;
        switch (i11) {
            case 1:
                this.f12952y = mVar;
                super(context, str, true, false, i10, d6Var);
                return;
            default:
                this.f12952y = mVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        u61 u61Var;
        u61 u61Var2;
        switch (this.f12951x) {
            case 0:
                if (z10 && (u61Var = this.f12952y.f31190a) != null) {
                    u61Var.x0(2);
                    return;
                }
                return;
            default:
                if (z10 && (u61Var2 = this.f12952y.f31190a) != null) {
                    u61Var2.x0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f12951x) {
            case 0:
                m mVar = this.f12952y;
                mVar.f12958n.d(mVar.f12960s.getText().toString(), mVar.v.getText().toString());
                mVar.e0(true);
                return;
            default:
                m mVar2 = this.f12952y;
                mVar2.f12958n.d(mVar2.f12960s.getText().toString(), mVar2.v.getText().toString());
                mVar2.e0(true);
                return;
        }
    }
}
