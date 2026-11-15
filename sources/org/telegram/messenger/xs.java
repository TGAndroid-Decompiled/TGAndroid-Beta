package org.telegram.messenger;

import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class xs {
    public final int f27576a;
    public final long f27577b;
    public final boolean f27578c;
    public final String d;
    public final TLRPC.User f27579e;
    public final TLRPC.Chat f27580f;
    public final e0.q f27581g;
    public final long h;
    public final String f27582i;
    public final long[] f27583j;
    public final int f27584k;
    public final Uri f27585l;
    public final int f27586m;
    public final boolean f27587n;
    public final boolean f27588o;
    public final boolean f27589p;
    public final int f27590q;
    public final at f27591r;

    public xs(at atVar, int i7, long j3, boolean z10, String str, TLRPC.User user, TLRPC.Chat chat, e0.q qVar, long j10, String str2, long[] jArr, int i10, Uri uri, int i11, boolean z11, boolean z12, boolean z13, int i12) {
        this.f27591r = atVar;
        this.h = j10;
        this.f27582i = str2;
        this.f27583j = jArr;
        this.f27584k = i10;
        this.f27585l = uri;
        this.f27586m = i11;
        this.f27587n = z11;
        this.f27588o = z12;
        this.f27589p = z13;
        this.f27590q = i12;
        this.f27576a = i7;
        this.d = str;
        this.f27579e = user;
        this.f27580f = chat;
        this.f27581g = qVar;
        this.f27577b = j3;
        this.f27578c = z10;
    }

    public final void a() {
        e0.q qVar = this.f27581g;
        boolean z10 = r2.f26198a;
        int i7 = this.f27576a;
        if (z10) {
            StringBuilder m10 = i5.c.m(i7, "show dialog notification with id ", " ");
            m10.append(this.f27577b);
            m10.append(" user=");
            m10.append(this.f27579e);
            m10.append(" chat=");
            m10.append(this.f27580f);
            a8.l(m10.toString());
        }
        try {
            at.m0.e(null, i7, qVar.b());
        } catch (SecurityException e10) {
            a8.g(e10, true);
            this.f27591r.P(qVar, this.f27577b, this.h, this.f27582i, this.f27583j, this.f27584k, this.f27585l, this.f27586m, this.f27587n, this.f27588o, this.f27589p, this.f27590q);
        }
    }
}
