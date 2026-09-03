package l3;

import java.nio.ByteBuffer;
import java.util.ArrayList;
public final class k {
    public final s8.v f11270a;
    public final ArrayList f11271b = new ArrayList();
    public ByteBuffer[] f11272c = new ByteBuffer[0];
    public boolean d;

    public k(s8.v vVar) {
        this.f11270a = vVar;
        l lVar = l.e;
        this.d = false;
    }

    public final void a() {
        ArrayList arrayList = this.f11271b;
        arrayList.clear();
        this.d = false;
        int i10 = 0;
        while (true) {
            s8.v vVar = this.f11270a;
            if (i10 >= vVar.size()) {
                break;
            }
            n nVar = (n) vVar.get(i10);
            nVar.flush();
            if (nVar.isActive()) {
                arrayList.add(nVar);
            }
            i10++;
        }
        this.f11272c = new ByteBuffer[arrayList.size()];
        for (int i11 = 0; i11 <= b(); i11++) {
            this.f11272c[i11] = ((n) arrayList.get(i11)).a();
        }
    }

    public final int b() {
        return this.f11272c.length - 1;
    }

    public final boolean c() {
        if (this.d && ((n) this.f11271b.get(b())).d() && !this.f11272c[b()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        return !this.f11271b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z4;
        ByteBuffer byteBuffer2;
        boolean z10;
        for (boolean z11 = true; z11; z11 = z4) {
            z4 = false;
            for (int i10 = 0; i10 <= b(); i10++) {
                if (!this.f11272c[i10].hasRemaining()) {
                    ArrayList arrayList = this.f11271b;
                    n nVar = (n) arrayList.get(i10);
                    if (nVar.d()) {
                        if (!this.f11272c[i10].hasRemaining() && i10 < b()) {
                            ((n) arrayList.get(i10 + 1)).c();
                        }
                    } else {
                        if (i10 > 0) {
                            byteBuffer2 = this.f11272c[i10 - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = n.f11308a;
                        }
                        nVar.b(byteBuffer2);
                        this.f11272c[i10] = nVar.a();
                        if (byteBuffer2.remaining() - byteBuffer2.remaining() <= 0 && !this.f11272c[i10].hasRemaining()) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        z4 |= z10;
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
        s8.v vVar = ((k) obj).f11270a;
        s8.v vVar2 = this.f11270a;
        if (vVar2.size() != vVar.size()) {
            return false;
        }
        for (int i10 = 0; i10 < vVar2.size(); i10++) {
            if (vVar2.get(i10) != vVar.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f11270a.hashCode();
    }
}
