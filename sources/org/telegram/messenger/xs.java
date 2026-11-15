package org.telegram.messenger;

import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class xs {
    public final int f27578a;
    public final long f27579b;
    public final boolean f27580c;
    public final String d;
    public final TLRPC.User f27581e;
    public final TLRPC.Chat f27582f;
    public final e0.q f27583g;
    public final long h;
    public final String f27584i;
    public final long[] f27585j;
    public final int f27586k;
    public final Uri f27587l;
    public final int f27588m;
    public final boolean f27589n;
    public final boolean f27590o;
    public final boolean f27591p;
    public final int f27592q;
    public final at f27593r;

    public xs(at atVar, int i7, long j3, boolean z10, String str, TLRPC.User user, TLRPC.Chat chat, e0.q qVar, long j10, String str2, long[] jArr, int i10, Uri uri, int i11, boolean z11, boolean z12, boolean z13, int i12) {
        this.f27593r = atVar;
        this.h = j10;
        this.f27584i = str2;
        this.f27585j = jArr;
        this.f27586k = i10;
        this.f27587l = uri;
        this.f27588m = i11;
        this.f27589n = z11;
        this.f27590o = z12;
        this.f27591p = z13;
        this.f27592q = i12;
        this.f27578a = i7;
        this.d = str;
        this.f27581e = user;
        this.f27582f = chat;
        this.f27583g = qVar;
        this.f27579b = j3;
        this.f27580c = z10;
    }

    public final void a() {
        e0.q qVar = this.f27583g;
        boolean z10 = r2.f26206a;
        int i7 = this.f27578a;
        if (z10) {
            StringBuilder m10 = i5.c.m(i7, "show dialog notification with id ", " ");
            m10.append(this.f27579b);
            m10.append(" user=");
            m10.append(this.f27581e);
            m10.append(" chat=");
            m10.append(this.f27582f);
            a8.l(m10.toString());
        }
        try {
            at.m0.e(null, i7, qVar.b());
        } catch (SecurityException e10) {
            a8.g(e10, true);
            this.f27593r.P(qVar, this.f27579b, this.h, this.f27584i, this.f27585j, this.f27586k, this.f27587l, this.f27588m, this.f27589n, this.f27590o, this.f27591p, this.f27592q);
        }
    }
}
