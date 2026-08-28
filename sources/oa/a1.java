package oa;
public class a1 extends la.u {
    @Override
    public final Object read(ta.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        return Boolean.valueOf(aVar.v());
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        String bool;
        Boolean bool2 = (Boolean) obj;
        if (bool2 == null) {
            bool = "null";
        } else {
            bool = bool2.toString();
        }
        cVar.r(bool);
    }
}
