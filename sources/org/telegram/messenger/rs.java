package org.telegram.messenger;

import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class rs {
    public final int f25215a;
    public final long f25216b;
    public final boolean f25217c;
    public final String d;
    public final TLRPC.User f25218e;
    public final TLRPC.Chat f25219f;
    public final e0.q f25220g;
    public final long h;
    public final String f25221i;
    public final long[] f25222j;
    public final int f25223k;
    public final Uri f25224l;
    public final int f25225m;
    public final boolean f25226n;
    public final boolean f25227o;
    public final boolean f25228p;
    public final int f25229q;
    public final us f25230r;

    public rs(us usVar, int i3, long j10, boolean z10, String str, TLRPC.User user, TLRPC.Chat chat, e0.q qVar, long j11, String str2, long[] jArr, int i10, Uri uri, int i11, boolean z11, boolean z12, boolean z13, int i12) {
        this.f25230r = usVar;
        this.h = j11;
        this.f25221i = str2;
        this.f25222j = jArr;
        this.f25223k = i10;
        this.f25224l = uri;
        this.f25225m = i11;
        this.f25226n = z11;
        this.f25227o = z12;
        this.f25228p = z13;
        this.f25229q = i12;
        this.f25215a = i3;
        this.d = str;
        this.f25218e = user;
        this.f25219f = chat;
        this.f25220g = qVar;
        this.f25216b = j10;
        this.f25217c = z10;
    }

    public final void a() {
        e0.q qVar = this.f25220g;
        boolean z10 = r2.f25040a;
        int i3 = this.f25215a;
        if (z10) {
            StringBuilder m10 = k2.p1.m(i3, "show dialog notification with id ", " ");
            m10.append(this.f25216b);
            m10.append(" user=");
            m10.append(this.f25218e);
            m10.append(" chat=");
            m10.append(this.f25219f);
            a8.l(m10.toString());
        }
        try {
            us.m0.e(null, i3, qVar.b());
        } catch (SecurityException e10) {
            a8.g(e10, true);
            this.f25230r.P(qVar, this.f25216b, this.h, this.f25221i, this.f25222j, this.f25223k, this.f25224l, this.f25225m, this.f25226n, this.f25227o, this.f25228p, this.f25229q);
        }
    }
}
