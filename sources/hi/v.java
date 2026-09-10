package hi;

import org.telegram.tgnet.TLRPC;
public final class v {
    public int f9894a = 0;
    public boolean f9895b;
    public boolean f9896c;
    public boolean d;
    public String e;
    public float f9897f;
    public TLRPC.Photo f9898g;
    public TLRPC.Document h;
    public TLRPC.Document f9899i;
    public int f9900j;
    public int f9901k;
    public int f9902l;
    public int f9903m;
    public boolean f9904n;

    public final boolean a() {
        if (this.f9894a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f9894a == 2) {
            if (!this.f9895b && !this.f9896c && !this.d) {
                if (this.f9898g != null) {
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
