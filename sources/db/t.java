package db;

import java.io.IOException;
public abstract class t {
    public static final p f6383a;
    public static final q f6384b;
    public static final t[] f6385c;

    static {
        p pVar = new p();
        f6383a = pVar;
        q qVar = new q();
        f6384b = qVar;
        f6385c = new t[]{pVar, qVar, new t() {
            public static Double b(String str, lb.a aVar) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite() && !valueOf.isNaN()) {
                        return valueOf;
                    }
                    throw new IOException("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.j());
                } catch (NumberFormatException e) {
                    StringBuilder v = a4.a.v("Cannot parse ", str, "; at path ");
                    v.append(aVar.j());
                    throw new RuntimeException(v.toString(), e);
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
                    StringBuilder v9 = a4.a.v("Cannot parse ", v, "; at path ");
                    v9.append(aVar.j());
                    throw new RuntimeException(v9.toString(), e);
                }
            }
        }};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f6385c.clone();
    }

    public abstract Number a(lb.a aVar);
}
