package defpackage;

import android.content.Context;
import android.view.View;
public final class b5b extends oec {
    public final byte a;
    public final Context b;
    public final y5b c;

    public b5b(y5b y5bVar, Context context, byte b) {
        this.a = b;
        this.c = y5bVar;
        this.b = context;
    }

    @Override
    public final void b(View view, int i, int i2) {
        switch (this.a) {
            case 0:
                ((t5b) view).b(i2);
                return;
            default:
                ((t5b) view).b(i2);
                return;
        }
    }

    @Override
    public final View d(int i) {
        byte b = this.a;
        Context context = this.b;
        y5b y5bVar = this.c;
        switch (b) {
            case 0:
                return new t5b(y5bVar, context);
            default:
                return new t5b(y5bVar, context);
        }
    }

    @Override
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    return 0;
                }
                return this.c.G1;
            default:
                return 5;
        }
    }
}
