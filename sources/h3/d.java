package h3;
public final class d implements a {
    public final int f13546a;
    public final int f13547b;
    public final int f13548c;
    public final int d;
    public final int f13549e;
    public final int f13550f;

    public d(int i7, int i10, int i11, int i12, int i13, int i14) {
        this.f13546a = i7;
        this.f13547b = i10;
        this.f13548c = i11;
        this.d = i12;
        this.f13549e = i13;
        this.f13550f = i14;
    }

    public final int a() {
        int i7 = this.f13546a;
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
