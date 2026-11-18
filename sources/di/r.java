package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.y61;
public final class r extends y61 {
    public final s[] f9603a = new s[3];
    public final Context f9604b;
    public final ek0 f9605c;
    public final t d;

    public r(t tVar, Context context, ek0 ek0Var) {
        this.d = tVar;
        this.f9604b = context;
        this.f9605c = ek0Var;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        this.f9605c.H(view);
    }

    @Override
    public final View d(int i7) {
        s[] sVarArr = this.f9603a;
        if (sVarArr[i7] == null) {
            sVarArr[i7] = new s(this.d, this.f9604b, i7);
        }
        return sVarArr[i7];
    }

    @Override
    public final int e() {
        return this.f9603a.length;
    }

    @Override
    public final CharSequence g(int i7) {
        int i10;
        if (i7 == 1) {
            i10 = 2131744684;
        } else if (i7 == 2) {
            i10 = 2131744683;
        } else {
            i10 = 2131744685;
        }
        return gd.M0(i10, null);
    }

    @Override
    public final int h(int i7) {
        return i7;
    }
}
