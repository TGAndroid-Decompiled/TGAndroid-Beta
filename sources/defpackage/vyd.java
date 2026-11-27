package defpackage;
public final class vyd {
    public final mnd a;
    public final wyd b;

    public vyd(mnd mndVar, String str, Object[] objArr) {
        this.a = mndVar;
        this.b = new wyd(mndVar.getClass(), str, objArr);
    }
}
