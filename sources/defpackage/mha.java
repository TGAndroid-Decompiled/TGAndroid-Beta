package defpackage;

import android.content.Context;
public final class mha {
    public final int a;
    public final int b;
    public final lha c;
    public final kha d;
    public final nha e;

    public mha(nha nhaVar, Context context, int i) {
        this.e = nhaVar;
        this.b = i;
        int i2 = nhaVar.o2;
        nhaVar.o2 = i2 + 1;
        this.a = (i2 & 65535) | 65536;
        this.c = new lha(this, context, i);
        this.d = new kha(nhaVar, context, i, false);
    }
}
