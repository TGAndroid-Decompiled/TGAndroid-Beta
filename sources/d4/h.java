package d4;
public final class h extends c4.i implements Comparable {
    public long f7848s;

    @Override
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        if (isEndOfStream() != hVar.isEndOfStream()) {
            if (isEndOfStream()) {
                return 1;
            }
            return -1;
        }
        long j3 = this.f18128e - hVar.f18128e;
        if (j3 == 0) {
            j3 = this.f7848s - hVar.f7848s;
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
