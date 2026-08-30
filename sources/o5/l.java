package o5;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.text.TextUtils;
import b4.e0;
import b6.m;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.t0;
import com.google.android.gms.common.api.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.r5;
import k7.y;
import kh.a2;
import org.json.JSONException;
public final class l extends a7.c {
    public final int f16458b = 0;
    public final Object f16459c;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 10);
        this.f16459c = revocationBoundService;
    }

    @Override
    public final boolean G0(int i10, Parcel parcel, Parcel parcel2) {
        boolean z4;
        BasePendingResult basePendingResult;
        String d;
        int i11 = this.f16458b;
        Object obj = this.f16459c;
        switch (i11) {
            case 0:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i10 != 1) {
                    if (i10 != 2) {
                        return false;
                    }
                    J0();
                    i.p(revocationBoundService).t();
                } else {
                    J0();
                    b a2 = b.a(revocationBoundService);
                    GoogleSignInAccount b10 = a2.b();
                    GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.v;
                    if (b10 != null) {
                        String d10 = a2.d("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(d10) && (d = a2.d(b.f("googleSignInOptions", d10))) != null) {
                            try {
                                googleSignInOptions = GoogleSignInOptions.e(d);
                            } catch (JSONException unused) {
                            }
                        }
                        googleSignInOptions = null;
                    }
                    a8.e a10 = y.a(revocationBoundService, googleSignInOptions);
                    if (b10 != null) {
                        t0 t0Var = a10.h;
                        Context context = a10.f2911a;
                        if (a10.h() == 3) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        h.f16454a.f("Revoking access", new Object[0]);
                        String d11 = b.a(context).d("refreshToken");
                        h.b(context);
                        if (z4) {
                            if (d11 == null) {
                                e0 e0Var = c.f16441c;
                                Status status = new Status(4, null, null, null);
                                m.a("Status code must not be SUCCESS", !status.e());
                                basePendingResult = new s(status);
                                basePendingResult.a(status);
                            } else {
                                c cVar = new c(d11);
                                new Thread(cVar).start();
                                basePendingResult = cVar.f16443b;
                            }
                        } else {
                            g gVar = new g(t0Var, 1);
                            t0Var.f2877b.d(1, gVar);
                            basePendingResult = gVar;
                        }
                        m.n(basePendingResult, new db.a(3));
                    } else {
                        a10.g();
                    }
                }
                return true;
            default:
                if (i10 != 1) {
                    return false;
                }
                w6.f.b(parcel);
                r5.a((Status) w6.f.a(parcel, Status.CREATOR), (l5.f) w6.f.a(parcel, l5.f.CREATOR), (TaskCompletionSource) obj);
                return true;
        }
    }

    public void J0() {
        if (i6.b.e((RevocationBoundService) this.f16459c, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException(a2.k(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
    }

    public l(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 10);
        this.f16459c = taskCompletionSource;
    }
}
