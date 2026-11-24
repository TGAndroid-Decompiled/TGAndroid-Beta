package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
public final class gdd {
    public final mad a;
    public boolean b;
    public long c;
    public long d;

    public gdd(mad madVar) {
        if (madVar != null) {
            this.a = madVar;
        } else {
            fvc.f("ticker");
            throw null;
        }
    }

    public final void a() {
        if (!this.b) {
            this.b = true;
            this.d = this.a.a();
            return;
        }
        sc8.j("This stopwatch is already running.");
    }

    public final String toString() {
        long j;
        TimeUnit timeUnit;
        String str;
        if (this.b) {
            j = (this.a.a() - this.d) + this.c;
        } else {
            j = this.c;
        }
        int i = ((j / 86400000000000L) > 0L ? 1 : ((j / 86400000000000L) == 0L ? 0 : -1));
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (i > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (j / 3600000000000L > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (j / 60000000000L > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (j / 1000000000 > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (j / 1000000 > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (j / 1000 > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = timeUnit2;
        }
        String format = String.format(Locale.ROOT, "%.4g", Double.valueOf(j / timeUnit2.convert(1L, timeUnit)));
        switch (bdd.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                wn4.f();
                return null;
        }
        return tb4.y(format, " ", str);
    }
}
