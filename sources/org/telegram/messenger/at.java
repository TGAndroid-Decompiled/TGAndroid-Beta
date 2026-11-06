package org.telegram.messenger;

import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class at {
    public final int f21500a;
    public final long f21501b;
    public final boolean f21502c;
    public final String d;
    public final TLRPC.User f21503e;
    public final TLRPC.Chat f21504f;
    public final e0.q f21505g;
    public final long h;
    public final String f21506i;
    public final long[] f21507j;
    public final int f21508k;
    public final Uri f21509l;
    public final int f21510m;
    public final boolean f21511n;
    public final boolean f21512o;
    public final boolean f21513p;
    public final int f21514q;
    public final dt f21515r;

    public at(dt dtVar, int i7, long j3, boolean z9, String str, TLRPC.User user, TLRPC.Chat chat, e0.q qVar, long j10, String str2, long[] jArr, int i10, Uri uri, int i11, boolean z10, boolean z11, boolean z12, int i12) {
        this.f21515r = dtVar;
        this.h = j10;
        this.f21506i = str2;
        this.f21507j = jArr;
        this.f21508k = i10;
        this.f21509l = uri;
        this.f21510m = i11;
        this.f21511n = z10;
        this.f21512o = z11;
        this.f21513p = z12;
        this.f21514q = i12;
        this.f21500a = i7;
        this.d = str;
        this.f21503e = user;
        this.f21504f = chat;
        this.f21505g = qVar;
        this.f21501b = j3;
        this.f21502c = z9;
    }

    public final void a() {
        e0.q qVar = this.f21505g;
        boolean z9 = r2.f25191a;
        int i7 = this.f21500a;
        if (z9) {
            StringBuilder n10 = jg.g.n(i7, "show dialog notification with id ", " ");
            n10.append(this.f21501b);
            n10.append(" user=");
            n10.append(this.f21503e);
            n10.append(" chat=");
            n10.append(this.f21504f);
            a8.l(n10.toString());
        }
        try {
            dt.f22052l0.e(null, i7, qVar.b());
        } catch (SecurityException e10) {
            a8.g(e10, true);
            this.f21515r.P(qVar, this.f21501b, this.h, this.f21506i, this.f21507j, this.f21508k, this.f21509l, this.f21510m, this.f21511n, this.f21512o, this.f21513p, this.f21514q);
        }
    }
}
