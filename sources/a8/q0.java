package a8;

import java.util.Locale;
public abstract class q0 {
    public static int a(int i10) {
        if (i10 < 100 && i10 >= 0) {
            return Integer.parseInt(String.format(Locale.US, "%s%02d", c3.h0.l(2, 0, String.valueOf(sb.b.R0().get(1))), Integer.valueOf(i10)));
        }
        return i10;
    }
}
