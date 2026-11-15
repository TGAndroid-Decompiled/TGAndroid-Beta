package f2;

import a8.ja;
import h9.i0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
public final class i {
    public final i0 f10726a;
    public final ArrayList f10727b = new ArrayList();
    public ByteBuffer[] f10728c = new ByteBuffer[0];
    public boolean d;

    public i(i0 i0Var) {
        this.f10726a = i0Var;
        j jVar = j.f10729e;
        this.d = false;
    }

    public final void a() {
        boolean z10;
        k kVar = k.f10733b;
        ArrayList arrayList = this.f10727b;
        arrayList.clear();
        this.d = false;
        long j3 = kVar.f10734a;
        int i7 = 0;
        while (true) {
            i0 i0Var = this.f10726a;
            if (i7 >= i0Var.size()) {
                break;
            }
            m mVar = (m) i0Var.get(i7);
            mVar.d(new k(j3));
            if (mVar.isActive()) {
                j3 = mVar.g(j3);
                if (j3 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ja.p(z10);
                arrayList.add(mVar);
            }
            i7++;
        }
        this.f10728c = new ByteBuffer[arrayList.size()];
        for (int i10 = 0; i10 <= b(); i10++) {
            this.f10728c[i10] = ((m) arrayList.get(i10)).b();
        }
    }

    public final int b() {
        return this.f10728c.length - 1;
    }

    public final boolean c() {
        if (this.d && ((m) this.f10727b.get(b())).a() && !this.f10728c[b()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        return !this.f10727b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z10;
        ByteBuffer byteBuffer2;
        boolean z11;
        for (boolean z12 = true; z12; z12 = z10) {
            z10 = false;
            for (int i7 = 0; i7 <= b(); i7++) {
                if (!this.f10728c[i7].hasRemaining()) {
                    ArrayList arrayList = this.f10727b;
                    m mVar = (m) arrayList.get(i7);
                    if (mVar.a()) {
                        if (!this.f10728c[i7].hasRemaining() && i7 < b()) {
                            ((m) arrayList.get(i7 + 1)).f();
                        }
                    } else {
                        if (i7 > 0) {
                            byteBuffer2 = this.f10728c[i7 - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = m.f10735a;
                        }
                        mVar.c(byteBuffer2);
                        this.f10728c[i7] = mVar.b();
                        if (byteBuffer2.remaining() - byteBuffer2.remaining() <= 0 && !this.f10728c[i7].hasRemaining()) {
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
        i0 i0Var = ((i) obj).f10726a;
        i0 i0Var2 = this.f10726a;
        if (i0Var2.size() != i0Var.size()) {
            return false;
        }
        for (int i7 = 0; i7 < i0Var2.size(); i7++) {
            if (i0Var2.get(i7) != i0Var.get(i7)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f10726a.hashCode();
    }
}
