package defpackage;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class aed implements h89 {
    public final byte a = 1;
    public final bhd b;
    public final String c;
    public final k89 d;

    public aed(bhd bhdVar, k89 k89Var, String str) {
        this.b = bhdVar;
        this.d = k89Var;
        this.c = str;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        boolean z = false;
        k89 k89Var = this.d;
        String str = this.c;
        bhd bhdVar = this.b;
        mjf mjfVar = (mjf) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (b) {
            case 0:
                if (bhdVar.G != 1) {
                    z = true;
                }
                ite.j("Not active connection", z);
                if (k89Var != null) {
                    z8d z8dVar = (z8d) mjfVar.k();
                    Parcel R = z8dVar.R();
                    R.writeString(str);
                    z8dVar.W(R, 12);
                }
                taskCompletionSource.setResult(null);
                return;
            default:
                if (bhdVar.G != 1) {
                    z = true;
                }
                ite.j("Not active connection", z);
                z8d z8dVar2 = (z8d) mjfVar.k();
                Parcel R2 = z8dVar2.R();
                R2.writeString(str);
                z8dVar2.W(R2, 12);
                if (k89Var != null) {
                    z8d z8dVar3 = (z8d) mjfVar.k();
                    Parcel R3 = z8dVar3.R();
                    R3.writeString(str);
                    z8dVar3.W(R3, 11);
                }
                taskCompletionSource.setResult(null);
                return;
        }
    }

    public aed(bhd bhdVar, String str, k89 k89Var) {
        this.b = bhdVar;
        this.c = str;
        this.d = k89Var;
    }
}
