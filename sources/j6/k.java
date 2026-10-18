package j6;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.q;
public final class k {
    public final int f14285a;
    public final TaskCompletionSource f14286b = new TaskCompletionSource();
    public final int f14287c;
    public final Bundle d;
    public final int e;

    public k(int i10, int i11, Bundle bundle, int i12) {
        this.e = i12;
        this.f14285a = i10;
        this.f14287c = i11;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(q qVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String kVar = toString();
            String obj = qVar.toString();
            Log.d("MessengerIpcClient", "Failing " + kVar + " with " + obj);
        }
        this.f14286b.setException(qVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String kVar = toString();
            String valueOf = String.valueOf(bundle);
            Log.d("MessengerIpcClient", "Finishing " + kVar + " with " + valueOf);
        }
        this.f14286b.setResult(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f14287c + " id=" + this.f14285a + " oneWay=" + a() + "}";
    }
}
