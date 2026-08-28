package la;
public final class d extends u {
    public final int f16713a;

    @Override
    public final Object read(ta.a aVar) {
        switch (this.f16713a) {
            case 0:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                return Double.valueOf(aVar.o());
            case 1:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                return Float.valueOf((float) aVar.o());
            default:
                aVar.C();
                return null;
        }
    }

    public String toString() {
        switch (this.f16713a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        switch (this.f16713a) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    cVar.i();
                    return;
                }
                double doubleValue = number.doubleValue();
                g.a(doubleValue);
                cVar.n(doubleValue);
                return;
            case 1:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    cVar.i();
                    return;
                }
                float floatValue = number2.floatValue();
                g.a(floatValue);
                if (!(number2 instanceof Float)) {
                    number2 = Float.valueOf(floatValue);
                }
                cVar.q(number2);
                return;
            default:
                cVar.i();
                return;
        }
    }
}
