package m5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;

public final class c0 implements com.google.android.gms.common.api.internal.s {

    public final int f17753a;

    public final f0 f17754b;

    public final String f17755c;
    public final String d;

    public c0(f0 f0Var, String str, String str2, int i10) {
        this.f17753a = i10;
        this.f17754b = f0Var;
        this.f17755c = str;
        this.d = str2;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f17753a) {
            case 0:
                f0 f0Var = this.f17754b;
                String str = this.f17755c;
                String str2 = this.d;
                r5.x xVar = (r5.x) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                y5.l.j("Not connected to device", f0Var.F == 2);
                r5.f fVar = (r5.f) xVar.u();
                Parcel parcelM0 = fVar.M0();
                parcelM0.writeString(str);
                parcelM0.writeString(str2);
                int i10 = com.google.android.gms.internal.cast.t.f3660a;
                parcelM0.writeInt(0);
                fVar.R0(parcelM0, 14);
                synchronized (f0Var.f17777r) {
                    try {
                        if (f0Var.f17774o != null) {
                            f0Var.i(2477);
                        }
                        f0Var.f17774o = taskCompletionSource;
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                f0 f0Var2 = this.f17754b;
                String str3 = this.f17755c;
                String str4 = this.d;
                r5.x xVar2 = (r5.x) obj;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj2;
                HashMap map = f0Var2.B;
                long jIncrementAndGet = f0Var2.f17776q.incrementAndGet();
                y5.l.j("Not connected to device", f0Var2.F == 2);
                try {
                    map.put(Long.valueOf(jIncrementAndGet), taskCompletionSource2);
                    r5.f fVar2 = (r5.f) xVar2.u();
                    Parcel parcelM1 = fVar2.M0();
                    parcelM1.writeString(str3);
                    parcelM1.writeString(str4);
                    parcelM1.writeLong(jIncrementAndGet);
                    fVar2.R0(parcelM1, 9);
                    return;
                } catch (RemoteException e9) {
                    map.remove(Long.valueOf(jIncrementAndGet));
                    taskCompletionSource2.setException(e9);
                    return;
                }
        }
    }
}
