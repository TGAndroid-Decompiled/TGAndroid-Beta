package ki;

import org.telegram.tgnet.TLRPC;
public final class t {
    public int f15510a = 0;
    public boolean f15511b;
    public boolean f15512c;
    public boolean d;
    public String e;
    public float f15513f;
    public TLRPC.Photo f15514g;
    public TLRPC.Document h;
    public TLRPC.Document f15515i;
    public int f15516j;
    public int f15517k;
    public int f15518l;
    public int f15519m;
    public boolean f15520n;

    public final boolean a() {
        if (this.f15510a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f15510a == 2) {
            if (!this.f15511b && !this.f15512c && !this.d) {
                if (this.f15514g != null) {
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
