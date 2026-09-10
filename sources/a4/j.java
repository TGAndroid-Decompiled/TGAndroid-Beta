package a4;
public final class j extends z3.i implements Comparable {
    public long f265s;

    @Override
    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        if (isEndOfStream() != jVar.isEndOfStream()) {
            if (isEndOfStream()) {
                return 1;
            }
            return -1;
        }
        long j3 = this.e - jVar.e;
        if (j3 == 0) {
            j3 = this.f265s - jVar.f265s;
            if (j3 == 0) {
                return 0;
            }
        }
        if (j3 > 0) {
            return 1;
        }
        return -1;
    }
}
