package jh;

import org.telegram.tgnet.ConnectionsManager;

public final class l6 {

    public final int f13623a;

    public final int f13624b;

    public final long f13625c;

    public l6(int i10, int i11, long j10) {
        this.f13624b = i10;
        this.f13625c = j10;
        this.f13623a = i11;
    }

    public final boolean a(int i10, int i11) {
        int i12 = this.f13624b;
        if (i12 != 1) {
            if ((i12 == 2 || i12 == 3) && ConnectionsManager.getInstance(i10).getCurrentTime() >= this.f13625c) {
                return false;
            }
        } else if (this.f13623a >= i11) {
            return false;
        }
        return true;
    }

    public final int b() {
        int i10 = this.f13624b;
        if (i10 != 2) {
            return i10 != 3 ? 14 : 16;
        }
        return 15;
    }
}
