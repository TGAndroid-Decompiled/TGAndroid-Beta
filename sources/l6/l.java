package l6;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class l {
    public final int f18083a;
    public final TaskCompletionSource f18084b = new TaskCompletionSource();
    public final int f18085c;
    public final Bundle d;
    public final int f18086e;

    public l(int i3, int i10, Bundle bundle, int i11) {
        this.f18086e = i11;
        this.f18083a = i3;
        this.f18085c = i10;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.f18086e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String lVar = toString();
            String valueOf = String.valueOf(bundle);
            StringBuilder sb2 = new StringBuilder(lVar.length() + 16 + valueOf.length());
            sb2.append("Finishing ");
            sb2.append(lVar);
            sb2.append(" with ");
            sb2.append(valueOf);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f18084b.setResult(bundle);
    }

    public final void c(m mVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String lVar = toString();
            String obj = mVar.toString();
            StringBuilder sb2 = new StringBuilder(lVar.length() + 14 + obj.length());
            sb2.append("Failing ");
            sb2.append(lVar);
            sb2.append(" with ");
            sb2.append(obj);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f18084b.setException(mVar);
    }

    public final String toString() {
        int i3 = this.f18085c;
        int length = String.valueOf(i3).length();
        int i10 = this.f18083a;
        int length2 = String.valueOf(i10).length();
        boolean a10 = a();
        StringBuilder sb2 = new StringBuilder(length + 19 + length2 + 8 + String.valueOf(a10).length() + 1);
        sb2.append("Request { what=");
        sb2.append(i3);
        sb2.append(" id=");
        sb2.append(i10);
        sb2.append(" oneWay=");
        sb2.append(a10);
        sb2.append("}");
        return sb2.toString();
    }
}
