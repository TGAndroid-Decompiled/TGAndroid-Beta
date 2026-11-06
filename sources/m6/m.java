package m6;

import ab.a0;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class m {
    public final int f19912a;
    public final TaskCompletionSource f19913b = new TaskCompletionSource();
    public final int f19914c;
    public final Bundle d;
    public final int f19915e;

    public m(int i7, int i10, Bundle bundle, int i11) {
        this.f19915e = i11;
        this.f19912a = i7;
        this.f19914c = i10;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.f19915e) {
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
        this.f19913b.setResult(bundle);
    }

    public final void c(a0 a0Var) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String mVar = toString();
            String obj = a0Var.toString();
            StringBuilder sb2 = new StringBuilder(mVar.length() + 14 + obj.length());
            sb2.append("Failing ");
            sb2.append(mVar);
            sb2.append(" with ");
            sb2.append(obj);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f19913b.setException(a0Var);
    }

    public final String toString() {
        int i7 = this.f19914c;
        int length = String.valueOf(i7).length();
        int i10 = this.f19912a;
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
