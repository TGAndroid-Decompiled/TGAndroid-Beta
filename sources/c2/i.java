package c2;

import e9.n0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import v7.t6;
public final class i {
    public final n0 f3544a;
    public final ArrayList f3545b = new ArrayList();
    public ByteBuffer[] f3546c = new ByteBuffer[0];
    public boolean d;

    public i(n0 n0Var) {
        this.f3544a = n0Var;
        j jVar = j.e;
        this.d = false;
    }

    public final void a() {
        boolean z10;
        k kVar = k.f3550b;
        ArrayList arrayList = this.f3545b;
        arrayList.clear();
        this.d = false;
        long j10 = kVar.f3551a;
        int i10 = 0;
        while (true) {
            n0 n0Var = this.f3544a;
            if (i10 >= n0Var.size()) {
                break;
            }
            m mVar = (m) n0Var.get(i10);
            mVar.d(new k(j10));
            if (mVar.isActive()) {
                j10 = mVar.g(j10);
                if (j10 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t6.p(z10);
                arrayList.add(mVar);
            }
            i10++;
        }
        this.f3546c = new ByteBuffer[arrayList.size()];
        for (int i11 = 0; i11 <= b(); i11++) {
            this.f3546c[i11] = ((m) arrayList.get(i11)).a();
        }
    }

    public final int b() {
        return this.f3546c.length - 1;
    }

    public final boolean c() {
        if (this.d && ((m) this.f3545b.get(b())).c() && !this.f3546c[b()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        return !this.f3545b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z10;
        ByteBuffer byteBuffer2;
        boolean z11;
        for (boolean z12 = true; z12; z12 = z10) {
            z10 = false;
            for (int i10 = 0; i10 <= b(); i10++) {
                if (!this.f3546c[i10].hasRemaining()) {
                    ArrayList arrayList = this.f3545b;
                    m mVar = (m) arrayList.get(i10);
                    if (mVar.c()) {
                        if (!this.f3546c[i10].hasRemaining() && i10 < b()) {
                            ((m) arrayList.get(i10 + 1)).f();
                        }
                    } else {
                        if (i10 > 0) {
                            byteBuffer2 = this.f3546c[i10 - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = m.f3552a;
                        }
                        mVar.b(byteBuffer2);
                        this.f3546c[i10] = mVar.a();
                        if (byteBuffer2.remaining() - byteBuffer2.remaining() <= 0 && !this.f3546c[i10].hasRemaining()) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        z10 |= z11;
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        n0 n0Var = ((i) obj).f3544a;
        n0 n0Var2 = this.f3544a;
        if (n0Var2.size() != n0Var.size()) {
            return false;
        }
        for (int i10 = 0; i10 < n0Var2.size(); i10++) {
            if (n0Var2.get(i10) != n0Var.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f3544a.hashCode();
    }
}
