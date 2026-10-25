package ib;
public class g0 extends fb.u {
    @Override
    public final Object read(nb.a aVar) {
        int x9 = aVar.x();
        if (x9 == 9) {
            aVar.t();
            return null;
        } else if (x9 == 8) {
            return Boolean.toString(aVar.n());
        } else {
            return aVar.v();
        }
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        bVar.r((String) obj);
    }
}
