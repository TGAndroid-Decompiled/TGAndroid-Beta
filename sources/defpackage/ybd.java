package defpackage;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class ybd implements f69 {
    public final byte a = 0;
    public final afd b;
    public final String c;
    public final i69 d;

    public ybd(afd afdVar, i69 i69Var, String str) {
        this.b = afdVar;
        this.d = i69Var;
        this.c = str;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        boolean z = false;
        i69 i69Var = this.d;
        String str = this.c;
        afd afdVar = this.b;
        lhf lhfVar = (lhf) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (b) {
            case 0:
                if (afdVar.G != 1) {
                    z = true;
                }
                fre.j("Not active connection", z);
                if (i69Var != null) {
                    x6d x6dVar = (x6d) lhfVar.k();
                    Parcel R = x6dVar.R();
                    R.writeString(str);
                    x6dVar.W(R, 12);
                }
                taskCompletionSource.setResult(null);
                return;
            default:
                if (afdVar.G != 1) {
                    z = true;
                }
                fre.j("Not active connection", z);
                x6d x6dVar2 = (x6d) lhfVar.k();
                Parcel R2 = x6dVar2.R();
                R2.writeString(str);
                x6dVar2.W(R2, 12);
                if (i69Var != null) {
                    x6d x6dVar3 = (x6d) lhfVar.k();
                    Parcel R3 = x6dVar3.R();
                    R3.writeString(str);
                    x6dVar3.W(R3, 11);
                }
                taskCompletionSource.setResult(null);
                return;
        }
    }

    public ybd(afd afdVar, String str, i69 i69Var) {
        this.b = afdVar;
        this.c = str;
        this.d = i69Var;
    }
}
