package h3;
public final class d implements a {
    public final int f14187a;
    public final int f14188b;
    public final int f14189c;
    public final int d;
    public final int f14190e;
    public final int f14191f;

    public d(int i7, int i10, int i11, int i12, int i13, int i14) {
        this.f14187a = i7;
        this.f14188b = i10;
        this.f14189c = i11;
        this.d = i12;
        this.f14190e = i13;
        this.f14191f = i14;
    }

    public final int a() {
        int i7 = this.f14187a;
        if (i7 != 1935960438) {
            if (i7 != 1935963489) {
                if (i7 != 1937012852) {
                    h2.a.l("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i7));
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
