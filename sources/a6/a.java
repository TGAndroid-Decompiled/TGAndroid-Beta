package a6;

import android.content.Context;
import android.content.Intent;
import b6.g;
import b6.h;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.s0;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.Task;
import o6.l;
import u7.s;
public final class a extends j {
    public static int f328k = 1;

    public a(Context context, i iVar) {
        super(context, y8.j.f52399a, y8.i.f52398a, iVar);
    }

    public Intent f() {
        int h = h();
        int i10 = h - 1;
        if (h != 0) {
            com.google.android.gms.common.api.b bVar = this.d;
            Context context = this.f6652a;
            if (i10 != 2) {
                if (i10 != 3) {
                    h.f3667a.j("getNoImplementationSignInIntent()", new Object[0]);
                    Intent a2 = h.a(context, (GoogleSignInOptions) bVar);
                    a2.setAction("com.google.android.gms.auth.NO_IMPL");
                    return a2;
                }
                return h.a(context, (GoogleSignInOptions) bVar);
            }
            h.f3667a.j("getFallbackSignInIntent()", new Object[0]);
            Intent a10 = h.a(context, (GoogleSignInOptions) bVar);
            a10.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return a10;
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
        h.f3667a.j("Signing out", new Object[0]);
        h.b(this.f6652a);
        s0 s0Var = this.h;
        if (z10) {
            BasePendingResult tVar = new t(s0Var, 0);
            tVar.a(Status.e);
            basePendingResult = tVar;
        } else {
            g gVar = new g(s0Var, 0);
            s0Var.f6616b.d(1, gVar);
            basePendingResult = gVar;
        }
        return l.n(basePendingResult, new s(14));
    }

    public synchronized int h() {
        int i10;
        try {
            i10 = f328k;
            if (i10 == 1) {
                Context context = this.f6652a;
                l6.d dVar = l6.d.d;
                int d = dVar.d(context, 12451000);
                if (d == 0) {
                    i10 = 4;
                    f328k = 4;
                } else if (dVar.b(context, null, d) == null && z6.e.a(context, "com.google.android.gms.auth.api.fallback") != 0) {
                    i10 = 3;
                    f328k = 3;
                } else {
                    i10 = 2;
                    f328k = 2;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }
}
