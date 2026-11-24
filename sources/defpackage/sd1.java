package defpackage;
public final class sd1 extends qab implements Comparable {
    public long s;

    @Override
    public final int compareTo(Object obj) {
        sd1 sd1Var = (sd1) obj;
        if (isEndOfStream() != sd1Var.isEndOfStream()) {
            if (isEndOfStream()) {
                return 1;
            }
            return -1;
        }
        long j = this.e - sd1Var.e;
        if (j == 0) {
            j = this.s - sd1Var.s;
            if (j == 0) {
                return 0;
            }
        }
        if (j > 0) {
            return 1;
        }
        return -1;
    }
}
