package ki;

import org.telegram.tgnet.TLRPC;
public final class t {
    public int f15568a = 0;
    public boolean f15569b;
    public boolean f15570c;
    public boolean d;
    public String e;
    public float f15571f;
    public TLRPC.Photo f15572g;
    public TLRPC.Document h;
    public TLRPC.Document f15573i;
    public int f15574j;
    public int f15575k;
    public int f15576l;
    public int f15577m;
    public boolean f15578n;

    public final boolean a() {
        if (this.f15568a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f15568a == 2) {
            if (!this.f15569b && !this.f15570c && !this.d) {
                if (this.f15572g != null) {
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
