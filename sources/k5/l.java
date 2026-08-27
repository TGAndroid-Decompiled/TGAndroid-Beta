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
import g7.g5;
import g7.m8;
import org.json.JSONException;

public final class l extends b7.a {

    public final int f14481b = 0;

    public final Object f14482c;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 9);
        this.f14482c = revocationBoundService;
    }

    @Override
    public final boolean G0(int i10, Parcel parcel, Parcel parcel2) {
        BasePendingResult sVar;
        String strD;
        int i11 = this.f14481b;
        Object obj = this.f14482c;
        switch (i11) {
            case 0:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i10 == 1) {
                    J0();
                    b bVarA = b.a(revocationBoundService);
                    GoogleSignInAccount googleSignInAccountB = bVarA.b();
                    GoogleSignInOptions googleSignInOptionsB = GoogleSignInOptions.v;
                    if (googleSignInAccountB != null) {
                        String strD2 = bVarA.d("defaultGoogleSignInAccount");
                        if (TextUtils.isEmpty(strD2) || (strD = bVarA.d(b.f("googleSignInOptions", strD2))) == null) {
                            googleSignInOptionsB = null;
                        } else {
                            try {
                                googleSignInOptionsB = GoogleSignInOptions.b(strD);
                            } catch (JSONException unused) {
                                googleSignInOptionsB = null;
                            }
                        }
                    }
                    v0 v0VarA = m8.a(revocationBoundService, googleSignInOptionsB);
                    if (googleSignInAccountB != null) {
                        t0 t0Var = v0VarA.h;
                        Context context = v0VarA.f3387a;
                        boolean z10 = v0VarA.h() == 3;
                        h.f14477a.e("Revoking access", new Object[0]);
                        String strD3 = b.a(context).d("refreshToken");
                        h.b(context);
                        if (!z10) {
                            g gVar = new g(t0Var, 1);
                            t0Var.f3353b.d(1, gVar);
                            sVar = gVar;
                        } else if (strD3 == null) {
                            b6.a aVar = c.f14463c;
                            Status status = new Status(4, null, null, null);
                            y5.l.a("Status code must not be SUCCESS", !status.b());
                            sVar = new s(status);
                            sVar.a(status);
                        } else {
                            c cVar = new c(strD3);
                            new Thread(cVar).start();
                            sVar = cVar.f14465b;
                        }
                        y5.l.n(sVar, new xa.a(26));
                    } else {
                        v0VarA.g();
                    }
                } else {
                    if (i10 != 2) {
                        return false;
                    }
                    J0();
                    i.H(revocationBoundService).I();
                }
                return true;
            default:
                if (i10 != 1) {
                    return false;
                }
                Status status2 = (Status) t6.f.a(parcel, Status.CREATOR);
                h5.f fVar = (h5.f) t6.f.a(parcel, h5.f.CREATOR);
                t6.f.b(parcel);
                g5.a(status2, fVar, (TaskCompletionSource) obj);
                return true;
        }
    }

    public void J0() {
        if (!f6.b.e((RevocationBoundService) this.f14482c, Binder.getCallingUid())) {
            throw new SecurityException(i0.a.l(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }

    public l(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 9);
        this.f14482c = taskCompletionSource;
    }
}
