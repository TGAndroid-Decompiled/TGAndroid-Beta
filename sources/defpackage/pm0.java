package defpackage;

import java.util.Calendar;
public final class pm0 implements dq7 {
    public final byte a;
    public final long b;
    public final Calendar c;
    public final int d;

    public pm0(long j, Calendar calendar, int i, byte b) {
        this.a = b;
        this.b = j;
        this.c = calendar;
        this.d = i;
    }

    @Override
    public final String c(int i) {
        byte b = this.a;
        int i2 = this.d;
        Calendar calendar = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                if (i == 0) {
                    return ob6.M0(2131748285, "MessageScheduleToday");
                }
                long j2 = (i * 86400000) + j;
                calendar.setTimeInMillis(j2);
                if (calendar.get(1) == i2) {
                    return ob6.D0().v0().format(j2);
                }
                return ob6.D0().x0().format(j2);
            default:
                if (i == 0) {
                    return ob6.M0(2131748285, null);
                }
                long j3 = (i * 86400000) + j;
                calendar.setTimeInMillis(j3);
                if (calendar.get(1) == i2) {
                    return ob6.D0().z0().format(j3) + " " + ob6.D0().v0().format(j3);
                }
                return ob6.D0().x0().format(j3);
        }
    }
}
