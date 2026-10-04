package ii;

import org.telegram.tgnet.TLRPC;
public final class u {
    public int f12662a = 0;
    public boolean f12663b;
    public boolean f12664c;
    public boolean d;
    public String f12665e;
    public float f12666f;
    public TLRPC.Photo f12667g;
    public TLRPC.Document h;
    public TLRPC.Document f12668i;
    public int f12669j;
    public int f12670k;
    public int f12671l;
    public int f12672m;
    public boolean f12673n;

    public final boolean a() {
        if (this.f12662a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f12662a == 2) {
            if (!this.f12663b && !this.f12664c && !this.d) {
                if (this.f12667g != null) {
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
