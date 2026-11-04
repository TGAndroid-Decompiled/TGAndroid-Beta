package e6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
public final class b0 implements com.google.android.gms.common.api.internal.p {
    public final int f9671a;
    public final e0 f9672b;
    public final String f9673c;
    public final String d;

    public b0(e0 e0Var, String str, String str2, int i3) {
        this.f9671a = i3;
        this.f9672b = e0Var;
        this.f9673c = str;
        this.d = str2;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        boolean z10 = false;
        boolean z11 = true;
        switch (this.f9671a) {
            case 0:
                e0 e0Var = this.f9672b;
                String str = this.f9673c;
                String str2 = this.d;
                i6.w wVar = (i6.w) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                if (e0Var.G != 2) {
                    z11 = false;
                }
                p6.m.i("Not connected to device", z11);
                i6.f fVar = (i6.f) wVar.m();
                Parcel P0 = fVar.P0();
                P0.writeString(str);
                P0.writeString(str2);
                int i3 = com.google.android.gms.internal.cast.u.f7057a;
                P0.writeInt(0);
                fVar.U0(P0, 14);
                synchronized (e0Var.f9700s) {
                    try {
                        if (e0Var.f9697p != null) {
                            e0Var.i(2477);
                        }
                        e0Var.f9697p = taskCompletionSource;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                e0 e0Var2 = this.f9672b;
                String str3 = this.f9673c;
                String str4 = this.d;
                i6.w wVar2 = (i6.w) obj;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj2;
                HashMap hashMap = e0Var2.C;
                long incrementAndGet = e0Var2.f9699r.incrementAndGet();
                if (e0Var2.G == 2) {
                    z10 = true;
                }
                p6.m.i("Not connected to device", z10);
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), taskCompletionSource2);
                    i6.f fVar2 = (i6.f) wVar2.m();
                    Parcel P02 = fVar2.P0();
                    P02.writeString(str3);
                    P02.writeString(str4);
                    P02.writeLong(incrementAndGet);
                    fVar2.U0(P02, 9);
                    return;
                } catch (RemoteException e10) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    taskCompletionSource2.setException(e10);
                    return;
                }
        }
    }
}
