package defpackage;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m2a extends ka {
    public TLRPC.User c;
    public TLRPC.InputPeer d;
    public TLRPC.TL_help_country e;
    public String f;
    public String g;
    public byte h;
    public int i;
    public boolean j;
    public int k;
    public jjb l;
    public jjb m;
    public obc n;
    public obc o;
    public View p;

    public m2a(int i, boolean z) {
        super(i, z);
        this.k = -1;
    }

    public static m2a b(String str) {
        m2a m2aVar = new m2a(8, false);
        m2aVar.f = str;
        return m2aVar;
    }

    public static m2a c(TLRPC.User user, boolean z) {
        m2a m2aVar = new m2a(3, true);
        m2aVar.c = user;
        m2aVar.d = null;
        m2aVar.j = z;
        return m2aVar;
    }

    @Override
    public final boolean a(ka kaVar) {
        boolean z;
        boolean z2;
        if (this != kaVar) {
            if (m2a.class == kaVar.getClass()) {
                m2a m2aVar = (m2a) kaVar;
                if (this.j == m2aVar.j) {
                    if (this.a == 8) {
                        if (TextUtils.equals(this.g, m2aVar.g)) {
                            if (this.l == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (m2aVar.l == null) {
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
            if (obj != null && m2a.class == obj.getClass()) {
                m2a m2aVar = (m2a) obj;
                int i = this.a;
                if (i == m2aVar.a) {
                    if (i != -1 || this.k == m2aVar.k) {
                        if (i == 3) {
                            TLRPC.User user = this.c;
                            long j2 = 0;
                            if (user != null) {
                                j = user.id;
                            } else {
                                TLRPC.InputPeer inputPeer = this.d;
                                if (inputPeer != null) {
                                    j = wf3.m(inputPeer);
                                } else {
                                    j = 0;
                                }
                            }
                            TLRPC.User user2 = m2aVar.c;
                            if (user2 != null) {
                                j2 = user2.id;
                            } else {
                                TLRPC.InputPeer inputPeer2 = m2aVar.d;
                                if (inputPeer2 != null) {
                                    j2 = wf3.m(inputPeer2);
                                }
                            }
                            if (j != j2) {
                                return false;
                            }
                        }
                        int i2 = this.a;
                        if (i2 != 6 || this.e == m2aVar.e) {
                            if (i2 != 7 || TextUtils.equals(this.f, m2aVar.f)) {
                                if (this.a != 8 || TextUtils.equals(this.f, m2aVar.f)) {
                                    if (this.a != 9 || (TextUtils.equals(this.f, m2aVar.f) && this.h == m2aVar.h && this.i == m2aVar.i)) {
                                        if (this.a != 10 || this.p == m2aVar.p) {
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
