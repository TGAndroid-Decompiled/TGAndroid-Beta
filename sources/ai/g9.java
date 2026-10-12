package ai;

import org.telegram.tgnet.ConnectionsManager;
public final class g9 {
    public int f1057a;
    public long f1058b;
    public int f1059c;

    public g9(int i10, int i11, long j3) {
        this.f1059c = i10;
        this.f1058b = j3;
        this.f1057a = i11;
    }

    public boolean a(int i10, int i11) {
        int i12 = this.f1059c;
        if (i12 != 1) {
            if ((i12 == 2 || i12 == 3) && ConnectionsManager.getInstance(i10).getCurrentTime() >= this.f1058b) {
                return false;
            }
        } else if (this.f1057a >= i11) {
            return false;
        }
        return true;
    }

    public int b() {
        int i10 = this.f1059c;
        if (i10 != 2) {
            if (i10 != 3) {
                return 14;
            }
            return 16;
        }
        return 15;
    }
}
