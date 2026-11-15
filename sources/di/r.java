package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.wj0;
public final class r extends n61 {
    public final s[] f9293a = new s[3];
    public final Context f9294b;
    public final wj0 f9295c;
    public final t d;

    public r(t tVar, Context context, wj0 wj0Var) {
        this.d = tVar;
        this.f9294b = context;
        this.f9295c = wj0Var;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        this.f9295c.J(view);
    }

    @Override
    public final View d(int i7) {
        s[] sVarArr = this.f9293a;
        if (sVarArr[i7] == null) {
            sVarArr[i7] = new s(this.d, this.f9294b, i7);
        }
        return sVarArr[i7];
    }

    @Override
    public final int e() {
        return this.f9293a.length;
    }

    @Override
    public final CharSequence g(int i7) {
        int i10;
        if (i7 == 1) {
            i10 = 2131744919;
        } else if (i7 == 2) {
            i10 = 2131744918;
        } else {
            i10 = 2131744920;
        }
        return hd.M0(i10, null);
    }

    @Override
    public final int h(int i7) {
        return i7;
    }
}
