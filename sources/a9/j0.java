package a9;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;
public final class j0 extends com.google.android.gms.common.api.j {
    public static int f210l = 1;

    public j0(Context context, com.google.android.gms.common.api.i iVar) {
        super(context, z8.c.f60149a, z8.b.f60148a, iVar);
    }

    public Intent f() {
        int h = h();
        int i3 = h - 1;
        if (h != 0) {
            com.google.android.gms.common.api.b bVar = this.f6775e;
            Context context = this.f6772a;
            if (i3 != 2) {
                if (i3 != 3) {
                    c6.h.f4232a.a("getNoImplementationSignInIntent()", new Object[0]);
                    Intent a10 = c6.h.a(context, (GoogleSignInOptions) bVar);
                    a10.setAction("com.google.android.gms.auth.NO_IMPL");
                    return a10;
                }
                return c6.h.a(context, (GoogleSignInOptions) bVar);
            }
            c6.h.f4232a.a("getFallbackSignInIntent()", new Object[0]);
            Intent a11 = c6.h.a(context, (GoogleSignInOptions) bVar);
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
        c6.h.f4232a.a("Signing out", new Object[0]);
        c6.h.b(this.f6772a);
        com.google.android.gms.common.api.internal.n0 n0Var = this.f6778i;
        if (z10) {
            BasePendingResult rVar = new com.google.android.gms.common.api.internal.r(n0Var, 0);
            rVar.a(Status.f6577e);
            basePendingResult = rVar;
        } else {
            c6.g gVar = new c6.g(n0Var, 0);
            n0Var.f6724b.d(1, gVar);
            basePendingResult = gVar;
        }
        return p6.m.m(basePendingResult, new mb.b(21));
    }

    public synchronized int h() {
        int i3;
        try {
            i3 = f210l;
            if (i3 == 1) {
                Context context = this.f6772a;
                m6.d dVar = m6.d.f19186e;
                int d = dVar.d(context, 12451000);
                if (d == 0) {
                    i3 = 4;
                    f210l = 4;
                } else if (dVar.b(d, context, null) == null && a7.f.a(context, "com.google.android.gms.auth.api.fallback") != 0) {
                    i3 = 3;
                    f210l = 3;
                } else {
                    i3 = 2;
                    f210l = 2;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i3;
    }
}
