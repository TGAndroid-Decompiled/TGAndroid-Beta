package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class txc {
    public long A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public int G;
    public double H;
    public double I;
    public double J;
    public long K;
    public boolean L;
    public int M;
    public boolean N;
    public final Runnable O;
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
    public final boolean o;
    public ss0 p;
    public String q;
    public String r;
    public long s;
    public TLRPC.TL_messageMediaWidget t;
    public String u;
    public cyc v;
    public al9 w;
    public final ArrayList x;
    public al9 y;
    public int z;

    public txc(String str, int i, long j, int i2, long j2, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z) {
        boolean z2;
        boolean z3;
        this.x = new ArrayList();
        this.O = new cpc(this, (byte) 14);
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = i2;
        this.n = j2;
        this.e = Math.max(0, tL_messageMediaWidget.width);
        this.f = Math.max(0, tL_messageMediaWidget.height);
        this.g = tL_messageMediaWidget.payload;
        this.k = z;
        boolean z4 = true;
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
        this.j = (z || !tL_messageMediaWidget.background_query || i2 <= 0) ? false : z4;
        this.l = tL_messageMediaWidget.widget_id;
        String str2 = null;
        if (!z && !z2) {
            if (pg3.D(j)) {
                str2 = "private";
            } else {
                TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
                if (L0 != null) {
                    str2 = !sd2.T(L0) ? "group" : L0.megagroup ? "supergroup" : "channel";
                }
            }
        }
        this.m = str2;
        this.t = tL_messageMediaWidget;
        this.q = wxc.D(tL_messageMediaWidget.chat_data);
        this.r = wxc.D(tL_messageMediaWidget.public_data);
        this.s = tL_messageMediaWidget.public_data_hash;
        this.o = false;
    }

    public final String a() {
        long j = this.c;
        return wxc.C(this.b, this.d, j);
    }

    public txc(String str, int i, long j, TL_bots.TL_botProfileWidget tL_botProfileWidget) {
        this.x = new ArrayList();
        this.O = new cpc(this, (byte) 14);
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = 0;
        this.n = j;
        this.e = 0;
        this.f = 0;
        this.g = tL_botProfileWidget.payload;
        this.k = false;
        this.h = false;
        this.i = tL_botProfileWidget.can_query;
        this.j = tL_botProfileWidget.background_query;
        this.l = 0L;
        this.m = null;
        this.t = null;
        this.q = wxc.D(tL_botProfileWidget.chat_data);
        this.r = wxc.D(tL_botProfileWidget.public_data);
        this.s = tL_botProfileWidget.public_data_hash;
        this.o = true;
    }
}
