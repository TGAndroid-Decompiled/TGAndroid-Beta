package ii;

import org.telegram.tgnet.TLRPC;
public final class u {
    public int f12709a = 0;
    public boolean f12710b;
    public boolean f12711c;
    public boolean d;
    public String f12712e;
    public float f12713f;
    public TLRPC.Photo f12714g;
    public TLRPC.Document h;
    public TLRPC.Document f12715i;
    public int f12716j;
    public int f12717k;
    public int f12718l;
    public int f12719m;
    public boolean f12720n;

    public final boolean a() {
        if (this.f12709a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f12709a == 2) {
            if (!this.f12710b && !this.f12711c && !this.d) {
                if (this.f12714g != null) {
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
