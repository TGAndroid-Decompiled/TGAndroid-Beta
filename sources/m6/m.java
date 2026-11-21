package m6;

import ab.b0;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class m {
    public final int f20901a;
    public final TaskCompletionSource f20902b = new TaskCompletionSource();
    public final int f20903c;
    public final Bundle d;
    public final int f20904e;

    public m(int i7, int i10, Bundle bundle, int i11) {
        this.f20904e = i11;
        this.f20901a = i7;
        this.f20903c = i10;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.f20904e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String mVar = toString();
            String valueOf = String.valueOf(bundle);
            StringBuilder sb2 = new StringBuilder(mVar.length() + 16 + valueOf.length());
            sb2.append("Finishing ");
            sb2.append(mVar);
            sb2.append(" with ");
            sb2.append(valueOf);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f20902b.setResult(bundle);
    }

    public final void c(b0 b0Var) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String mVar = toString();
            String obj = b0Var.toString();
            StringBuilder sb2 = new StringBuilder(mVar.length() + 14 + obj.length());
            sb2.append("Failing ");
            sb2.append(mVar);
            sb2.append(" with ");
            sb2.append(obj);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f20902b.setException(b0Var);
    }

    public final String toString() {
        int i7 = this.f20903c;
        int length = String.valueOf(i7).length();
        int i10 = this.f20901a;
        int length2 = String.valueOf(i10).length();
        boolean a10 = a();
        StringBuilder sb2 = new StringBuilder(length + 19 + length2 + 8 + String.valueOf(a10).length() + 1);
        sb2.append("Request { what=");
        sb2.append(i7);
        sb2.append(" id=");
        sb2.append(i10);
        sb2.append(" oneWay=");
        sb2.append(a10);
        sb2.append("}");
        return sb2.toString();
    }
}
