package defpackage;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class rgd implements s99 {
    public final byte a = 1;
    public final rjd b;
    public final String c;
    public final v99 d;

    public rgd(rjd rjdVar, v99 v99Var, String str) {
        this.b = rjdVar;
        this.d = v99Var;
        this.c = str;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        boolean z = false;
        v99 v99Var = this.d;
        String str = this.c;
        rjd rjdVar = this.b;
        bmf bmfVar = (bmf) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (b) {
            case 0:
                if (rjdVar.G != 1) {
                    z = true;
                }
                xve.j("Not active connection", z);
                if (v99Var != null) {
                    qbd qbdVar = (qbd) bmfVar.k();
                    Parcel R = qbdVar.R();
                    R.writeString(str);
                    qbdVar.W(R, 12);
                }
                taskCompletionSource.setResult(null);
                return;
            default:
                if (rjdVar.G != 1) {
                    z = true;
                }
                xve.j("Not active connection", z);
                qbd qbdVar2 = (qbd) bmfVar.k();
                Parcel R2 = qbdVar2.R();
                R2.writeString(str);
                qbdVar2.W(R2, 12);
                if (v99Var != null) {
                    qbd qbdVar3 = (qbd) bmfVar.k();
                    Parcel R3 = qbdVar3.R();
                    R3.writeString(str);
                    qbdVar3.W(R3, 11);
                }
                taskCompletionSource.setResult(null);
                return;
        }
    }

    public rgd(rjd rjdVar, String str, v99 v99Var) {
        this.b = rjdVar;
        this.c = str;
        this.d = v99Var;
    }
}
