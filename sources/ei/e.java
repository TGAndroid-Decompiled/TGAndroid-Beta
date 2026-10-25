package ei;

import android.view.View;
import di.s6;
import org.telegram.ui.Components.us0;
public final class e implements View.OnClickListener {
    public final int f9983a;
    public final r f9984b;

    public e(r rVar, int i10) {
        this.f9983a = i10;
        this.f9984b = rVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f9983a) {
            case 0:
                r rVar = this.f9984b;
                us0 us0Var = rVar.W;
                s6 s6Var = rVar.f10001a;
                if (s6Var == null) {
                    str = "";
                } else {
                    str = s6Var.E;
                }
                us0Var.a(str);
                return;
            default:
                r rVar2 = this.f9984b;
                rVar2.W.b(rVar2.f10001a.E);
                return;
        }
    }
}
