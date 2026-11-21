package org.telegram.messenger;

import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class us {
    public final int f27253a;
    public final long f27254b;
    public final boolean f27255c;
    public final String d;
    public final TLRPC.User f27256e;
    public final TLRPC.Chat f27257f;
    public final e0.q f27258g;
    public final long h;
    public final String f27259i;
    public final long[] f27260j;
    public final int f27261k;
    public final Uri f27262l;
    public final int f27263m;
    public final boolean f27264n;
    public final boolean f27265o;
    public final boolean f27266p;
    public final int f27267q;
    public final xs f27268r;

    public us(xs xsVar, int i7, long j3, boolean z10, String str, TLRPC.User user, TLRPC.Chat chat, e0.q qVar, long j10, String str2, long[] jArr, int i10, Uri uri, int i11, boolean z11, boolean z12, boolean z13, int i12) {
        this.f27268r = xsVar;
        this.h = j10;
        this.f27259i = str2;
        this.f27260j = jArr;
        this.f27261k = i10;
        this.f27262l = uri;
        this.f27263m = i11;
        this.f27264n = z11;
        this.f27265o = z12;
        this.f27266p = z13;
        this.f27267q = i12;
        this.f27253a = i7;
        this.d = str;
        this.f27256e = user;
        this.f27257f = chat;
        this.f27258g = qVar;
        this.f27254b = j3;
        this.f27255c = z10;
    }

    public final void a() {
        e0.q qVar = this.f27258g;
        boolean z10 = s2.f26749a;
        int i7 = this.f27253a;
        if (z10) {
            StringBuilder m10 = i5.c.m(i7, "show dialog notification with id ", " ");
            m10.append(this.f27254b);
            m10.append(" user=");
            m10.append(this.f27256e);
            m10.append(" chat=");
            m10.append(this.f27257f);
            a8.l(m10.toString());
        }
        try {
            xs.m0.e(null, i7, qVar.b());
        } catch (SecurityException e10) {
            a8.g(e10, true);
            this.f27268r.P(qVar, this.f27254b, this.h, this.f27259i, this.f27260j, this.f27261k, this.f27262l, this.f27263m, this.f27264n, this.f27265o, this.f27266p, this.f27267q);
        }
    }
}
