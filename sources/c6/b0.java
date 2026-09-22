package c6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
public final class b0 implements com.google.android.gms.common.api.internal.s {
    public final int f3957a;
    public final e0 f3958b;
    public final String f3959c;
    public final String d;

    public b0(e0 e0Var, String str, String str2, int i10) {
        this.f3957a = i10;
        this.f3958b = e0Var;
        this.f3959c = str;
        this.d = str2;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        boolean z10 = false;
        boolean z11 = true;
        switch (this.f3957a) {
            case 0:
                e0 e0Var = this.f3958b;
                String str = this.f3959c;
                String str2 = this.d;
                g6.w wVar = (g6.w) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                if (e0Var.F != 2) {
                    z11 = false;
                }
                n6.l.j("Not connected to device", z11);
                g6.f fVar = (g6.f) wVar.u();
                Parcel O0 = fVar.O0();
                O0.writeString(str);
                O0.writeString(str2);
                int i10 = com.google.android.gms.internal.cast.v.f6513a;
                O0.writeInt(0);
                fVar.T0(O0, 14);
                synchronized (e0Var.f3984r) {
                    try {
                        if (e0Var.f3981o != null) {
                            e0Var.i(2477);
                        }
                        e0Var.f3981o = taskCompletionSource;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                e0 e0Var2 = this.f3958b;
                String str3 = this.f3959c;
                String str4 = this.d;
                g6.w wVar2 = (g6.w) obj;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj2;
                HashMap hashMap = e0Var2.B;
                long incrementAndGet = e0Var2.f3983q.incrementAndGet();
                if (e0Var2.F == 2) {
                    z10 = true;
                }
                n6.l.j("Not connected to device", z10);
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), taskCompletionSource2);
                    g6.f fVar2 = (g6.f) wVar2.u();
                    Parcel O02 = fVar2.O0();
                    O02.writeString(str3);
                    O02.writeString(str4);
                    O02.writeLong(incrementAndGet);
                    fVar2.T0(O02, 9);
                    return;
                } catch (RemoteException e) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    taskCompletionSource2.setException(e);
                    return;
                }
        }
    }
}
