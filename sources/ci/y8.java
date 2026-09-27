package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.p81;
public final class y8 extends p81 {
    public final int f5889a;
    public final Context f5890b;
    public final ea f5891c;

    public y8(ea eaVar, Context context, int i10) {
        this.f5889a = i10;
        this.f5891c = eaVar;
        this.f5890b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f5889a) {
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
        switch (this.f5889a) {
            case 0:
                return new x9(this.f5891c, this.f5890b);
            default:
                return new x9(this.f5891c, this.f5890b);
        }
    }

    @Override
    public final int e() {
        switch (this.f5889a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f5889a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f5891c.M;
            default:
                return 5;
        }
    }
}
