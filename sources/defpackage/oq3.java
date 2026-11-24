package defpackage;
public final class oq3 implements cx5 {
    public static final oq3 a = new Object();
    public static final el8 b = new el8("kotlin.Double", dl8.c);

    @Override
    public final void b(c40 c40Var, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        vk1 vk1Var = (vk1) ((m41) c40Var.b).c;
        if (c40Var.a) {
            c40Var.k(String.valueOf(doubleValue));
        } else {
            vk1Var.c(String.valueOf(doubleValue));
        }
        if (!Double.isInfinite(doubleValue) && !Double.isNaN(doubleValue)) {
            return;
        }
        Double valueOf = Double.valueOf(doubleValue);
        String vk1Var2 = vk1Var.toString();
        throw new IllegalArgumentException("Unexpected special floating-point value " + valueOf + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) rne.b(-1, vk1Var2)));
    }

    @Override
    public final Object c(jif jifVar) {
        e0c e0cVar = (e0c) jifVar.d;
        String k = e0cVar.k();
        try {
            double parseDouble = Double.parseDouble(k);
            if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                return Double.valueOf(parseDouble);
            }
            Double valueOf = Double.valueOf(parseDouble);
            e0c.m(e0cVar, "Unexpected special floating-point value " + valueOf + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            e0c.m(e0cVar, "Failed to parse type 'double' for input '" + k + '\'', 0, 6);
            throw null;
        }
    }

    @Override
    public final y6a d() {
        return b;
    }
}
