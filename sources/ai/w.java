package ai;

import java.util.ArrayList;
public final class w {
    public final z f1587a;
    public final t f1588b;
    public final String f1589c;
    public final u1 d;
    public volatile int[] f1592g;
    public int f1593i;
    public boolean f1594j;
    public volatile boolean f1595k;
    public volatile boolean f1596l;
    public volatile String f1598n;
    public r1 f1599o;
    public final StringBuilder f1590e = new StringBuilder();
    public final ArrayList f1591f = new ArrayList();
    public String h = "";
    public volatile int f1597m = -1;

    public w(z zVar, android.support.v4.media.session.a0 a0Var, u1 u1Var) {
        this.f1587a = zVar;
        this.f1588b = (t) a0Var.f1724b;
        this.f1589c = (String) a0Var.f1725c;
        this.d = u1Var;
    }

    public final void a(java.lang.String r13) {
        throw new UnsupportedOperationException("Method not decompiled: ai.w.a(java.lang.String):void");
    }

    public final void b(Runnable runnable) {
        String sb2 = this.f1590e.toString();
        String str = this.h;
        boolean z10 = this.f1594j;
        int i7 = this.f1593i;
        ArrayList arrayList = this.f1591f;
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        org.telegram.messenger.g0.g3(new v(this, iArr, sb2, str, z10, i7, runnable));
    }
}
