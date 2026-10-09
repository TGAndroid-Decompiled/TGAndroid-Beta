package j6;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class k {
    public final int f14056a;
    public final TaskCompletionSource f14057b = new TaskCompletionSource();
    public final int f14058c;
    public final Bundle d;
    public final int f14059e;

    public k(int i10, int i11, Bundle bundle, int i12) {
        this.f14059e = i12;
        this.f14056a = i10;
        this.f14058c = i11;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.f14059e) {
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
        this.f14057b.setException(kVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String kVar = toString();
            String valueOf = String.valueOf(bundle);
            Log.d("MessengerIpcClient", "Finishing " + kVar + " with " + valueOf);
        }
        this.f14057b.setResult(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f14058c + " id=" + this.f14056a + " oneWay=" + a() + "}";
    }
}
