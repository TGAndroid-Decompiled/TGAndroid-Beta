package defpackage;
public final class w30 extends Exception {
    public final int a;
    public final boolean b;
    public final fm4 c;

    public w30(int i, fm4 fm4Var, boolean z) {
        super(de9.k(i, "AudioTrack write failed: "));
        this.b = z;
        this.a = i;
        this.c = fm4Var;
    }
}
