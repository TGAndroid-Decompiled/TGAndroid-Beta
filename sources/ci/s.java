package ci;
public final class s {
    public final t f5885a;
    public final int f5886b;
    public final int f5887c;

    public s(t tVar, int i10, int i11) {
        this.f5885a = tVar;
        this.f5886b = i10;
        this.f5887c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f5885a.d[this.f5887c]) * this.f5886b;
    }

    public final float b(float f7) {
        return (f7 / this.f5885a.d[this.f5887c]) * (this.f5886b + 1);
    }
}
