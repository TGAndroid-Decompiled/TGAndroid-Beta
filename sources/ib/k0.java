package ib;
public class k0 extends fb.u {
    @Override
    public final Object read(nb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        return new StringBuilder(aVar.v());
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        String sb2;
        StringBuilder sb3 = (StringBuilder) obj;
        if (sb3 == null) {
            sb2 = null;
        } else {
            sb2 = sb3.toString();
        }
        bVar.r(sb2);
    }
}
