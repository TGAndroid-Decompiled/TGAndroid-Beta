package c4;
public final class h extends b4.i implements Comparable {
    public long f4202s;

    @Override
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        if (isEndOfStream() != hVar.isEndOfStream()) {
            if (isEndOfStream()) {
                return 1;
            }
            return -1;
        }
        long j10 = this.f16158e - hVar.f16158e;
        if (j10 == 0) {
            j10 = this.f4202s - hVar.f4202s;
            if (j10 == 0) {
                return 0;
            }
        }
        if (j10 > 0) {
            return 1;
        }
        return -1;
    }
}
