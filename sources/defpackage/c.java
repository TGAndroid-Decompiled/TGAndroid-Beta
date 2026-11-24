package defpackage;

import java.util.Calendar;
import java.util.Locale;
public final class c implements yw5, ed, fn7, dn7 {
    public final byte a;

    public c(byte b) {
        this.a = b;
    }

    @Override
    public final String c(int i) {
        switch (this.a) {
            case 18:
                if (i == 0) {
                    return k96.M0(2131748339, null);
                }
                Calendar calendar = Calendar.getInstance();
                int i2 = calendar.get(1);
                calendar.add(6, i);
                long timeInMillis = calendar.getTimeInMillis();
                if (calendar.get(1) == i2) {
                    return k96.D0().z0().format(timeInMillis) + ", " + k96.D0().v0().format(timeInMillis);
                }
                return k96.D0().x0().format(timeInMillis);
            case 19:
                return String.format("%02d", Integer.valueOf(i));
            case 20:
                if (i == 0) {
                    return k96.M0(2131748339, null);
                }
                Calendar calendar2 = Calendar.getInstance();
                int i3 = calendar2.get(1);
                calendar2.add(6, i);
                long timeInMillis2 = calendar2.getTimeInMillis();
                if (calendar2.get(1) == i3) {
                    if (i < 7) {
                        return k96.D0().z0().format(timeInMillis2) + ", " + k96.D0().v0().format(timeInMillis2);
                    }
                    return k96.D0().v0().format(timeInMillis2);
                }
                return k96.D0().x0().format(timeInMillis2);
            case 21:
                return String.format("%02d", Integer.valueOf(i));
            case 22:
                return String.format("%02d", Integer.valueOf(i));
            case 23:
                return String.format("%02d", Integer.valueOf(i));
            case 24:
                Calendar calendar3 = Calendar.getInstance();
                calendar3.set(5, 1);
                calendar3.set(2, i);
                return calendar3.getDisplayName(2, 1, Locale.getDefault());
            case 25:
                return String.format("%02d", Integer.valueOf(i));
            case 26:
                return String.format("%02d", Integer.valueOf(i));
            case 27:
                if (i == 0) {
                    return k96.M0(2131748339, null);
                }
                Calendar calendar4 = Calendar.getInstance();
                int i4 = calendar4.get(1);
                calendar4.add(6, i);
                long timeInMillis3 = calendar4.getTimeInMillis();
                if (calendar4.get(1) == i4) {
                    return k96.D0().v0().format(timeInMillis3);
                }
                return k96.D0().x0().format(timeInMillis3);
            case 28:
                return String.format("%02d", Integer.valueOf(i));
            default:
                return String.format("%02d", Integer.valueOf(i));
        }
    }

    @Override
    public final void n(Exception exc) {
        switch (this.a) {
            case 0:
                fa4.g(exc, true);
                return;
            default:
                fa4.g(exc, true);
                return;
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        hdVar.dismiss();
    }

    @Override
    public final void i(hn7 hn7Var, int i) {
    }
}
