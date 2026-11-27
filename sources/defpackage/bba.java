package defpackage;
public final class bba {
    public final aca a;
    public final aca b;

    public bba(aca acaVar, aca acaVar2) {
        acaVar.getClass();
        acaVar2.getClass();
        this.a = acaVar;
        this.b = acaVar2;
    }

    public final double a() {
        Double d = this.a.d();
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double d2 = this.b.d();
        if (d2 != null) {
            double doubleValue2 = d2.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    public final java.lang.Object b(defpackage.ax2 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bba.b(ax2):java.lang.Object");
    }
}
