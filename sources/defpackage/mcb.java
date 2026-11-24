package defpackage;
public final class mcb {
    public int a;
    public float b;
    public float c;

    public mcb(float f, float f2, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    public final Object clone() {
        return new mcb(this.b, this.c, this.a);
    }
}
