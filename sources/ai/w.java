package ai;

import java.util.ArrayList;
public final class w {
    public final z f1576a;
    public final t f1577b;
    public final String f1578c;
    public final t1 d;
    public volatile int[] f1581g;
    public int f1582i;
    public boolean f1583j;
    public volatile boolean f1584k;
    public volatile boolean f1585l;
    public volatile String f1587n;
    public q1 f1588o;
    public final StringBuilder f1579e = new StringBuilder();
    public final ArrayList f1580f = new ArrayList();
    public String h = "";
    public volatile int f1586m = -1;

    public w(z zVar, android.support.v4.media.session.a0 a0Var, t1 t1Var) {
        this.f1576a = zVar;
        this.f1577b = (t) a0Var.f1717b;
        this.f1578c = (String) a0Var.f1718c;
        this.d = t1Var;
    }

    public final void a(java.lang.String r13) {
        throw new UnsupportedOperationException("Method not decompiled: ai.w.a(java.lang.String):void");
    }

    public final void b(Runnable runnable) {
        String sb2 = this.f1579e.toString();
        String str = this.h;
        boolean z10 = this.f1583j;
        int i7 = this.f1582i;
        ArrayList arrayList = this.f1580f;
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        org.telegram.messenger.g0.g3(new v(this, iArr, sb2, str, z10, i7, runnable));
    }
}
