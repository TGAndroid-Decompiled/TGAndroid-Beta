package ki;

import org.telegram.tgnet.TLRPC;
public final class t {
    public int f15508a = 0;
    public boolean f15509b;
    public boolean f15510c;
    public boolean d;
    public String e;
    public float f15511f;
    public TLRPC.Photo f15512g;
    public TLRPC.Document h;
    public TLRPC.Document f15513i;
    public int f15514j;
    public int f15515k;
    public int f15516l;
    public int f15517m;
    public boolean f15518n;

    public final boolean a() {
        if (this.f15508a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f15508a == 2) {
            if (!this.f15509b && !this.f15510c && !this.d) {
                if (this.f15512g != null) {
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
