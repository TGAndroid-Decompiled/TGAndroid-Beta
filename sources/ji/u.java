package ji;

import org.telegram.tgnet.TLRPC;
public final class u {
    public int f14221a = 0;
    public boolean f14222b;
    public boolean f14223c;
    public boolean d;
    public String f14224e;
    public float f14225f;
    public TLRPC.Photo f14226g;
    public TLRPC.Document h;
    public TLRPC.Document f14227i;
    public int f14228j;
    public int f14229k;
    public int f14230l;
    public int f14231m;
    public boolean f14232n;

    public final boolean a() {
        if (this.f14221a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f14221a == 2) {
            if (!this.f14222b && !this.f14223c && !this.d) {
                if (this.f14226g != null) {
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
