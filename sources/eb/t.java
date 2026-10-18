package eb;

import java.io.IOException;
public abstract class t {
    public static final p f8579a;
    public static final q f8580b;
    public static final t[] f8581c;

    static {
        p pVar = new p();
        f8579a = pVar;
        q qVar = new q();
        f8580b = qVar;
        f8581c = new t[]{pVar, qVar, new t() {
            public static Double b(String str, mb.a aVar) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite() && !valueOf.isNaN()) {
                        return valueOf;
                    }
                    throw new IOException("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.j());
                } catch (NumberFormatException e) {
                    StringBuilder v = a1.g.v("Cannot parse ", str, "; at path ");
                    v.append(aVar.j());
                    throw new RuntimeException(v.toString(), e);
                }
            }

            @Override
            public final Number a(mb.a aVar) {
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
            public final Number a(mb.a aVar) {
                String v = aVar.v();
                try {
                    return gb.d.i(v);
                } catch (NumberFormatException e) {
                    StringBuilder v10 = a1.g.v("Cannot parse ", v, "; at path ");
                    v10.append(aVar.j());
                    throw new RuntimeException(v10.toString(), e);
                }
            }
        }};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f8581c.clone();
    }

    public abstract Number a(mb.a aVar);
}
