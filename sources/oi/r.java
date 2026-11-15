package oi;

import org.telegram.tgnet.TLRPC;
public final class r {
    public int f21957a = 0;
    public boolean f21958b;
    public boolean f21959c;
    public boolean d;
    public String f21960e;
    public float f21961f;
    public TLRPC.Photo f21962g;
    public TLRPC.Document h;
    public TLRPC.Document f21963i;
    public int f21964j;
    public int f21965k;
    public int f21966l;
    public int f21967m;
    public boolean f21968n;

    public final boolean a() {
        if (this.f21957a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f21957a == 2) {
            if (!this.f21958b && !this.f21959c && !this.d) {
                if (this.f21962g != null) {
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
