package oi;

import org.telegram.tgnet.TLRPC;
public final class r {
    public int f22344a = 0;
    public boolean f22345b;
    public boolean f22346c;
    public boolean d;
    public String f22347e;
    public float f22348f;
    public TLRPC.Photo f22349g;
    public TLRPC.Document h;
    public TLRPC.Document f22350i;
    public int f22351j;
    public int f22352k;
    public int f22353l;
    public int f22354m;
    public boolean f22355n;

    public final boolean a() {
        if (this.f22344a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f22344a == 2) {
            if (!this.f22345b && !this.f22346c && !this.d) {
                if (this.f22349g != null) {
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
