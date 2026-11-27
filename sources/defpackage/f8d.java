package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;
public final class f8d extends u3d {
    public final byte b = 1;
    public final Object c;

    public f8d(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", (byte) 2);
        this.c = revocationBoundService;
    }

    public final void T() {
        if (u1f.a((RevocationBoundService) this.c, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException(qd4.n(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
    }

    @Override
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        BasePendingResult basePendingResult;
        String e;
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (i != 1) {
                    return false;
                }
                n8d.b(parcel);
                vze.a((Status) n8d.a(parcel, Status.CREATOR), (jh0) n8d.a(parcel, jh0.CREATOR), (TaskCompletionSource) obj);
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    T();
                    z8d.s1(revocationBoundService).x1();
                } else {
                    T();
                    a5b a = a5b.a(revocationBoundService);
                    GoogleSignInAccount b2 = a.b();
                    GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.w;
                    if (b2 != null) {
                        String e2 = a.e("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(e2) && (e = a.e(a5b.f("googleSignInOptions", e2))) != null) {
                            try {
                                googleSignInOptions = GoogleSignInOptions.b(e);
                            } catch (JSONException unused) {
                            }
                        }
                        googleSignInOptions = null;
                    }
                    qa4 a2 = sne.a(revocationBoundService, googleSignInOptions);
                    if (b2 != null) {
                        o6d o6dVar = a2.i;
                        Context context = a2.a;
                        if (a2.l() == 3) {
                            z = true;
                        } else {
                            z = false;
                        }
                        y8d.a.a("Revoking access", new Object[0]);
                        String e3 = a5b.a(context).e("refreshToken");
                        y8d.b(context);
                        if (z) {
                            if (e3 == null) {
                                mh0 mh0Var = k8d.c;
                                Status status = new Status(4, null, null, null);
                                xve.a("Status code must not be SUCCESS", !status.b());
                                basePendingResult = new d7d(status);
                                basePendingResult.a(status);
                            } else {
                                k8d k8dVar = new k8d(e3);
                                new Thread(k8dVar).start();
                                basePendingResult = k8dVar.b;
                            }
                        } else {
                            w8d w8dVar = new w8d(o6dVar, (byte) 1);
                            o6dVar.b.d(1, w8dVar);
                            basePendingResult = w8dVar;
                        }
                        pgd.a(basePendingResult, new uif((byte) 29));
                    } else {
                        a2.k();
                    }
                }
                return true;
        }
    }

    public f8d(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", (byte) 2);
        this.c = taskCompletionSource;
    }
}
