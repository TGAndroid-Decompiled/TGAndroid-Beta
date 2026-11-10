package d6;

import a8.k8;
import a8.q;
import a8.u7;
import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.text.TextUtils;
import b9.j0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.n0;
import com.google.android.gms.common.api.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;
import org.telegram.messenger.d1;
import q6.m;
public final class l extends q {
    public final int f8213b = 0;
    public final Object f8214c;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 7);
        this.f8214c = revocationBoundService;
    }

    @Override
    public final boolean j1(int i7, Parcel parcel, Parcel parcel2) {
        boolean z9;
        BasePendingResult basePendingResult;
        String e10;
        int i10 = this.f8213b;
        Object obj = this.f8214c;
        switch (i10) {
            case 0:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i7 != 1) {
                    if (i7 != 2) {
                        return false;
                    }
                    m1();
                    i.o0(revocationBoundService).p0();
                } else {
                    m1();
                    b a10 = b.a(revocationBoundService);
                    GoogleSignInAccount b10 = a10.b();
                    GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f6465w;
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
                    j0 a11 = u7.a(revocationBoundService, googleSignInOptions);
                    if (b10 != null) {
                        n0 n0Var = a11.f6724i;
                        Context context = a11.f6718a;
                        if (a11.h() == 3) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        h.f8209a.a("Revoking access", new Object[0]);
                        String e12 = b.a(context).e("refreshToken");
                        h.b(context);
                        if (z9) {
                            if (e12 == null) {
                                d1 d1Var = c.f8195c;
                                Status status = new Status(4, null, null, null);
                                m.a("Status code must not be SUCCESS", !status.b());
                                basePendingResult = new s(status);
                                basePendingResult.a(status);
                            } else {
                                c cVar = new c(e12);
                                new Thread(cVar).start();
                                basePendingResult = cVar.f8197b;
                            }
                        } else {
                            g gVar = new g(n0Var, 1);
                            n0Var.f6672b.d(1, gVar);
                            basePendingResult = gVar;
                        }
                        m.m(basePendingResult, new w7.s(21, false));
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
                k8.a((Status) l7.f.a(parcel, Status.CREATOR), (a6.f) l7.f.a(parcel, a6.f.CREATOR), (TaskCompletionSource) obj);
                return true;
        }
    }

    public void m1() {
        if (x6.b.e((RevocationBoundService) this.f8214c, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException(jg.g.k(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
    }

    public l(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 7);
        this.f8214c = taskCompletionSource;
    }
}
