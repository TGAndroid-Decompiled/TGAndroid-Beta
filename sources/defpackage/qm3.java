package defpackage;

import java.util.ArrayList;
public final class qm3 {
    public final sm3 a;
    public final nm3 b;
    public final String c;
    public final bf d;
    public volatile int[] g;
    public int i;
    public boolean j;
    public volatile boolean k;
    public volatile boolean l;
    public volatile String n;
    public tn3 o;
    public final StringBuilder e = new StringBuilder();
    public final ArrayList f = new ArrayList();
    public String h = "";
    public volatile int m = -1;

    public qm3(sm3 sm3Var, pm3 pm3Var, bf bfVar) {
        this.a = sm3Var;
        this.b = (nm3) pm3Var.b;
        this.c = (String) pm3Var.c;
        this.d = bfVar;
    }

    public final void a(java.lang.String r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm3.a(java.lang.String):void");
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
        hl.c3(new et(this, iArr, sb, str, z, i, runnable));
    }
}
