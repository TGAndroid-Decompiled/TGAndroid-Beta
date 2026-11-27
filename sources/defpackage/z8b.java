package defpackage;

import android.content.Context;
import android.view.View;
public final class z8b extends nic {
    public final byte a;
    public final Context b;
    public final w9b c;

    public z8b(w9b w9bVar, Context context, byte b) {
        this.a = b;
        this.c = w9bVar;
        this.b = context;
    }

    @Override
    public final void b(View view, int i, int i2) {
        switch (this.a) {
            case 0:
                ((r9b) view).b(i2);
                return;
            default:
                ((r9b) view).b(i2);
                return;
        }
    }

    @Override
    public final View d(int i) {
        byte b = this.a;
        Context context = this.b;
        w9b w9bVar = this.c;
        switch (b) {
            case 0:
                return new r9b(w9bVar, context);
            default:
                return new r9b(w9bVar, context);
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
