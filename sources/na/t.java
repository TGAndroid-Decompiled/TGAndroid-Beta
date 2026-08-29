package na;

import a4.w;
import java.io.IOException;
public abstract class t {
    public static final p f17196a;
    public static final q f17197b;
    public static final t[] f17198c;

    static {
        p pVar = new p();
        f17196a = pVar;
        q qVar = new q();
        f17197b = qVar;
        f17198c = new t[]{pVar, qVar, new t() {
            public static Double b(String str, va.a aVar) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite() && !valueOf.isNaN()) {
                        return valueOf;
                    }
                    throw new IOException("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.j());
                } catch (NumberFormatException e10) {
                    StringBuilder s10 = w.s("Cannot parse ", str, "; at path ");
                    s10.append(aVar.j());
                    throw new RuntimeException(s10.toString(), e10);
                }
            }

            @Override
            public final Number a(va.a aVar) {
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
            public final Number a(va.a aVar) {
                String v = aVar.v();
                try {
                    return pa.d.i(v);
                } catch (NumberFormatException e10) {
                    StringBuilder s10 = w.s("Cannot parse ", v, "; at path ");
                    s10.append(aVar.j());
                    throw new RuntimeException(s10.toString(), e10);
                }
            }
        }};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f17198c.clone();
    }

    public abstract Number a(va.a aVar);
}
