package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
public abstract class rue {
    public static void a(int i, int i2, Intent intent, Executor executor, a33 a33Var, CancellationSignal cancellationSignal) {
        yu4 yu4Var;
        String string;
        Bundle bundle;
        boolean z = j33.c;
        if (i != z) {
            Log.w("GetCredentialController", "Returned request code " + (z ? 1 : 0) + " which  does not match what was given " + i);
            return;
        }
        e33 e33Var = j33.a;
        if (i2 != -1) {
            vu4 uu4Var = new uu4(mce.a(i2), (byte) 2);
            if (i2 == 0) {
                uu4Var = new su4("activity is cancelled by the user.");
            }
            CredentialProviderPlayServicesImpl.Companion.getClass();
            if (!w33.a(cancellationSignal)) {
                executor.execute(new s33(a33Var, uu4Var, (byte) 2));
            }
        } else if (intent == null) {
            CredentialProviderPlayServicesImpl.Companion.getClass();
            if (!w33.a(cancellationSignal)) {
                executor.execute(new d23(a33Var, (byte) 10));
            }
        } else {
            int i3 = Build.VERSION.SDK_INT;
            vu4 vu4Var = null;
            if (i3 >= 34) {
                yu4Var = t4.d(intent);
            } else {
                Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                if (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) {
                    yu4Var = null;
                } else {
                    yu4Var = new yu4(gce.a(string, bundle));
                }
            }
            if (yu4Var != null) {
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!w33.a(cancellationSignal)) {
                    executor.execute(new ey8(a33Var, yu4Var, (byte) 19));
                    return;
                }
                return;
            }
            if (i3 >= 34) {
                vu4Var = t4.c(intent);
            } else {
                int i4 = vu4.a;
                Bundle bundleExtra2 = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                if (bundleExtra2 != null) {
                    String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                    if (string2 != null) {
                        vu4Var = gwd.b(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                    } else {
                        u36.j("Bundle was missing exception type.");
                        return;
                    }
                }
            }
            CredentialProviderPlayServicesImpl.Companion.getClass();
            if (w33.a(cancellationSignal)) {
                return;
            }
            executor.execute(new s33(a33Var, vu4Var, (byte) 1));
        }
    }
}
