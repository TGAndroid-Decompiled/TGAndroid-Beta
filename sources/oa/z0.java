package oa;
public class z0 extends la.u {
    @Override
    public final Object read(ta.a aVar) {
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
    public final void write(ta.c cVar, Object obj) {
        cVar.p((Boolean) obj);
    }
}
