package defpackage;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Arrays;
import java.util.LinkedHashMap;
public final class ied implements red, ahf, h89 {
    public static final s9e a(Object obj, Object obj2) {
        s9e s9eVar = (s9e) obj;
        s9e s9eVar2 = (s9e) obj2;
        if (!s9eVar2.isEmpty()) {
            if (!s9eVar.a) {
                if (s9eVar.isEmpty()) {
                    s9eVar = new s9e();
                } else {
                    ?? linkedHashMap = new LinkedHashMap(s9eVar);
                    linkedHashMap.a = true;
                    s9eVar = linkedHashMap;
                }
            }
            s9eVar.c();
            if (!s9eVar2.isEmpty()) {
                s9eVar.putAll(s9eVar2);
            }
        }
        return s9eVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        nee neeVar = (nee) ((bjf) obj).k();
        y0e y0eVar = new y0e((TaskCompletionSource) obj2, (byte) 2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i = kjd.a;
        obtain.writeStrongBinder(y0eVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            neeVar.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public final byte[] c(int i, int i2, byte[] bArr) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }
}
