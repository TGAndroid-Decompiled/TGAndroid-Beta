package nh;

import org.telegram.tgnet.ConnectionsManager;
public final class n6 {
    public final int f15664a;
    public final int f15665b;
    public final long f15666c;

    public n6(int i10, int i11, long j10) {
        this.f15665b = i10;
        this.f15666c = j10;
        this.f15664a = i11;
    }

    public final boolean a(int i10, int i11) {
        int i12 = this.f15665b;
        if (i12 != 1) {
            if ((i12 == 2 || i12 == 3) && ConnectionsManager.getInstance(i10).getCurrentTime() >= this.f15666c) {
                return false;
            }
        } else if (this.f15664a >= i11) {
            return false;
        }
        return true;
    }

    public final int b() {
        int i10 = this.f15665b;
        if (i10 != 2) {
            if (i10 != 3) {
                return 14;
            }
            return 16;
        }
        return 15;
    }
}
