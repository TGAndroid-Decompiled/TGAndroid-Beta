package j7;

import java.util.Locale;
public abstract class n8 {
    public static int a(int i10) {
        if (i10 < 100 && i10 >= 0) {
            return Integer.parseInt(String.format(Locale.US, "%s%02d", e2.c.j(String.valueOf(db.a.F3().get(1)), 2, 0), Integer.valueOf(i10)));
        }
        return i10;
    }
}
