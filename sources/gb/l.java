package gb;
public final class l {
    public final q f12227a;
    public final q f12228b;

    public l(q localOverrideSettings, q remoteSettings) {
        kotlin.jvm.internal.j.e(localOverrideSettings, "localOverrideSettings");
        kotlin.jvm.internal.j.e(remoteSettings, "remoteSettings");
        this.f12227a = localOverrideSettings;
        this.f12228b = remoteSettings;
    }

    public final double a() {
        Double d = this.f12227a.d();
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double d10 = this.f12228b.d();
        if (d10 != null) {
            double doubleValue2 = d10.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    public final java.lang.Object b(hd.c r6) {
        throw new UnsupportedOperationException("Method not decompiled: gb.l.b(hd.c):java.lang.Object");
    }
}
