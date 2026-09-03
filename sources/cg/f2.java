package cg;
public final class f2 {
    public int f2384a;
    public float f2385b;
    public float f2386c;

    public f2(float f10, float f11, int i10) {
        this.f2384a = i10;
        this.f2385b = f10;
        this.f2386c = f11;
    }

    public final Object clone() {
        return new f2(this.f2385b, this.f2386c, this.f2384a);
    }
}
