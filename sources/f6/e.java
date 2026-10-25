package f6;

import org.telegram.ui.Components.b10;
public abstract class e {
    public static int a(long j10) {
        if (j10 <= 2147483647L && j10 >= -2147483648L) {
            return (int) j10;
        }
        throw new RuntimeException(b10.i(j10, "A cast to int has gone wrong. Please contact the mp4parser discussion group (", ")"));
    }
}
