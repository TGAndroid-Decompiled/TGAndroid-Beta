package defpackage;
public final class l10 extends Exception {
    public final int a;
    public final boolean b;

    public l10(int i, boolean z) {
        super(hg9.j(i, "AudioOutput write failed: "));
        this.b = z;
        this.a = i;
    }
}
