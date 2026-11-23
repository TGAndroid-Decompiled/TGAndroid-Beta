package org.telegram.messenger;

import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class vs {
    public final int f27553a;
    public final long f27554b;
    public final boolean f27555c;
    public final String d;
    public final TLRPC.User f27556e;
    public final TLRPC.Chat f27557f;
    public final e0.q f27558g;
    public final long h;
    public final String f27559i;
    public final long[] f27560j;
    public final int f27561k;
    public final Uri f27562l;
    public final int f27563m;
    public final boolean f27564n;
    public final boolean f27565o;
    public final boolean f27566p;
    public final int f27567q;
    public final ys f27568r;

    public vs(ys ysVar, int i7, long j3, boolean z10, String str, TLRPC.User user, TLRPC.Chat chat, e0.q qVar, long j10, String str2, long[] jArr, int i10, Uri uri, int i11, boolean z11, boolean z12, boolean z13, int i12) {
        this.f27568r = ysVar;
        this.h = j10;
        this.f27559i = str2;
        this.f27560j = jArr;
        this.f27561k = i10;
        this.f27562l = uri;
        this.f27563m = i11;
        this.f27564n = z11;
        this.f27565o = z12;
        this.f27566p = z13;
        this.f27567q = i12;
        this.f27553a = i7;
        this.d = str;
        this.f27556e = user;
        this.f27557f = chat;
        this.f27558g = qVar;
        this.f27554b = j3;
        this.f27555c = z10;
    }

    public final void a() {
        e0.q qVar = this.f27558g;
        boolean z10 = s2.f26694a;
        int i7 = this.f27553a;
        if (z10) {
            StringBuilder m10 = i5.c.m(i7, "show dialog notification with id ", " ");
            m10.append(this.f27554b);
            m10.append(" user=");
            m10.append(this.f27556e);
            m10.append(" chat=");
            m10.append(this.f27557f);
            a8.l(m10.toString());
        }
        try {
            ys.m0.e(null, i7, qVar.b());
        } catch (SecurityException e10) {
            a8.g(e10, true);
            this.f27568r.P(qVar, this.f27554b, this.h, this.f27559i, this.f27560j, this.f27561k, this.f27562l, this.f27563m, this.f27564n, this.f27565o, this.f27566p, this.f27567q);
        }
    }
}
