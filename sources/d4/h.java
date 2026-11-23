package d4;
public final class h extends c4.i implements Comparable {
    public long f7840s;

    @Override
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        if (isEndOfStream() != hVar.isEndOfStream()) {
            if (isEndOfStream()) {
                return 1;
            }
            return -1;
        }
        long j3 = this.f18122e - hVar.f18122e;
        if (j3 == 0) {
            j3 = this.f7840s - hVar.f7840s;
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
