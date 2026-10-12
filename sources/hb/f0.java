package hb;
public class f0 extends eb.u {
    @Override
    public final Object read(mb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        if (v.length() == 1) {
            return Character.valueOf(v.charAt(0));
        }
        StringBuilder v10 = a1.g.v("Expecting character, got: ", v, "; at ");
        v10.append(aVar.j());
        throw new RuntimeException(v10.toString());
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
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
