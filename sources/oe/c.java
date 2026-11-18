package oe;

import h2.o0;
public final class c implements ke.a {
    public static final c f21792a = new Object();
    public static final n f21793b = new n("kotlin.Double", me.b.f20969c);

    @Override
    public final void a(qe.h hVar, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        ca.i iVar = (ca.i) hVar.f56118b;
        if (hVar.f56117a) {
            hVar.j(String.valueOf(doubleValue));
        } else {
            ((mc.a) iVar.f5126c).c(String.valueOf(doubleValue));
        }
        ((o0) hVar.f56121f).getClass();
        if (!Double.isInfinite(doubleValue) && !Double.isNaN(doubleValue)) {
            return;
        }
        Double valueOf = Double.valueOf(doubleValue);
        String aVar = ((mc.a) iVar.f5126c).toString();
        throw new qe.d("Unexpected special floating-point value " + valueOf + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) qe.f.d(-1, aVar)));
    }

    @Override
    public final Object b(h2.c decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        a4.k kVar = (a4.k) decoder.d;
        String k10 = kVar.k();
        try {
            double parseDouble = Double.parseDouble(k10);
            ((pe.b) decoder.f13733b).f55572a.getClass();
            if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                return Double.valueOf(parseDouble);
            }
            Double valueOf = Double.valueOf(parseDouble);
            a4.k.n(kVar, "Unexpected special floating-point value " + valueOf + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            a4.k.n(kVar, "Failed to parse type 'double' for input '" + k10 + '\'', 0, 6);
            throw null;
        }
    }

    @Override
    public final me.d d() {
        return f21793b;
    }
}
