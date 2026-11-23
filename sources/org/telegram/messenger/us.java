package org.telegram.messenger;

import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class us {
    public final int f27329a;
    public final long f27330b;
    public final boolean f27331c;
    public final String d;
    public final TLRPC.User f27332e;
    public final TLRPC.Chat f27333f;
    public final e0.q f27334g;
    public final long h;
    public final String f27335i;
    public final long[] f27336j;
    public final int f27337k;
    public final Uri f27338l;
    public final int f27339m;
    public final boolean f27340n;
    public final boolean f27341o;
    public final boolean f27342p;
    public final int f27343q;
    public final xs f27344r;

    public us(xs xsVar, int i7, long j3, boolean z10, String str, TLRPC.User user, TLRPC.Chat chat, e0.q qVar, long j10, String str2, long[] jArr, int i10, Uri uri, int i11, boolean z11, boolean z12, boolean z13, int i12) {
        this.f27344r = xsVar;
        this.h = j10;
        this.f27335i = str2;
        this.f27336j = jArr;
        this.f27337k = i10;
        this.f27338l = uri;
        this.f27339m = i11;
        this.f27340n = z11;
        this.f27341o = z12;
        this.f27342p = z13;
        this.f27343q = i12;
        this.f27329a = i7;
        this.d = str;
        this.f27332e = user;
        this.f27333f = chat;
        this.f27334g = qVar;
        this.f27330b = j3;
        this.f27331c = z10;
    }

    public final void a() {
        e0.q qVar = this.f27334g;
        boolean z10 = s2.f26829a;
        int i7 = this.f27329a;
        if (z10) {
            StringBuilder m10 = i5.c.m(i7, "show dialog notification with id ", " ");
            m10.append(this.f27330b);
            m10.append(" user=");
            m10.append(this.f27332e);
            m10.append(" chat=");
            m10.append(this.f27333f);
            a8.l(m10.toString());
        }
        try {
            xs.m0.e(null, i7, qVar.b());
        } catch (SecurityException e10) {
            a8.g(e10, true);
            this.f27344r.P(qVar, this.f27330b, this.h, this.f27335i, this.f27336j, this.f27337k, this.f27338l, this.f27339m, this.f27340n, this.f27341o, this.f27342p, this.f27343q);
        }
    }
}
