package oa;

import java.util.Calendar;
public class s0 extends la.u {
    @Override
    public final java.lang.Object read(ta.a r13) {
        throw new UnsupportedOperationException("Method not decompiled: oa.s0.read(ta.a):java.lang.Object");
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        Calendar calendar = (Calendar) obj;
        if (calendar == null) {
            cVar.i();
            return;
        }
        cVar.c();
        cVar.g("year");
        cVar.o(calendar.get(1));
        cVar.g("month");
        cVar.o(calendar.get(2));
        cVar.g("dayOfMonth");
        cVar.o(calendar.get(5));
        cVar.g("hourOfDay");
        cVar.o(calendar.get(11));
        cVar.g("minute");
        cVar.o(calendar.get(12));
        cVar.g("second");
        cVar.o(calendar.get(13));
        cVar.f();
    }
}
