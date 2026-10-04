package db;

import java.io.IOException;
public abstract class t {
    public static final p f8214a;
    public static final q f8215b;
    public static final t[] f8216c;

    static {
        p pVar = new p();
        f8214a = pVar;
        q qVar = new q();
        f8215b = qVar;
        f8216c = new t[]{pVar, qVar, new t() {
            public static Double b(String str, lb.a aVar) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite() && !valueOf.isNaN()) {
                        return valueOf;
                    }
                    throw new IOException("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.j());
                } catch (NumberFormatException e7) {
                    StringBuilder w10 = a4.a.w("Cannot parse ", str, "; at path ");
                    w10.append(aVar.j());
                    throw new RuntimeException(w10.toString(), e7);
                }
            }

            @Override
            public final Number a(lb.a aVar) {
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
            public final Number a(lb.a aVar) {
                String v = aVar.v();
                try {
                    return fb.d.i(v);
                } catch (NumberFormatException e7) {
                    StringBuilder w10 = a4.a.w("Cannot parse ", v, "; at path ");
                    w10.append(aVar.j());
                    throw new RuntimeException(w10.toString(), e7);
                }
            }
        }};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f8216c.clone();
    }

    public abstract Number a(lb.a aVar);
}
