package ai;

import org.telegram.tgnet.ConnectionsManager;
public final class f9 {
    public int f877a;
    public long f878b;
    public int f879c;

    public f9(int i10, int i11, long j3) {
        this.f879c = i10;
        this.f878b = j3;
        this.f877a = i11;
    }

    public boolean a(int i10, int i11) {
        int i12 = this.f879c;
        if (i12 != 1) {
            if ((i12 == 2 || i12 == 3) && ConnectionsManager.getInstance(i10).getCurrentTime() >= this.f878b) {
                return false;
            }
        } else if (this.f877a >= i11) {
            return false;
        }
        return true;
    }

    public int b() {
        int i10 = this.f879c;
        if (i10 != 2) {
            if (i10 != 3) {
                return 14;
            }
            return 16;
        }
        return 15;
    }
}
