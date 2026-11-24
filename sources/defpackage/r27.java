package defpackage;

import android.content.Context;
import android.view.View;
public final class r27 extends oec {
    public final Context a;
    public final l37 b;

    public r27(l37 l37Var, Context context) {
        this.b = l37Var;
        this.a = context;
    }

    @Override
    public final View d(int i) {
        return new f37(this.b, this.a, i);
    }

    @Override
    public final int e() {
        return this.b.e.a.size();
    }

    @Override
    public final int h(int i) {
        return ((i37) this.b.e.a.get(i)).a;
    }
}
