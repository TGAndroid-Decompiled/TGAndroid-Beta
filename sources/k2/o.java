package k2;
public final class o extends Exception {
    public final int f14633a;
    public final boolean f14634b;
    public final b2.s f14635c;

    public o(int i10, b2.s sVar, boolean z10) {
        super(i2.g.i(i10, "AudioTrack write failed: "));
        this.f14634b = z10;
        this.f14633a = i10;
        this.f14635c = sVar;
    }
}
