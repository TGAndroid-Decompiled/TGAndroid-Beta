package oi;

import org.telegram.tgnet.TLRPC;
public final class r {
    public int f22258a = 0;
    public boolean f22259b;
    public boolean f22260c;
    public boolean d;
    public String f22261e;
    public float f22262f;
    public TLRPC.Photo f22263g;
    public TLRPC.Document h;
    public TLRPC.Document f22264i;
    public int f22265j;
    public int f22266k;
    public int f22267l;
    public int f22268m;
    public boolean f22269n;

    public final boolean a() {
        if (this.f22258a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f22258a == 2) {
            if (!this.f22259b && !this.f22260c && !this.d) {
                if (this.f22263g != null) {
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
