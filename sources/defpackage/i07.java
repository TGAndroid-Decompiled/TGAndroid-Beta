package defpackage;

import org.telegram.tgnet.TLRPC;
public final class i07 {
    public byte a = 0;
    public boolean b;
    public boolean c;
    public boolean d;
    public String e;
    public float f;
    public TLRPC.Photo g;
    public TLRPC.Document h;
    public TLRPC.Document i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;

    public final boolean a() {
        if (this.a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.a == 2) {
            if (!this.b && !this.c && !this.d) {
                if (this.g != null) {
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
