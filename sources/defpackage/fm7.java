package defpackage;

import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class fm7 {
    public final int a;
    public final long b;
    public final boolean c;
    public final String d;
    public final TLRPC.User e;
    public final TLRPC.Chat f;
    public final xk7 g;
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
    public final im7 r;

    public fm7(im7 im7Var, int i, long j, boolean z, String str, TLRPC.User user, TLRPC.Chat chat, xk7 xk7Var, long j2, String str2, long[] jArr, int i2, Uri uri, int i3, boolean z2, boolean z3, boolean z4, int i4) {
        this.r = im7Var;
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
        this.g = xk7Var;
        this.b = j;
        this.c = z;
    }

    public final void a() {
        xk7 xk7Var = this.g;
        boolean z = w01.a;
        int i = this.a;
        if (z) {
            StringBuilder m = de9.m(i, "show dialog notification with id ", " ");
            m.append(this.b);
            m.append(" user=");
            m.append(this.e);
            m.append(" chat=");
            m.append(this.f);
            fa4.l(m.toString());
        }
        try {
            im7.m0.e(null, i, xk7Var.b());
        } catch (SecurityException e) {
            fa4.g(e, true);
            this.r.P(xk7Var, this.b, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
        }
    }
}
