package gd;

import g7.n7;
import java.util.concurrent.TimeUnit;
public final class c {
    public static final c f7740b;
    public static final c f7741c;
    public static final c d;
    public static final c f7742e;
    public static final c f7743f;
    public static final c h;
    public static final c[] f7744n;
    public final TimeUnit f7745a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f7740b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f7741c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f7742e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f7743f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        h = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f7744n = cVarArr;
        n7.a(cVarArr);
    }

    public c(String str, int i9, TimeUnit timeUnit) {
        this.f7745a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f7744n.clone();
    }
}
