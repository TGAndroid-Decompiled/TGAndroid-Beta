package ib;
public class z0 extends fb.u {
    @Override
    public final Object read(nb.a aVar) {
        int x9 = aVar.x();
        if (x9 == 9) {
            aVar.t();
            return null;
        } else if (x9 == 6) {
            return Boolean.valueOf(Boolean.parseBoolean(aVar.v()));
        } else {
            return Boolean.valueOf(aVar.n());
        }
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        bVar.p((Boolean) obj);
    }
}
