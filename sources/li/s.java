package li;

import org.telegram.tgnet.TLRPC;
public final class s {
    public int f18814a = 0;
    public boolean f18815b;
    public boolean f18816c;
    public boolean d;
    public String f18817e;
    public float f18818f;
    public TLRPC.Photo f18819g;
    public TLRPC.Document h;
    public TLRPC.Document f18820i;
    public int f18821j;
    public int f18822k;
    public int f18823l;
    public int f18824m;
    public boolean f18825n;

    public final boolean a() {
        if (this.f18814a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f18814a == 2) {
            if (!this.f18815b && !this.f18816c && !this.d) {
                if (this.f18819g != null) {
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
