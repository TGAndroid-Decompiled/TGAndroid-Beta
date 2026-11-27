package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
public final class ygd implements s99 {
    public final byte a;
    public final rjd b;
    public final String c;
    public final String d;

    public ygd(rjd rjdVar, String str, String str2, byte b) {
        this.a = b;
        this.b = rjdVar;
        this.c = str;
        this.d = str2;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        boolean z = false;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                rjd rjdVar = this.b;
                String str = this.c;
                String str2 = this.d;
                bmf bmfVar = (bmf) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                if (rjdVar.G != 2) {
                    z2 = false;
                }
                xve.j("Not connected to device", z2);
                qbd qbdVar = (qbd) bmfVar.k();
                Parcel R = qbdVar.R();
                R.writeString(str);
                R.writeString(str2);
                int i = ald.a;
                R.writeInt(0);
                qbdVar.W(R, 14);
                synchronized (rjdVar.s) {
                    if (rjdVar.p != null) {
                        rjdVar.i(2477);
                    }
                    rjdVar.p = taskCompletionSource;
                }
                return;
            default:
                rjd rjdVar2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                bmf bmfVar2 = (bmf) obj;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj2;
                HashMap hashMap = rjdVar2.C;
                long incrementAndGet = rjdVar2.r.incrementAndGet();
                if (rjdVar2.G == 2) {
                    z = true;
                }
                xve.j("Not connected to device", z);
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), taskCompletionSource2);
                    qbd qbdVar2 = (qbd) bmfVar2.k();
                    Parcel R2 = qbdVar2.R();
                    R2.writeString(str3);
                    R2.writeString(str4);
                    R2.writeLong(incrementAndGet);
                    qbdVar2.W(R2, 9);
                    return;
                } catch (RemoteException e) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    taskCompletionSource2.setException(e);
                    return;
                }
        }
    }
}
