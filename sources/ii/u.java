package ii;

import org.telegram.tgnet.TLRPC;
public final class u {
    public int f12663a = 0;
    public boolean f12664b;
    public boolean f12665c;
    public boolean d;
    public String f12666e;
    public float f12667f;
    public TLRPC.Photo f12668g;
    public TLRPC.Document h;
    public TLRPC.Document f12669i;
    public int f12670j;
    public int f12671k;
    public int f12672l;
    public int f12673m;
    public boolean f12674n;

    public final boolean a() {
        if (this.f12663a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f12663a == 2) {
            if (!this.f12664b && !this.f12665c && !this.d) {
                if (this.f12668g != null) {
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
