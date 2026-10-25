package ib;

import java.util.BitSet;
public class w0 extends fb.u {
    @Override
    public final Object read(nb.a aVar) {
        boolean z10;
        BitSet bitSet = new BitSet();
        aVar.a();
        int x9 = aVar.x();
        int i10 = 0;
        while (x9 != 2) {
            int c10 = m1.j.c(x9);
            if (c10 != 5 && c10 != 6) {
                if (c10 == 7) {
                    z10 = aVar.n();
                } else {
                    throw new RuntimeException("Invalid bitset value type: " + ic.a.C(x9) + "; at path " + aVar.h());
                }
            } else {
                int p10 = aVar.p();
                if (p10 == 0) {
                    z10 = false;
                } else if (p10 == 1) {
                    z10 = true;
                } else {
                    StringBuilder k10 = ic.a.k(p10, "Invalid bitset value ", ", expected 0 or 1; at path ");
                    k10.append(aVar.j());
                    throw new RuntimeException(k10.toString());
                }
            }
            if (z10) {
                bitSet.set(i10);
            }
            i10++;
            x9 = aVar.x();
        }
        aVar.e();
        return bitSet;
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        bVar.b();
        int length = bitSet.length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.o(bitSet.get(i10) ? 1L : 0L);
        }
        bVar.e();
    }
}
