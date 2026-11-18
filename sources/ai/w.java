package ai;

import java.util.ArrayList;
public final class w {
    public final z f1569a;
    public final t f1570b;
    public final String f1571c;
    public final r1 d;
    public volatile int[] f1574g;
    public int f1575i;
    public boolean f1576j;
    public volatile boolean f1577k;
    public volatile boolean f1578l;
    public volatile String f1580n;
    public o1 f1581o;
    public final StringBuilder f1572e = new StringBuilder();
    public final ArrayList f1573f = new ArrayList();
    public String h = "";
    public volatile int f1579m = -1;

    public w(z zVar, android.support.v4.media.session.a0 a0Var, r1 r1Var) {
        this.f1569a = zVar;
        this.f1570b = (t) a0Var.f1704b;
        this.f1571c = (String) a0Var.f1705c;
        this.d = r1Var;
    }

    public final void a(java.lang.String r13) {
        throw new UnsupportedOperationException("Method not decompiled: ai.w.a(java.lang.String):void");
    }

    public final void b(Runnable runnable) {
        String sb2 = this.f1572e.toString();
        String str = this.h;
        boolean z10 = this.f1576j;
        int i7 = this.f1575i;
        ArrayList arrayList = this.f1573f;
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        org.telegram.messenger.g0.g3(new v(this, iArr, sb2, str, z10, i7, runnable));
    }
}
