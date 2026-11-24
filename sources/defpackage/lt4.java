package defpackage;

import android.text.TextUtils;
public final class lt4 extends st4 {
    public final tt4 y;

    public lt4(tt4 tt4Var) {
        super(tt4Var);
        this.y = tt4Var;
    }

    @Override
    public final void F(boolean z) {
        tt4 tt4Var = this.y;
        r7 r7Var = tt4Var.H;
        if (r7Var != null) {
            r7Var.setShowSearchProgress(z);
        }
        tt4Var.s.e(z, true);
    }

    @Override
    public final void f() {
        super.f();
        boolean isEmpty = TextUtils.isEmpty(this.f);
        a1b a1bVar = this.y.s;
        if (isEmpty) {
            a1bVar.setStickerType(11);
            a1bVar.d.setText(jb6.M0(2131745494, null));
            return;
        }
        a1bVar.setStickerType(1);
        a1bVar.d.setText(jb6.a0(null, null, 2131747900, this.f));
    }
}
