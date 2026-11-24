package defpackage;
public final class ep3 implements cv5 {
    public static final ep3 a = new Object();
    public static final bj8 b = new bj8("kotlin.Double", aj8.c);

    @Override
    public final void b(c30 c30Var, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        nj1 nj1Var = (nj1) ((e31) c30Var.b).c;
        if (c30Var.a) {
            c30Var.k(String.valueOf(doubleValue));
        } else {
            nj1Var.c(String.valueOf(doubleValue));
        }
        if (!Double.isInfinite(doubleValue) && !Double.isNaN(doubleValue)) {
            return;
        }
        Double valueOf = Double.valueOf(doubleValue);
        String nj1Var2 = nj1Var.toString();
        throw new IllegalArgumentException("Unexpected special floating-point value " + valueOf + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) ple.b(-1, nj1Var2)));
    }

    @Override
    public final Object c(igf igfVar) {
        cyb cybVar = (cyb) igfVar.d;
        String k = cybVar.k();
        try {
            double parseDouble = Double.parseDouble(k);
            if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                return Double.valueOf(parseDouble);
            }
            Double valueOf = Double.valueOf(parseDouble);
            cyb.m(cybVar, "Unexpected special floating-point value " + valueOf + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            cyb.m(cybVar, "Failed to parse type 'double' for input '" + k + '\'', 0, 6);
            throw null;
        }
    }

    @Override
    public final w4a d() {
        return b;
    }
}
