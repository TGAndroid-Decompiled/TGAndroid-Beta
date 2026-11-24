package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class svc {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public double F;
    public double G;
    public double H;
    public long I;
    public boolean J;
    public int K;
    public boolean L;
    public final String a;
    public final int b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final long l;
    public final String m;
    public final long n;
    public String o;
    public String p;
    public long q;
    public TLRPC.TL_messageMediaWidget r;
    public String s;
    public bwc t;
    public zi9 u;
    public zi9 w;
    public int x;
    public long y;
    public boolean z;
    public final ArrayList v = new ArrayList();
    public final frc M = new frc(this, (byte) 6);

    public svc(String str, int i, long j, int i2, long j2, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z) {
        boolean z2;
        boolean z3;
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = i2;
        this.n = j2;
        boolean z4 = false;
        this.e = Math.max(0, tL_messageMediaWidget.width);
        this.f = Math.max(0, tL_messageMediaWidget.height);
        this.g = tL_messageMediaWidget.payload;
        this.k = z;
        if (!z && tL_messageMediaWidget.is_copy) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.h = z2;
        if (!z && tL_messageMediaWidget.can_query && i2 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.i = z3;
        if (!z && tL_messageMediaWidget.background_query && i2 > 0) {
            z4 = true;
        }
        this.j = z4;
        this.l = tL_messageMediaWidget.widget_id;
        String str2 = null;
        if (!z && !z2) {
            if (cf3.D(j)) {
                str2 = "private";
            } else {
                TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
                if (K0 != null) {
                    str2 = !hc2.T(K0) ? "group" : K0.megagroup ? "supergroup" : "channel";
                }
            }
        }
        this.m = str2;
        this.r = tL_messageMediaWidget;
        this.o = vvc.C(tL_messageMediaWidget.chat_data);
        this.p = vvc.C(tL_messageMediaWidget.public_data);
        this.q = tL_messageMediaWidget.public_data_hash;
    }

    public final String a() {
        long j = this.c;
        return vvc.B(this.b, this.d, j);
    }
}
