package g5;

import android.system.ErrnoException;
import android.system.OsConstants;
public abstract class y {
    public static boolean b(Throwable th2) {
        if ((th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES) {
            return true;
        }
        return false;
    }
}
