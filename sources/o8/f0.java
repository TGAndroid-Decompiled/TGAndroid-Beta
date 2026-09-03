package o8;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
public final class f0 {
    public final String f16642a;

    public f0(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        this.f16642a = ("UID: [" + myUid + "]  PID: [" + myPid + "] ").concat(str);
    }

    public static String d(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e6) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e6);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return android.support.v4.media.a.z(str, " : ", str2);
    }

    public final void a(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", d(this.f16642a, str, objArr), remoteException);
        }
    }

    public final void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", d(this.f16642a, str, objArr));
        }
    }

    public final void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", d(this.f16642a, str, objArr));
        }
    }
}
