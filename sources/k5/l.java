package k5;

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
import com.google.android.gms.internal.clearcut.v0;
import com.google.android.gms.tasks.TaskCompletionSource;
import f7.h5;
import f7.s8;
import j3.r0;
import org.json.JSONException;
public final class l extends a7.a {
    public final int f14660b = 0;
    public final Object f14661c;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 9);
        this.f14661c = revocationBoundService;
    }

    @Override
    public final boolean G0(int i9, Parcel parcel, Parcel parcel2) {
        boolean z10;
        BasePendingResult basePendingResult;
        String d;
        int i10 = this.f14660b;
        Object obj = this.f14661c;
        switch (i10) {
            case 0:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i9 != 1) {
                    if (i9 != 2) {
                        return false;
                    }
                    J0();
                    i.Q(revocationBoundService).R();
                } else {
                    J0();
                    b a2 = b.a(revocationBoundService);
                    GoogleSignInAccount b10 = a2.b();
                    GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.v;
                    if (b10 != null) {
                        String d9 = a2.d("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(d9) && (d = a2.d(b.f("googleSignInOptions", d9))) != null) {
                            try {
                                googleSignInOptions = GoogleSignInOptions.b(d);
                            } catch (JSONException unused) {
                            }
                        }
                        googleSignInOptions = null;
                    }
                    v0 a3 = s8.a(revocationBoundService, googleSignInOptions);
                    if (b10 != null) {
                        t0 t0Var = a3.h;
                        Context context = a3.f2942a;
                        if (a3.h() == 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        h.f14656a.e("Revoking access", new Object[0]);
                        String d10 = b.a(context).d("refreshToken");
                        h.b(context);
                        if (z10) {
                            if (d10 == null) {
                                a6.a aVar = c.f14642c;
                                Status status = new Status(4, null, null, null);
                                x5.l.a("Status code must not be SUCCESS", !status.b());
                                basePendingResult = new s(status);
                                basePendingResult.a(status);
                            } else {
                                c cVar = new c(d10);
                                new Thread(cVar).start();
                                basePendingResult = cVar.f14644b;
                            }
                        } else {
                            g gVar = new g(t0Var, 1);
                            t0Var.f2908b.d(1, gVar);
                            basePendingResult = gVar;
                        }
                        x5.l.n(basePendingResult, new za.a(25));
                    } else {
                        a3.g();
                    }
                }
                return true;
            default:
                if (i9 != 1) {
                    return false;
                }
                s6.f.b(parcel);
                h5.a((Status) s6.f.a(parcel, Status.CREATOR), (h5.f) s6.f.a(parcel, h5.f.CREATOR), (TaskCompletionSource) obj);
                return true;
        }
    }

    public void J0() {
        if (e6.b.e((RevocationBoundService) this.f14661c, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException(r0.m(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
    }

    public l(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 9);
        this.f14661c = taskCompletionSource;
    }
}
