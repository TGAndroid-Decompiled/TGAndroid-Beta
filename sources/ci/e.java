package ci;

import android.view.View;
import bi.b8;
import org.telegram.ui.Components.lr0;
public final class e implements View.OnClickListener {
    public final int f4835a;
    public final t f4836b;

    public e(t tVar, int i10) {
        this.f4835a = i10;
        this.f4836b = tVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f4835a) {
            case 0:
                t tVar = this.f4836b;
                lr0 lr0Var = tVar.W;
                b8 b8Var = tVar.f4858a;
                if (b8Var == null) {
                    str = "";
                } else {
                    str = b8Var.E;
                }
                lr0Var.a(str);
                return;
            default:
                t tVar2 = this.f4836b;
                tVar2.W.b(tVar2.f4858a.E);
                return;
        }
    }
}
