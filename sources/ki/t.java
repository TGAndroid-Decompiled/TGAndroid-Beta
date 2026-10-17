package ki;

import org.telegram.tgnet.TLRPC;
public final class t {
    public int f15502a = 0;
    public boolean f15503b;
    public boolean f15504c;
    public boolean d;
    public String e;
    public float f15505f;
    public TLRPC.Photo f15506g;
    public TLRPC.Document h;
    public TLRPC.Document f15507i;
    public int f15508j;
    public int f15509k;
    public int f15510l;
    public int f15511m;
    public boolean f15512n;

    public final boolean a() {
        if (this.f15502a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f15502a == 2) {
            if (!this.f15503b && !this.f15504c && !this.d) {
                if (this.f15506g != null) {
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
