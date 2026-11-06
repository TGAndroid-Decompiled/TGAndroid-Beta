package jb;
public final class l {
    public final q f16629a;
    public final q f16630b;

    public l(q localOverrideSettings, q remoteSettings) {
        kotlin.jvm.internal.j.e(localOverrideSettings, "localOverrideSettings");
        kotlin.jvm.internal.j.e(remoteSettings, "remoteSettings");
        this.f16629a = localOverrideSettings;
        this.f16630b = remoteSettings;
    }

    public final double a() {
        Double d = this.f16629a.d();
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double d2 = this.f16630b.d();
        if (d2 != null) {
            double doubleValue2 = d2.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    public final java.lang.Object b(kd.c r6) {
        throw new UnsupportedOperationException("Method not decompiled: jb.l.b(kd.c):java.lang.Object");
    }
}
