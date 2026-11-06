package c8;
public abstract class ib {
    public static int a(long j3) {
        if (j3 <= 2147483647L && j3 >= -2147483648L) {
            return (int) j3;
        }
        throw new RuntimeException(rf.b.h(j3, "A cast to int has gone wrong. Please contact the mp4parser discussion group (", ")"));
    }
}
