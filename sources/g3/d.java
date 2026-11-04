package g3;
public final class d implements a {
    public final int f11946a;
    public final int f11947b;
    public final int f11948c;
    public final int d;
    public final int f11949e;
    public final int f11950f;

    public d(int i3, int i10, int i11, int i12, int i13, int i14) {
        this.f11946a = i3;
        this.f11947b = i10;
        this.f11948c = i11;
        this.d = i12;
        this.f11949e = i13;
        this.f11950f = i14;
    }

    public final int a() {
        int i3 = this.f11946a;
        if (i3 != 1935960438) {
            if (i3 != 1935963489) {
                if (i3 != 1937012852) {
                    g2.a.l("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i3));
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
