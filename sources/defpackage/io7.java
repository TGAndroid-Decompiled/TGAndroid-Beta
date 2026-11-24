package defpackage;

import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class io7 {
    public final int a;
    public final long b;
    public final boolean c;
    public final String d;
    public final TLRPC.User e;
    public final TLRPC.Chat f;
    public final an7 g;
    public final long h;
    public final String i;
    public final long[] j;
    public final int k;
    public final Uri l;
    public final byte m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final byte q;
    public final lo7 r;

    public io7(lo7 lo7Var, int i, long j, boolean z, String str, TLRPC.User user, TLRPC.Chat chat, an7 an7Var, long j2, String str2, long[] jArr, int i2, Uri uri, int i3, boolean z2, boolean z3, boolean z4, int i4) {
        this.r = lo7Var;
        this.h = j2;
        this.i = str2;
        this.j = jArr;
        this.k = i2;
        this.l = uri;
        this.m = i3;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = i4;
        this.a = i;
        this.d = str;
        this.e = user;
        this.f = chat;
        this.g = an7Var;
        this.b = j;
        this.c = z;
    }

    public final void a() {
        an7 an7Var = this.g;
        boolean z = e21.a;
        int i = this.a;
        if (z) {
            StringBuilder l = hg9.l(i, "show dialog notification with id ", " ");
            l.append(this.b);
            l.append(" user=");
            l.append(this.e);
            l.append(" chat=");
            l.append(this.f);
            fc4.l(l.toString());
        }
        try {
            lo7.m0.e(null, i, an7Var.b());
        } catch (SecurityException e) {
            fc4.g(e, true);
            this.r.P(an7Var, this.b, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
        }
    }
}
