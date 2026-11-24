package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
public final class fcd implements f69 {
    public final byte a;
    public final afd b;
    public final String c;
    public final String d;

    public fcd(afd afdVar, String str, String str2, byte b) {
        this.a = b;
        this.b = afdVar;
        this.c = str;
        this.d = str2;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        boolean z = false;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                afd afdVar = this.b;
                String str = this.c;
                String str2 = this.d;
                lhf lhfVar = (lhf) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                if (afdVar.G != 2) {
                    z2 = false;
                }
                fre.j("Not connected to device", z2);
                x6d x6dVar = (x6d) lhfVar.k();
                Parcel R = x6dVar.R();
                R.writeString(str);
                R.writeString(str2);
                int i = jgd.a;
                R.writeInt(0);
                x6dVar.W(R, 14);
                synchronized (afdVar.s) {
                    if (afdVar.p != null) {
                        afdVar.i(2477);
                    }
                    afdVar.p = taskCompletionSource;
                }
                return;
            default:
                afd afdVar2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                lhf lhfVar2 = (lhf) obj;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj2;
                HashMap hashMap = afdVar2.C;
                long incrementAndGet = afdVar2.r.incrementAndGet();
                if (afdVar2.G == 2) {
                    z = true;
                }
                fre.j("Not connected to device", z);
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), taskCompletionSource2);
                    x6d x6dVar2 = (x6d) lhfVar2.k();
                    Parcel R2 = x6dVar2.R();
                    R2.writeString(str3);
                    R2.writeString(str4);
                    R2.writeLong(incrementAndGet);
                    x6dVar2.W(R2, 9);
                    return;
                } catch (RemoteException e) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    taskCompletionSource2.setException(e);
                    return;
                }
        }
    }
}
