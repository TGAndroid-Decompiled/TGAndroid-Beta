package li;

import org.telegram.tgnet.TLRPC;
public final class t {
    public int f17477a = 0;
    public boolean f17478b;
    public boolean f17479c;
    public boolean d;
    public String e;
    public float f17480f;
    public TLRPC.Photo f17481g;
    public TLRPC.Document h;
    public TLRPC.Document f17482i;
    public int f17483j;
    public int f17484k;
    public int f17485l;
    public int f17486m;
    public boolean f17487n;

    public final boolean a() {
        if (this.f17477a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f17477a == 2) {
            if (!this.f17478b && !this.f17479c && !this.d) {
                if (this.f17481g != null) {
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
