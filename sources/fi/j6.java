package fi;

import org.telegram.tgnet.ConnectionsManager;
public final class j6 implements f3.f0 {
    public final int f12159a = 1;
    public int f12160b;
    public long f12161c;
    public int d;

    public j6() {
    }

    public boolean a(int i7, int i10) {
        int i11 = this.d;
        if (i11 != 1) {
            if ((i11 == 2 || i11 == 3) && ConnectionsManager.getInstance(i7).getCurrentTime() >= this.f12161c) {
                return false;
            }
        } else if (this.f12160b >= i10) {
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
        switch (this.f12159a) {
            case 3:
                StringBuilder sb2 = new StringBuilder("AtomSizeTooSmall{type=");
                sb2.append(h2.l0.e0(this.f12160b));
                sb2.append(", size=");
                sb2.append(this.f12161c);
                sb2.append(", minHeaderSize=");
                return a8.p0.n(this.d, "}", sb2);
            default:
                return super.toString();
        }
    }

    public j6(int i7, long j3, int i10) {
        this.f12160b = i7;
        this.f12161c = j3;
        this.d = i10;
    }

    public j6(long j3, int i7, int i10) {
        this.f12161c = j3;
        this.f12160b = i7;
        this.d = i10;
    }

    public j6(int i7, int i10, long j3) {
        this.d = i7;
        this.f12161c = j3;
        this.f12160b = i10;
    }
}
