package j6;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.r;
public final class k {
    public final int f12873a;
    public final TaskCompletionSource f12874b = new TaskCompletionSource();
    public final int f12875c;
    public final Bundle d;
    public final int e;

    public k(int i10, int i11, Bundle bundle, int i12) {
        this.e = i12;
        this.f12873a = i10;
        this.f12875c = i11;
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

    public final void b(r rVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String kVar = toString();
            String obj = rVar.toString();
            Log.d("MessengerIpcClient", "Failing " + kVar + " with " + obj);
        }
        this.f12874b.setException(rVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String kVar = toString();
            String valueOf = String.valueOf(bundle);
            Log.d("MessengerIpcClient", "Finishing " + kVar + " with " + valueOf);
        }
        this.f12874b.setResult(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f12875c + " id=" + this.f12873a + " oneWay=" + a() + "}";
    }
}
