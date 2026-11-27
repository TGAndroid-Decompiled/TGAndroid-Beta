package defpackage;

import java.util.ArrayList;
public final class hr6 implements Runnable {
    public final byte a;
    public final is6 b;
    public final ArrayList c;
    public final String d;

    public hr6(is6 is6Var, ArrayList arrayList, String str, byte b) {
        this.a = b;
        this.b = is6Var;
        this.c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.d;
        ArrayList arrayList = this.c;
        is6 is6Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new hr6(is6Var, arrayList, str, (byte) 2));
                return;
            case 1:
                is6Var.b(str, arrayList);
                return;
            default:
                is6Var.b(str, arrayList);
                return;
        }
    }
}
