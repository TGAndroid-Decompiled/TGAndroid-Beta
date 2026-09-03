package oh;

import org.telegram.tgnet.ConnectionsManager;
public final class n6 {
    public final int f17500a;
    public final int f17501b;
    public final long f17502c;

    public n6(int i10, int i11, long j10) {
        this.f17501b = i10;
        this.f17502c = j10;
        this.f17500a = i11;
    }

    public final boolean a(int i10, int i11) {
        int i12 = this.f17501b;
        if (i12 != 1) {
            if ((i12 == 2 || i12 == 3) && ConnectionsManager.getInstance(i10).getCurrentTime() >= this.f17502c) {
                return false;
            }
        } else if (this.f17500a >= i11) {
            return false;
        }
        return true;
    }

    public final int b() {
        int i10 = this.f17501b;
        if (i10 != 2) {
            if (i10 != 3) {
                return 14;
            }
            return 16;
        }
        return 15;
    }
}
