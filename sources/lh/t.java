package lh;

public final class t {

    public final u f16828a;

    public final int f16829b;

    public final int f16830c;

    public t(u uVar, int i10, int i11) {
        this.f16828a = uVar;
        this.f16829b = i10;
        this.f16830c = i11;
    }

    public final float a(float f10) {
        return (f10 / this.f16828a.d[this.f16830c]) * this.f16829b;
    }

    public final float b(float f10) {
        return (f10 / this.f16828a.d[this.f16830c]) * (this.f16829b + 1);
    }
}
