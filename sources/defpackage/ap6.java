package defpackage;

import java.util.ArrayList;
public final class ap6 implements Runnable {
    public final byte a;
    public final eq6 b;
    public final ArrayList c;
    public final String d;

    public ap6(eq6 eq6Var, ArrayList arrayList, String str, byte b) {
        this.a = b;
        this.b = eq6Var;
        this.c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.d;
        ArrayList arrayList = this.c;
        eq6 eq6Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new ap6(eq6Var, arrayList, str, (byte) 2));
                return;
            case 1:
                eq6Var.f(str, arrayList);
                return;
            default:
                eq6Var.f(str, arrayList);
                return;
        }
    }
}
