package defpackage;
public final class k7a {
    public final k8a a;
    public final k8a b;

    public k7a(k8a k8aVar, k8a k8aVar2) {
        k8aVar.getClass();
        k8aVar2.getClass();
        this.a = k8aVar;
        this.b = k8aVar2;
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

    public final java.lang.Object b(defpackage.gw2 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k7a.b(gw2):java.lang.Object");
    }
}
