package db;

import b8.zc;
public final class m implements oa.f {
    public static final m f8701b;
    public static final m[] f8702c;
    public final int f8703a;

    static {
        m mVar = new m("EVENT_TYPE_UNKNOWN", 0, 0);
        m mVar2 = new m("SESSION_START", 1, 1);
        f8701b = mVar2;
        m[] mVarArr = {mVar, mVar2};
        f8702c = mVarArr;
        zc.a(mVarArr);
    }

    public m(String str, int i3, int i10) {
        this.f8703a = i10;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f8702c.clone();
    }

    @Override
    public final int a() {
        return this.f8703a;
    }
}
