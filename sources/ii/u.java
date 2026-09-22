package ii;

import org.telegram.tgnet.TLRPC;
public final class u {
    public int f11637a = 0;
    public boolean f11638b;
    public boolean f11639c;
    public boolean d;
    public String e;
    public float f11640f;
    public TLRPC.Photo f11641g;
    public TLRPC.Document h;
    public TLRPC.Document f11642i;
    public int f11643j;
    public int f11644k;
    public int f11645l;
    public int f11646m;
    public boolean f11647n;

    public final boolean a() {
        if (this.f11637a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f11637a == 2) {
            if (!this.f11638b && !this.f11639c && !this.d) {
                if (this.f11641g != null) {
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
