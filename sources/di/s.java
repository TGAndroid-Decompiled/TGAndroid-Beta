package di;
public final class s {
    public final t f7733a;
    public final int f7734b;
    public final int f7735c;

    public s(t tVar, int i10, int i11) {
        this.f7733a = tVar;
        this.f7734b = i10;
        this.f7735c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f7733a.d[this.f7735c]) * this.f7734b;
    }

    public final float b(float f7) {
        return (f7 / this.f7733a.d[this.f7735c]) * (this.f7734b + 1);
    }
}
