package defpackage;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
public final class cee extends jh0 {
    public final pvd q;

    public cee(pvd pvdVar, z3d z3dVar) {
        super(tj2.j, z3dVar);
        this.q = pvdVar;
    }

    @Override
    public final void n(zz4 zz4Var) {
        pvd pvdVar = this.q;
        cpe cpeVar = (cpe) zz4Var;
        vje vjeVar = new vje(this);
        try {
            uee ueeVar = pvdVar.r;
            int c = ueeVar.c();
            byte[] bArr = new byte[c];
            o6e.b(ueeVar, bArr, c);
            pvdVar.b = bArr;
            l7f l7fVar = (l7f) cpeVar.k();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            int i = lid.a;
            obtain.writeStrongBinder(vjeVar);
            obtain.writeInt(1);
            pvdVar.writeToParcel(obtain, 0);
            try {
                l7fVar.a.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RuntimeException e) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
            o(new Status(10, "MessageProducer", null, null));
        }
    }
}
