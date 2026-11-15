package gb;

import c8.l1;
public final class y implements pa.f {
    public static final y f13123b;
    public static final y[] f13124c;
    public final int f13125a;

    static {
        y yVar = new y("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
        y yVar2 = new y("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
        y yVar3 = new y("LOG_ENVIRONMENT_STAGING", 2, 2);
        y yVar4 = new y("LOG_ENVIRONMENT_PROD", 3, 3);
        f13123b = yVar4;
        y[] yVarArr = {yVar, yVar2, yVar3, yVar4};
        f13124c = yVarArr;
        l1.a(yVarArr);
    }

    public y(String str, int i7, int i10) {
        this.f13125a = i10;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f13124c.clone();
    }

    @Override
    public final int a() {
        return this.f13125a;
    }
}
