package gb;
public class z0 extends db.u {
    @Override
    public final Object read(lb.a aVar) {
        int x10 = aVar.x();
        if (x10 == 9) {
            aVar.t();
            return null;
        } else if (x10 == 6) {
            return Boolean.valueOf(Boolean.parseBoolean(aVar.v()));
        } else {
            return Boolean.valueOf(aVar.n());
        }
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        bVar.p((Boolean) obj);
    }
}
