package j4;

import e2.l0;
import org.telegram.tgnet.ConnectionsManager;
public final class w implements c3.f0 {
    public final int f9642a = 0;
    public long f9643b;
    public int f9644c;
    public int d;

    public w() {
    }

    public boolean a(int i10, int i11) {
        int i12 = this.d;
        if (i12 != 1) {
            if ((i12 == 2 || i12 == 3) && ConnectionsManager.getInstance(i10).getCurrentTime() >= this.f9643b) {
                return false;
            }
        } else if (this.f9644c >= i11) {
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
        switch (this.f9642a) {
            case 3:
                StringBuilder sb2 = new StringBuilder("AtomSizeTooSmall{type=");
                sb2.append(l0.e0(this.f9644c));
                sb2.append(", size=");
                sb2.append(this.f9643b);
                sb2.append(", minHeaderSize=");
                return a1.g.p(sb2, this.d, "}");
            default:
                return super.toString();
        }
    }

    public w(int i10, long j10, int i11) {
        this.f9644c = i10;
        this.f9643b = j10;
        this.d = i11;
    }

    public w(long j10, int i10, int i11) {
        this.f9643b = j10;
        this.f9644c = i10;
        this.d = i11;
    }

    public w(int i10, int i11, long j10) {
        this.d = i10;
        this.f9643b = j10;
        this.f9644c = i11;
    }
}
