package gb;
public final class j implements pa.f {
    public static final j f13716b;
    public static final j f13717c;
    public static final j d;
    public static final j[] f13718e;
    public final int f13719a;

    static {
        j jVar = new j("COLLECTION_UNKNOWN", 0, 0);
        j jVar2 = new j("COLLECTION_SDK_NOT_INSTALLED", 1, 1);
        f13716b = jVar2;
        j jVar3 = new j("COLLECTION_ENABLED", 2, 2);
        f13717c = jVar3;
        j jVar4 = new j("COLLECTION_DISABLED", 3, 3);
        d = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, new j("COLLECTION_DISABLED_REMOTE", 4, 4), new j("COLLECTION_SAMPLED", 5, 5)};
        f13718e = jVarArr;
        c8.j1.a(jVarArr);
    }

    public j(String str, int i7, int i10) {
        this.f13719a = i10;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f13718e.clone();
    }

    @Override
    public final int a() {
        return this.f13719a;
    }
}
