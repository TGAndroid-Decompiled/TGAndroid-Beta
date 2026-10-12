package ji;

import org.telegram.tgnet.TLRPC;
public final class u {
    public int f13535a = 0;
    public boolean f13536b;
    public boolean f13537c;
    public boolean d;
    public String e;
    public float f13538f;
    public TLRPC.Photo f13539g;
    public TLRPC.Document h;
    public TLRPC.Document f13540i;
    public int f13541j;
    public int f13542k;
    public int f13543l;
    public int f13544m;
    public boolean f13545n;

    public final boolean a() {
        if (this.f13535a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f13535a == 2) {
            if (!this.f13536b && !this.f13537c && !this.d) {
                if (this.f13539g != null) {
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
