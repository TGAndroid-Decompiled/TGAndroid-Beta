package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class ebf {
    public final int a;
    public final TaskCompletionSource b = new TaskCompletionSource();
    public final byte c;
    public final Bundle d;
    public final byte e;

    public ebf(int i, int i2, Bundle bundle, byte b) {
        this.e = b;
        this.a = i;
        this.c = i2;
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

    public final void b(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String ebfVar = toString();
            String valueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(ebfVar.length() + 16 + valueOf.length());
            sb.append("Finishing ");
            sb.append(ebfVar);
            sb.append(" with ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.b.setResult(bundle);
    }

    public final void c(v30 v30Var) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String ebfVar = toString();
            String obj = v30Var.toString();
            StringBuilder sb = new StringBuilder(ebfVar.length() + 14 + obj.length());
            sb.append("Failing ");
            sb.append(ebfVar);
            sb.append(" with ");
            sb.append(obj);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.b.setException(v30Var);
    }

    public final String toString() {
        byte b = this.c;
        int length = String.valueOf((int) b).length();
        int i = this.a;
        int length2 = String.valueOf(i).length();
        boolean a = a();
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 8 + String.valueOf(a).length() + 1);
        sb.append("Request { what=");
        sb.append((int) b);
        sb.append(" id=");
        sb.append(i);
        sb.append(" oneWay=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
