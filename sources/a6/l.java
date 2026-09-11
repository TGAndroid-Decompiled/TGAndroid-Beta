package a6;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.t0;
import com.google.android.gms.common.api.s;
import com.google.android.gms.internal.clearcut.u0;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;
import v7.f5;
import w7.d9;
public final class l extends b8.b {
    public final int f313b = 0;
    public final Object f314c;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 5);
        this.f314c = revocationBoundService;
    }

    @Override
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        boolean z10;
        BasePendingResult basePendingResult;
        String d;
        int i11 = this.f313b;
        Object obj = this.f314c;
        switch (i11) {
            case 0:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i10 != 1) {
                    if (i10 != 2) {
                        return false;
                    }
                    L0();
                    i.G(revocationBoundService).I();
                } else {
                    L0();
                    b a2 = b.a(revocationBoundService);
                    GoogleSignInAccount b10 = a2.b();
                    GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.v;
                    if (b10 != null) {
                        String d10 = a2.d("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(d10) && (d = a2.d(b.f("googleSignInOptions", d10))) != null) {
                            try {
                                googleSignInOptions = GoogleSignInOptions.b(d);
                            } catch (JSONException unused) {
                            }
                        }
                        googleSignInOptions = null;
                    }
                    u0 a10 = d9.a(revocationBoundService, googleSignInOptions);
                    if (b10 != null) {
                        t0 t0Var = a10.h;
                        Context context = a10.f5145a;
                        if (a10.h() == 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        h.f309a.f("Revoking access", new Object[0]);
                        String d11 = b.a(context).d("refreshToken");
                        h.b(context);
                        if (z10) {
                            if (d11 == null) {
                                a5.a aVar = c.f295c;
                                Status status = new Status(4, null, null, null);
                                n6.l.a("Status code must not be SUCCESS", !status.b());
                                basePendingResult = new s(status);
                                basePendingResult.a(status);
                            } else {
                                c cVar = new c(d11);
                                new Thread(cVar).start();
                                basePendingResult = cVar.f297b;
                            }
                        } else {
                            g gVar = new g(t0Var, 1);
                            t0Var.f5111b.d(1, gVar);
                            basePendingResult = gVar;
                        }
                        n6.l.n(basePendingResult, new Object());
                    } else {
                        a10.g();
                    }
                }
                return true;
            default:
                if (i10 != 1) {
                    return false;
                }
                i7.f.b(parcel);
                f5.a((Status) i7.f.a(parcel, Status.CREATOR), (x5.f) i7.f.a(parcel, x5.f.CREATOR), (TaskCompletionSource) obj);
                return true;
        }
    }

    public void L0() {
        if (u6.b.e((RevocationBoundService) this.f314c, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException(i2.g.j(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
    }

    public l(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 5);
        this.f314c = taskCompletionSource;
    }
}
