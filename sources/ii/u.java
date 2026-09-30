package ii;

import org.telegram.tgnet.TLRPC;
public final class u {
    public int f11647a = 0;
    public boolean f11648b;
    public boolean f11649c;
    public boolean d;
    public String e;
    public float f11650f;
    public TLRPC.Photo f11651g;
    public TLRPC.Document h;
    public TLRPC.Document f11652i;
    public int f11653j;
    public int f11654k;
    public int f11655l;
    public int f11656m;
    public boolean f11657n;

    public final boolean a() {
        if (this.f11647a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f11647a == 2) {
            if (!this.f11648b && !this.f11649c && !this.d) {
                if (this.f11651g != null) {
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
