package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.vj0;
public final class t extends f61 {
    public final u[] f5992a = new u[3];
    public final Context f5993b;
    public final vj0 f5994c;
    public final v d;

    public t(v vVar, Context context, vj0 vj0Var) {
        this.d = vVar;
        this.f5993b = context;
        this.f5994c = vj0Var;
    }

    @Override
    public final void b(View view, int i3, int i10) {
        this.f5994c.L(view);
    }

    @Override
    public final View d(int i3) {
        u[] uVarArr = this.f5992a;
        if (uVarArr[i3] == null) {
            uVarArr[i3] = new u(this.d, this.f5993b, i3);
        }
        return uVarArr[i3];
    }

    @Override
    public final int e() {
        return this.f5992a.length;
    }

    @Override
    public final CharSequence g(int i3) {
        int i10;
        if (i3 == 1) {
            i10 = 2131744929;
        } else if (i3 == 2) {
            i10 = 2131744928;
        } else {
            i10 = 2131744930;
        }
        return bd.M0(i10, null);
    }

    @Override
    public final int h(int i3) {
        return i3;
    }
}
