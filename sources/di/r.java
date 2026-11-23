package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.gk0;
public final class r extends c71 {
    public final s[] f9598a = new s[3];
    public final Context f9599b;
    public final gk0 f9600c;
    public final t d;

    public r(t tVar, Context context, gk0 gk0Var) {
        this.d = tVar;
        this.f9599b = context;
        this.f9600c = gk0Var;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        this.f9600c.J(view);
    }

    @Override
    public final View d(int i7) {
        s[] sVarArr = this.f9598a;
        if (sVarArr[i7] == null) {
            sVarArr[i7] = new s(this.d, this.f9599b, i7);
        }
        return sVarArr[i7];
    }

    @Override
    public final int e() {
        return this.f9598a.length;
    }

    @Override
    public final CharSequence g(int i7) {
        int i10;
        if (i7 == 1) {
            i10 = 2131744678;
        } else if (i7 == 2) {
            i10 = 2131744677;
        } else {
            i10 = 2131744679;
        }
        return gd.N0(i10, null);
    }

    @Override
    public final int h(int i7) {
        return i7;
    }
}
