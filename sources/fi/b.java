package fi;

import android.view.View;
import ei.k6;
import org.telegram.ui.Components.tp0;
public final class b implements View.OnClickListener {
    public final int f11597a;
    public final m f11598b;

    public b(m mVar, int i3) {
        this.f11597a = i3;
        this.f11598b = mVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f11597a) {
            case 0:
                m mVar = this.f11598b;
                tp0 tp0Var = mVar.f11616a0;
                k6 k6Var = mVar.f11615a;
                if (k6Var == null) {
                    str = "";
                } else {
                    str = k6Var.E;
                }
                tp0Var.a(str);
                return;
            default:
                m mVar2 = this.f11598b;
                mVar2.f11616a0.b(mVar2.f11615a.E);
                return;
        }
    }
}
