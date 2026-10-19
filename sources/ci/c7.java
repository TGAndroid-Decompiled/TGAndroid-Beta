package ci;

import org.telegram.tgnet.ConnectionsManager;
public final class c7 implements c3.g0 {
    public final int f5289a = 1;
    public int f5290b;
    public long f5291c;
    public int d;

    public c7() {
    }

    public boolean a(int i10, int i11) {
        int i12 = this.d;
        if (i12 != 1) {
            if ((i12 == 2 || i12 == 3) && ConnectionsManager.getInstance(i10).getCurrentTime() >= this.f5291c) {
                return false;
            }
        } else if (this.f5290b >= i11) {
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
        switch (this.f5289a) {
            case 2:
                StringBuilder sb2 = new StringBuilder("AtomSizeTooSmall{type=");
                sb2.append(e2.m0.e0(this.f5290b));
                sb2.append(", size=");
                sb2.append(this.f5291c);
                sb2.append(", minHeaderSize=");
                return a1.g.n(this.d, "}", sb2);
            default:
                return super.toString();
        }
    }

    public c7(int i10, long j10, int i11) {
        this.f5290b = i10;
        this.f5291c = j10;
        this.d = i11;
    }

    public c7(int i10, int i11, long j10) {
        this.d = i10;
        this.f5291c = j10;
        this.f5290b = i11;
    }
}
