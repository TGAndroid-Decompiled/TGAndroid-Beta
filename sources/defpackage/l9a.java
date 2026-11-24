package defpackage;
public final class l9a {
    public final kaa a;
    public final kaa b;

    public l9a(kaa kaaVar, kaa kaaVar2) {
        kaaVar.getClass();
        kaaVar2.getClass();
        this.a = kaaVar;
        this.b = kaaVar2;
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

    public final java.lang.Object b(defpackage.qx2 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l9a.b(qx2):java.lang.Object");
    }
}
