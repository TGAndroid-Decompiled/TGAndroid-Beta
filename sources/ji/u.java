package ji;

import org.telegram.tgnet.TLRPC;
public final class u {
    public int f13538a = 0;
    public boolean f13539b;
    public boolean f13540c;
    public boolean d;
    public String e;
    public float f13541f;
    public TLRPC.Photo f13542g;
    public TLRPC.Document h;
    public TLRPC.Document f13543i;
    public int f13544j;
    public int f13545k;
    public int f13546l;
    public int f13547m;
    public boolean f13548n;

    public final boolean a() {
        if (this.f13538a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f13538a == 2) {
            if (!this.f13539b && !this.f13540c && !this.d) {
                if (this.f13542g != null) {
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
