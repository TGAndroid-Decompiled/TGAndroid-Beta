package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a81;
public final class b9 extends a81 {
    public final int f6981a;
    public final Context f6982b;
    public final ia f6983c;

    public b9(ia iaVar, Context context, int i10) {
        this.f6981a = i10;
        this.f6983c = iaVar;
        this.f6982b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f6981a) {
            case 0:
                ((ba) view).b(i11);
                return;
            default:
                ((ba) view).b(i11);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f6981a) {
            case 0:
                return new ba(this.f6983c, this.f6982b);
            default:
                return new ba(this.f6983c, this.f6982b);
        }
    }

    @Override
    public final int e() {
        switch (this.f6981a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f6981a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f6983c.M;
            default:
                return 5;
        }
    }
}
