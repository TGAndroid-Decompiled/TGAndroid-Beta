package f7;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
public abstract class f0 {
    public static void a(CancellationSignal cancellationSignal, zc.a onResultOrException) {
        kotlin.jvm.internal.i.e(onResultOrException, "onResultOrException");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (a1.g.a(cancellationSignal)) {
            return;
        }
        onResultOrException.invoke();
    }

    public static boolean b(int i9, zc.p pVar, zc.l lVar, CancellationSignal cancellationSignal) {
        if (i9 != -1) {
            ?? obj = new Object();
            obj.f16499a = new w0.h(j3.r0.m(i9, "activity with result code: ", " indicating not RESULT_OK"), 2);
            if (i9 == 0) {
                obj.f16499a = new w0.g("activity is cancelled by the user.");
            }
            pVar.invoke(cancellationSignal, new b1.c(lVar, obj, 1));
            return true;
        }
        return false;
    }
}
