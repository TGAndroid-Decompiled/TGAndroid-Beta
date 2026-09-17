package ai;

import org.telegram.tgnet.ConnectionsManager;
public final class f9 {
    public int f882a;
    public long f883b;
    public int f884c;

    public f9(int i10, int i11, long j3) {
        this.f884c = i10;
        this.f883b = j3;
        this.f882a = i11;
    }

    public boolean a(int i10, int i11) {
        int i12 = this.f884c;
        if (i12 != 1) {
            if ((i12 == 2 || i12 == 3) && ConnectionsManager.getInstance(i10).getCurrentTime() >= this.f883b) {
                return false;
            }
        } else if (this.f882a >= i11) {
            return false;
        }
        return true;
    }

    public int b() {
        int i10 = this.f884c;
        if (i10 != 2) {
            if (i10 != 3) {
                return 14;
            }
            return 16;
        }
        return 15;
    }
}
