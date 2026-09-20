package ci;
public final class s {
    public final t f5481a;
    public final int f5482b;
    public final int f5483c;

    public s(t tVar, int i10, int i11) {
        this.f5481a = tVar;
        this.f5482b = i10;
        this.f5483c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f5481a.d[this.f5483c]) * this.f5482b;
    }

    public final float b(float f7) {
        return (f7 / this.f5481a.d[this.f5483c]) * (this.f5482b + 1);
    }
}
