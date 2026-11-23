package ai;

import java.util.ArrayList;
public final class s {
    public final u f1511a;
    public final p f1512b;
    public final String f1513c;
    public final n1 d;
    public volatile int[] f1516g;
    public int f1517i;
    public boolean f1518j;
    public volatile boolean f1519k;
    public volatile boolean f1520l;
    public volatile String f1522n;
    public j1 f1523o;
    public final StringBuilder f1514e = new StringBuilder();
    public final ArrayList f1515f = new ArrayList();
    public String h = "";
    public volatile int f1521m = -1;

    public s(u uVar, android.support.v4.media.session.a0 a0Var, n1 n1Var) {
        this.f1511a = uVar;
        this.f1512b = (p) a0Var.f1675b;
        this.f1513c = (String) a0Var.f1676c;
        this.d = n1Var;
    }

    public final void a(java.lang.String r13) {
        throw new UnsupportedOperationException("Method not decompiled: ai.s.a(java.lang.String):void");
    }

    public final void b(Runnable runnable) {
        String sb2 = this.f1514e.toString();
        String str = this.h;
        boolean z10 = this.f1518j;
        int i7 = this.f1517i;
        ArrayList arrayList = this.f1515f;
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        org.telegram.messenger.g0.g3(new r(this, iArr, sb2, str, z10, i7, runnable));
    }
}
