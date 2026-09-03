package kd;

import java.util.concurrent.TimeUnit;
import k7.o8;
public final class c {
    public static final c f10306b;
    public static final c f10307c;
    public static final c d;
    public static final c e;
    public static final c f10308f;
    public static final c h;
    public static final c[] f10309n;
    public final TimeUnit f10310a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f10306b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f10307c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f10308f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        h = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f10309n = cVarArr;
        o8.a(cVarArr);
    }

    public c(String str, int i10, TimeUnit timeUnit) {
        this.f10310a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f10309n.clone();
    }
}
