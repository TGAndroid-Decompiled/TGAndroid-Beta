package defpackage;

import android.content.Context;
import android.view.View;
public final class r47 extends ogc {
    public final Context a;
    public final l57 b;

    public r47(l57 l57Var, Context context) {
        this.b = l57Var;
        this.a = context;
    }

    @Override
    public final View d(int i) {
        return new f57(this.b, this.a, i);
    }

    @Override
    public final int e() {
        return this.b.e.a.size();
    }

    @Override
    public final int h(int i) {
        return ((i57) this.b.e.a.get(i)).a;
    }
}
