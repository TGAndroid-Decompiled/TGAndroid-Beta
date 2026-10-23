package hb;

import i2.o1;
public class b1 extends eb.u {
    @Override
    public final Object read(mb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            int p5 = aVar.p();
            if (p5 <= 255 && p5 >= -128) {
                return Byte.valueOf((byte) p5);
            }
            StringBuilder n10 = o1.n(p5, "Lossy conversion from ", " to byte; at path ");
            n10.append(aVar.j());
            throw new RuntimeException(n10.toString());
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.i();
        } else {
            bVar.o(number.byteValue());
        }
    }
}
