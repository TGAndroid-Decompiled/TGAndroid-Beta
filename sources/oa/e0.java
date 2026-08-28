package oa;
public class e0 extends la.u {
    @Override
    public final Object read(ta.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        return Double.valueOf(aVar.o());
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            cVar.i();
        } else {
            cVar.n(number.doubleValue());
        }
    }
}
