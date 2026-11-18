package org.telegram.messenger;

import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class us {
    public final int f27227a;
    public final long f27228b;
    public final boolean f27229c;
    public final String d;
    public final TLRPC.User f27230e;
    public final TLRPC.Chat f27231f;
    public final e0.q f27232g;
    public final long h;
    public final String f27233i;
    public final long[] f27234j;
    public final int f27235k;
    public final Uri f27236l;
    public final int f27237m;
    public final boolean f27238n;
    public final boolean f27239o;
    public final boolean f27240p;
    public final int f27241q;
    public final xs f27242r;

    public us(xs xsVar, int i7, long j3, boolean z10, String str, TLRPC.User user, TLRPC.Chat chat, e0.q qVar, long j10, String str2, long[] jArr, int i10, Uri uri, int i11, boolean z11, boolean z12, boolean z13, int i12) {
        this.f27242r = xsVar;
        this.h = j10;
        this.f27233i = str2;
        this.f27234j = jArr;
        this.f27235k = i10;
        this.f27236l = uri;
        this.f27237m = i11;
        this.f27238n = z11;
        this.f27239o = z12;
        this.f27240p = z13;
        this.f27241q = i12;
        this.f27227a = i7;
        this.d = str;
        this.f27230e = user;
        this.f27231f = chat;
        this.f27232g = qVar;
        this.f27228b = j3;
        this.f27229c = z10;
    }

    public final void a() {
        e0.q qVar = this.f27232g;
        boolean z10 = s2.f26723a;
        int i7 = this.f27227a;
        if (z10) {
            StringBuilder m10 = i5.c.m(i7, "show dialog notification with id ", " ");
            m10.append(this.f27228b);
            m10.append(" user=");
            m10.append(this.f27230e);
            m10.append(" chat=");
            m10.append(this.f27231f);
            a8.l(m10.toString());
        }
        try {
            xs.m0.e(null, i7, qVar.b());
        } catch (SecurityException e10) {
            a8.g(e10, true);
            this.f27242r.P(qVar, this.f27228b, this.h, this.f27233i, this.f27234j, this.f27235k, this.f27236l, this.f27237m, this.f27238n, this.f27239o, this.f27240p, this.f27241q);
        }
    }
}
