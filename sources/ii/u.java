package ii;

import org.telegram.tgnet.TLRPC;
public final class u {
    public int f11638a = 0;
    public boolean f11639b;
    public boolean f11640c;
    public boolean d;
    public String e;
    public float f11641f;
    public TLRPC.Photo f11642g;
    public TLRPC.Document h;
    public TLRPC.Document f11643i;
    public int f11644j;
    public int f11645k;
    public int f11646l;
    public int f11647m;
    public boolean f11648n;

    public final boolean a() {
        if (this.f11638a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f11638a == 2) {
            if (!this.f11639b && !this.f11640c && !this.d) {
                if (this.f11642g != null) {
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
