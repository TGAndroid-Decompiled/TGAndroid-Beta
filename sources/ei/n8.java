package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.u81;
public final class n8 extends u81 {
    public final int f9521a;
    public final Context f9522b;
    public final r9 f9523c;

    public n8(r9 r9Var, Context context, int i10) {
        this.f9521a = i10;
        this.f9523c = r9Var;
        this.f9522b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f9521a) {
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
        switch (this.f9521a) {
            case 0:
                return new k9(this.f9523c, this.f9522b);
            default:
                return new k9(this.f9523c, this.f9522b);
        }
    }

    @Override
    public final int e() {
        switch (this.f9521a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f9521a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f9523c.M;
            default:
                return 5;
        }
    }
}
