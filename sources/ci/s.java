package ci;
public final class s {
    public final t f5886a;
    public final int f5887b;
    public final int f5888c;

    public s(t tVar, int i10, int i11) {
        this.f5886a = tVar;
        this.f5887b = i10;
        this.f5888c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f5886a.d[this.f5888c]) * this.f5887b;
    }

    public final float b(float f7) {
        return (f7 / this.f5886a.d[this.f5888c]) * (this.f5887b + 1);
    }
}
