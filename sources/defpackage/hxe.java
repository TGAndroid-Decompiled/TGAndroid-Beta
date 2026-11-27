package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
public abstract class hxe {
    public static void a(int i, int i2, Intent intent, Executor executor, h23 h23Var, CancellationSignal cancellationSignal) {
        bv4 bv4Var;
        String string;
        Bundle bundle;
        boolean z = q23.c;
        if (i != z) {
            Log.w("GetCredentialController", "Returned request code " + (z ? 1 : 0) + " which  does not match what was given " + i);
            return;
        }
        l23 l23Var = q23.a;
        if (i2 != -1) {
            yu4 xu4Var = new xu4(bfe.a(i2), (byte) 2);
            if (i2 == 0) {
                xu4Var = new vu4("activity is cancelled by the user.");
            }
            CredentialProviderPlayServicesImpl.Companion.getClass();
            if (!d33.a(cancellationSignal)) {
                executor.execute(new z23(h23Var, xu4Var, (byte) 2));
            }
        } else if (intent == null) {
            CredentialProviderPlayServicesImpl.Companion.getClass();
            if (!d33.a(cancellationSignal)) {
                executor.execute(new k13(h23Var, (byte) 10));
            }
        } else {
            int i3 = Build.VERSION.SDK_INT;
            yu4 yu4Var = null;
            if (i3 >= 34) {
                bv4Var = u4.d(intent);
            } else {
                Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                if (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) {
                    bv4Var = null;
                } else {
                    bv4Var = new bv4(vee.a(string, bundle));
                }
            }
            if (bv4Var != null) {
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!d33.a(cancellationSignal)) {
                    executor.execute(new yz8(h23Var, bv4Var, (byte) 17));
                    return;
                }
                return;
            }
            if (i3 >= 34) {
                yu4Var = u4.c(intent);
            } else {
                int i4 = yu4.a;
                Bundle bundleExtra2 = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                if (bundleExtra2 != null) {
                    String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                    if (string2 != null) {
                        yu4Var = tyd.b(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                    } else {
                        lq5.j("Bundle was missing exception type.");
                        return;
                    }
                }
            }
            CredentialProviderPlayServicesImpl.Companion.getClass();
            if (d33.a(cancellationSignal)) {
                return;
            }
            executor.execute(new z23(h23Var, yu4Var, (byte) 1));
        }
    }
}
