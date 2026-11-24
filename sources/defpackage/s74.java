package defpackage;
public final class s74 {
    public final uzb a;
    public final int[] b;

    public s74(uzb uzbVar, int... iArr) {
        if (iArr.length == 0) {
            ncd.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = uzbVar;
        this.b = iArr;
    }
}
