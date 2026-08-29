package ag;
public final class k2 {
    public int f571a;
    public float f572b;
    public float f573c;

    public k2(float f9, float f10, int i10) {
        this.f571a = i10;
        this.f572b = f9;
        this.f573c = f10;
    }

    public final Object clone() {
        return new k2(this.f572b, this.f573c, this.f571a);
    }
}
