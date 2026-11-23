package org.telegram.messenger;

import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class vs {
    public final int f27589a;
    public final long f27590b;
    public final boolean f27591c;
    public final String d;
    public final TLRPC.User f27592e;
    public final TLRPC.Chat f27593f;
    public final e0.q f27594g;
    public final long h;
    public final String f27595i;
    public final long[] f27596j;
    public final int f27597k;
    public final Uri f27598l;
    public final int f27599m;
    public final boolean f27600n;
    public final boolean f27601o;
    public final boolean f27602p;
    public final int f27603q;
    public final ys f27604r;

    public vs(ys ysVar, int i7, long j3, boolean z10, String str, TLRPC.User user, TLRPC.Chat chat, e0.q qVar, long j10, String str2, long[] jArr, int i10, Uri uri, int i11, boolean z11, boolean z12, boolean z13, int i12) {
        this.f27604r = ysVar;
        this.h = j10;
        this.f27595i = str2;
        this.f27596j = jArr;
        this.f27597k = i10;
        this.f27598l = uri;
        this.f27599m = i11;
        this.f27600n = z11;
        this.f27601o = z12;
        this.f27602p = z13;
        this.f27603q = i12;
        this.f27589a = i7;
        this.d = str;
        this.f27592e = user;
        this.f27593f = chat;
        this.f27594g = qVar;
        this.f27590b = j3;
        this.f27591c = z10;
    }

    public final void a() {
        e0.q qVar = this.f27594g;
        boolean z10 = s2.f26730a;
        int i7 = this.f27589a;
        if (z10) {
            StringBuilder m10 = i5.c.m(i7, "show dialog notification with id ", " ");
            m10.append(this.f27590b);
            m10.append(" user=");
            m10.append(this.f27592e);
            m10.append(" chat=");
            m10.append(this.f27593f);
            a8.l(m10.toString());
        }
        try {
            ys.m0.e(null, i7, qVar.b());
        } catch (SecurityException e10) {
            a8.g(e10, true);
            this.f27604r.P(qVar, this.f27590b, this.h, this.f27595i, this.f27596j, this.f27597k, this.f27598l, this.f27599m, this.f27600n, this.f27601o, this.f27602p, this.f27603q);
        }
    }
}
