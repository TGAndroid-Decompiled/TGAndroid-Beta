package o5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
public final class b0 implements com.google.android.gms.common.api.internal.s {
    public final int f19230a;
    public final e0 f19231b;
    public final String f19232c;
    public final String d;

    public b0(e0 e0Var, String str, String str2, int i10) {
        this.f19230a = i10;
        this.f19231b = e0Var;
        this.f19232c = str;
        this.d = str2;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        boolean z10 = false;
        boolean z11 = true;
        switch (this.f19230a) {
            case 0:
                e0 e0Var = this.f19231b;
                String str = this.f19232c;
                String str2 = this.d;
                s5.x xVar = (s5.x) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                if (e0Var.F != 2) {
                    z11 = false;
                }
                z5.l.j("Not connected to device", z11);
                s5.f fVar = (s5.f) xVar.u();
                Parcel M0 = fVar.M0();
                M0.writeString(str);
                M0.writeString(str2);
                int i10 = com.google.android.gms.internal.cast.u.f4281a;
                M0.writeInt(0);
                fVar.R0(M0, 14);
                synchronized (e0Var.f19259r) {
                    try {
                        if (e0Var.f19256o != null) {
                            e0Var.i(2477);
                        }
                        e0Var.f19256o = taskCompletionSource;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                e0 e0Var2 = this.f19231b;
                String str3 = this.f19232c;
                String str4 = this.d;
                s5.x xVar2 = (s5.x) obj;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj2;
                HashMap hashMap = e0Var2.B;
                long incrementAndGet = e0Var2.f19258q.incrementAndGet();
                if (e0Var2.F == 2) {
                    z10 = true;
                }
                z5.l.j("Not connected to device", z10);
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), taskCompletionSource2);
                    s5.f fVar2 = (s5.f) xVar2.u();
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
