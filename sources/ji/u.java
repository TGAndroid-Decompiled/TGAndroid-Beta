package ji;

import org.telegram.tgnet.TLRPC;
public final class u {
    public int f14195a = 0;
    public boolean f14196b;
    public boolean f14197c;
    public boolean d;
    public String f14198e;
    public float f14199f;
    public TLRPC.Photo f14200g;
    public TLRPC.Document h;
    public TLRPC.Document f14201i;
    public int f14202j;
    public int f14203k;
    public int f14204l;
    public int f14205m;
    public boolean f14206n;

    public final boolean a() {
        if (this.f14195a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f14195a == 2) {
            if (!this.f14196b && !this.f14197c && !this.d) {
                if (this.f14200g != null) {
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
