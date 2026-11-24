package defpackage;

import android.content.Context;
import android.view.View;
public final class c7b extends ogc {
    public final byte a;
    public final Context b;
    public final a8b c;

    public c7b(a8b a8bVar, Context context, byte b) {
        this.a = b;
        this.c = a8bVar;
        this.b = context;
    }

    @Override
    public final void b(View view, int i, int i2) {
        switch (this.a) {
            case 0:
                ((v7b) view).b(i2);
                return;
            default:
                ((v7b) view).b(i2);
                return;
        }
    }

    @Override
    public final View d(int i) {
        byte b = this.a;
        Context context = this.b;
        a8b a8bVar = this.c;
        switch (b) {
            case 0:
                return new v7b(a8bVar, context);
            default:
                return new v7b(a8bVar, context);
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
