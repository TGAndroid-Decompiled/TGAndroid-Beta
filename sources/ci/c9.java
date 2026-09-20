package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.o81;
public final class c9 extends o81 {
    public final int f4437a;
    public final Context f4438b;
    public final ia f4439c;

    public c9(ia iaVar, Context context, int i10) {
        this.f4437a = i10;
        this.f4439c = iaVar;
        this.f4438b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f4437a) {
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
        switch (this.f4437a) {
            case 0:
                return new ba(this.f4439c, this.f4438b);
            default:
                return new ba(this.f4439c, this.f4438b);
        }
    }

    @Override
    public final int e() {
        switch (this.f4437a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f4437a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f4439c.M;
            default:
                return 5;
        }
    }
}
