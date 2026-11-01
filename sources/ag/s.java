package ag;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.ii;
public final class s extends org.telegram.ui.Cells.m3 {
    public final int E;
    public final w F;

    public s(w wVar, Context context, String str, int i10, p6 p6Var, int i11) {
        super(context, str, false, false, i10, p6Var);
        this.E = i11;
        switch (i11) {
            case 1:
                this.F = wVar;
                super(context, str, true, false, i10, p6Var);
                return;
            default:
                this.F = wVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        ii iiVar;
        ii iiVar2;
        switch (this.E) {
            case 0:
                if (z10 && (iiVar = this.F.f30217a) != null) {
                    iiVar.y0(2);
                    return;
                }
                return;
            default:
                if (z10 && (iiVar2 = this.F.f30217a) != null) {
                    iiVar2.y0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.E) {
            case 0:
                w wVar = this.F;
                wVar.f762n.d(wVar.f764s.getText().toString(), wVar.f765w.getText().toString());
                wVar.j0(true);
                return;
            default:
                w wVar2 = this.F;
                wVar2.f762n.d(wVar2.f764s.getText().toString(), wVar2.f765w.getText().toString());
                wVar2.j0(true);
                return;
        }
    }
}
