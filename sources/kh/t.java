package kh;
public final class t {
    public final u f16073a;
    public final int f16074b;
    public final int f16075c;

    public t(u uVar, int i9, int i10) {
        this.f16073a = uVar;
        this.f16074b = i9;
        this.f16075c = i10;
    }

    public final float a(float f10) {
        return (f10 / this.f16073a.d[this.f16075c]) * this.f16074b;
    }

    public final float b(float f10) {
        return (f10 / this.f16073a.d[this.f16075c]) * (this.f16074b + 1);
    }
}
