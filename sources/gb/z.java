package gb;

import c8.h9;
public final class z implements pa.f {
    public static final z f13436b;
    public static final z[] f13437c;
    public final int f13438a;

    static {
        z zVar = new z("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
        z zVar2 = new z("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
        z zVar3 = new z("LOG_ENVIRONMENT_STAGING", 2, 2);
        z zVar4 = new z("LOG_ENVIRONMENT_PROD", 3, 3);
        f13436b = zVar4;
        z[] zVarArr = {zVar, zVar2, zVar3, zVar4};
        f13437c = zVarArr;
        h9.a(zVarArr);
    }

    public z(String str, int i7, int i10) {
        this.f13438a = i10;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f13437c.clone();
    }

    @Override
    public final int a() {
        return this.f13438a;
    }
}
