package defpackage;
public final class igb {
    public int a;
    public float b;
    public float c;

    public igb(float f, float f2, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    public final Object clone() {
        return new igb(this.b, this.c, this.a);
    }
}
