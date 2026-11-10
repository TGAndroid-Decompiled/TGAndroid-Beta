package gb;
public final class n implements pa.f {
    public static final n f13733b;
    public static final n[] f13734c;
    public final int f13735a;

    static {
        n nVar = new n("EVENT_TYPE_UNKNOWN", 0, 0);
        n nVar2 = new n("SESSION_START", 1, 1);
        f13733b = nVar2;
        n[] nVarArr = {nVar, nVar2};
        f13734c = nVarArr;
        c8.j1.a(nVarArr);
    }

    public n(String str, int i7, int i10) {
        this.f13735a = i10;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f13734c.clone();
    }

    @Override
    public final int a() {
        return this.f13735a;
    }
}
