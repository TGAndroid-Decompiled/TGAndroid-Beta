package ai;

import org.telegram.tgnet.ConnectionsManager;
public final class g9 {
    public int f1059a;
    public long f1060b;
    public int f1061c;

    public g9(int i10, int i11, long j3) {
        this.f1061c = i10;
        this.f1060b = j3;
        this.f1059a = i11;
    }

    public boolean a(int i10, int i11) {
        int i12 = this.f1061c;
        if (i12 != 1) {
            if ((i12 == 2 || i12 == 3) && ConnectionsManager.getInstance(i10).getCurrentTime() >= this.f1060b) {
                return false;
            }
        } else if (this.f1059a >= i11) {
            return false;
        }
        return true;
    }

    public int b() {
        int i10 = this.f1061c;
        if (i10 != 2) {
            if (i10 != 3) {
                return 14;
            }
            return 16;
        }
        return 15;
    }
}
