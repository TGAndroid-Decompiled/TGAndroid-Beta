package be;

import a8.we;
import java.util.concurrent.TimeUnit;
public final class c {
    public static final c f3895b;
    public static final c f3896c;
    public static final c d;
    public static final c e;
    public static final c f3897f;
    public static final c h;
    public static final c[] f3898n;
    public final TimeUnit f3899a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f3895b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f3896c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f3897f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        h = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f3898n = cVarArr;
        we.a(cVarArr);
    }

    public c(String str, int i10, TimeUnit timeUnit) {
        this.f3899a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f3898n.clone();
    }
}
