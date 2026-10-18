package e3;
public final class d implements a {
    public final int f8316a;
    public final int f8317b;
    public final int f8318c;
    public final int d;
    public final int e;
    public final int f8319f;

    public d(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f8316a = i10;
        this.f8317b = i11;
        this.f8318c = i12;
        this.d = i13;
        this.e = i14;
        this.f8319f = i15;
    }

    public final int a() {
        int i10 = this.f8316a;
        if (i10 != 1935960438) {
            if (i10 != 1935963489) {
                if (i10 != 1937012852) {
                    e2.a.l("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i10));
                    return -1;
                }
                return 3;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int getType() {
        return 1752331379;
    }
}
