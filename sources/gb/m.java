package gb;

import c8.h9;
public final class m implements pa.f {
    public static final m f13378b;
    public static final m[] f13379c;
    public final int f13380a;

    static {
        m mVar = new m("EVENT_TYPE_UNKNOWN", 0, 0);
        m mVar2 = new m("SESSION_START", 1, 1);
        f13378b = mVar2;
        m[] mVarArr = {mVar, mVar2};
        f13379c = mVarArr;
        h9.a(mVarArr);
    }

    public m(String str, int i7, int i10) {
        this.f13380a = i10;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f13379c.clone();
    }

    @Override
    public final int a() {
        return this.f13380a;
    }
}
