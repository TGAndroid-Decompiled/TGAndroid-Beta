package d6;

import a8.l8;
import a8.q;
import a8.v7;
import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.text.TextUtils;
import b9.k0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.common.api.t;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;
import org.telegram.messenger.d1;
import q6.m;
public final class l extends q {
    public final int f7596b = 0;
    public final Object f7597c;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 7);
        this.f7597c = revocationBoundService;
    }

    @Override
    public final boolean j1(int i7, Parcel parcel, Parcel parcel2) {
        boolean z10;
        BasePendingResult basePendingResult;
        String e10;
        int i10 = this.f7596b;
        Object obj = this.f7597c;
        switch (i10) {
            case 0:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i7 != 1) {
                    if (i7 != 2) {
                        return false;
                    }
                    m1();
                    i.V(revocationBoundService).Z();
                } else {
                    m1();
                    b a10 = b.a(revocationBoundService);
                    GoogleSignInAccount b10 = a10.b();
                    GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f5844w;
                    if (b10 != null) {
                        String e11 = a10.e("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(e11) && (e10 = a10.e(b.f("googleSignInOptions", e11))) != null) {
                            try {
                                googleSignInOptions = GoogleSignInOptions.b(e10);
                            } catch (JSONException unused) {
                            }
                        }
                        googleSignInOptions = null;
                    }
                    k0 a11 = v7.a(revocationBoundService, googleSignInOptions);
                    if (b10 != null) {
                        p0 p0Var = a11.f6108i;
                        Context context = a11.f6102a;
                        if (a11.h() == 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        h.f7592a.a("Revoking access", new Object[0]);
                        String e12 = b.a(context).e("refreshToken");
                        h.b(context);
                        if (z10) {
                            if (e12 == null) {
                                d1 d1Var = c.f7578c;
                                Status status = new Status(4, null, null, null);
                                m.a("Status code must not be SUCCESS", !status.b());
                                basePendingResult = new t(status);
                                basePendingResult.a(status);
                            } else {
                                c cVar = new c(e12);
                                new Thread(cVar).start();
                                basePendingResult = cVar.f7580b;
                            }
                        } else {
                            g gVar = new g(p0Var, 1);
                            p0Var.f6063b.d(1, gVar);
                            basePendingResult = gVar;
                        }
                        m.m(basePendingResult, new qb.a(22));
                    } else {
                        a11.g();
                    }
                }
                return true;
            default:
                if (i7 != 1) {
                    return false;
                }
                l7.f.b(parcel);
                l8.a((Status) l7.f.a(parcel, Status.CREATOR), (a6.f) l7.f.a(parcel, a6.f.CREATOR), (TaskCompletionSource) obj);
                return true;
        }
    }

    public void m1() {
        if (x6.b.e((RevocationBoundService) this.f7597c, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException(i5.c.j(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
    }

    public l(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 7);
        this.f7597c = taskCompletionSource;
    }
}
