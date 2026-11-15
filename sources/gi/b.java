package gi;

import android.view.View;
import fi.c6;
import org.telegram.ui.Components.vp0;
public final class b implements View.OnClickListener {
    public final int f13318a;
    public final m f13319b;

    public b(m mVar, int i7) {
        this.f13318a = i7;
        this.f13319b = mVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f13318a) {
            case 0:
                m mVar = this.f13319b;
                vp0 vp0Var = mVar.f13337a0;
                c6 c6Var = mVar.f13336a;
                if (c6Var == null) {
                    str = "";
                } else {
                    str = c6Var.E;
                }
                vp0Var.a(str);
                return;
            default:
                m mVar2 = this.f13319b;
                mVar2.f13337a0.b(mVar2.f13336a.E);
                return;
        }
    }
}
