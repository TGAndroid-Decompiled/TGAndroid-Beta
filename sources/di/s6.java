package di;

import org.telegram.tgnet.ConnectionsManager;
public final class s6 implements f3.g0 {
    public final int f9766a = 1;
    public int f9767b;
    public long f9768c;
    public int d;

    public s6() {
    }

    public boolean a(int i7, int i10) {
        int i11 = this.d;
        if (i11 != 1) {
            if ((i11 == 2 || i11 == 3) && ConnectionsManager.getInstance(i7).getCurrentTime() >= this.f9768c) {
                return false;
            }
        } else if (this.f9767b >= i10) {
            return false;
        }
        return true;
    }

    public int b() {
        int i7 = this.d;
        if (i7 != 2) {
            if (i7 != 3) {
                return 14;
            }
            return 16;
        }
        return 15;
    }

    public String toString() {
        switch (this.f9766a) {
            case 3:
                StringBuilder sb2 = new StringBuilder("AtomSizeTooSmall{type=");
                sb2.append(h2.m0.e0(this.f9767b));
                sb2.append(", size=");
                sb2.append(this.f9768c);
                sb2.append(", minHeaderSize=");
                return a8.p0.n(this.d, "}", sb2);
            default:
                return super.toString();
        }
    }

    public s6(int i7, long j3, int i10) {
        this.f9767b = i7;
        this.f9768c = j3;
        this.d = i10;
    }

    public s6(long j3, int i7, int i10) {
        this.f9768c = j3;
        this.f9767b = i7;
        this.d = i10;
    }

    public s6(int i7, int i10, long j3) {
        this.d = i7;
        this.f9768c = j3;
        this.f9767b = i10;
    }
}
