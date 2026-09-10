package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.n81;
public final class ea extends n81 {
    public final int f2667a;
    public final Context f2668b;
    public final rb f2669c;

    public ea(rb rbVar, Context context, int i10) {
        this.f2667a = i10;
        this.f2669c = rbVar;
        this.f2668b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f2667a) {
            case 0:
                ((kb) view).b(i11);
                return;
            default:
                ((kb) view).b(i11);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f2667a) {
            case 0:
                return new kb(this.f2669c, this.f2668b);
            default:
                return new kb(this.f2669c, this.f2668b);
        }
    }

    @Override
    public final int e() {
        switch (this.f2667a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f2667a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f2669c.M;
            default:
                return 5;
        }
    }
}
