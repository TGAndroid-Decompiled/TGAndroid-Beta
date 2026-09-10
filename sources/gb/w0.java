package gb;

import java.util.BitSet;
public class w0 extends db.u {
    @Override
    public final Object read(lb.a aVar) {
        boolean z10;
        BitSet bitSet = new BitSet();
        aVar.a();
        int x10 = aVar.x();
        int i10 = 0;
        while (x10 != 2) {
            int c10 = m1.j.c(x10);
            if (c10 != 5 && c10 != 6) {
                if (c10 == 7) {
                    z10 = aVar.n();
                } else {
                    throw new RuntimeException("Invalid bitset value type: " + hc.b.E(x10) + "; at path " + aVar.h());
                }
            } else {
                int p5 = aVar.p();
                if (p5 == 0) {
                    z10 = false;
                } else if (p5 == 1) {
                    z10 = true;
                } else {
                    StringBuilder m10 = hc.b.m(p5, "Invalid bitset value ", ", expected 0 or 1; at path ");
                    m10.append(aVar.j());
                    throw new RuntimeException(m10.toString());
                }
            }
            if (z10) {
                bitSet.set(i10);
            }
            i10++;
            x10 = aVar.x();
        }
        aVar.e();
        return bitSet;
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        bVar.b();
        int length = bitSet.length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.o(bitSet.get(i10) ? 1L : 0L);
        }
        bVar.e();
    }
}
