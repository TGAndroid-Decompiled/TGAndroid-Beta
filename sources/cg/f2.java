package cg;
public final class f2 {
    public int f2401a;
    public float f2402b;
    public float f2403c;

    public f2(float f10, float f11, int i10) {
        this.f2401a = i10;
        this.f2402b = f10;
        this.f2403c = f11;
    }

    public final Object clone() {
        return new f2(this.f2402b, this.f2403c, this.f2401a);
    }
}
