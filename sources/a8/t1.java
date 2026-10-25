package a8;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
public abstract class t1 {
    public static void a(CancellationSignal cancellationSignal, ud.a onResultOrException) {
        kotlin.jvm.internal.i.e(onResultOrException, "onResultOrException");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (a1.h.a(cancellationSignal)) {
            return;
        }
        onResultOrException.invoke();
    }

    public static boolean b(int i10, ud.p pVar, ud.l lVar, CancellationSignal cancellationSignal) {
        if (i10 != -1) {
            ?? obj = new Object();
            obj.f16669a = new w0.h(ic.a.j(i10, "activity with result code: ", " indicating not RESULT_OK"), 2);
            if (i10 == 0) {
                obj.f16669a = new w0.g("activity is cancelled by the user.");
            }
            pVar.invoke(cancellationSignal, new b1.c(lVar, obj, 1));
            return true;
        }
        return false;
    }
}
