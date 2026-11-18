package org.telegram.messenger;

import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class us {
    public final int f27225a;
    public final long f27226b;
    public final boolean f27227c;
    public final String d;
    public final TLRPC.User f27228e;
    public final TLRPC.Chat f27229f;
    public final e0.q f27230g;
    public final long h;
    public final String f27231i;
    public final long[] f27232j;
    public final int f27233k;
    public final Uri f27234l;
    public final int f27235m;
    public final boolean f27236n;
    public final boolean f27237o;
    public final boolean f27238p;
    public final int f27239q;
    public final xs f27240r;

    public us(xs xsVar, int i7, long j3, boolean z10, String str, TLRPC.User user, TLRPC.Chat chat, e0.q qVar, long j10, String str2, long[] jArr, int i10, Uri uri, int i11, boolean z11, boolean z12, boolean z13, int i12) {
        this.f27240r = xsVar;
        this.h = j10;
        this.f27231i = str2;
        this.f27232j = jArr;
        this.f27233k = i10;
        this.f27234l = uri;
        this.f27235m = i11;
        this.f27236n = z11;
        this.f27237o = z12;
        this.f27238p = z13;
        this.f27239q = i12;
        this.f27225a = i7;
        this.d = str;
        this.f27228e = user;
        this.f27229f = chat;
        this.f27230g = qVar;
        this.f27226b = j3;
        this.f27227c = z10;
    }

    public final void a() {
        e0.q qVar = this.f27230g;
        boolean z10 = s2.f26721a;
        int i7 = this.f27225a;
        if (z10) {
            StringBuilder m10 = i5.c.m(i7, "show dialog notification with id ", " ");
            m10.append(this.f27226b);
            m10.append(" user=");
            m10.append(this.f27228e);
            m10.append(" chat=");
            m10.append(this.f27229f);
            a8.l(m10.toString());
        }
        try {
            xs.m0.e(null, i7, qVar.b());
        } catch (SecurityException e10) {
            a8.g(e10, true);
            this.f27240r.P(qVar, this.f27226b, this.h, this.f27231i, this.f27232j, this.f27233k, this.f27234l, this.f27235m, this.f27236n, this.f27237o, this.f27238p, this.f27239q);
        }
    }
}
