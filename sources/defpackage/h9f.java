package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class h9f extends bgb implements jg0 {
    public TaskCompletionSource d;
    public final fhd[] e;

    public h9f(fhd[] fhdVarArr) {
        super(null, false, 9004);
        this.e = fhdVarArr;
    }

    @Override
    public final void a(ua9 ua9Var) {
        v30 v30Var;
        Status status = (Status) ua9Var;
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
                v30Var = new v30(str);
                break;
            case 17511:
                v30Var = new v30(str);
                break;
            case 17512:
            default:
                v30Var = new v30(str);
                break;
            case 17513:
                v30Var = new v30(str);
                break;
            case 17514:
                v30Var = new v30(str);
                break;
        }
        taskCompletionSource.setException(v30Var);
    }

    @Override
    public final void c(xx4 xx4Var, TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
        h5d h5dVar = (h5d) ((i6d) xx4Var).k();
        x43 x43Var = new x43(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        int i = pgd.a;
        obtain.writeStrongBinder(x43Var);
        obtain.writeTypedArray(this.e, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            h5dVar.a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
