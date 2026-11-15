package gb;

import c8.l1;
public final class m implements pa.f {
    public static final m f13068b;
    public static final m[] f13069c;
    public final int f13070a;

    static {
        m mVar = new m("EVENT_TYPE_UNKNOWN", 0, 0);
        m mVar2 = new m("SESSION_START", 1, 1);
        f13068b = mVar2;
        m[] mVarArr = {mVar, mVar2};
        f13069c = mVarArr;
        l1.a(mVarArr);
    }

    public m(String str, int i7, int i10) {
        this.f13070a = i10;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f13069c.clone();
    }

    @Override
    public final int a() {
        return this.f13070a;
    }
}
