package defpackage;

import android.content.Context;
public final class dja {
    public final int a;
    public final int b;
    public final cja c;
    public final bja d;
    public final eja e;

    public dja(eja ejaVar, Context context, int i) {
        this.e = ejaVar;
        this.b = i;
        int i2 = ejaVar.o2;
        ejaVar.o2 = i2 + 1;
        this.a = (i2 & 65535) | 65536;
        this.c = new cja(this, context, i);
        this.d = new bja(ejaVar, context, i, false);
    }
}
