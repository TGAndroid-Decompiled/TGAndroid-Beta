package oa;
public class c0 extends la.u {
    @Override
    public final Object read(ta.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            return Long.valueOf(aVar.q());
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
            cVar.o(number.longValue());
        }
    }
}
