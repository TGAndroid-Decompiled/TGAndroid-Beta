package defpackage;
public final class a76 {
    public final x66 a;
    public final adc b = new adc(0.0f);
    public final adc c = new adc(0.0f);
    public final adc d = new adc(0.0f);
    public final adc e = new adc(0.0f);
    public final adc f = new adc(0.0f);
    public final adc g = new adc(0.0f);

    public a76(b76 b76Var, x66 x66Var) {
        this.a = x66Var;
    }

    public final void a(int i, boolean z) {
        float f = 0.0f;
        adc adcVar = this.c;
        adc adcVar2 = this.b;
        if (z) {
            adcVar2.c = i;
            if (i > 0) {
                f = 1.0f;
            }
            adcVar.c = f;
            return;
        }
        adcVar2.d(i);
        if (i > 0) {
            f = 1.0f;
        }
        adcVar.d(f);
    }
}
