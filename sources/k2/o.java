package k2;
public final class o extends Exception {
    public final int f14523a;
    public final boolean f14524b;
    public final b2.s f14525c;

    public o(int i10, b2.s sVar, boolean z10) {
        super(hg.c.h(i10, "AudioTrack write failed: "));
        this.f14524b = z10;
        this.f14523a = i10;
        this.f14525c = sVar;
    }
}
