package a8;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
public abstract class d7 {
    public static void a(CancellationSignal cancellationSignal, rd.a onResultOrException) {
        kotlin.jvm.internal.j.e(onResultOrException, "onResultOrException");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (a1.g.a(cancellationSignal)) {
            return;
        }
        onResultOrException.invoke();
    }

    public static boolean b(int i7, rd.p pVar, rd.l lVar, CancellationSignal cancellationSignal) {
        if (i7 != -1) {
            ?? obj = new Object();
            obj.f17618a = new w0.h(2, jg.g.k(i7, "activity with result code: ", " indicating not RESULT_OK"));
            if (i7 == 0) {
                obj.f17618a = new w0.g("activity is cancelled by the user.");
            }
            pVar.invoke(cancellationSignal, new b1.c(lVar, obj, 1));
            return true;
        }
        return false;
    }
}
