package o3;

import android.media.MediaDrm;
import h5.d0;
public abstract class q {
    public static boolean a(Throwable th2) {
        return th2 instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th2) {
        return d0.r(d0.s(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
    }
}
