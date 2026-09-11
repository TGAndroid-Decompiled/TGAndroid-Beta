package a4;
public final class j extends z3.i implements Comparable {
    public long f274w;

    @Override
    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        if (c(4) != jVar.c(4)) {
            if (c(4)) {
                return 1;
            }
            return -1;
        }
        long j3 = this.h - jVar.h;
        if (j3 == 0) {
            j3 = this.f274w - jVar.f274w;
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
