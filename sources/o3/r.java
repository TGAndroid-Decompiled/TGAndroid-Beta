package o3;

import android.media.MediaDrm;
public abstract class r {
    public static boolean a(Throwable th2) {
        return th2 instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th2) {
        return h5.d0.r(h5.d0.s(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
    }
}
