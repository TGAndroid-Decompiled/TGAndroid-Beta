package oi;

import org.telegram.tgnet.TLRPC;
public final class r {
    public int f22289a = 0;
    public boolean f22290b;
    public boolean f22291c;
    public boolean d;
    public String f22292e;
    public float f22293f;
    public TLRPC.Photo f22294g;
    public TLRPC.Document h;
    public TLRPC.Document f22295i;
    public int f22296j;
    public int f22297k;
    public int f22298l;
    public int f22299m;
    public boolean f22300n;

    public final boolean a() {
        if (this.f22289a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f22289a == 2) {
            if (!this.f22290b && !this.f22291c && !this.d) {
                if (this.f22294g != null) {
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
