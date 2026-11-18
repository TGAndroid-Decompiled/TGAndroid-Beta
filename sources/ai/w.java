package ai;

import java.util.ArrayList;
public final class w {
    public final z f1570a;
    public final t f1571b;
    public final String f1572c;
    public final r1 d;
    public volatile int[] f1575g;
    public int f1576i;
    public boolean f1577j;
    public volatile boolean f1578k;
    public volatile boolean f1579l;
    public volatile String f1581n;
    public o1 f1582o;
    public final StringBuilder f1573e = new StringBuilder();
    public final ArrayList f1574f = new ArrayList();
    public String h = "";
    public volatile int f1580m = -1;

    public w(z zVar, android.support.v4.media.session.a0 a0Var, r1 r1Var) {
        this.f1570a = zVar;
        this.f1571b = (t) a0Var.f1705b;
        this.f1572c = (String) a0Var.f1706c;
        this.d = r1Var;
    }

    public final void a(java.lang.String r13) {
        throw new UnsupportedOperationException("Method not decompiled: ai.w.a(java.lang.String):void");
    }

    public final void b(Runnable runnable) {
        String sb2 = this.f1573e.toString();
        String str = this.h;
        boolean z10 = this.f1577j;
        int i7 = this.f1576i;
        ArrayList arrayList = this.f1574f;
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        org.telegram.messenger.g0.g3(new v(this, iArr, sb2, str, z10, i7, runnable));
    }
}
