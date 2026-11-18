package a8;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import c8.je;
import c8.zc;
import java.util.concurrent.Executor;
public abstract class f7 {
    public static void a(int i7, int i10, Intent intent, Executor executor, v0.g gVar, CancellationSignal cancellationSignal) {
        v0.n nVar;
        String string;
        Bundle bundle;
        int i11 = b1.d.f2847c;
        if (i7 != i11) {
            Log.w("GetCredentialController", "Returned request code " + i11 + " which  does not match what was given " + i7);
            return;
        }
        int i12 = b1.d.d;
        if (e7.b(i10, new b1.e(0), new ae.d(1, executor, gVar), cancellationSignal)) {
            return;
        }
        if (intent == null) {
            e7.a(cancellationSignal, new b1.f(0, executor, gVar));
            return;
        }
        int i13 = Build.VERSION.SDK_INT;
        w0.i iVar = null;
        if (i13 >= 34) {
            nVar = h1.a.d(intent);
        } else {
            Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
            if (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) {
                nVar = null;
            } else {
                nVar = new v0.n(zc.a(string, bundle));
            }
        }
        if (nVar != null) {
            e7.a(cancellationSignal, new b1.b(executor, gVar, nVar, 1));
            return;
        }
        if (i13 >= 34) {
            iVar = h1.a.c(intent);
        } else {
            int i14 = w0.i.f59589a;
            Bundle bundleExtra2 = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
            if (bundleExtra2 != null) {
                String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                if (string2 != null) {
                    iVar = je.b(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                } else {
                    throw new IllegalArgumentException("Bundle was missing exception type.");
                }
            }
        }
        e7.a(cancellationSignal, new b1.b(executor, gVar, iVar, 2));
    }
}
