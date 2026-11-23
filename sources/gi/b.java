package gi;

import android.view.View;
import fi.a6;
import org.telegram.ui.Components.fq0;
public final class b implements View.OnClickListener {
    public final int f13662a;
    public final m f13663b;

    public b(m mVar, int i7) {
        this.f13662a = i7;
        this.f13663b = mVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f13662a) {
            case 0:
                m mVar = this.f13663b;
                fq0 fq0Var = mVar.f13681a0;
                a6 a6Var = mVar.f13680a;
                if (a6Var == null) {
                    str = "";
                } else {
                    str = a6Var.E;
                }
                fq0Var.a(str);
                return;
            default:
                m mVar2 = this.f13663b;
                mVar2.f13681a0.b(mVar2.f13680a.E);
                return;
        }
    }
}
