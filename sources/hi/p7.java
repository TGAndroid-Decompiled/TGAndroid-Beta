package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.n61;
public final class p7 extends n61 {
    public final int f14867a;
    public final Context f14868b;
    public final q8 f14869c;

    public p7(q8 q8Var, Context context, int i7) {
        this.f14867a = i7;
        this.f14869c = q8Var;
        this.f14868b = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        switch (this.f14867a) {
            case 0:
                ((l8) view).b(i10);
                return;
            default:
                ((l8) view).b(i10);
                return;
        }
    }

    @Override
    public final View d(int i7) {
        switch (this.f14867a) {
            case 0:
                return new l8(this.f14869c, this.f14868b);
            default:
                return new l8(this.f14869c, this.f14868b);
        }
    }

    @Override
    public final int e() {
        switch (this.f14867a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f14867a) {
            case 0:
                if (i7 == 0) {
                    return 0;
                }
                return this.f14869c.H1;
            default:
                return 5;
        }
    }
}
