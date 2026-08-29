package fd;

import i7.i8;
public final class i {
    public static final i[] f6711a;

    static {
        i[] iVarArr = {new Enum("PUBLIC", 0), new Enum("PROTECTED", 1), new Enum("INTERNAL", 2), new Enum("PRIVATE", 3)};
        f6711a = iVarArr;
        i8.a(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f6711a.clone();
    }
}
