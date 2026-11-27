package defpackage;
public final class m00 extends Exception {
    public final int a;
    public final boolean b;

    public m00(int i, boolean z) {
        super(uh9.k(i, "AudioOutput write failed: "));
        this.b = z;
        this.a = i;
    }
}
