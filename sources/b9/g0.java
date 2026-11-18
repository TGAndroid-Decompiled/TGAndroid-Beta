package b9;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
public final class g0 {
    public final HashMap f3005a;

    public g0(int i7) {
        switch (i7) {
            case 1:
                this.f3005a = new HashMap();
                return;
            case 2:
                this.f3005a = new HashMap();
                return;
            default:
                this.f3005a = new HashMap();
                return;
        }
    }

    public void a(Runnable runnable) {
        Runnable runnable2 = (Runnable) this.f3005a.remove(runnable);
        if (runnable2 != null) {
            org.telegram.messenger.g0.r(runnable2);
        }
    }

    public void b() {
        HashMap hashMap = this.f3005a;
        for (Map.Entry entry : hashMap.entrySet()) {
            org.telegram.messenger.g0.r((Runnable) entry.getValue());
        }
        hashMap.clear();
    }

    public void c(IBinder iBinder) {
        synchronized (this.f3005a) {
            if (iBinder != null) {
                try {
                    iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            new a();
            for (Map.Entry entry : this.f3005a.entrySet()) {
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
