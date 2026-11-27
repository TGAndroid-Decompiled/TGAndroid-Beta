package defpackage;

import android.text.TextUtils;
public final class ot4 extends vt4 {
    public final wt4 y;

    public ot4(wt4 wt4Var) {
        super(wt4Var);
        this.y = wt4Var;
    }

    @Override
    public final void F(boolean z) {
        wt4 wt4Var = this.y;
        s7 s7Var = wt4Var.H;
        if (s7Var != null) {
            s7Var.setShowSearchProgress(z);
        }
        wt4Var.s.e(z, true);
    }

    @Override
    public final void f() {
        super.f();
        boolean isEmpty = TextUtils.isEmpty(this.f);
        z2b z2bVar = this.y.s;
        if (isEmpty) {
            z2bVar.setStickerType(11);
            z2bVar.d.setText(ob6.M0(2131745488, null));
            return;
        }
        z2bVar.setStickerType(1);
        z2bVar.d.setText(ob6.a0(null, null, 2131747897, this.f));
    }
}
