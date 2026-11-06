package li;

import org.telegram.tgnet.TLRPC;
public final class s {
    public int f18811a = 0;
    public boolean f18812b;
    public boolean f18813c;
    public boolean d;
    public String f18814e;
    public float f18815f;
    public TLRPC.Photo f18816g;
    public TLRPC.Document h;
    public TLRPC.Document f18817i;
    public int f18818j;
    public int f18819k;
    public int f18820l;
    public int f18821m;
    public boolean f18822n;

    public final boolean a() {
        if (this.f18811a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f18811a == 2) {
            if (!this.f18812b && !this.f18813c && !this.d) {
                if (this.f18816g != null) {
                    return true;
                }
                return false;
            } else if (this.h != null) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
