package gb;
public class g0 extends db.u {
    @Override
    public final Object read(lb.a aVar) {
        int x10 = aVar.x();
        if (x10 == 9) {
            aVar.t();
            return null;
        } else if (x10 == 8) {
            return Boolean.toString(aVar.n());
        } else {
            return aVar.v();
        }
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        bVar.r((String) obj);
    }
}
