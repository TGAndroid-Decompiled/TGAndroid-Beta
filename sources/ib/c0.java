package ib;
public class c0 extends fb.u {
    @Override
    public final Object read(nb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            return Long.valueOf(aVar.q());
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
            bVar.o(number.longValue());
        }
    }
}
