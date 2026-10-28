package li;

import org.telegram.tgnet.TLRPC;
public final class t {
    public int f17476a = 0;
    public boolean f17477b;
    public boolean f17478c;
    public boolean d;
    public String e;
    public float f17479f;
    public TLRPC.Photo f17480g;
    public TLRPC.Document h;
    public TLRPC.Document f17481i;
    public int f17482j;
    public int f17483k;
    public int f17484l;
    public int f17485m;
    public boolean f17486n;

    public final boolean a() {
        if (this.f17476a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f17476a == 2) {
            if (!this.f17477b && !this.f17478c && !this.d) {
                if (this.f17480g != null) {
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
