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
import com.google.android.gms.common.api.internal.u0;
import com.google.android.gms.common.api.s;
import com.google.android.gms.internal.clearcut.v0;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;
import org.telegram.messenger.g1;
import v7.i5;
import w7.n9;
public final class l extends b8.b {
    public final int f308b = 0;
    public final Object f309c;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 5);
        this.f309c = revocationBoundService;
    }

    @Override
    public final boolean J0(int i10, Parcel parcel, Parcel parcel2) {
        boolean z10;
        BasePendingResult basePendingResult;
        String d;
        int i11 = this.f308b;
        Object obj = this.f309c;
        switch (i11) {
            case 0:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i10 != 1) {
                    if (i10 != 2) {
                        return false;
                    }
                    M0();
                    i.n0(revocationBoundService).o0();
                } else {
                    M0();
                    b a2 = b.a(revocationBoundService);
                    GoogleSignInAccount b10 = a2.b();
                    GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f4273w;
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
                    v0 a10 = n9.a(revocationBoundService, googleSignInOptions);
                    if (b10 != null) {
                        u0 u0Var = a10.h;
                        Context context = a10.f4521a;
                        if (a10.h() == 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        h.f304a.a("Revoking access", new Object[0]);
                        String d11 = b.a(context).d("refreshToken");
                        h.b(context);
                        if (z10) {
                            if (d11 == null) {
                                g1 g1Var = c.f291c;
                                Status status = new Status(4, null, null, null);
                                n6.l.a("Status code must not be SUCCESS", !status.b());
                                basePendingResult = new s(status);
                                basePendingResult.a(status);
                            } else {
                                c cVar = new c(d11);
                                new Thread(cVar).start();
                                basePendingResult = cVar.f293b;
                            }
                        } else {
                            g gVar = new g(u0Var, 1);
                            u0Var.f4493b.d(1, gVar);
                            basePendingResult = gVar;
                        }
                        n6.l.m(basePendingResult, new hb.a(13));
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
                i5.a((Status) i7.f.a(parcel, Status.CREATOR), (x5.f) i7.f.a(parcel, x5.f.CREATOR), (TaskCompletionSource) obj);
                return true;
        }
    }

    public void M0() {
        if (u6.b.e((RevocationBoundService) this.f309c, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException(i0.a.j(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
    }

    public l(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 5);
        this.f309c = taskCompletionSource;
    }
}
