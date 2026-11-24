package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class jbf extends cib implements kh0 {
    public TaskCompletionSource d;
    public final gjd[] e;

    public jbf(gjd[] gjdVarArr) {
        super(null, false, 9004);
        this.e = gjdVarArr;
    }

    @Override
    public final void a(uc9 uc9Var) {
        v40 v40Var;
        Status status = (Status) uc9Var;
        boolean b = status.b();
        TaskCompletionSource taskCompletionSource = this.d;
        if (b) {
            taskCompletionSource.setResult(null);
            return;
        }
        String str = status.b;
        str = (str == null || str.isEmpty()) ? "User Action indexing error, please try again." : "User Action indexing error, please try again.";
        switch (status.a) {
            case 17510:
                v40Var = new v40(str);
                break;
            case 17511:
                v40Var = new v40(str);
                break;
            case 17512:
            default:
                v40Var = new v40(str);
                break;
            case 17513:
                v40Var = new v40(str);
                break;
            case 17514:
                v40Var = new v40(str);
                break;
        }
        taskCompletionSource.setException(v40Var);
    }

    @Override
    public final void c(zz4 zz4Var, TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
        j7d j7dVar = (j7d) ((k8d) zz4Var).k();
        i63 i63Var = new i63(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        int i = qid.a;
        obtain.writeStrongBinder(i63Var);
        obtain.writeTypedArray(this.e, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            j7dVar.a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
