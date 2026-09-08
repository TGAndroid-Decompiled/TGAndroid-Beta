package ig;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.x51;
public final class l extends i3 {
    public final int f12161x;
    public final m f12162y;

    public l(m mVar, Context context, String str, int i10, f6 f6Var, int i11) {
        super(context, str, false, false, i10, f6Var);
        this.f12161x = i11;
        switch (i11) {
            case 1:
                this.f12162y = mVar;
                super(context, str, true, false, i10, f6Var);
                return;
            default:
                this.f12162y = mVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        x51 x51Var;
        x51 x51Var2;
        switch (this.f12161x) {
            case 0:
                if (z10 && (x51Var = this.f12162y.f32876a) != null) {
                    x51Var.x0(2);
                    return;
                }
                return;
            default:
                if (z10 && (x51Var2 = this.f12162y.f32876a) != null) {
                    x51Var2.x0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f12161x) {
            case 0:
                m mVar = this.f12162y;
                mVar.f12170n.d(mVar.f12172s.getText().toString(), mVar.v.getText().toString());
                mVar.e0(true);
                return;
            default:
                m mVar2 = this.f12162y;
                mVar2.f12170n.d(mVar2.f12172s.getText().toString(), mVar2.v.getText().toString());
                mVar2.e0(true);
                return;
        }
    }
}
