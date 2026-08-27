package ma;

public abstract class t {

    public static final p f17913a;

    public static final q f17914b;

    public static final t[] f17915c;

    static {
        p pVar = new p();
        f17913a = pVar;
        q qVar = new q();
        f17914b = qVar;
        f17915c = new t[]{pVar, qVar, new t() {
            public static Double b(String str, ua.a aVar) throws ua.c {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (!dValueOf.isInfinite() && !dValueOf.isNaN()) {
                        return dValueOf;
                    }
                    throw new ua.c("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.j());
                } catch (NumberFormatException e9) {
                    StringBuilder sbR = a9.p.r("Cannot parse ", str, "; at path ");
                    sbR.append(aVar.j());
                    throw new a7.c(sbR.toString(), e9);
                }
            }

            @Override
            public final Number a(ua.a aVar) {
                String strV = aVar.v();
                if (strV.indexOf(46) >= 0) {
                    return b(strV, aVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(strV));
                } catch (NumberFormatException unused) {
                    return b(strV, aVar);
                }
            }
        }, new t() {
            @Override
            public final Number a(ua.a aVar) {
                String strV = aVar.v();
                try {
                    return oa.d.i(strV);
                } catch (NumberFormatException e9) {
                    StringBuilder sbR = a9.p.r("Cannot parse ", strV, "; at path ");
                    sbR.append(aVar.j());
                    throw new a7.c(sbR.toString(), e9);
                }
            }
        }};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f17915c.clone();
    }

    public abstract Number a(ua.a aVar);
}
