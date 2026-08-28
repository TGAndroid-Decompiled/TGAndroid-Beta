package oa;
public class d0 extends la.u {
    @Override
    public final Object read(ta.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        return Float.valueOf((float) aVar.o());
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            cVar.i();
            return;
        }
        if (!(number instanceof Float)) {
            number = Float.valueOf(number.floatValue());
        }
        cVar.q(number);
    }
}
