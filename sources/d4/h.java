package d4;
public final class h extends c4.i implements Comparable {
    public long f8179s;

    @Override
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        if (isEndOfStream() != hVar.isEndOfStream()) {
            if (isEndOfStream()) {
                return 1;
            }
            return -1;
        }
        long j3 = this.f17176e - hVar.f17176e;
        if (j3 == 0) {
            j3 = this.f8179s - hVar.f8179s;
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
