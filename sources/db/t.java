package db;

import java.io.IOException;
public abstract class t {
    public static final p f6712a;
    public static final q f6713b;
    public static final t[] f6714c;

    static {
        p pVar = new p();
        f6712a = pVar;
        q qVar = new q();
        f6713b = qVar;
        f6714c = new t[]{pVar, qVar, new t() {
            public static Double b(String str, lb.a aVar) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite() && !valueOf.isNaN()) {
                        return valueOf;
                    }
                    throw new IOException("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.j());
                } catch (NumberFormatException e7) {
                    StringBuilder v = a4.a.v("Cannot parse ", str, "; at path ");
                    v.append(aVar.j());
                    throw new RuntimeException(v.toString(), e7);
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
                    StringBuilder v9 = a4.a.v("Cannot parse ", v, "; at path ");
                    v9.append(aVar.j());
                    throw new RuntimeException(v9.toString(), e7);
                }
            }
        }};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f6714c.clone();
    }

    public abstract Number a(lb.a aVar);
}
