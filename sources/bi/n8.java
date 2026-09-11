package bi;

import org.telegram.tgnet.ConnectionsManager;
public final class n8 {
    public int f3375a;
    public long f3376b;
    public int f3377c;

    public n8(int i10, int i11, long j3) {
        this.f3377c = i10;
        this.f3376b = j3;
        this.f3375a = i11;
    }

    public boolean a(int i10, int i11) {
        int i12 = this.f3377c;
        if (i12 != 1) {
            if ((i12 == 2 || i12 == 3) && ConnectionsManager.getInstance(i10).getCurrentTime() >= this.f3376b) {
                return false;
            }
        } else if (this.f3375a >= i11) {
            return false;
        }
        return true;
    }

    public int b() {
        int i10 = this.f3377c;
        if (i10 != 2) {
            if (i10 != 3) {
                return 14;
            }
            return 16;
        }
        return 15;
    }
}
