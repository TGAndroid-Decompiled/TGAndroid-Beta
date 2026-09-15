package ii;

import org.telegram.tgnet.TLRPC;
public final class u {
    public int f11635a = 0;
    public boolean f11636b;
    public boolean f11637c;
    public boolean d;
    public String e;
    public float f11638f;
    public TLRPC.Photo f11639g;
    public TLRPC.Document h;
    public TLRPC.Document f11640i;
    public int f11641j;
    public int f11642k;
    public int f11643l;
    public int f11644m;
    public boolean f11645n;

    public final boolean a() {
        if (this.f11635a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f11635a == 2) {
            if (!this.f11636b && !this.f11637c && !this.d) {
                if (this.f11639g != null) {
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
