package j6;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class k {
    public final int f9696a;
    public final TaskCompletionSource f9697b = new TaskCompletionSource();
    public final int f9698c;
    public final Bundle d;
    public final int e;

    public k(int i10, int i11, Bundle bundle, int i12) {
        this.e = i12;
        this.f9696a = i10;
        this.f9698c = i11;
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

    public final void b(l lVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String kVar = toString();
            String obj = lVar.toString();
            Log.d("MessengerIpcClient", "Failing " + kVar + " with " + obj);
        }
        this.f9697b.setException(lVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String kVar = toString();
            String valueOf = String.valueOf(bundle);
            Log.d("MessengerIpcClient", "Finishing " + kVar + " with " + valueOf);
        }
        this.f9697b.setResult(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f9698c + " id=" + this.f9696a + " oneWay=" + a() + "}";
    }
}
