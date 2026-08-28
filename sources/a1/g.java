package a1;

import android.os.CancellationSignal;
import android.util.Log;
public final class g {
    public static boolean a(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            if (cancellationSignal.isCanceled()) {
                Log.i("PlayServicesImpl", "the flow has been canceled");
                return true;
            }
            return false;
        }
        Log.i("PlayServicesImpl", "No cancellationSignal found");
        return false;
    }
}
