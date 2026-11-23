package gi;

import android.view.View;
import fi.a6;
import org.telegram.ui.Components.eq0;
public final class b implements View.OnClickListener {
    public final int f13625a;
    public final m f13626b;

    public b(m mVar, int i7) {
        this.f13625a = i7;
        this.f13626b = mVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f13625a) {
            case 0:
                m mVar = this.f13626b;
                eq0 eq0Var = mVar.f13644a0;
                a6 a6Var = mVar.f13643a;
                if (a6Var == null) {
                    str = "";
                } else {
                    str = a6Var.E;
                }
                eq0Var.a(str);
                return;
            default:
                m mVar2 = this.f13626b;
                mVar2.f13644a0.b(mVar2.f13643a.E);
                return;
        }
    }
}
