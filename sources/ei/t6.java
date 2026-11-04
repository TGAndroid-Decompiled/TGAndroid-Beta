package ei;

import org.telegram.tgnet.ConnectionsManager;
public final class t6 implements e3.f0 {
    public final int f11052a = 1;
    public int f11053b;
    public long f11054c;
    public int d;

    public t6() {
    }

    public boolean a(int i3, int i10) {
        int i11 = this.d;
        if (i11 != 1) {
            if ((i11 == 2 || i11 == 3) && ConnectionsManager.getInstance(i3).getCurrentTime() >= this.f11054c) {
                return false;
            }
        } else if (this.f11053b >= i10) {
            return false;
        }
        return true;
    }

    public int b() {
        int i3 = this.d;
        if (i3 != 2) {
            if (i3 != 3) {
                return 14;
            }
            return 16;
        }
        return 15;
    }

    public String toString() {
        switch (this.f11052a) {
            case 3:
                StringBuilder sb2 = new StringBuilder("AtomSizeTooSmall{type=");
                sb2.append(g2.n0.e0(this.f11053b));
                sb2.append(", size=");
                sb2.append(this.f11054c);
                sb2.append(", minHeaderSize=");
                return a1.g.o(this.d, "}", sb2);
            default:
                return super.toString();
        }
    }

    public t6(int i3, long j10, int i10) {
        this.f11053b = i3;
        this.f11054c = j10;
        this.d = i10;
    }

    public t6(long j10, int i3, int i10) {
        this.f11054c = j10;
        this.f11053b = i3;
        this.d = i10;
    }

    public t6(int i3, int i10, long j10) {
        this.d = i3;
        this.f11054c = j10;
        this.f11053b = i10;
    }
}
