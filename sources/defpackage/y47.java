package defpackage;

import android.content.Context;
import android.view.View;
public final class y47 extends nic {
    public final Context a;
    public final s57 b;

    public y47(s57 s57Var, Context context) {
        this.b = s57Var;
        this.a = context;
    }

    @Override
    public final View d(int i) {
        return new m57(this.b, this.a, i);
    }

    @Override
    public final int e() {
        return this.b.e.a.size();
    }

    @Override
    public final int h(int i) {
        return ((p57) this.b.e.a.get(i)).a;
    }
}
