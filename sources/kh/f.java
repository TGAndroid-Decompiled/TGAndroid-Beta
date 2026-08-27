package kh;

import android.view.View;
import jh.b6;
import org.telegram.ui.Components.vq0;

public final class f implements View.OnClickListener {

    public final int f15198a;

    public final r f15199b;

    public f(r rVar, int i10) {
        this.f15198a = i10;
        this.f15199b = rVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f15198a) {
            case 0:
                r rVar = this.f15199b;
                vq0 vq0Var = rVar.S;
                b6 b6Var = rVar.f15214a;
                vq0Var.a(b6Var == null ? "" : b6Var.E);
                break;
            default:
                r rVar2 = this.f15199b;
                rVar2.S.b(rVar2.f15214a.E);
                break;
        }
    }
}
