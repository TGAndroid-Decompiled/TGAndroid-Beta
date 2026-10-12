package c6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
public final class b0 implements com.google.android.gms.common.api.internal.s {
    public final int f4445a;
    public final e0 f4446b;
    public final String f4447c;
    public final String d;

    public b0(e0 e0Var, String str, String str2, int i10) {
        this.f4445a = i10;
        this.f4446b = e0Var;
        this.f4447c = str;
        this.d = str2;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        boolean z10 = false;
        boolean z11 = true;
        switch (this.f4445a) {
            case 0:
                e0 e0Var = this.f4446b;
                String str = this.f4447c;
                String str2 = this.d;
                g6.w wVar = (g6.w) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                if (e0Var.F != 2) {
                    z11 = false;
                }
                n6.l.j("Not connected to device", z11);
                g6.f fVar = (g6.f) wVar.u();
                Parcel N0 = fVar.N0();
                N0.writeString(str);
                N0.writeString(str2);
                int i10 = com.google.android.gms.internal.cast.v.f5346a;
                N0.writeInt(0);
                fVar.S0(N0, 14);
                synchronized (e0Var.f4472r) {
                    try {
                        if (e0Var.f4469o != null) {
                            e0Var.i(2477);
                        }
                        e0Var.f4469o = taskCompletionSource;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                e0 e0Var2 = this.f4446b;
                String str3 = this.f4447c;
                String str4 = this.d;
                g6.w wVar2 = (g6.w) obj;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj2;
                HashMap hashMap = e0Var2.B;
                long incrementAndGet = e0Var2.f4471q.incrementAndGet();
                if (e0Var2.F == 2) {
                    z10 = true;
                }
                n6.l.j("Not connected to device", z10);
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), taskCompletionSource2);
                    g6.f fVar2 = (g6.f) wVar2.u();
                    Parcel N02 = fVar2.N0();
                    N02.writeString(str3);
                    N02.writeString(str4);
                    N02.writeLong(incrementAndGet);
                    fVar2.S0(N02, 9);
                    return;
                } catch (RemoteException e) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    taskCompletionSource2.setException(e);
                    return;
                }
        }
    }
}
