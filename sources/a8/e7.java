package a8;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import c8.fe;
import c8.vc;
import java.util.concurrent.Executor;
public abstract class e7 {
    public static void a(int i7, int i10, Intent intent, Executor executor, v0.g gVar, CancellationSignal cancellationSignal) {
        v0.o oVar;
        String string;
        Bundle bundle;
        int i11 = b1.d.f2899c;
        if (i7 != i11) {
            Log.w("GetCredentialController", "Returned request code " + i11 + " which  does not match what was given " + i7);
            return;
        }
        int i12 = b1.d.d;
        if (d7.b(i10, new b1.e(0), new ae.d(1, executor, gVar), cancellationSignal)) {
            return;
        }
        if (intent == null) {
            d7.a(cancellationSignal, new b1.f(0, executor, gVar));
            return;
        }
        int i13 = Build.VERSION.SDK_INT;
        w0.i iVar = null;
        if (i13 >= 34) {
            oVar = h1.a.d(intent);
        } else {
            Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
            if (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) {
                oVar = null;
            } else {
                oVar = new v0.o(vc.a(string, bundle));
            }
        }
        if (oVar != null) {
            d7.a(cancellationSignal, new b1.b(executor, gVar, oVar, 1));
            return;
        }
        if (i13 >= 34) {
            iVar = h1.a.c(intent);
        } else {
            int i14 = w0.i.f57481a;
            Bundle bundleExtra2 = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
            if (bundleExtra2 != null) {
                String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                if (string2 != null) {
                    iVar = fe.b(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                } else {
                    throw new IllegalArgumentException("Bundle was missing exception type.");
                }
            }
        }
        d7.a(cancellationSignal, new b1.b(executor, gVar, iVar, 2));
    }
}
