package gi;
public final class s {
    public final t f13537a;
    public final int f13538b;
    public final int f13539c;

    public s(t tVar, int i3, int i10) {
        this.f13537a = tVar;
        this.f13538b = i3;
        this.f13539c = i10;
    }

    public final float a(float f10) {
        return (f10 / this.f13537a.d[this.f13539c]) * this.f13538b;
    }

    public final float b(float f10) {
        return (f10 / this.f13537a.d[this.f13539c]) * (this.f13538b + 1);
    }
}
