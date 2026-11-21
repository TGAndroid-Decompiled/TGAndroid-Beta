package gi;

import android.view.View;
import fi.a6;
import org.telegram.ui.Components.fq0;
public final class b implements View.OnClickListener {
    public final int f13659a;
    public final m f13660b;

    public b(m mVar, int i7) {
        this.f13659a = i7;
        this.f13660b = mVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f13659a) {
            case 0:
                m mVar = this.f13660b;
                fq0 fq0Var = mVar.f13678a0;
                a6 a6Var = mVar.f13677a;
                if (a6Var == null) {
                    str = "";
                } else {
                    str = a6Var.E;
                }
                fq0Var.a(str);
                return;
            default:
                m mVar2 = this.f13660b;
                mVar2.f13678a0.b(mVar2.f13677a.E);
                return;
        }
    }
}
