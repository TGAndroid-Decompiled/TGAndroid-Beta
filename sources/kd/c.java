package kd;

import java.util.concurrent.TimeUnit;
import k7.o8;
public final class c {
    public static final c f10327b;
    public static final c f10328c;
    public static final c d;
    public static final c e;
    public static final c f10329f;
    public static final c h;
    public static final c[] f10330n;
    public final TimeUnit f10331a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f10327b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f10328c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f10329f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        h = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f10330n = cVarArr;
        o8.a(cVarArr);
    }

    public c(String str, int i10, TimeUnit timeUnit) {
        this.f10331a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f10330n.clone();
    }
}
