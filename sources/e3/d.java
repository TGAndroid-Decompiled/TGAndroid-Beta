package e3;
public final class d implements a {
    public final int f7942a;
    public final int f7943b;
    public final int f7944c;
    public final int d;
    public final int e;
    public final int f7945f;

    public d(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f7942a = i10;
        this.f7943b = i11;
        this.f7944c = i12;
        this.d = i13;
        this.e = i14;
        this.f7945f = i15;
    }

    public final int a() {
        int i10 = this.f7942a;
        if (i10 != 1935960438) {
            if (i10 != 1935963489) {
                if (i10 != 1937012852) {
                    e2.a.n("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i10));
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
