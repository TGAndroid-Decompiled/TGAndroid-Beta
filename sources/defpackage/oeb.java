package defpackage;
public final class oeb {
    public int a;
    public float b;
    public float c;

    public oeb(float f, float f2, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    public final Object clone() {
        return new oeb(this.b, this.c, this.a);
    }
}
