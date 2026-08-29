package m5;

import ag.j2;
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
import h7.o5;
import j7.l1;
import org.json.JSONException;
public final class l extends c7.a {
    public final int f16881b = 0;
    public final Object f16882c;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 9);
        this.f16882c = revocationBoundService;
    }

    @Override
    public final boolean G0(int i10, Parcel parcel, Parcel parcel2) {
        boolean z10;
        BasePendingResult basePendingResult;
        String d;
        int i11 = this.f16881b;
        Object obj = this.f16882c;
        switch (i11) {
            case 0:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i10 != 1) {
                    if (i10 != 2) {
                        return false;
                    }
                    J0();
                    i.J(revocationBoundService).L();
                } else {
                    J0();
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
                    v0 a10 = i7.l.a(revocationBoundService, googleSignInOptions);
                    if (b10 != null) {
                        t0 t0Var = a10.h;
                        Context context = a10.f3956a;
                        if (a10.h() == 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        h.f16877a.g("Revoking access", new Object[0]);
                        String d11 = b.a(context).d("refreshToken");
                        h.b(context);
                        if (z10) {
                            if (d11 == null) {
                                j2 j2Var = c.f16863c;
                                Status status = new Status(4, null, null, null);
                                z5.l.a("Status code must not be SUCCESS", !status.b());
                                basePendingResult = new s(status);
                                basePendingResult.a(status);
                            } else {
                                c cVar = new c(d11);
                                new Thread(cVar).start();
                                basePendingResult = cVar.f16865b;
                            }
                        } else {
                            g gVar = new g(t0Var, 1);
                            t0Var.f3922b.d(1, gVar);
                            basePendingResult = gVar;
                        }
                        z5.l.n(basePendingResult, new ab.b(27));
                    } else {
                        a10.g();
                    }
                }
                return true;
            default:
                if (i10 != 1) {
                    return false;
                }
                u6.f.b(parcel);
                o5.a((Status) u6.f.a(parcel, Status.CREATOR), (j5.f) u6.f.a(parcel, j5.f.CREATOR), (TaskCompletionSource) obj);
                return true;
        }
    }

    public void J0() {
        if (g6.b.e((RevocationBoundService) this.f16882c, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException(l1.l(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
    }

    public l(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 9);
        this.f16882c = taskCompletionSource;
    }
}
