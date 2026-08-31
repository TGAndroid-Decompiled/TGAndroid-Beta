package b9;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.q;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class c extends w implements f {
    public TaskCompletionSource d;
    public final b[] f1904e;

    public c(b[] bVarArr) {
        super(null, false, 9004);
        this.f1904e = bVarArr;
    }

    @Override
    public final void a(q qVar) {
        b7.a aVar;
        Status status = (Status) qVar;
        if (status.e()) {
            this.d.setResult(null);
            return;
        }
        TaskCompletionSource taskCompletionSource = this.d;
        String str = status.f2647b;
        str = (str == null || str.isEmpty()) ? "User Action indexing error, please try again." : "User Action indexing error, please try again.";
        switch (status.f2646a) {
            case 17510:
                aVar = new b7.a(str);
                break;
            case 17511:
                aVar = new b7.a(str);
                break;
            case 17512:
            default:
                aVar = new b7.a(str);
                break;
            case 17513:
                aVar = new b7.a(str);
                break;
            case 17514:
                aVar = new b7.a(str);
                break;
        }
        taskCompletionSource.setException(aVar);
    }

    @Override
    public final void f(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
        d7.a aVar = (d7.a) ((d7.b) cVar).u();
        p6.b bVar = new p6.b(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        int i10 = d7.c.f4296a;
        obtain.writeStrongBinder(bVar);
        obtain.writeTypedArray(this.f1904e, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            aVar.f4295a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
