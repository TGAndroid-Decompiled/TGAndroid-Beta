package c2;

import e9.n0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import v7.u6;
public final class j {
    public final n0 f4510a;
    public final ArrayList f4511b = new ArrayList();
    public ByteBuffer[] f4512c = new ByteBuffer[0];
    public boolean d;

    public j(n0 n0Var) {
        this.f4510a = n0Var;
        k kVar = k.e;
        this.d = false;
    }

    public final void a() {
        boolean z10;
        l lVar = l.f4516b;
        ArrayList arrayList = this.f4511b;
        arrayList.clear();
        this.d = false;
        long j10 = lVar.f4517a;
        int i10 = 0;
        while (true) {
            n0 n0Var = this.f4510a;
            if (i10 >= n0Var.size()) {
                break;
            }
            n nVar = (n) n0Var.get(i10);
            nVar.d(new l(j10));
            if (nVar.isActive()) {
                j10 = nVar.g(j10);
                if (j10 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u6.p(z10);
                arrayList.add(nVar);
            }
            i10++;
        }
        this.f4512c = new ByteBuffer[arrayList.size()];
        for (int i11 = 0; i11 <= b(); i11++) {
            this.f4512c[i11] = ((n) arrayList.get(i11)).a();
        }
    }

    public final int b() {
        return this.f4512c.length - 1;
    }

    public final boolean c() {
        if (this.d && ((n) this.f4511b.get(b())).b() && !this.f4512c[b()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        return !this.f4511b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z10;
        ByteBuffer byteBuffer2;
        boolean z11;
        for (boolean z12 = true; z12; z12 = z10) {
            z10 = false;
            for (int i10 = 0; i10 <= b(); i10++) {
                if (!this.f4512c[i10].hasRemaining()) {
                    ArrayList arrayList = this.f4511b;
                    n nVar = (n) arrayList.get(i10);
                    if (nVar.b()) {
                        if (!this.f4512c[i10].hasRemaining() && i10 < b()) {
                            ((n) arrayList.get(i10 + 1)).f();
                        }
                    } else {
                        if (i10 > 0) {
                            byteBuffer2 = this.f4512c[i10 - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = n.f4518a;
                        }
                        nVar.c(byteBuffer2);
                        this.f4512c[i10] = nVar.a();
                        if (byteBuffer2.remaining() - byteBuffer2.remaining() <= 0 && !this.f4512c[i10].hasRemaining()) {
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
        if (!(obj instanceof j)) {
            return false;
        }
        n0 n0Var = ((j) obj).f4510a;
        n0 n0Var2 = this.f4510a;
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
        return this.f4510a.hashCode();
    }
}
