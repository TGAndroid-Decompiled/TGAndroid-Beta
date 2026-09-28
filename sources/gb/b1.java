package gb;
public class b1 extends db.u {
    @Override
    public final Object read(lb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            int p5 = aVar.p();
            if (p5 <= 255 && p5 >= -128) {
                return Byte.valueOf((byte) p5);
            }
            StringBuilder j3 = hg.c.j(p5, "Lossy conversion from ", " to byte; at path ");
            j3.append(aVar.j());
            throw new RuntimeException(j3.toString());
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
            bVar.o(number.byteValue());
        }
    }
}
