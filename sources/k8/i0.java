package k8;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
public final class i0 {
    public final HashMap f13514a;

    public i0(int i10) {
        switch (i10) {
            case 1:
                this.f13514a = new HashMap();
                return;
            default:
                this.f13514a = new HashMap();
                return;
        }
    }

    public void a(Runnable runnable) {
        Runnable runnable2 = (Runnable) this.f13514a.remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    public void b() {
        HashMap hashMap = this.f13514a;
        for (Map.Entry entry : hashMap.entrySet()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) entry.getValue());
        }
        hashMap.clear();
    }

    public void c(IBinder iBinder) {
        synchronized (this.f13514a) {
            if (iBinder != null) {
                try {
                    iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            new a();
            for (Map.Entry entry : this.f13514a.entrySet()) {
                if (entry.getValue() == null) {
                    try {
                        throw null;
                        break;
                    } catch (RemoteException unused) {
                        String valueOf = String.valueOf(entry.getKey());
                        Log.w("WearableClient", "onPostInitHandler: Didn't add: " + valueOf + "/null");
                    }
                } else {
                    throw new ClassCastException();
                }
            }
        }
    }
}
