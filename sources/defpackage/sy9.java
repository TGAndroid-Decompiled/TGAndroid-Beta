package defpackage;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class sy9 extends ja {
    public TLRPC.User c;
    public TLRPC.InputPeer d;
    public TLRPC.TL_help_country e;
    public String f;
    public String g;
    public byte h;
    public int i;
    public boolean j;
    public int k;
    public vzb l;
    public vzb m;
    public o7c n;
    public o7c o;
    public View p;

    public sy9(int i, boolean z) {
        super(i, z);
        this.k = -1;
    }

    public static sy9 b(String str) {
        sy9 sy9Var = new sy9(8, false);
        sy9Var.f = str;
        return sy9Var;
    }

    public static sy9 c(TLRPC.User user, boolean z) {
        sy9 sy9Var = new sy9(3, true);
        sy9Var.c = user;
        sy9Var.d = null;
        sy9Var.j = z;
        return sy9Var;
    }

    @Override
    public final boolean a(ja jaVar) {
        boolean z;
        boolean z2;
        if (this != jaVar) {
            if (sy9.class == jaVar.getClass()) {
                sy9 sy9Var = (sy9) jaVar;
                if (this.j == sy9Var.j) {
                    if (this.a == 8) {
                        if (TextUtils.equals(this.g, sy9Var.g)) {
                            if (this.l == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (sy9Var.l == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z != z2) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        long j;
        if (this != obj) {
            if (obj != null && sy9.class == obj.getClass()) {
                sy9 sy9Var = (sy9) obj;
                int i = this.a;
                if (i == sy9Var.a) {
                    if (i != -1 || this.k == sy9Var.k) {
                        if (i == 3) {
                            TLRPC.User user = this.c;
                            long j2 = 0;
                            if (user != null) {
                                j = user.id;
                            } else {
                                TLRPC.InputPeer inputPeer = this.d;
                                if (inputPeer != null) {
                                    j = cf3.m(inputPeer);
                                } else {
                                    j = 0;
                                }
                            }
                            TLRPC.User user2 = sy9Var.c;
                            if (user2 != null) {
                                j2 = user2.id;
                            } else {
                                TLRPC.InputPeer inputPeer2 = sy9Var.d;
                                if (inputPeer2 != null) {
                                    j2 = cf3.m(inputPeer2);
                                }
                            }
                            if (j != j2) {
                                return false;
                            }
                        }
                        int i2 = this.a;
                        if (i2 != 6 || this.e == sy9Var.e) {
                            if (i2 != 7 || TextUtils.equals(this.f, sy9Var.f)) {
                                if (this.a != 8 || TextUtils.equals(this.f, sy9Var.f)) {
                                    if (this.a != 9 || (TextUtils.equals(this.f, sy9Var.f) && this.h == sy9Var.h && this.i == sy9Var.i)) {
                                        if (this.a != 10 || this.p == sy9Var.p) {
                                            return true;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
