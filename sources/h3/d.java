package h3;
public final class d implements a {
    public final int f13890a;
    public final int f13891b;
    public final int f13892c;
    public final int d;
    public final int f13893e;
    public final int f13894f;

    public d(int i7, int i10, int i11, int i12, int i13, int i14) {
        this.f13890a = i7;
        this.f13891b = i10;
        this.f13892c = i11;
        this.d = i12;
        this.f13893e = i13;
        this.f13894f = i14;
    }

    public final int a() {
        int i7 = this.f13890a;
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
