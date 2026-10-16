package ig;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.c71;
public final class l extends j3 {
    public final int f11567x;
    public final m f11568y;

    public l(m mVar, Context context, String str, int i10, c6 c6Var, int i11) {
        super(context, str, false, false, i10, c6Var);
        this.f11567x = i11;
        switch (i11) {
            case 1:
                this.f11568y = mVar;
                super(context, str, true, false, i10, c6Var);
                return;
            default:
                this.f11568y = mVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        c71 c71Var;
        c71 c71Var2;
        switch (this.f11567x) {
            case 0:
                if (z10 && (c71Var = this.f11568y.f24003a) != null) {
                    c71Var.x0(2);
                    return;
                }
                return;
            default:
                if (z10 && (c71Var2 = this.f11568y.f24003a) != null) {
                    c71Var2.x0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f11567x) {
            case 0:
                m mVar = this.f11568y;
                mVar.f11575n.d(mVar.f11577s.getText().toString(), mVar.v.getText().toString());
                mVar.e0(true);
                return;
            default:
                m mVar2 = this.f11568y;
                mVar2.f11575n.d(mVar2.f11577s.getText().toString(), mVar2.v.getText().toString());
                mVar2.e0(true);
                return;
        }
    }
}
