package hg;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.k3;
import org.telegram.ui.Components.m61;
public final class l extends k3 {
    public final int f10343x;
    public final m f10344y;

    public l(m mVar, Context context, String str, int i10, f6 f6Var, int i11) {
        super(context, str, false, false, i10, f6Var);
        this.f10343x = i11;
        switch (i11) {
            case 1:
                this.f10344y = mVar;
                super(context, str, true, false, i10, f6Var);
                return;
            default:
                this.f10344y = mVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        m61 m61Var;
        m61 m61Var2;
        switch (this.f10343x) {
            case 0:
                if (z10 && (m61Var = this.f10344y.f26598a) != null) {
                    m61Var.y0(2);
                    return;
                }
                return;
            default:
                if (z10 && (m61Var2 = this.f10344y.f26598a) != null) {
                    m61Var2.y0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f10343x) {
            case 0:
                m mVar = this.f10344y;
                mVar.f10357r.d(mVar.v.getText().toString(), mVar.f10359w.getText().toString());
                mVar.e0(true);
                return;
            default:
                m mVar2 = this.f10344y;
                mVar2.f10357r.d(mVar2.v.getText().toString(), mVar2.f10359w.getText().toString());
                mVar2.e0(true);
                return;
        }
    }
}
