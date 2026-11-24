package defpackage;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Arrays;
import java.util.LinkedHashMap;
public final class gcd implements pcd, zef, f69 {
    public static final r7e a(Object obj, Object obj2) {
        r7e r7eVar = (r7e) obj;
        r7e r7eVar2 = (r7e) obj2;
        if (!r7eVar2.isEmpty()) {
            if (!r7eVar.a) {
                if (r7eVar.isEmpty()) {
                    r7eVar = new r7e();
                } else {
                    ?? linkedHashMap = new LinkedHashMap(r7eVar);
                    linkedHashMap.a = true;
                    r7eVar = linkedHashMap;
                }
            }
            r7eVar.c();
            if (!r7eVar2.isEmpty()) {
                r7eVar.putAll(r7eVar2);
            }
        }
        return r7eVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        mce mceVar = (mce) ((ahf) obj).k();
        vyd vydVar = new vyd((TaskCompletionSource) obj2, (byte) 2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i = jhd.a;
        obtain.writeStrongBinder(vydVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            mceVar.a.transact(1, obtain, obtain2, 0);
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
