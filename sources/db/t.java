package db;

import java.io.IOException;
public abstract class t {
    public static final p f7594a;
    public static final q f7595b;
    public static final t[] f7596c;

    static {
        p pVar = new p();
        f7594a = pVar;
        q qVar = new q();
        f7595b = qVar;
        f7596c = new t[]{pVar, qVar, new t() {
            public static Double b(String str, lb.a aVar) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite() && !valueOf.isNaN()) {
                        return valueOf;
                    }
                    throw new IOException("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.j());
                } catch (NumberFormatException e) {
                    StringBuilder w10 = a4.a.w("Cannot parse ", str, "; at path ");
                    w10.append(aVar.j());
                    throw new RuntimeException(w10.toString(), e);
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
                } catch (NumberFormatException e) {
                    StringBuilder w10 = a4.a.w("Cannot parse ", v, "; at path ");
                    w10.append(aVar.j());
                    throw new RuntimeException(w10.toString(), e);
                }
            }
        }};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f7596c.clone();
    }

    public abstract Number a(lb.a aVar);
}
