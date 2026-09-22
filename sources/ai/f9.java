package ai;

import org.telegram.tgnet.ConnectionsManager;
public final class f9 {
    public int f879a;
    public long f880b;
    public int f881c;

    public f9(int i10, int i11, long j3) {
        this.f881c = i10;
        this.f880b = j3;
        this.f879a = i11;
    }

    public boolean a(int i10, int i11) {
        int i12 = this.f881c;
        if (i12 != 1) {
            if ((i12 == 2 || i12 == 3) && ConnectionsManager.getInstance(i10).getCurrentTime() >= this.f880b) {
                return false;
            }
        } else if (this.f879a >= i11) {
            return false;
        }
        return true;
    }

    public int b() {
        int i10 = this.f881c;
        if (i10 != 2) {
            if (i10 != 3) {
                return 14;
            }
            return 16;
        }
        return 15;
    }
}
