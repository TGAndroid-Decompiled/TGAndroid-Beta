package e2;
public class a0 {
    public static final a0 f10304i = new a0(new z());
    public static final String f10305j = Integer.toString(0, 36);
    public static final String f10306k = Integer.toString(1, 36);
    public static final String f10307l = Integer.toString(2, 36);
    public static final String f10308m = Integer.toString(3, 36);
    public static final String f10309n = Integer.toString(4, 36);
    public static final String f10310o = Integer.toString(5, 36);
    public static final String f10311p = Integer.toString(6, 36);
    public static final String f10312q = Integer.toString(7, 36);
    public final long f10313a;
    public final long f10314b;
    public final long f10315c;
    public final long d;
    public final boolean f10316e;
    public final boolean f10317f;
    public final boolean f10318g;
    public final boolean h;

    public a0(z zVar) {
        this.f10313a = h2.l0.h0(zVar.f10801a);
        this.f10315c = h2.l0.h0(zVar.f10802b);
        this.f10314b = zVar.f10801a;
        this.d = zVar.f10802b;
        this.f10316e = zVar.f10803c;
        this.f10317f = zVar.d;
        this.f10318g = zVar.f10804e;
        this.h = zVar.f10805f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f10314b == a0Var.f10314b && this.d == a0Var.d && this.f10316e == a0Var.f10316e && this.f10317f == a0Var.f10317f && this.f10318g == a0Var.f10318g && this.h == a0Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f10314b;
        long j10 = this.d;
        return (((((((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f10316e ? 1 : 0)) * 31) + (this.f10317f ? 1 : 0)) * 31) + (this.f10318g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
