package k6;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.p;
public final class l {
    public final int f16420a;
    public final TaskCompletionSource f16421b = new TaskCompletionSource();
    public final int f16422c;
    public final Bundle d;
    public final int e;

    public l(int i10, int i11, Bundle bundle, int i12) {
        this.e = i12;
        this.f16420a = i10;
        this.f16422c = i11;
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

    public final void b(p pVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String lVar = toString();
            String obj = pVar.toString();
            Log.d("MessengerIpcClient", "Failing " + lVar + " with " + obj);
        }
        this.f16421b.setException(pVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String lVar = toString();
            String valueOf = String.valueOf(bundle);
            Log.d("MessengerIpcClient", "Finishing " + lVar + " with " + valueOf);
        }
        this.f16421b.setResult(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f16422c + " id=" + this.f16420a + " oneWay=" + a() + "}";
    }
}
