package db;

import b8.zc;
public final class j implements oa.f {
    public static final j f8687b;
    public static final j f8688c;
    public static final j d;
    public static final j[] f8689e;
    public final int f8690a;

    static {
        j jVar = new j("COLLECTION_UNKNOWN", 0, 0);
        j jVar2 = new j("COLLECTION_SDK_NOT_INSTALLED", 1, 1);
        f8687b = jVar2;
        j jVar3 = new j("COLLECTION_ENABLED", 2, 2);
        f8688c = jVar3;
        j jVar4 = new j("COLLECTION_DISABLED", 3, 3);
        d = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, new j("COLLECTION_DISABLED_REMOTE", 4, 4), new j("COLLECTION_SAMPLED", 5, 5)};
        f8689e = jVarArr;
        zc.a(jVarArr);
    }

    public j(String str, int i3, int i10) {
        this.f8690a = i10;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f8689e.clone();
    }

    @Override
    public final int a() {
        return this.f8690a;
    }
}
