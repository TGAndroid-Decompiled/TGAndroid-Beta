package defpackage;
public final class fud {
    public final vid a;
    public final gud b;

    public fud(vid vidVar, String str, Object[] objArr) {
        this.a = vidVar;
        this.b = new gud(vidVar.getClass(), str, objArr);
    }
}
