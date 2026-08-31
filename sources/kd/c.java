package kd;

import java.util.concurrent.TimeUnit;
import k7.p8;
public final class c {
    public static final c f11096b;
    public static final c f11097c;
    public static final c d;
    public static final c f11098e;
    public static final c f11099f;
    public static final c h;
    public static final c[] f11100n;
    public final TimeUnit f11101a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f11096b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f11097c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f11098e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f11099f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        h = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f11100n = cVarArr;
        p8.a(cVarArr);
    }

    public c(String str, int i10, TimeUnit timeUnit) {
        this.f11101a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f11100n.clone();
    }
}
