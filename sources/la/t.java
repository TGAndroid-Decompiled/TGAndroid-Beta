package la;

import java.io.IOException;
public abstract class t {
    public static final p f16729a;
    public static final q f16730b;
    public static final t[] f16731c;

    static {
        p pVar = new p();
        f16729a = pVar;
        q qVar = new q();
        f16730b = qVar;
        f16731c = new t[]{pVar, qVar, new t() {
            public static Double b(String str, ta.a aVar) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite() && !valueOf.isNaN()) {
                        return valueOf;
                    }
                    throw new IOException("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.j());
                } catch (NumberFormatException e10) {
                    StringBuilder t10 = aa.d.t("Cannot parse ", str, "; at path ");
                    t10.append(aVar.j());
                    throw new RuntimeException(t10.toString(), e10);
                }
            }

            @Override
            public final Number a(ta.a aVar) {
                String v = aVar.v();
                if (v.indexOf(46) >= 0) {
                    return b(v, aVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(v));
                } catch (NumberFormatException unused) {
                    return b(v, aVar);
                }
            }
        }, new t() {
            @Override
            public final Number a(ta.a aVar) {
                String v = aVar.v();
                try {
                    return na.d.i(v);
                } catch (NumberFormatException e10) {
                    StringBuilder t10 = aa.d.t("Cannot parse ", v, "; at path ");
                    t10.append(aVar.j());
                    throw new RuntimeException(t10.toString(), e10);
                }
            }
        }};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f16731c.clone();
    }

    public abstract Number a(ta.a aVar);
}
