package di;

import org.telegram.tgnet.ConnectionsManager;
public final class b7 implements c3.f0 {
    public final int f8436a = 1;
    public int f8437b;
    public long f8438c;
    public int d;

    public b7() {
    }

    public boolean a(int i10, int i11) {
        int i12 = this.d;
        if (i12 != 1) {
            if ((i12 == 2 || i12 == 3) && ConnectionsManager.getInstance(i10).getCurrentTime() >= this.f8438c) {
                return false;
            }
        } else if (this.f8437b >= i11) {
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
        switch (this.f8436a) {
            case 2:
                StringBuilder sb2 = new StringBuilder("AtomSizeTooSmall{type=");
                sb2.append(e2.n0.e0(this.f8437b));
                sb2.append(", size=");
                sb2.append(this.f8438c);
                sb2.append(", minHeaderSize=");
                return a1.g.n(this.d, "}", sb2);
            default:
                return super.toString();
        }
    }

    public b7(int i10, long j10, int i11) {
        this.f8437b = i10;
        this.f8438c = j10;
        this.d = i11;
    }

    public b7(int i10, int i11, long j10) {
        this.d = i10;
        this.f8438c = j10;
        this.f8437b = i11;
    }
}
