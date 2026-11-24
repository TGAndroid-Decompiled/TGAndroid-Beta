package defpackage;
public final class j64 {
    public final sxb a;
    public final int[] b;

    public j64(sxb sxbVar, int... iArr) {
        if (iArr.length == 0) {
            lad.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = sxbVar;
        this.b = iArr;
    }
}
