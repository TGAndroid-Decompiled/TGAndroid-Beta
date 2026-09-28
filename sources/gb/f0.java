package gb;
public class f0 extends db.u {
    @Override
    public final Object read(lb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        if (v.length() == 1) {
            return Character.valueOf(v.charAt(0));
        }
        StringBuilder w10 = a4.a.w("Expecting character, got: ", v, "; at ");
        w10.append(aVar.j());
        throw new RuntimeException(w10.toString());
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        String valueOf;
        Character ch2 = (Character) obj;
        if (ch2 == null) {
            valueOf = null;
        } else {
            valueOf = String.valueOf(ch2);
        }
        bVar.r(valueOf);
    }
}
