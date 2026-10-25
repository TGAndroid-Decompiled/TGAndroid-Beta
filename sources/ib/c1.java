package ib;
public class c1 extends fb.u {
    @Override
    public final Object read(nb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            int p10 = aVar.p();
            if (p10 <= 65535 && p10 >= -32768) {
                return Short.valueOf((short) p10);
            }
            StringBuilder k10 = ic.a.k(p10, "Lossy conversion from ", " to short; at path ");
            k10.append(aVar.j());
            throw new RuntimeException(k10.toString());
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.i();
        } else {
            bVar.o(number.shortValue());
        }
    }
}
