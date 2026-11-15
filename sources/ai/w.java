package ai;

import java.util.ArrayList;
public final class w {
    public final z f1578a;
    public final t f1579b;
    public final String f1580c;
    public final r1 d;
    public volatile int[] f1583g;
    public int f1584i;
    public boolean f1585j;
    public volatile boolean f1586k;
    public volatile boolean f1587l;
    public volatile String f1589n;
    public o1 f1590o;
    public final StringBuilder f1581e = new StringBuilder();
    public final ArrayList f1582f = new ArrayList();
    public String h = "";
    public volatile int f1588m = -1;

    public w(z zVar, android.support.v4.media.session.a0 a0Var, r1 r1Var) {
        this.f1578a = zVar;
        this.f1579b = (t) a0Var.f1713b;
        this.f1580c = (String) a0Var.f1714c;
        this.d = r1Var;
    }

    public final void a(java.lang.String r13) {
        throw new UnsupportedOperationException("Method not decompiled: ai.w.a(java.lang.String):void");
    }

    public final void b(Runnable runnable) {
        String sb2 = this.f1581e.toString();
        String str = this.h;
        boolean z10 = this.f1585j;
        int i7 = this.f1584i;
        ArrayList arrayList = this.f1582f;
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        org.telegram.messenger.g0.h3(new v(this, iArr, sb2, str, z10, i7, runnable));
    }
}
