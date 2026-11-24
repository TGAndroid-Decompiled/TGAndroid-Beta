package defpackage;

import android.content.Context;
public final class v9d implements Runnable {
    public final byte a;
    public final rad b;

    public v9d(rad radVar, byte b) {
        this.a = b;
        this.b = radVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        rad radVar = this.b;
        switch (b) {
            case 0:
                v8b v8bVar = radVar.e;
                gu6 gu6Var = (gu6) v8bVar.c;
                if (gu6Var == null) {
                    gu6Var = gu6.d((Context) v8bVar.b);
                    v8bVar.c = gu6Var;
                }
                gu6Var.h(radVar);
                return;
            default:
                radVar.n();
                return;
        }
    }
}
