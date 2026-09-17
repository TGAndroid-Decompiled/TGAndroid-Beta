package bi;

import org.telegram.tgnet.ConnectionsManager;
public final class n8 {
    public int f3402a;
    public long f3403b;
    public int f3404c;

    public n8(int i10, int i11, long j3) {
        this.f3404c = i10;
        this.f3403b = j3;
        this.f3402a = i11;
    }

    public boolean a(int i10, int i11) {
        int i12 = this.f3404c;
        if (i12 != 1) {
            if ((i12 == 2 || i12 == 3) && ConnectionsManager.getInstance(i10).getCurrentTime() >= this.f3403b) {
                return false;
            }
        } else if (this.f3402a >= i11) {
            return false;
        }
        return true;
    }

    public int b() {
        int i10 = this.f3404c;
        if (i10 != 2) {
            if (i10 != 3) {
                return 14;
            }
            return 16;
        }
        return 15;
    }
}
