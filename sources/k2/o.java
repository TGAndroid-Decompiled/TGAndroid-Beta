package k2;
public final class o extends Exception {
    public final int f14524a;
    public final boolean f14525b;
    public final b2.s f14526c;

    public o(int i10, b2.s sVar, boolean z10) {
        super(hg.c.h(i10, "AudioTrack write failed: "));
        this.f14525b = z10;
        this.f14524a = i10;
        this.f14526c = sVar;
    }
}
