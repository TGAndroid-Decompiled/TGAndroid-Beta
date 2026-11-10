package b9;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;
public final class j0 extends com.google.android.gms.common.api.j {
    public static int f3063l = 1;

    public j0(Context context, com.google.android.gms.common.api.i iVar) {
        super(context, a9.c.f754a, a9.b.f753a, iVar);
    }

    public Intent f() {
        int h = h();
        int i7 = h - 1;
        if (h != 0) {
            com.google.android.gms.common.api.b bVar = this.f6721e;
            Context context = this.f6718a;
            if (i7 != 2) {
                if (i7 != 3) {
                    d6.h.f8209a.a("getNoImplementationSignInIntent()", new Object[0]);
                    Intent a10 = d6.h.a(context, (GoogleSignInOptions) bVar);
                    a10.setAction("com.google.android.gms.auth.NO_IMPL");
                    return a10;
                }
                return d6.h.a(context, (GoogleSignInOptions) bVar);
            }
            d6.h.f8209a.a("getFallbackSignInIntent()", new Object[0]);
            Intent a11 = d6.h.a(context, (GoogleSignInOptions) bVar);
            a11.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return a11;
        }
        throw null;
    }

    public Task g() {
        boolean z9;
        BasePendingResult basePendingResult;
        if (h() == 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        d6.h.f8209a.a("Signing out", new Object[0]);
        d6.h.b(this.f6718a);
        com.google.android.gms.common.api.internal.n0 n0Var = this.f6724i;
        if (z9) {
            BasePendingResult rVar = new com.google.android.gms.common.api.internal.r(n0Var, 0);
            rVar.a(Status.f6528e);
            basePendingResult = rVar;
        } else {
            d6.g gVar = new d6.g(n0Var, 0);
            n0Var.f6672b.d(1, gVar);
            basePendingResult = gVar;
        }
        return q6.m.m(basePendingResult, new w7.s(21, false));
    }

    public synchronized int h() {
        int i7;
        try {
            i7 = f3063l;
            if (i7 == 1) {
                Context context = this.f6718a;
                n6.d dVar = n6.d.f20503e;
                int d = dVar.d(context, 12451000);
                if (d == 0) {
                    i7 = 4;
                    f3063l = 4;
                } else if (dVar.b(d, context, null) == null && b7.f.a(context, "com.google.android.gms.auth.api.fallback") != 0) {
                    i7 = 3;
                    f3063l = 3;
                } else {
                    i7 = 2;
                    f3063l = 2;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i7;
    }
}
