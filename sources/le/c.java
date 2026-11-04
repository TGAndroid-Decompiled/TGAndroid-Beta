package le;

import e0.e0;
import g2.q0;
public final class c implements he.a {
    public static final c f18181a = new Object();
    public static final n f18182b = new n("kotlin.Double", je.b.f16240c);

    @Override
    public final Object a(g2.d decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        e0 e0Var = (e0) decoder.d;
        String k10 = e0Var.k();
        try {
            double parseDouble = Double.parseDouble(k10);
            ((me.b) decoder.f11819b).f19277a.getClass();
            if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                return Double.valueOf(parseDouble);
            }
            Double valueOf = Double.valueOf(parseDouble);
            e0.n(e0Var, "Unexpected special floating-point value " + valueOf + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            e0.n(e0Var, "Failed to parse type 'double' for input '" + k10 + '\'', 0, 6);
            throw null;
        }
    }

    @Override
    public final void c(ne.h hVar, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        ba.i iVar = (ba.i) hVar.f20353b;
        if (hVar.f20352a) {
            hVar.j(String.valueOf(doubleValue));
        } else {
            ((jc.a) iVar.f3187c).c(String.valueOf(doubleValue));
        }
        ((q0) hVar.f20356f).getClass();
        if (!Double.isInfinite(doubleValue) && !Double.isNaN(doubleValue)) {
            return;
        }
        Double valueOf = Double.valueOf(doubleValue);
        String aVar = ((jc.a) iVar.f3187c).toString();
        throw new ne.d("Unexpected special floating-point value " + valueOf + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) ne.f.d(-1, aVar)));
    }

    @Override
    public final je.d d() {
        return f18182b;
    }
}
