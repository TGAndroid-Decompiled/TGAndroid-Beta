package defpackage;
public final class ma4 {
    public long a;
    public int b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final ja4 j;
    public final String k;
    public int l;

    public ma4(long j, int i, long j2, int i2, int i3, int i4, int i5, ja4 ja4Var, String str) {
        this.c = j;
        this.e = i;
        this.d = j2;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = ja4Var;
        this.k = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append(" ");
        sb.append(this.f);
        sb.append("/");
        sb.append(this.g);
        sb.append("ms ");
        sb.append(this.h);
        sb.append("/");
        sb.append(this.i);
        sb.append("‰ ");
        sb.append(this.k);
        sb.append(" ");
        Object obj = this.j;
        if (obj == null) {
            obj = "-#0 -";
        }
        sb.append(obj);
        return sb.toString();
    }
}
