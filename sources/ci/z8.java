package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.n81;
public final class z8 extends n81 {
    public final int f5915a;
    public final Context f5916b;
    public final fa f5917c;

    public z8(fa faVar, Context context, int i10) {
        this.f5915a = i10;
        this.f5917c = faVar;
        this.f5916b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f5915a) {
            case 0:
                ((y9) view).b(i11);
                return;
            default:
                ((y9) view).b(i11);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f5915a) {
            case 0:
                return new y9(this.f5917c, this.f5916b);
            default:
                return new y9(this.f5917c, this.f5916b);
        }
    }

    @Override
    public final int e() {
        switch (this.f5915a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f5915a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f5917c.M;
            default:
                return 5;
        }
    }
}
