package gb;
public class c1 extends db.u {
    @Override
    public final Object read(lb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            int p5 = aVar.p();
            if (p5 <= 65535 && p5 >= -32768) {
                return Short.valueOf((short) p5);
            }
            StringBuilder k10 = hg.k0.k(p5, "Lossy conversion from ", " to short; at path ");
            k10.append(aVar.j());
            throw new RuntimeException(k10.toString());
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.i();
        } else {
            bVar.o(number.shortValue());
        }
    }
}
