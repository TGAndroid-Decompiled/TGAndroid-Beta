package defpackage;

import java.util.ArrayList;
public final class jn3 {
    public final ln3 a;
    public final gn3 b;
    public final String c;
    public final yg d;
    public volatile int[] g;
    public int i;
    public boolean j;
    public volatile boolean k;
    public volatile boolean l;
    public volatile String n;
    public mo3 o;
    public final StringBuilder e = new StringBuilder();
    public final ArrayList f = new ArrayList();
    public String h = "";
    public volatile int m = -1;

    public jn3(ln3 ln3Var, in3 in3Var, yg ygVar) {
        this.a = ln3Var;
        this.b = (gn3) in3Var.b;
        this.c = (String) in3Var.c;
        this.d = ygVar;
    }

    public final void a(java.lang.String r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jn3.a(java.lang.String):void");
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
        gm.c3(new gu(this, iArr, sb, str, z, i, runnable));
    }
}
