package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d91;
public final class n8 extends d91 {
    public final int f9531a;
    public final Context f9532b;
    public final r9 f9533c;

    public n8(r9 r9Var, Context context, int i10) {
        this.f9531a = i10;
        this.f9533c = r9Var;
        this.f9532b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f9531a) {
            case 0:
                ((k9) view).b(i11);
                return;
            default:
                ((k9) view).b(i11);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f9531a) {
            case 0:
                return new k9(this.f9533c, this.f9532b);
            default:
                return new k9(this.f9533c, this.f9532b);
        }
    }

    @Override
    public final int e() {
        switch (this.f9531a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f9531a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f9533c.M;
            default:
                return 5;
        }
    }
}
