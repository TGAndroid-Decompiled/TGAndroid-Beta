package c6;

import a9.j0;
import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.text.TextUtils;
import b8.h1;
import b8.y9;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.n0;
import com.google.android.gms.common.api.s;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.tasks.TaskCompletionSource;
import k2.p1;
import org.json.JSONException;
import org.telegram.messenger.d1;
import p6.m;
public final class l extends o {
    public final int f4236b = 0;
    public final Object f4237c;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 5);
        this.f4237c = revocationBoundService;
    }

    @Override
    public final boolean J0(int i3, Parcel parcel, Parcel parcel2) {
        boolean z10;
        BasePendingResult basePendingResult;
        String e10;
        int i10 = this.f4236b;
        Object obj = this.f4237c;
        switch (i10) {
            case 0:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i3 != 1) {
                    if (i3 != 2) {
                        return false;
                    }
                    M0();
                    i.D(revocationBoundService).G();
                } else {
                    M0();
                    b a10 = b.a(revocationBoundService);
                    GoogleSignInAccount b10 = a10.b();
                    GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f6514w;
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
                    j0 a11 = h1.a(revocationBoundService, googleSignInOptions);
                    if (b10 != null) {
                        n0 n0Var = a11.f6778i;
                        Context context = a11.f6772a;
                        if (a11.h() == 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        h.f4232a.a("Revoking access", new Object[0]);
                        String e12 = b.a(context).e("refreshToken");
                        h.b(context);
                        if (z10) {
                            if (e12 == null) {
                                d1 d1Var = c.f4218c;
                                Status status = new Status(4, null, null, null);
                                m.a("Status code must not be SUCCESS", !status.b());
                                basePendingResult = new s(status);
                                basePendingResult.a(status);
                            } else {
                                c cVar = new c(e12);
                                new Thread(cVar).start();
                                basePendingResult = cVar.f4220b;
                            }
                        } else {
                            g gVar = new g(n0Var, 1);
                            n0Var.f6724b.d(1, gVar);
                            basePendingResult = gVar;
                        }
                        m.m(basePendingResult, new mb.b(21));
                    } else {
                        a11.g();
                    }
                }
                return true;
            default:
                if (i3 != 1) {
                    return false;
                }
                k7.f.b(parcel);
                y9.a((Status) k7.f.a(parcel, Status.CREATOR), (z5.f) k7.f.a(parcel, z5.f.CREATOR), (TaskCompletionSource) obj);
                return true;
        }
    }

    public void M0() {
        if (w6.b.e((RevocationBoundService) this.f4237c, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException(p1.j(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
    }

    public l(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 5);
        this.f4237c = taskCompletionSource;
    }
}
