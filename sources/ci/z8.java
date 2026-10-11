package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.h91;
public final class z8 extends h91 {
    public final int f6425a;
    public final Context f6426b;
    public final fa f6427c;

    public z8(fa faVar, Context context, int i10) {
        this.f6425a = i10;
        this.f6427c = faVar;
        this.f6426b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f6425a) {
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
        switch (this.f6425a) {
            case 0:
                return new y9(this.f6427c, this.f6426b);
            default:
                return new y9(this.f6427c, this.f6426b);
        }
    }

    @Override
    public final int e() {
        switch (this.f6425a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f6425a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f6427c.M;
            default:
                return 5;
        }
    }
}
