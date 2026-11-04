package mi;

import org.telegram.tgnet.TLRPC;
public final class s {
    public int f19859a = 0;
    public boolean f19860b;
    public boolean f19861c;
    public boolean d;
    public String f19862e;
    public float f19863f;
    public TLRPC.Photo f19864g;
    public TLRPC.Document h;
    public TLRPC.Document f19865i;
    public int f19866j;
    public int f19867k;
    public int f19868l;
    public int f19869m;
    public boolean f19870n;

    public final boolean a() {
        if (this.f19859a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f19859a == 2) {
            if (!this.f19860b && !this.f19861c && !this.d) {
                if (this.f19864g != null) {
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
