package a4;
public final class j extends z3.i implements Comparable {
    public long f288s;

    @Override
    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        if (isEndOfStream() != jVar.isEndOfStream()) {
            if (isEndOfStream()) {
                return 1;
            }
            return -1;
        }
        long j3 = this.f10981e - jVar.f10981e;
        if (j3 == 0) {
            j3 = this.f288s - jVar.f288s;
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
