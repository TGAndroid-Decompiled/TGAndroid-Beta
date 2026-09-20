package ii;

import org.telegram.tgnet.TLRPC;
public final class u {
    public int f11639a = 0;
    public boolean f11640b;
    public boolean f11641c;
    public boolean d;
    public String e;
    public float f11642f;
    public TLRPC.Photo f11643g;
    public TLRPC.Document h;
    public TLRPC.Document f11644i;
    public int f11645j;
    public int f11646k;
    public int f11647l;
    public int f11648m;
    public boolean f11649n;

    public final boolean a() {
        if (this.f11639a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f11639a == 2) {
            if (!this.f11640b && !this.f11641c && !this.d) {
                if (this.f11643g != null) {
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
