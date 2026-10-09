package ii;

import org.telegram.tgnet.TLRPC;
public final class u {
    public int f12710a = 0;
    public boolean f12711b;
    public boolean f12712c;
    public boolean d;
    public String f12713e;
    public float f12714f;
    public TLRPC.Photo f12715g;
    public TLRPC.Document h;
    public TLRPC.Document f12716i;
    public int f12717j;
    public int f12718k;
    public int f12719l;
    public int f12720m;
    public boolean f12721n;

    public final boolean a() {
        if (this.f12710a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f12710a == 2) {
            if (!this.f12711b && !this.f12712c && !this.d) {
                if (this.f12715g != null) {
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
