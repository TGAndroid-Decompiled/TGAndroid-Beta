package org.telegram.messenger;

import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class lt {
    public final int f16789a;
    public final long f16790b;
    public final boolean f16791c;
    public final String d;
    public final TLRPC.User e;
    public final TLRPC.Chat f16792f;
    public final e0.r f16793g;
    public final long h;
    public final String f16794i;
    public final long[] f16795j;
    public final int f16796k;
    public final Uri f16797l;
    public final int f16798m;
    public final boolean f16799n;
    public final boolean f16800o;
    public final boolean f16801p;
    public final int f16802q;
    public final ot f16803r;

    public lt(ot otVar, int i10, long j10, boolean z10, String str, TLRPC.User user, TLRPC.Chat chat, e0.r rVar, long j11, String str2, long[] jArr, int i11, Uri uri, int i12, boolean z11, boolean z12, boolean z13, int i13) {
        this.f16803r = otVar;
        this.h = j11;
        this.f16794i = str2;
        this.f16795j = jArr;
        this.f16796k = i11;
        this.f16797l = uri;
        this.f16798m = i12;
        this.f16799n = z11;
        this.f16800o = z12;
        this.f16801p = z13;
        this.f16802q = i13;
        this.f16789a = i10;
        this.d = str;
        this.e = user;
        this.f16792f = chat;
        this.f16793g = rVar;
        this.f16790b = j10;
        this.f16791c = z10;
    }

    public final void a() {
        e0.r rVar = this.f16793g;
        boolean z10 = v2.f18448a;
        int i10 = this.f16789a;
        if (z10) {
            StringBuilder l4 = i0.a.l(i10, "show dialog notification with id ", " ");
            l4.append(this.f16790b);
            l4.append(" user=");
            l4.append(this.e);
            l4.append(" chat=");
            l4.append(this.f16792f);
            f8.l(l4.toString());
        }
        try {
            ot.f17305l0.e(null, i10, rVar.b());
        } catch (SecurityException e) {
            f8.g(e, true);
            this.f16803r.P(rVar, this.f16790b, this.h, this.f16794i, this.f16795j, this.f16796k, this.f16797l, this.f16798m, this.f16799n, this.f16800o, this.f16801p, this.f16802q);
        }
    }
}
