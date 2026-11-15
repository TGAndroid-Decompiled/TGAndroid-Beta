package ai;

import java.util.ArrayList;
public final class v {
    public final y f1577a;
    public final s f1578b;
    public final String f1579c;
    public final q1 d;
    public volatile int[] f1582g;
    public int f1583i;
    public boolean f1584j;
    public volatile boolean f1585k;
    public volatile boolean f1586l;
    public volatile String f1588n;
    public n1 f1589o;
    public final StringBuilder f1580e = new StringBuilder();
    public final ArrayList f1581f = new ArrayList();
    public String h = "";
    public volatile int f1587m = -1;

    public v(y yVar, android.support.v4.media.session.a0 a0Var, q1 q1Var) {
        this.f1577a = yVar;
        this.f1578b = (s) a0Var.f1706b;
        this.f1579c = (String) a0Var.f1707c;
        this.d = q1Var;
    }

    public final void a(java.lang.String r13) {
        throw new UnsupportedOperationException("Method not decompiled: ai.v.a(java.lang.String):void");
    }

    public final void b(Runnable runnable) {
        String sb2 = this.f1580e.toString();
        String str = this.h;
        boolean z10 = this.f1584j;
        int i7 = this.f1583i;
        ArrayList arrayList = this.f1581f;
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        org.telegram.messenger.g0.h3(new u(this, iArr, sb2, str, z10, i7, runnable));
    }
}
