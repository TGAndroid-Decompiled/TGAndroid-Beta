package j7;
public abstract class k5 {
    public static int a(long j10) {
        if (j10 <= 2147483647L && j10 >= -2147483648L) {
            return (int) j10;
        }
        throw new RuntimeException(e2.c.i(j10, "A cast to int has gone wrong. Please contact the mp4parser discussion group (", ")"));
    }
}
