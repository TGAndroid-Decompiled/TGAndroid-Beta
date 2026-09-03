package a8;

import android.content.Context;
import android.content.Intent;
import b6.m;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.t0;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.tasks.Task;
public final class e extends com.google.android.gms.common.api.j {
    public static int f133k = 1;

    public e(Context context, com.google.android.gms.common.api.i iVar) {
        super(context, l8.j.f11829a, l8.i.f11828a, iVar);
    }

    public Intent f() {
        int h = h();
        int i10 = h - 1;
        if (h != 0) {
            com.google.android.gms.common.api.b bVar = this.d;
            Context context = this.f2894a;
            if (i10 != 2) {
                if (i10 != 3) {
                    o5.h.f16436a.g("getNoImplementationSignInIntent()", new Object[0]);
                    Intent a2 = o5.h.a(context, (GoogleSignInOptions) bVar);
                    a2.setAction("com.google.android.gms.auth.NO_IMPL");
                    return a2;
                }
                return o5.h.a(context, (GoogleSignInOptions) bVar);
            }
            o5.h.f16436a.g("getFallbackSignInIntent()", new Object[0]);
            Intent a10 = o5.h.a(context, (GoogleSignInOptions) bVar);
            a10.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return a10;
        }
        throw null;
    }

    public Task g() {
        boolean z4;
        BasePendingResult basePendingResult;
        if (h() == 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        o5.h.f16436a.g("Signing out", new Object[0]);
        o5.h.b(this.f2894a);
        t0 t0Var = this.h;
        if (z4) {
            BasePendingResult uVar = new u(t0Var, 0);
            uVar.a(Status.e);
            basePendingResult = uVar;
        } else {
            o5.g gVar = new o5.g(t0Var, 0);
            t0Var.f2860b.d(1, gVar);
            basePendingResult = gVar;
        }
        return m.n(basePendingResult, new cb.b(3));
    }

    public synchronized int h() {
        int i10;
        try {
            i10 = f133k;
            if (i10 == 1) {
                Context context = this.f2894a;
                y5.d dVar = y5.d.d;
                int d = dVar.d(context, 12451000);
                if (d == 0) {
                    i10 = 4;
                    f133k = 4;
                } else if (dVar.b(context, null, d) == null && m6.e.a(context, "com.google.android.gms.auth.api.fallback") != 0) {
                    i10 = 3;
                    f133k = 3;
                } else {
                    i10 = 2;
                    f133k = 2;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }
}
