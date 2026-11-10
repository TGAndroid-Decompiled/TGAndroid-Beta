package org.telegram.messenger;

import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class at {
    public final int f21521a;
    public final long f21522b;
    public final boolean f21523c;
    public final String d;
    public final TLRPC.User f21524e;
    public final TLRPC.Chat f21525f;
    public final e0.q f21526g;
    public final long h;
    public final String f21527i;
    public final long[] f21528j;
    public final int f21529k;
    public final Uri f21530l;
    public final int f21531m;
    public final boolean f21532n;
    public final boolean f21533o;
    public final boolean f21534p;
    public final int f21535q;
    public final dt f21536r;

    public at(dt dtVar, int i7, long j3, boolean z9, String str, TLRPC.User user, TLRPC.Chat chat, e0.q qVar, long j10, String str2, long[] jArr, int i10, Uri uri, int i11, boolean z10, boolean z11, boolean z12, int i12) {
        this.f21536r = dtVar;
        this.h = j10;
        this.f21527i = str2;
        this.f21528j = jArr;
        this.f21529k = i10;
        this.f21530l = uri;
        this.f21531m = i11;
        this.f21532n = z10;
        this.f21533o = z11;
        this.f21534p = z12;
        this.f21535q = i12;
        this.f21521a = i7;
        this.d = str;
        this.f21524e = user;
        this.f21525f = chat;
        this.f21526g = qVar;
        this.f21522b = j3;
        this.f21523c = z9;
    }

    public final void a() {
        e0.q qVar = this.f21526g;
        boolean z9 = r2.f25216a;
        int i7 = this.f21521a;
        if (z9) {
            StringBuilder n10 = jg.g.n(i7, "show dialog notification with id ", " ");
            n10.append(this.f21522b);
            n10.append(" user=");
            n10.append(this.f21524e);
            n10.append(" chat=");
            n10.append(this.f21525f);
            a8.l(n10.toString());
        }
        try {
            dt.f22081l0.e(null, i7, qVar.b());
        } catch (SecurityException e10) {
            a8.g(e10, true);
            this.f21536r.P(qVar, this.f21522b, this.h, this.f21527i, this.f21528j, this.f21529k, this.f21530l, this.f21531m, this.f21532n, this.f21533o, this.f21534p, this.f21535q);
        }
    }
}
