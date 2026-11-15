package b9;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;
public final class k0 extends com.google.android.gms.common.api.j {
    public static int f3027l = 1;

    public k0(Context context, com.google.android.gms.common.api.i iVar) {
        super(context, a9.c.f754a, a9.b.f753a, iVar);
    }

    public Intent f() {
        int h = h();
        int i7 = h - 1;
        if (h != 0) {
            com.google.android.gms.common.api.b bVar = this.f6108e;
            Context context = this.f6105a;
            if (i7 != 2) {
                if (i7 != 3) {
                    d6.h.f7595a.a("getNoImplementationSignInIntent()", new Object[0]);
                    Intent a10 = d6.h.a(context, (GoogleSignInOptions) bVar);
                    a10.setAction("com.google.android.gms.auth.NO_IMPL");
                    return a10;
                }
                return d6.h.a(context, (GoogleSignInOptions) bVar);
            }
            d6.h.f7595a.a("getFallbackSignInIntent()", new Object[0]);
            Intent a11 = d6.h.a(context, (GoogleSignInOptions) bVar);
            a11.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return a11;
        }
        throw null;
    }

    public Task g() {
        boolean z10;
        BasePendingResult basePendingResult;
        if (h() == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.h.f7595a.a("Signing out", new Object[0]);
        d6.h.b(this.f6105a);
        com.google.android.gms.common.api.internal.p0 p0Var = this.f6111i;
        if (z10) {
            BasePendingResult sVar = new com.google.android.gms.common.api.internal.s(p0Var, 0);
            sVar.a(Status.f5910e);
            basePendingResult = sVar;
        } else {
            d6.g gVar = new d6.g(p0Var, 0);
            p0Var.f6066b.d(1, gVar);
            basePendingResult = gVar;
        }
        return q6.m.m(basePendingResult, new qb.a(22));
    }

    public synchronized int h() {
        int i7;
        try {
            i7 = f3027l;
            if (i7 == 1) {
                Context context = this.f6105a;
                n6.d dVar = n6.d.f21067e;
                int d = dVar.d(context, 12451000);
                if (d == 0) {
                    i7 = 4;
                    f3027l = 4;
                } else if (dVar.b(d, context, null) == null && b7.f.a(context, "com.google.android.gms.auth.api.fallback") != 0) {
                    i7 = 3;
                    f3027l = 3;
                } else {
                    i7 = 2;
                    f3027l = 2;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i7;
    }
}
