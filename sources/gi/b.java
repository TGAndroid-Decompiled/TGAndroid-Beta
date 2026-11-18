package gi;

import android.view.View;
import fi.z5;
import org.telegram.ui.Components.dq0;
public final class b implements View.OnClickListener {
    public final int f13633a;
    public final m f13634b;

    public b(m mVar, int i7) {
        this.f13633a = i7;
        this.f13634b = mVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f13633a) {
            case 0:
                m mVar = this.f13634b;
                dq0 dq0Var = mVar.f13652a0;
                z5 z5Var = mVar.f13651a;
                if (z5Var == null) {
                    str = "";
                } else {
                    str = z5Var.E;
                }
                dq0Var.a(str);
                return;
            default:
                m mVar2 = this.f13634b;
                mVar2.f13652a0.b(mVar2.f13651a.E);
                return;
        }
    }
}
