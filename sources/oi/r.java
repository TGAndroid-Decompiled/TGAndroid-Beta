package oi;

import org.telegram.tgnet.TLRPC;
public final class r {
    public int f22341a = 0;
    public boolean f22342b;
    public boolean f22343c;
    public boolean d;
    public String f22344e;
    public float f22345f;
    public TLRPC.Photo f22346g;
    public TLRPC.Document h;
    public TLRPC.Document f22347i;
    public int f22348j;
    public int f22349k;
    public int f22350l;
    public int f22351m;
    public boolean f22352n;

    public final boolean a() {
        if (this.f22341a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f22341a == 2) {
            if (!this.f22342b && !this.f22343c && !this.d) {
                if (this.f22346g != null) {
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
