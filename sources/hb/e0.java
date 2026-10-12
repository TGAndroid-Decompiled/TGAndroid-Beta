package hb;
public class e0 extends eb.u {
    @Override
    public final Object read(mb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        return Double.valueOf(aVar.o());
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.i();
        } else {
            bVar.n(number.doubleValue());
        }
    }
}
