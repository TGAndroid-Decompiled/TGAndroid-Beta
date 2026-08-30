package o3;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
public abstract class p {
    public static boolean a(Throwable th2) {
        return th2 instanceof DeniedByServerException;
    }

    public static boolean b(Throwable th2) {
        return th2 instanceof NotProvisionedException;
    }
}
