package oi;

import org.telegram.tgnet.TLRPC;
public final class r {
    public int f22261a = 0;
    public boolean f22262b;
    public boolean f22263c;
    public boolean d;
    public String f22264e;
    public float f22265f;
    public TLRPC.Photo f22266g;
    public TLRPC.Document h;
    public TLRPC.Document f22267i;
    public int f22268j;
    public int f22269k;
    public int f22270l;
    public int f22271m;
    public boolean f22272n;

    public final boolean a() {
        if (this.f22261a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f22261a == 2) {
            if (!this.f22262b && !this.f22263c && !this.d) {
                if (this.f22266g != null) {
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
