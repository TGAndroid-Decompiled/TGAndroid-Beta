package defpackage;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
public final class rge extends jg0 {
    public final cyd q;

    public rge(cyd cydVar, o6d o6dVar) {
        super(bj2.j, o6dVar);
        this.q = cydVar;
    }

    @Override
    public final void n(d05 d05Var) {
        cyd cydVar = this.q;
        qre qreVar = (qre) d05Var;
        lme lmeVar = new lme(this);
        try {
            khe kheVar = cydVar.r;
            int c = kheVar.c();
            byte[] bArr = new byte[c];
            b9e.b(kheVar, bArr, c);
            cydVar.b = bArr;
            aaf aafVar = (aaf) qreVar.k();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            int i = bld.a;
            obtain.writeStrongBinder(lmeVar);
            obtain.writeInt(1);
            cydVar.writeToParcel(obtain, 0);
            try {
                aafVar.a.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RuntimeException e) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
            o(new Status(10, "MessageProducer", null, null));
        }
    }
}
