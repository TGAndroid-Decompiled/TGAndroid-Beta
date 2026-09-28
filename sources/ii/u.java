package ii;

import org.telegram.tgnet.TLRPC;
public final class u {
    public int f11633a = 0;
    public boolean f11634b;
    public boolean f11635c;
    public boolean d;
    public String e;
    public float f11636f;
    public TLRPC.Photo f11637g;
    public TLRPC.Document h;
    public TLRPC.Document f11638i;
    public int f11639j;
    public int f11640k;
    public int f11641l;
    public int f11642m;
    public boolean f11643n;

    public final boolean a() {
        if (this.f11633a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f11633a == 2) {
            if (!this.f11634b && !this.f11635c && !this.d) {
                if (this.f11637g != null) {
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
