package defpackage;

import java.util.ArrayList;
public final class ar6 implements Runnable {
    public final byte a;
    public final es6 b;
    public final ArrayList c;
    public final String d;

    public ar6(es6 es6Var, ArrayList arrayList, String str, byte b) {
        this.a = b;
        this.b = es6Var;
        this.c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.d;
        ArrayList arrayList = this.c;
        es6 es6Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new ar6(es6Var, arrayList, str, (byte) 2));
                return;
            case 1:
                es6Var.f(str, arrayList);
                return;
            default:
                es6Var.f(str, arrayList);
                return;
        }
    }
}
