package defpackage;
public final class vp3 implements hx5 {
    public static final vp3 a = new Object();
    public static final om8 b = new om8("kotlin.Double", nm8.c);

    @Override
    public final void b(d30 d30Var, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        wj1 wj1Var = (wj1) ((n31) d30Var.b).c;
        if (d30Var.a) {
            d30Var.k(String.valueOf(doubleValue));
        } else {
            wj1Var.c(String.valueOf(doubleValue));
        }
        if (!Double.isInfinite(doubleValue) && !Double.isNaN(doubleValue)) {
            return;
        }
        Double valueOf = Double.valueOf(doubleValue);
        String wj1Var2 = wj1Var.toString();
        throw new IllegalArgumentException("Unexpected special floating-point value " + valueOf + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) hqe.b(-1, wj1Var2)));
    }

    @Override
    public final Object c(ykf ykfVar) {
        d2c d2cVar = (d2c) ykfVar.d;
        String k = d2cVar.k();
        try {
            double parseDouble = Double.parseDouble(k);
            if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                return Double.valueOf(parseDouble);
            }
            Double valueOf = Double.valueOf(parseDouble);
            d2c.m(d2cVar, "Unexpected special floating-point value " + valueOf + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            d2c.m(d2cVar, "Failed to parse type 'double' for input '" + k + '\'', 0, 6);
            throw null;
        }
    }

    @Override
    public final o8a d() {
        return b;
    }
}
