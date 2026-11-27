package defpackage;
public final class k3d {
    public static final k3d c;
    public static final k3d d;
    public static final k3d e;
    public static final k3d f;
    public static final k3d[] h;
    public static final j44 n;
    public final char a;
    public final char b;

    static {
        k3d k3dVar = new k3d("OBJ", 0, '{', '}');
        c = k3dVar;
        k3d k3dVar2 = new k3d("LIST", 1, '[', ']');
        d = k3dVar2;
        k3d k3dVar3 = new k3d("MAP", 2, '{', '}');
        e = k3dVar3;
        k3d k3dVar4 = new k3d("POLY_OBJ", 3, '[', ']');
        f = k3dVar4;
        k3d[] k3dVarArr = {k3dVar, k3dVar2, k3dVar3, k3dVar4};
        h = k3dVarArr;
        n = new j44(k3dVarArr);
    }

    public k3d(String str, int i, char c2, char c3) {
        this.a = c2;
        this.b = c3;
    }

    public static k3d valueOf(String str) {
        return (k3d) Enum.valueOf(k3d.class, str);
    }

    public static k3d[] values() {
        return (k3d[]) h.clone();
    }
}
