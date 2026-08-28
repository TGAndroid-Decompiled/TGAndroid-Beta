package ih;

import org.telegram.tgnet.ConnectionsManager;
public final class p6 {
    public final int f11956a;
    public final int f11957b;
    public final long f11958c;

    public p6(int i9, int i10, long j10) {
        this.f11957b = i9;
        this.f11958c = j10;
        this.f11956a = i10;
    }

    public final boolean a(int i9, int i10) {
        int i11 = this.f11957b;
        if (i11 != 1) {
            if ((i11 == 2 || i11 == 3) && ConnectionsManager.getInstance(i9).getCurrentTime() >= this.f11958c) {
                return false;
            }
        } else if (this.f11956a >= i10) {
            return false;
        }
        return true;
    }

    public final int b() {
        int i9 = this.f11957b;
        if (i9 != 2) {
            if (i9 != 3) {
                return 14;
            }
            return 16;
        }
        return 15;
    }
}
