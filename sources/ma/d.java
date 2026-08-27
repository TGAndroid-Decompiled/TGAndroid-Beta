package ma;

import java.io.IOException;

public final class d extends u {

    public final int f17897a;

    @Override
    public final Object read(ua.a aVar) throws IOException {
        switch (this.f17897a) {
            case 0:
                if (aVar.x() != 9) {
                    return Double.valueOf(aVar.o());
                }
                aVar.t();
                return null;
            case 1:
                if (aVar.x() != 9) {
                    return Float.valueOf((float) aVar.o());
                }
                aVar.t();
                return null;
            default:
                aVar.C();
                return null;
        }
    }

    public String toString() {
        switch (this.f17897a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }

    @Override
    public final void write(ua.b bVar, Object obj) throws IOException {
        switch (this.f17897a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    g.a(dDoubleValue);
                    bVar.n(dDoubleValue);
                } else {
                    bVar.i();
                }
                break;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    g.a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    bVar.q(numberValueOf);
                } else {
                    bVar.i();
                }
                break;
            default:
                bVar.i();
                break;
        }
    }
}
