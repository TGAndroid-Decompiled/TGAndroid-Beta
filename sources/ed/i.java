package ed;

import h7.s7;

public final class i {

    public static final i[] f5375a;

    i EF5;

    static {
        i[] iVarArr = {new i("PUBLIC", 0), new i("PROTECTED", 1), new i("INTERNAL", 2), new i("PRIVATE", 3)};
        f5375a = iVarArr;
        s7.a(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f5375a.clone();
    }
}
