package gb;
public class e0 extends db.u {
    @Override
    public final Object read(lb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        return Double.valueOf(aVar.o());
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.i();
        } else {
            bVar.n(number.doubleValue());
        }
    }
}
