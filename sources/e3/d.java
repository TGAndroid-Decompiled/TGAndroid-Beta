package e3;
public final class d implements a {
    public final int f8610a;
    public final int f8611b;
    public final int f8612c;
    public final int d;
    public final int f8613e;
    public final int f8614f;

    public d(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f8610a = i10;
        this.f8611b = i11;
        this.f8612c = i12;
        this.d = i13;
        this.f8613e = i14;
        this.f8614f = i15;
    }

    public final int a() {
        int i10 = this.f8610a;
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
