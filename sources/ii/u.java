package ii;

import org.telegram.tgnet.TLRPC;
public final class u {
    public int f11636a = 0;
    public boolean f11637b;
    public boolean f11638c;
    public boolean d;
    public String e;
    public float f11639f;
    public TLRPC.Photo f11640g;
    public TLRPC.Document h;
    public TLRPC.Document f11641i;
    public int f11642j;
    public int f11643k;
    public int f11644l;
    public int f11645m;
    public boolean f11646n;

    public final boolean a() {
        if (this.f11636a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f11636a == 2) {
            if (!this.f11637b && !this.f11638c && !this.d) {
                if (this.f11640g != null) {
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
