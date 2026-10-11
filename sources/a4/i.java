package a4;
public final class i extends z3.i implements Comparable {
    public long f288s;

    @Override
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        if (isEndOfStream() != iVar.isEndOfStream()) {
            if (isEndOfStream()) {
                return 1;
            }
            return -1;
        }
        long j3 = this.f10985e - iVar.f10985e;
        if (j3 == 0) {
            j3 = this.f288s - iVar.f288s;
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
