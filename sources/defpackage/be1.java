package defpackage;
public final class be1 extends neb implements Comparable {
    public long s;

    @Override
    public final int compareTo(Object obj) {
        be1 be1Var = (be1) obj;
        if (isEndOfStream() != be1Var.isEndOfStream()) {
            if (isEndOfStream()) {
                return 1;
            }
            return -1;
        }
        long j = this.e - be1Var.e;
        if (j == 0) {
            j = this.s - be1Var.s;
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
