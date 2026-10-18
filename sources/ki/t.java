package ki;

import org.telegram.tgnet.TLRPC;
public final class t {
    public int f15507a = 0;
    public boolean f15508b;
    public boolean f15509c;
    public boolean d;
    public String e;
    public float f15510f;
    public TLRPC.Photo f15511g;
    public TLRPC.Document h;
    public TLRPC.Document f15512i;
    public int f15513j;
    public int f15514k;
    public int f15515l;
    public int f15516m;
    public boolean f15517n;

    public final boolean a() {
        if (this.f15507a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f15507a == 2) {
            if (!this.f15508b && !this.f15509c && !this.d) {
                if (this.f15511g != null) {
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
