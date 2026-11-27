package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class ydf extends xjb implements kg0 {
    public TaskCompletionSource d;
    public final wld[] e;

    public ydf(wld[] wldVarArr) {
        super(null, false, 9004);
        this.e = wldVarArr;
    }

    @Override
    public final void a(ie9 ie9Var) {
        w30 w30Var;
        Status status = (Status) ie9Var;
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
                w30Var = new w30(str);
                break;
            case 17511:
                w30Var = new w30(str);
                break;
            case 17512:
            default:
                w30Var = new w30(str);
                break;
            case 17513:
                w30Var = new w30(str);
                break;
            case 17514:
                w30Var = new w30(str);
                break;
        }
        taskCompletionSource.setException(w30Var);
    }

    @Override
    public final void c(d05 d05Var, TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
        aad aadVar = (aad) ((bbd) d05Var).k();
        p53 p53Var = new p53(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        int i = gld.a;
        obtain.writeStrongBinder(p53Var);
        obtain.writeTypedArray(this.e, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            aadVar.a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
