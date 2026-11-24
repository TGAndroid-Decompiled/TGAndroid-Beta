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
public final class o3d extends dzc {
    public final byte b = 1;
    public final Object c;

    public o3d(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", (byte) 2);
        this.c = revocationBoundService;
    }

    public final void T() {
        if (axe.a((RevocationBoundService) this.c, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException(tb4.n(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
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
                w3d.b(parcel);
                dve.a((Status) w3d.a(parcel, Status.CREATOR), (ih0) w3d.a(parcel, ih0.CREATOR), (TaskCompletionSource) obj);
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    T();
                    i4d.N2(revocationBoundService).O2();
                } else {
                    T();
                    d1b a = d1b.a(revocationBoundService);
                    GoogleSignInAccount b2 = a.b();
                    GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.w;
                    if (b2 != null) {
                        String e2 = a.e("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(e2) && (e = a.e(d1b.f("googleSignInOptions", e2))) != null) {
                            try {
                                googleSignInOptions = GoogleSignInOptions.b(e);
                            } catch (JSONException unused) {
                            }
                        }
                        googleSignInOptions = null;
                    }
                    u84 a2 = aje.a(revocationBoundService, googleSignInOptions);
                    if (b2 != null) {
                        x1d x1dVar = a2.i;
                        Context context = a2.a;
                        if (a2.l() == 3) {
                            z = true;
                        } else {
                            z = false;
                        }
                        h4d.a.a("Revoking access", new Object[0]);
                        String e3 = d1b.a(context).e("refreshToken");
                        h4d.b(context);
                        if (z) {
                            if (e3 == null) {
                                lh0 lh0Var = t3d.c;
                                Status status = new Status(4, null, null, null);
                                fre.a("Status code must not be SUCCESS", !status.b());
                                basePendingResult = new m2d(status);
                                basePendingResult.a(status);
                            } else {
                                t3d t3dVar = new t3d(e3);
                                new Thread(t3dVar).start();
                                basePendingResult = t3dVar.b;
                            }
                        } else {
                            f4d f4dVar = new f4d(x1dVar, (byte) 1);
                            x1dVar.b.d(1, f4dVar);
                            basePendingResult = f4dVar;
                        }
                        wbd.a(basePendingResult, new o5f((byte) 29));
                    } else {
                        a2.k();
                    }
                }
                return true;
        }
    }

    public o3d(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", (byte) 2);
        this.c = taskCompletionSource;
    }
}
