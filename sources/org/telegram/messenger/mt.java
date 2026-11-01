package org.telegram.messenger;

import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class mt {
    public final int f17173a;
    public final long f17174b;
    public final boolean f17175c;
    public final String d;
    public final TLRPC.User e;
    public final TLRPC.Chat f17176f;
    public final e0.r f17177g;
    public final long h;
    public final String f17178i;
    public final long[] f17179j;
    public final int f17180k;
    public final Uri f17181l;
    public final int f17182m;
    public final boolean f17183n;
    public final boolean f17184o;
    public final boolean f17185p;
    public final int f17186q;
    public final pt f17187r;

    public mt(pt ptVar, int i10, long j10, boolean z10, String str, TLRPC.User user, TLRPC.Chat chat, e0.r rVar, long j11, String str2, long[] jArr, int i11, Uri uri, int i12, boolean z11, boolean z12, boolean z13, int i13) {
        this.f17187r = ptVar;
        this.h = j11;
        this.f17178i = str2;
        this.f17179j = jArr;
        this.f17180k = i11;
        this.f17181l = uri;
        this.f17182m = i12;
        this.f17183n = z11;
        this.f17184o = z12;
        this.f17185p = z13;
        this.f17186q = i13;
        this.f17173a = i10;
        this.d = str;
        this.e = user;
        this.f17176f = chat;
        this.f17177g = rVar;
        this.f17174b = j10;
        this.f17175c = z10;
    }

    public final void a() {
        e0.r rVar = this.f17177g;
        boolean z10 = v2.f18578a;
        int i10 = this.f17173a;
        if (z10) {
            StringBuilder l4 = i0.a.l(i10, "show dialog notification with id ", " ");
            l4.append(this.f17174b);
            l4.append(" user=");
            l4.append(this.e);
            l4.append(" chat=");
            l4.append(this.f17176f);
            f8.l(l4.toString());
        }
        try {
            pt.f17638l0.e(null, i10, rVar.b());
        } catch (SecurityException e) {
            f8.g(e, true);
            this.f17187r.P(rVar, this.f17174b, this.h, this.f17178i, this.f17179j, this.f17180k, this.f17181l, this.f17182m, this.f17183n, this.f17184o, this.f17185p, this.f17186q);
        }
    }
}
