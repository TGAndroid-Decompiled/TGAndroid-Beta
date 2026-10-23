package ci;

import org.telegram.tgnet.ConnectionsManager;
public final class b7 implements c3.i0 {
    public final int f5188a = 1;
    public int f5189b;
    public long f5190c;
    public int d;

    public b7() {
    }

    public boolean a(int i10, int i11) {
        int i12 = this.d;
        if (i12 != 1) {
            if ((i12 == 2 || i12 == 3) && ConnectionsManager.getInstance(i10).getCurrentTime() >= this.f5190c) {
                return false;
            }
        } else if (this.f5189b >= i11) {
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
        switch (this.f5188a) {
            case 2:
                StringBuilder sb2 = new StringBuilder("AtomSizeTooSmall{type=");
                sb2.append(e2.m0.e0(this.f5189b));
                sb2.append(", size=");
                sb2.append(this.f5190c);
                sb2.append(", minHeaderSize=");
                return a1.g.n(this.d, "}", sb2);
            default:
                return super.toString();
        }
    }

    public b7(int i10, long j10, int i11) {
        this.f5189b = i10;
        this.f5190c = j10;
        this.d = i11;
    }

    public b7(int i10, int i11, long j10) {
        this.d = i10;
        this.f5190c = j10;
        this.f5189b = i11;
    }
}
