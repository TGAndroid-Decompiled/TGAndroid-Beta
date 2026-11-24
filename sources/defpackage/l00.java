package defpackage;
public final class l00 extends Exception {
    public final int a;
    public final boolean b;

    public l00(int i, boolean z) {
        super(de9.k(i, "AudioOutput write failed: "));
        this.b = z;
        this.a = i;
    }
}
