package oa;
public class f0 extends la.u {
    @Override
    public final Object read(ta.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        if (v.length() == 1) {
            return Character.valueOf(v.charAt(0));
        }
        StringBuilder t10 = aa.d.t("Expecting character, got: ", v, "; at ");
        t10.append(aVar.j());
        throw new RuntimeException(t10.toString());
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        String valueOf;
        Character ch2 = (Character) obj;
        if (ch2 == null) {
            valueOf = null;
        } else {
            valueOf = String.valueOf(ch2);
        }
        cVar.r(valueOf);
    }
}
