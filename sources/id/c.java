package id;

import i7.i8;
import java.util.concurrent.TimeUnit;
public final class c {
    public static final c f8876b;
    public static final c f8877c;
    public static final c d;
    public static final c f8878e;
    public static final c f8879f;
    public static final c h;
    public static final c[] f8880n;
    public final TimeUnit f8881a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f8876b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f8877c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f8878e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f8879f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        h = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f8880n = cVarArr;
        i8.a(cVarArr);
    }

    public c(String str, int i10, TimeUnit timeUnit) {
        this.f8881a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f8880n.clone();
    }
}
