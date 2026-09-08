package k2;
public final class o extends Exception {
    public final int f14659a;
    public final boolean f14660b;
    public final b2.s f14661c;

    public o(int i10, b2.s sVar, boolean z10) {
        super(i2.g.i(i10, "AudioTrack write failed: "));
        this.f14660b = z10;
        this.f14659a = i10;
        this.f14661c = sVar;
    }
}
