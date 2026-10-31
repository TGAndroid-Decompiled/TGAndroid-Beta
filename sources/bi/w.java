package bi;

import org.telegram.tgnet.TLRPC;
public final class w {
    public int f3416a = 0;
    public boolean f3417b;
    public boolean f3418c;
    public boolean d;
    public String e;
    public float f3419f;
    public TLRPC.Photo f3420g;
    public TLRPC.Document h;
    public TLRPC.Document f3421i;
    public int f3422j;
    public int f3423k;
    public int f3424l;
    public int f3425m;
    public boolean f3426n;

    public final boolean a() {
        if (this.f3416a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f3416a == 2) {
            if (!this.f3417b && !this.f3418c && !this.d) {
                if (this.f3420g != null) {
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
