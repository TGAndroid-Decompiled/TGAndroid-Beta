package gi;

import android.view.View;
import fi.z5;
import org.telegram.ui.Components.fq0;
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
                fq0 fq0Var = mVar.f13644a0;
                z5 z5Var = mVar.f13643a;
                if (z5Var == null) {
                    str = "";
                } else {
                    str = z5Var.E;
                }
                fq0Var.a(str);
                return;
            default:
                m mVar2 = this.f13626b;
                mVar2.f13644a0.b(mVar2.f13643a.E);
                return;
        }
    }
}
