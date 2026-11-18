package h3;
public final class d implements a {
    public final int f13858a;
    public final int f13859b;
    public final int f13860c;
    public final int d;
    public final int f13861e;
    public final int f13862f;

    public d(int i7, int i10, int i11, int i12, int i13, int i14) {
        this.f13858a = i7;
        this.f13859b = i10;
        this.f13860c = i11;
        this.d = i12;
        this.f13861e = i13;
        this.f13862f = i14;
    }

    public final int a() {
        int i7 = this.f13858a;
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
