package defpackage;
public final class d74 {
    public final t1c a;
    public final int[] b;

    public d74(t1c t1cVar, int... iArr) {
        if (iArr.length == 0) {
            efd.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = t1cVar;
        this.b = iArr;
    }
}
