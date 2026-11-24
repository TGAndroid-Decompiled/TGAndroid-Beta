package defpackage;

import java.util.List;
public final class j53 implements lcb {
    public static final c61 c = new c61(new o41((byte) 3), jk7.b);
    public final mo5 a;
    public final long[] b;

    public j53(defpackage.y79 r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j53.<init>(y79):void");
    }

    @Override
    public final int b(long j) {
        int b = hac.b(this.b, j, false);
        if (b < this.a.size()) {
            return b;
        }
        return -1;
    }

    @Override
    public final long k(int i) {
        boolean z;
        if (i < this.a.size()) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        return this.b[i];
    }

    @Override
    public final List p(long j) {
        int f = hac.f(this.b, j, false);
        if (f == -1) {
            ko5 ko5Var = mo5.b;
            return y79.e;
        }
        return (mo5) this.a.get(f);
    }

    @Override
    public final int q() {
        return this.a.size();
    }
}
