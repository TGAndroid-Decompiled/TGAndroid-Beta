package c2;

import a8.yb;
import f9.i0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
public final class k {
    public final i0 f5951a;
    public final ArrayList f5952b = new ArrayList();
    public ByteBuffer[] f5953c = new ByteBuffer[0];
    public boolean d;

    public k(i0 i0Var) {
        this.f5951a = i0Var;
        l lVar = l.e;
        this.d = false;
    }

    public final void a() {
        boolean z10;
        m mVar = m.f5957b;
        ArrayList arrayList = this.f5952b;
        arrayList.clear();
        this.d = false;
        long j10 = mVar.f5958a;
        int i10 = 0;
        while (true) {
            i0 i0Var = this.f5951a;
            if (i10 >= i0Var.size()) {
                break;
            }
            o oVar = (o) i0Var.get(i10);
            oVar.d(new m(j10));
            if (oVar.isActive()) {
                j10 = oVar.g(j10);
                if (j10 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yb.p(z10);
                arrayList.add(oVar);
            }
            i10++;
        }
        this.f5953c = new ByteBuffer[arrayList.size()];
        for (int i11 = 0; i11 <= b(); i11++) {
            this.f5953c[i11] = ((o) arrayList.get(i11)).a();
        }
    }

    public final int b() {
        return this.f5953c.length - 1;
    }

    public final boolean c() {
        if (this.d && ((o) this.f5952b.get(b())).c() && !this.f5953c[b()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        return !this.f5952b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z10;
        ByteBuffer byteBuffer2;
        boolean z11;
        for (boolean z12 = true; z12; z12 = z10) {
            z10 = false;
            for (int i10 = 0; i10 <= b(); i10++) {
                if (!this.f5953c[i10].hasRemaining()) {
                    ArrayList arrayList = this.f5952b;
                    o oVar = (o) arrayList.get(i10);
                    if (oVar.c()) {
                        if (!this.f5953c[i10].hasRemaining() && i10 < b()) {
                            ((o) arrayList.get(i10 + 1)).f();
                        }
                    } else {
                        if (i10 > 0) {
                            byteBuffer2 = this.f5953c[i10 - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = o.f5959a;
                        }
                        oVar.b(byteBuffer2);
                        this.f5953c[i10] = oVar.a();
                        if (byteBuffer2.remaining() - byteBuffer2.remaining() <= 0 && !this.f5953c[i10].hasRemaining()) {
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
        if (!(obj instanceof k)) {
            return false;
        }
        i0 i0Var = ((k) obj).f5951a;
        i0 i0Var2 = this.f5951a;
        if (i0Var2.size() != i0Var.size()) {
            return false;
        }
        for (int i10 = 0; i10 < i0Var2.size(); i10++) {
            if (i0Var2.get(i10) != i0Var.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f5951a.hashCode();
    }
}
