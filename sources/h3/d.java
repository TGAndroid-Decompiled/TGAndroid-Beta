package h3;
public final class d implements a {
    public final int f14189a;
    public final int f14190b;
    public final int f14191c;
    public final int d;
    public final int f14192e;
    public final int f14193f;

    public d(int i7, int i10, int i11, int i12, int i13, int i14) {
        this.f14189a = i7;
        this.f14190b = i10;
        this.f14191c = i11;
        this.d = i12;
        this.f14192e = i13;
        this.f14193f = i14;
    }

    public final int a() {
        int i7 = this.f14189a;
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
