package oi;

import org.telegram.tgnet.TLRPC;
public final class s {
    public int f22421a = 0;
    public boolean f22422b;
    public boolean f22423c;
    public boolean d;
    public String f22424e;
    public float f22425f;
    public TLRPC.Photo f22426g;
    public TLRPC.Document h;
    public TLRPC.Document f22427i;
    public int f22428j;
    public int f22429k;
    public int f22430l;
    public int f22431m;
    public boolean f22432n;

    public final boolean a() {
        if (this.f22421a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f22421a == 2) {
            if (!this.f22422b && !this.f22423c && !this.d) {
                if (this.f22426g != null) {
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
