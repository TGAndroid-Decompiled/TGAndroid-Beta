package m5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
public final class b0 implements com.google.android.gms.common.api.internal.s {
    public final int f17369a;
    public final f0 f17370b;
    public final String f17371c;
    public final String d;

    public b0(f0 f0Var, String str, String str2, int i9) {
        this.f17369a = i9;
        this.f17370b = f0Var;
        this.f17371c = str;
        this.d = str2;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        boolean z10 = false;
        boolean z11 = true;
        switch (this.f17369a) {
            case 0:
                f0 f0Var = this.f17370b;
                String str = this.f17371c;
                String str2 = this.d;
                q5.x xVar = (q5.x) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                if (f0Var.F != 2) {
                    z11 = false;
                }
                x5.l.j("Not connected to device", z11);
                q5.f fVar = (q5.f) xVar.u();
                Parcel M0 = fVar.M0();
                M0.writeString(str);
                M0.writeString(str2);
                int i9 = com.google.android.gms.internal.cast.u.f3239a;
                M0.writeInt(0);
                fVar.R0(M0, 14);
                synchronized (f0Var.f17400r) {
                    try {
                        if (f0Var.f17397o != null) {
                            f0Var.i(2477);
                        }
                        f0Var.f17397o = taskCompletionSource;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                f0 f0Var2 = this.f17370b;
                String str3 = this.f17371c;
                String str4 = this.d;
                q5.x xVar2 = (q5.x) obj;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj2;
                HashMap hashMap = f0Var2.B;
                long incrementAndGet = f0Var2.f17399q.incrementAndGet();
                if (f0Var2.F == 2) {
                    z10 = true;
                }
                x5.l.j("Not connected to device", z10);
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), taskCompletionSource2);
                    q5.f fVar2 = (q5.f) xVar2.u();
                    Parcel M02 = fVar2.M0();
                    M02.writeString(str3);
                    M02.writeString(str4);
                    M02.writeLong(incrementAndGet);
                    fVar2.R0(M02, 9);
                    return;
                } catch (RemoteException e10) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    taskCompletionSource2.setException(e10);
                    return;
                }
        }
    }
}
