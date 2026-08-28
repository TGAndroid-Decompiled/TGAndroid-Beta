package oa;
public class b1 extends la.u {
    @Override
    public final Object read(ta.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            int p6 = aVar.p();
            if (p6 <= 255 && p6 >= -128) {
                return Byte.valueOf((byte) p6);
            }
            StringBuilder p9 = j3.r0.p(p6, "Lossy conversion from ", " to byte; at path ");
            p9.append(aVar.j());
            throw new RuntimeException(p9.toString());
        } catch (NumberFormatException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            cVar.i();
        } else {
            cVar.o(number.byteValue());
        }
    }
}
