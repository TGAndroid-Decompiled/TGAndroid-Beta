package defpackage;

import java.util.Calendar;
import java.util.Locale;
public final class e implements dz5, dq7, fd {
    public final byte a;

    public e(byte b) {
        this.a = b;
    }

    @Override
    public final String c(int i) {
        switch (this.a) {
            case 16:
                return String.valueOf(i);
            case 17:
                switch (i) {
                    case 0:
                        return ob6.M0(2131748840, null);
                    case 1:
                        return ob6.M0(2131750794, null);
                    case 2:
                        return ob6.M0(2131748437, null);
                    case 3:
                        return ob6.M0(2131754166, null);
                    case 4:
                        return ob6.M0(2131748416, null);
                    case 5:
                        return ob6.M0(2131748818, null);
                    case 6:
                        return ob6.M0(2131748820, null);
                    case 7:
                        return ob6.M0(2131753888, null);
                    case 8:
                        return ob6.M0(2131745293, null);
                    case 9:
                        return ob6.M0(2131747557, null);
                    case 10:
                        return ob6.M0(2131747562, null);
                    default:
                        return ob6.M0(2131751570, null);
                }
            case 18:
                if (i == 0) {
                    return ob6.M0(2131748285, null);
                }
                Calendar calendar = Calendar.getInstance();
                int i2 = calendar.get(1);
                calendar.add(6, i);
                long timeInMillis = calendar.getTimeInMillis();
                if (calendar.get(1) == i2) {
                    return ob6.D0().z0().format(timeInMillis) + ", " + ob6.D0().v0().format(timeInMillis);
                }
                return ob6.D0().x0().format(timeInMillis);
            case 19:
            default:
                return ob6.G(i + 1, "Minutes", new Object[0]);
            case 20:
                return String.format("%02d", Integer.valueOf(i));
            case 21:
                return String.format("%02d", Integer.valueOf(i));
            case 22:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                calendar2.set(2, i);
                return calendar2.getDisplayName(2, 1, Locale.getDefault());
            case 23:
                return String.format("%02d", Integer.valueOf(i));
            case 24:
                return String.format("%02d", Integer.valueOf(i));
            case 25:
                if (i == 0) {
                    return ob6.M0(2131748285, null);
                }
                Calendar calendar3 = Calendar.getInstance();
                int i3 = calendar3.get(1);
                calendar3.add(6, i);
                long timeInMillis2 = calendar3.getTimeInMillis();
                if (calendar3.get(1) == i3) {
                    return ob6.D0().v0().format(timeInMillis2);
                }
                return ob6.D0().x0().format(timeInMillis2);
            case 26:
                return String.format("%02d", Integer.valueOf(i));
            case 27:
                return String.format("%02d", Integer.valueOf(i));
            case 28:
                return ob6.G(i + 1, "Times", new Object[0]);
        }
    }

    @Override
    public final void l(Exception exc) {
        switch (this.a) {
            case 0:
                cc4.g(exc, true);
                return;
            default:
                cc4.g(exc, true);
                return;
        }
    }

    @Override
    public final void w(id idVar, int i) {
        idVar.dismiss();
    }
}
