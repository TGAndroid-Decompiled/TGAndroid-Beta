package bi;

import org.telegram.tgnet.ConnectionsManager;
public final class q8 implements c3.f0 {
    public final int f3594a = 1;
    public int f3595b;
    public long f3596c;
    public int d;

    public q8() {
    }

    public boolean a(int i10, int i11) {
        int i12 = this.d;
        if (i12 != 1) {
            if ((i12 == 2 || i12 == 3) && ConnectionsManager.getInstance(i10).getCurrentTime() >= this.f3596c) {
                return false;
            }
        } else if (this.f3595b >= i11) {
            return false;
        }
        return true;
    }

    public int b() {
        int i10 = this.d;
        if (i10 != 2) {
            if (i10 != 3) {
                return 14;
            }
            return 16;
        }
        return 15;
    }

    public String toString() {
        switch (this.f3594a) {
            case 2:
                StringBuilder sb2 = new StringBuilder("AtomSizeTooSmall{type=");
                sb2.append(e2.m0.e0(this.f3595b));
                sb2.append(", size=");
                sb2.append(this.f3596c);
                sb2.append(", minHeaderSize=");
                return a1.g.n(this.d, "}", sb2);
            default:
                return super.toString();
        }
    }

    public q8(int i10, long j10, int i11) {
        this.f3595b = i10;
        this.f3596c = j10;
        this.d = i11;
    }

    public q8(int i10, int i11, long j10) {
        this.d = i10;
        this.f3596c = j10;
        this.f3595b = i11;
    }
}
