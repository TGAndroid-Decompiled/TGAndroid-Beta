package defpackage;
public final class af1 extends rcb implements Comparable {
    public long s;

    @Override
    public final int compareTo(Object obj) {
        af1 af1Var = (af1) obj;
        if (isEndOfStream() != af1Var.isEndOfStream()) {
            if (isEndOfStream()) {
                return 1;
            }
            return -1;
        }
        long j = this.e - af1Var.e;
        if (j == 0) {
            j = this.s - af1Var.s;
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
