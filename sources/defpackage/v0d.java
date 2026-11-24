package defpackage;
public final class v0d {
    public static final v0d c;
    public static final v0d d;
    public static final v0d e;
    public static final v0d f;
    public static final v0d[] h;
    public static final y44 n;
    public final char a;
    public final char b;

    static {
        v0d v0dVar = new v0d("OBJ", 0, '{', '}');
        c = v0dVar;
        v0d v0dVar2 = new v0d("LIST", 1, '[', ']');
        d = v0dVar2;
        v0d v0dVar3 = new v0d("MAP", 2, '{', '}');
        e = v0dVar3;
        v0d v0dVar4 = new v0d("POLY_OBJ", 3, '[', ']');
        f = v0dVar4;
        v0d[] v0dVarArr = {v0dVar, v0dVar2, v0dVar3, v0dVar4};
        h = v0dVarArr;
        n = new y44(v0dVarArr);
    }

    public v0d(String str, int i, char c2, char c3) {
        this.a = c2;
        this.b = c3;
    }

    public static v0d valueOf(String str) {
        return (v0d) Enum.valueOf(v0d.class, str);
    }

    public static v0d[] values() {
        return (v0d[]) h.clone();
    }
}
