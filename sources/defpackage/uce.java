package defpackage;

import java.util.Calendar;
import java.util.Locale;
public abstract class uce {
    public static int a(int i) {
        if (i < 100 && i >= 0) {
            if (ize.G == null) {
                ize.G = new ize((byte) 15);
            }
            return Integer.parseInt(String.format(Locale.US, "%s%02d", ir2.n(2, 0, String.valueOf(Calendar.getInstance().get(1))), Integer.valueOf(i)));
        }
        return i;
    }
}
