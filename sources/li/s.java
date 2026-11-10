package li;

import org.telegram.tgnet.TLRPC;
public final class s {
    public int f18817a = 0;
    public boolean f18818b;
    public boolean f18819c;
    public boolean d;
    public String f18820e;
    public float f18821f;
    public TLRPC.Photo f18822g;
    public TLRPC.Document h;
    public TLRPC.Document f18823i;
    public int f18824j;
    public int f18825k;
    public int f18826l;
    public int f18827m;
    public boolean f18828n;

    public final boolean a() {
        if (this.f18817a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f18817a == 2) {
            if (!this.f18818b && !this.f18819c && !this.d) {
                if (this.f18822g != null) {
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
