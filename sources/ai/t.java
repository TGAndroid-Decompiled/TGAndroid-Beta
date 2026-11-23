package ai;

import java.util.ArrayList;
public final class t {
    public final v f1523a;
    public final q f1524b;
    public final String f1525c;
    public final o1 d;
    public volatile int[] f1528g;
    public int f1529i;
    public boolean f1530j;
    public volatile boolean f1531k;
    public volatile boolean f1532l;
    public volatile String f1534n;
    public k1 f1535o;
    public final StringBuilder f1526e = new StringBuilder();
    public final ArrayList f1527f = new ArrayList();
    public String h = "";
    public volatile int f1533m = -1;

    public t(v vVar, android.support.v4.media.session.a0 a0Var, o1 o1Var) {
        this.f1523a = vVar;
        this.f1524b = (q) a0Var.f1676b;
        this.f1525c = (String) a0Var.f1677c;
        this.d = o1Var;
    }

    public final void a(java.lang.String r13) {
        throw new UnsupportedOperationException("Method not decompiled: ai.t.a(java.lang.String):void");
    }

    public final void b(Runnable runnable) {
        String sb2 = this.f1526e.toString();
        String str = this.h;
        boolean z10 = this.f1530j;
        int i7 = this.f1529i;
        ArrayList arrayList = this.f1527f;
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        org.telegram.messenger.g0.g3(new s(this, iArr, sb2, str, z10, i7, runnable));
    }
}
