package k2;
public final class o extends Exception {
    public final int f14520a;
    public final boolean f14521b;
    public final b2.s f14522c;

    public o(int i10, b2.s sVar, boolean z10) {
        super(hg.c.i(i10, "AudioTrack write failed: "));
        this.f14521b = z10;
        this.f14520a = i10;
        this.f14522c = sVar;
    }
}
