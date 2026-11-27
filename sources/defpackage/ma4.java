package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
public final class ma4 {
    public final HashMap a;

    public ma4(byte b) {
        switch (b) {
            case 1:
                this.a = new HashMap();
                return;
            default:
                this.a = new HashMap();
                return;
        }
    }

    public final void a(IBinder iBinder) {
        synchronized (this.a) {
            if (iBinder != null) {
                iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
            }
            new p9d();
            for (Map.Entry entry : this.a.entrySet()) {
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
