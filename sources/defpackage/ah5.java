package defpackage;
public abstract class ah5 implements Comparable {
    public final String a;
    public final zg5 b;
    public final long c;
    public final int d;
    public final long e;
    public final as3 f;
    public final String h;
    public final String n;
    public final long r;
    public final long s;
    public final boolean w;

    public ah5(String str, zg5 zg5Var, long j, int i, long j2, as3 as3Var, String str2, String str3, long j3, long j4, boolean z) {
        this.a = str;
        this.b = zg5Var;
        this.c = j;
        this.d = i;
        this.e = j2;
        this.f = as3Var;
        this.h = str2;
        this.n = str3;
        this.r = j3;
        this.s = j4;
        this.w = z;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long longValue = l.longValue();
        long j = this.e;
        if (j > longValue) {
            return 1;
        }
        if (j < l.longValue()) {
            return -1;
        }
        return 0;
    }
}
