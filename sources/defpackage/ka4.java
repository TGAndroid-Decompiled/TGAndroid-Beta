package defpackage;
public final class ka4 {
    public long a;
    public int b;
    public final long c;
    public final long d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final ja4 j;

    public ka4(long j, int i, long j2, float f, float f2, float f3, float f4, ja4 ja4Var) {
        this.c = j;
        this.e = i;
        this.d = j2;
        this.f = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
        this.j = ja4Var;
    }

    public final String a() {
        Object valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(":");
        long j = this.d;
        if (j != 0) {
            valueOf = kt6.n(j, "g");
        } else {
            valueOf = Integer.valueOf(this.e);
        }
        sb.append(valueOf);
        return sb.toString();
    }
}
