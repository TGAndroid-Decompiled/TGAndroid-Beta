package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
public abstract class ose {
    public static void a(int i, int i2, Intent intent, Executor executor, o13 o13Var, CancellationSignal cancellationSignal) {
        xs4 xs4Var;
        String string;
        Bundle bundle;
        boolean z = y13.c;
        if (i != z) {
            Log.w("GetCredentialController", "Returned request code " + (z ? 1 : 0) + " which  does not match what was given " + i);
            return;
        }
        t13 t13Var = y13.a;
        if (i2 != -1) {
            us4 ts4Var = new ts4(lae.a(i2), (byte) 2);
            if (i2 == 0) {
                ts4Var = new rs4("activity is cancelled by the user.");
            }
            CredentialProviderPlayServicesImpl.Companion.getClass();
            if (!l23.a(cancellationSignal)) {
                executor.execute(new h23(o13Var, ts4Var, (byte) 2));
            }
        } else if (intent == null) {
            CredentialProviderPlayServicesImpl.Companion.getClass();
            if (!l23.a(cancellationSignal)) {
                executor.execute(new r03(o13Var, (byte) 10));
            }
        } else {
            int i3 = Build.VERSION.SDK_INT;
            us4 us4Var = null;
            if (i3 >= 34) {
                xs4Var = t4.d(intent);
            } else {
                Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                if (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) {
                    xs4Var = null;
                } else {
                    xs4Var = new xs4(fae.a(string, bundle));
                }
            }
            if (xs4Var != null) {
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!l23.a(cancellationSignal)) {
                    executor.execute(new lw8(o13Var, xs4Var, (byte) 17));
                    return;
                }
                return;
            }
            if (i3 >= 34) {
                us4Var = t4.c(intent);
            } else {
                int i4 = us4.a;
                Bundle bundleExtra2 = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                if (bundleExtra2 != null) {
                    String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                    if (string2 != null) {
                        us4Var = dud.b(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                    } else {
                        w26.j("Bundle was missing exception type.");
                        return;
                    }
                }
            }
            CredentialProviderPlayServicesImpl.Companion.getClass();
            if (l23.a(cancellationSignal)) {
                return;
            }
            executor.execute(new h23(o13Var, us4Var, (byte) 1));
        }
    }
}
