package d4;
public final class h extends c4.i implements Comparable {
    public long f7839s;

    @Override
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        if (isEndOfStream() != hVar.isEndOfStream()) {
            if (isEndOfStream()) {
                return 1;
            }
            return -1;
        }
        long j3 = this.f18224e - hVar.f18224e;
        if (j3 == 0) {
            j3 = this.f7839s - hVar.f7839s;
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
