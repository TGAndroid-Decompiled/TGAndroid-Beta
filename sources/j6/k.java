package j6;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class k {
    public final int f14055a;
    public final TaskCompletionSource f14056b = new TaskCompletionSource();
    public final int f14057c;
    public final Bundle d;
    public final int f14058e;

    public k(int i10, int i11, Bundle bundle, int i12) {
        this.f14058e = i12;
        this.f14055a = i10;
        this.f14057c = i11;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.f14058e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(cc.k kVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String kVar2 = toString();
            String obj = kVar.toString();
            Log.d("MessengerIpcClient", "Failing " + kVar2 + " with " + obj);
        }
        this.f14056b.setException(kVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String kVar = toString();
            String valueOf = String.valueOf(bundle);
            Log.d("MessengerIpcClient", "Finishing " + kVar + " with " + valueOf);
        }
        this.f14056b.setResult(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f14057c + " id=" + this.f14055a + " oneWay=" + a() + "}";
    }
}
