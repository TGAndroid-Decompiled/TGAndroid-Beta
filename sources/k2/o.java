package k2;
public final class o extends Exception {
    public final int f14521a;
    public final boolean f14522b;
    public final b2.s f14523c;

    public o(int i10, b2.s sVar, boolean z10) {
        super(hg.c.i(i10, "AudioTrack write failed: "));
        this.f14522b = z10;
        this.f14521a = i10;
        this.f14523c = sVar;
    }
}
