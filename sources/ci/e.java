package ci;

import android.view.View;
import bi.b8;
import org.telegram.ui.Components.lr0;
public final class e implements View.OnClickListener {
    public final int f4808a;
    public final t f4809b;

    public e(t tVar, int i10) {
        this.f4808a = i10;
        this.f4809b = tVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f4808a) {
            case 0:
                t tVar = this.f4809b;
                lr0 lr0Var = tVar.W;
                b8 b8Var = tVar.f4831a;
                if (b8Var == null) {
                    str = "";
                } else {
                    str = b8Var.E;
                }
                lr0Var.a(str);
                return;
            default:
                t tVar2 = this.f4809b;
                tVar2.W.b(tVar2.f4831a.E);
                return;
        }
    }
}
