package defpackage;

import java.util.ArrayList;
public final class yl3 {
    public final am3 a;
    public final vl3 b;
    public final String c;
    public final yf d;
    public volatile int[] g;
    public int i;
    public boolean j;
    public volatile boolean k;
    public volatile boolean l;
    public volatile String n;
    public cn3 o;
    public final StringBuilder e = new StringBuilder();
    public final ArrayList f = new ArrayList();
    public String h = "";
    public volatile int m = -1;

    public yl3(am3 am3Var, xl3 xl3Var, yf yfVar) {
        this.a = am3Var;
        this.b = (vl3) xl3Var.b;
        this.c = (String) xl3Var.c;
        this.d = yfVar;
    }

    public final void a(java.lang.String r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl3.a(java.lang.String):void");
    }

    public final void b(Runnable runnable) {
        String sb = this.e.toString();
        String str = this.h;
        boolean z = this.j;
        int i = this.i;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        gl.c3(new ft(this, iArr, sb, str, z, i, runnable));
    }
}
