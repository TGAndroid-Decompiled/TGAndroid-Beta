package ki;

import org.telegram.tgnet.TLRPC;
public final class t {
    public int f15509a = 0;
    public boolean f15510b;
    public boolean f15511c;
    public boolean d;
    public String e;
    public float f15512f;
    public TLRPC.Photo f15513g;
    public TLRPC.Document h;
    public TLRPC.Document f15514i;
    public int f15515j;
    public int f15516k;
    public int f15517l;
    public int f15518m;
    public boolean f15519n;

    public final boolean a() {
        if (this.f15509a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f15509a == 2) {
            if (!this.f15510b && !this.f15511c && !this.d) {
                if (this.f15513g != null) {
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
