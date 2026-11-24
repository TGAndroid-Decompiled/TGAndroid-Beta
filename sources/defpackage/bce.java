package defpackage;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
public final class bce extends ig0 {
    public final mtd q;

    public bce(mtd mtdVar, x1d x1dVar) {
        super(fi2.j, x1dVar);
        this.q = mtdVar;
    }

    @Override
    public final void n(xx4 xx4Var) {
        mtd mtdVar = this.q;
        zme zmeVar = (zme) xx4Var;
        uhe uheVar = new uhe(this);
        try {
            tce tceVar = mtdVar.r;
            int c = tceVar.c();
            byte[] bArr = new byte[c];
            l4e.b(tceVar, bArr, c);
            mtdVar.b = bArr;
            j5f j5fVar = (j5f) zmeVar.k();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            int i = kgd.a;
            obtain.writeStrongBinder(uheVar);
            obtain.writeInt(1);
            mtdVar.writeToParcel(obtain, 0);
            try {
                j5fVar.a.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RuntimeException e) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
            o(new Status(10, "MessageProducer", null, null));
        }
    }
}
