package kh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e71;
public final class k1 extends e71 {
    public final boolean f15504a;
    public final Context f15505b;
    public final n2 f15506c;

    public k1(n2 n2Var, boolean z10, Context context) {
        this.f15506c = n2Var;
        this.f15504a = z10;
        this.f15505b = context;
    }

    @Override
    public final void b(View view, int i9, int i10) {
        x1 x1Var = (x1) view;
        if (this.f15504a) {
            i9 = 1;
        }
        x1Var.a(i9);
    }

    @Override
    public final View d(int i9) {
        Context context = this.f15505b;
        n2 n2Var = this.f15506c;
        if (i9 == 1) {
            return new w1(n2Var, context);
        }
        return new b2(n2Var, context);
    }

    @Override
    public final int e() {
        if (this.f15504a) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int h(int i9) {
        if (i9 != 0 && i9 != 1) {
            return 1;
        }
        return 0;
    }
}
