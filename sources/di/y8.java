package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d91;
public final class y8 extends d91 {
    public final int f8135a;
    public final Context f8136b;
    public final ea f8137c;

    public y8(ea eaVar, Context context, int i10) {
        this.f8135a = i10;
        this.f8137c = eaVar;
        this.f8136b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f8135a) {
            case 0:
                ((x9) view).b(i11);
                return;
            default:
                ((x9) view).b(i11);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f8135a) {
            case 0:
                return new x9(this.f8137c, this.f8136b);
            default:
                return new x9(this.f8137c, this.f8136b);
        }
    }

    @Override
    public final int e() {
        switch (this.f8135a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f8135a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f8137c.M;
            default:
                return 5;
        }
    }
}
