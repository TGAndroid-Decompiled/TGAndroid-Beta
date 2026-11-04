package ne;

import b8.zc;
public final class j {
    public static final j f20360c;
    public static final j d;
    public static final j f20361e;
    public static final j f20362f;
    public static final j[] h;
    public static final id.b f20363n;
    public final char f20364a;
    public final char f20365b;

    static {
        j jVar = new j("OBJ", 0, '{', '}');
        f20360c = jVar;
        j jVar2 = new j("LIST", 1, '[', ']');
        d = jVar2;
        j jVar3 = new j("MAP", 2, '{', '}');
        f20361e = jVar3;
        j jVar4 = new j("POLY_OBJ", 3, '[', ']');
        f20362f = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        h = jVarArr;
        f20363n = zc.a(jVarArr);
    }

    public j(String str, int i3, char c2, char c10) {
        this.f20364a = c2;
        this.f20365b = c10;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) h.clone();
    }
}
