package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a81;
public final class c9 extends a81 {
    public final int f4433a;
    public final Context f4434b;
    public final ia f4435c;

    public c9(ia iaVar, Context context, int i10) {
        this.f4433a = i10;
        this.f4435c = iaVar;
        this.f4434b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f4433a) {
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
        switch (this.f4433a) {
            case 0:
                return new ba(this.f4435c, this.f4434b);
            default:
                return new ba(this.f4435c, this.f4434b);
        }
    }

    @Override
    public final int e() {
        switch (this.f4433a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f4433a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f4435c.M;
            default:
                return 5;
        }
    }
}
