package j4;

import org.telegram.tgnet.ConnectionsManager;
public final class w {
    public int f11745a;
    public int f11746b;
    public long f11747c;

    public w(int i10, int i11, long j3) {
        this.f11746b = i10;
        this.f11747c = j3;
        this.f11745a = i11;
    }

    public boolean a(int i10, int i11) {
        int i12 = this.f11746b;
        if (i12 != 1) {
            if ((i12 == 2 || i12 == 3) && ConnectionsManager.getInstance(i10).getCurrentTime() >= this.f11747c) {
                return false;
            }
        } else if (this.f11745a >= i11) {
            return false;
        }
        return true;
    }

    public int b() {
        int i10 = this.f11746b;
        if (i10 != 2) {
            if (i10 != 3) {
                return 14;
            }
            return 16;
        }
        return 15;
    }
}
