package oa;
public class g0 extends la.u {
    @Override
    public final Object read(ta.a aVar) {
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
    public final void write(ta.c cVar, Object obj) {
        cVar.r((String) obj);
    }
}
