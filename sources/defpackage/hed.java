package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
public final class hed implements h89 {
    public final byte a;
    public final bhd b;
    public final String c;
    public final String d;

    public hed(bhd bhdVar, String str, String str2, byte b) {
        this.a = b;
        this.b = bhdVar;
        this.c = str;
        this.d = str2;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        boolean z = false;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                bhd bhdVar = this.b;
                String str = this.c;
                String str2 = this.d;
                mjf mjfVar = (mjf) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                if (bhdVar.G != 2) {
                    z2 = false;
                }
                ite.j("Not connected to device", z2);
                z8d z8dVar = (z8d) mjfVar.k();
                Parcel R = z8dVar.R();
                R.writeString(str);
                R.writeString(str2);
                int i = kid.a;
                R.writeInt(0);
                z8dVar.W(R, 14);
                synchronized (bhdVar.s) {
                    if (bhdVar.p != null) {
                        bhdVar.i(2477);
                    }
                    bhdVar.p = taskCompletionSource;
                }
                return;
            default:
                bhd bhdVar2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                mjf mjfVar2 = (mjf) obj;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj2;
                HashMap hashMap = bhdVar2.C;
                long incrementAndGet = bhdVar2.r.incrementAndGet();
                if (bhdVar2.G == 2) {
                    z = true;
                }
                ite.j("Not connected to device", z);
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), taskCompletionSource2);
                    z8d z8dVar2 = (z8d) mjfVar2.k();
                    Parcel R2 = z8dVar2.R();
                    R2.writeString(str3);
                    R2.writeString(str4);
                    R2.writeLong(incrementAndGet);
                    z8dVar2.W(R2, 9);
                    return;
                } catch (RemoteException e) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    taskCompletionSource2.setException(e);
                    return;
                }
        }
    }
}
