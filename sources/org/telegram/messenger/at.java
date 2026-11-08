package org.telegram.messenger;

import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class at {
    public final int f21516a;
    public final long f21517b;
    public final boolean f21518c;
    public final String d;
    public final TLRPC.User f21519e;
    public final TLRPC.Chat f21520f;
    public final e0.q f21521g;
    public final long h;
    public final String f21522i;
    public final long[] f21523j;
    public final int f21524k;
    public final Uri f21525l;
    public final int f21526m;
    public final boolean f21527n;
    public final boolean f21528o;
    public final boolean f21529p;
    public final int f21530q;
    public final dt f21531r;

    public at(dt dtVar, int i7, long j3, boolean z9, String str, TLRPC.User user, TLRPC.Chat chat, e0.q qVar, long j10, String str2, long[] jArr, int i10, Uri uri, int i11, boolean z10, boolean z11, boolean z12, int i12) {
        this.f21531r = dtVar;
        this.h = j10;
        this.f21522i = str2;
        this.f21523j = jArr;
        this.f21524k = i10;
        this.f21525l = uri;
        this.f21526m = i11;
        this.f21527n = z10;
        this.f21528o = z11;
        this.f21529p = z12;
        this.f21530q = i12;
        this.f21516a = i7;
        this.d = str;
        this.f21519e = user;
        this.f21520f = chat;
        this.f21521g = qVar;
        this.f21517b = j3;
        this.f21518c = z9;
    }

    public final void a() {
        e0.q qVar = this.f21521g;
        boolean z9 = r2.f25212a;
        int i7 = this.f21516a;
        if (z9) {
            StringBuilder n10 = jg.g.n(i7, "show dialog notification with id ", " ");
            n10.append(this.f21517b);
            n10.append(" user=");
            n10.append(this.f21519e);
            n10.append(" chat=");
            n10.append(this.f21520f);
            a8.l(n10.toString());
        }
        try {
            dt.f22077l0.e(null, i7, qVar.b());
        } catch (SecurityException e10) {
            a8.g(e10, true);
            this.f21531r.P(qVar, this.f21517b, this.h, this.f21522i, this.f21523j, this.f21524k, this.f21525l, this.f21526m, this.f21527n, this.f21528o, this.f21529p, this.f21530q);
        }
    }
}
