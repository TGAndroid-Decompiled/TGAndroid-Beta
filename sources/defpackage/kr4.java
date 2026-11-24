package defpackage;

import android.text.TextUtils;
public final class kr4 extends rr4 {
    public final sr4 y;

    public kr4(sr4 sr4Var) {
        super(sr4Var);
        this.y = sr4Var;
    }

    @Override
    public final void F(boolean z) {
        sr4 sr4Var = this.y;
        r7 r7Var = sr4Var.H;
        if (r7Var != null) {
            r7Var.setShowSearchProgress(z);
        }
        sr4Var.s.e(z, true);
    }

    @Override
    public final void f() {
        super.f();
        boolean isEmpty = TextUtils.isEmpty(this.f);
        zya zyaVar = this.y.s;
        if (isEmpty) {
            zyaVar.setStickerType(11);
            zyaVar.d.setText(k96.M0(2131745568, null));
            return;
        }
        zyaVar.setStickerType(1);
        zyaVar.d.setText(k96.a0(null, null, 2131747974, this.f));
    }
}
