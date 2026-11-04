package db;

import b8.zc;
public final class x implements oa.f {
    public static final x f8752b;
    public static final x[] f8753c;
    public final int f8754a;

    static {
        x xVar = new x("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
        x xVar2 = new x("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
        x xVar3 = new x("LOG_ENVIRONMENT_STAGING", 2, 2);
        x xVar4 = new x("LOG_ENVIRONMENT_PROD", 3, 3);
        f8752b = xVar4;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4};
        f8753c = xVarArr;
        zc.a(xVarArr);
    }

    public x(String str, int i3, int i10) {
        this.f8754a = i10;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f8753c.clone();
    }

    @Override
    public final int a() {
        return this.f8754a;
    }
}
