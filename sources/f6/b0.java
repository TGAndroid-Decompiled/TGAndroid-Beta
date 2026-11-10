package f6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
public final class b0 implements com.google.android.gms.common.api.internal.p {
    public final int f11233a;
    public final e0 f11234b;
    public final String f11235c;
    public final String d;

    public b0(e0 e0Var, String str, String str2, int i7) {
        this.f11233a = i7;
        this.f11234b = e0Var;
        this.f11235c = str;
        this.d = str2;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        boolean z9 = false;
        boolean z10 = true;
        switch (this.f11233a) {
            case 0:
                e0 e0Var = this.f11234b;
                String str = this.f11235c;
                String str2 = this.d;
                j6.w wVar = (j6.w) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                if (e0Var.G != 2) {
                    z10 = false;
                }
                q6.m.i("Not connected to device", z10);
                j6.f fVar = (j6.f) wVar.n();
                Parcel p12 = fVar.p1();
                p12.writeString(str);
                p12.writeString(str2);
                int i7 = com.google.android.gms.internal.cast.t.f6994a;
                p12.writeInt(0);
                fVar.u1(p12, 14);
                synchronized (e0Var.f11262s) {
                    try {
                        if (e0Var.f11259p != null) {
                            e0Var.i(2477);
                        }
                        e0Var.f11259p = taskCompletionSource;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                e0 e0Var2 = this.f11234b;
                String str3 = this.f11235c;
                String str4 = this.d;
                j6.w wVar2 = (j6.w) obj;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj2;
                HashMap hashMap = e0Var2.C;
                long incrementAndGet = e0Var2.f11261r.incrementAndGet();
                if (e0Var2.G == 2) {
                    z9 = true;
                }
                q6.m.i("Not connected to device", z9);
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), taskCompletionSource2);
                    j6.f fVar2 = (j6.f) wVar2.n();
                    Parcel p13 = fVar2.p1();
                    p13.writeString(str3);
                    p13.writeString(str4);
                    p13.writeLong(incrementAndGet);
                    fVar2.u1(p13, 9);
                    return;
                } catch (RemoteException e10) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    taskCompletionSource2.setException(e10);
                    return;
                }
        }
    }
}
