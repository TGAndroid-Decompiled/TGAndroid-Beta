package defpackage;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class u0a extends ja {
    public TLRPC.User c;
    public TLRPC.InputPeer d;
    public TLRPC.TL_help_country e;
    public String f;
    public String g;
    public byte h;
    public int i;
    public boolean j;
    public int k;
    public fyb l;
    public fyb m;
    public p9c n;
    public p9c o;
    public View p;

    public u0a(int i, boolean z) {
        super(i, z);
        this.k = -1;
    }

    public static u0a b(String str) {
        u0a u0aVar = new u0a(8, false);
        u0aVar.f = str;
        return u0aVar;
    }

    public static u0a c(TLRPC.User user, boolean z) {
        u0a u0aVar = new u0a(3, true);
        u0aVar.c = user;
        u0aVar.d = null;
        u0aVar.j = z;
        return u0aVar;
    }

    @Override
    public final boolean a(ja jaVar) {
        boolean z;
        boolean z2;
        if (this != jaVar) {
            if (u0a.class == jaVar.getClass()) {
                u0a u0aVar = (u0a) jaVar;
                if (this.j == u0aVar.j) {
                    if (this.a == 8) {
                        if (TextUtils.equals(this.g, u0aVar.g)) {
                            if (this.l == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (u0aVar.l == null) {
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
            if (obj != null && u0a.class == obj.getClass()) {
                u0a u0aVar = (u0a) obj;
                int i = this.a;
                if (i == u0aVar.a) {
                    if (i != -1 || this.k == u0aVar.k) {
                        if (i == 3) {
                            TLRPC.User user = this.c;
                            long j2 = 0;
                            if (user != null) {
                                j = user.id;
                            } else {
                                TLRPC.InputPeer inputPeer = this.d;
                                if (inputPeer != null) {
                                    j = pg3.m(inputPeer);
                                } else {
                                    j = 0;
                                }
                            }
                            TLRPC.User user2 = u0aVar.c;
                            if (user2 != null) {
                                j2 = user2.id;
                            } else {
                                TLRPC.InputPeer inputPeer2 = u0aVar.d;
                                if (inputPeer2 != null) {
                                    j2 = pg3.m(inputPeer2);
                                }
                            }
                            if (j != j2) {
                                return false;
                            }
                        }
                        int i2 = this.a;
                        if (i2 != 6 || this.e == u0aVar.e) {
                            if (i2 != 7 || TextUtils.equals(this.f, u0aVar.f)) {
                                if (this.a != 8 || TextUtils.equals(this.f, u0aVar.f)) {
                                    if (this.a != 9 || (TextUtils.equals(this.f, u0aVar.f) && this.h == u0aVar.h && this.i == u0aVar.i)) {
                                        if (this.a != 10 || this.p == u0aVar.p) {
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
