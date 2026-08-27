package lh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.g71;

public final class n8 extends g71 {

    public final int f16437a;

    public final Context f16438b;

    public final q9 f16439c;

    public n8(q9 q9Var, Context context, int i10) {
        this.f16437a = i10;
        this.f16439c = q9Var;
        this.f16438b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f16437a) {
            case 0:
                ((k9) view).b(i11);
                break;
            default:
                ((k9) view).b(i11);
                break;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f16437a) {
            case 0:
                break;
        }
        return new k9(this.f16439c, this.f16438b);
    }

    @Override
    public final int e() {
        switch (this.f16437a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f16437a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f16439c.I;
            default:
                return 5;
        }
    }
}
