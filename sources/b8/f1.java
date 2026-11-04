package b8;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
public abstract class f1 {
    public static void a(CancellationSignal cancellationSignal, od.a onResultOrException) {
        kotlin.jvm.internal.j.e(onResultOrException, "onResultOrException");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (a1.h.a(cancellationSignal)) {
            return;
        }
        onResultOrException.invoke();
    }

    public static boolean b(int i3, od.p pVar, od.l lVar, CancellationSignal cancellationSignal) {
        if (i3 != -1) {
            ?? obj = new Object();
            obj.f17361a = new w0.h(2, k2.p1.j(i3, "activity with result code: ", " indicating not RESULT_OK"));
            if (i3 == 0) {
                obj.f17361a = new w0.g("activity is cancelled by the user.");
            }
            pVar.invoke(cancellationSignal, new b1.c(lVar, obj, 1));
            return true;
        }
        return false;
    }
}
