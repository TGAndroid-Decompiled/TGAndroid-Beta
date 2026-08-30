package j7;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
public abstract class b0 {
    public static void a(CancellationSignal cancellationSignal, dd.a onResultOrException) {
        kotlin.jvm.internal.j.e(onResultOrException, "onResultOrException");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (a1.g.a(cancellationSignal)) {
            return;
        }
        onResultOrException.invoke();
    }

    public static boolean b(int i10, dd.p pVar, dd.l lVar, CancellationSignal cancellationSignal) {
        if (i10 != -1) {
            ?? obj = new Object();
            obj.f10990a = new w0.h(kh.a2.k(i10, "activity with result code: ", " indicating not RESULT_OK"), 2);
            if (i10 == 0) {
                obj.f10990a = new w0.g("activity is cancelled by the user.");
            }
            pVar.invoke(cancellationSignal, new b1.c(lVar, obj, 1));
            return true;
        }
        return false;
    }
}
