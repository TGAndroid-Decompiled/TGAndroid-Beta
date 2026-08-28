package g7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
public abstract class m7 {
    public static c7.e f7314a;

    public static m5.c0 a(Bitmap bitmap) {
        x5.l.i(bitmap, "image must not be null");
        try {
            c7.e eVar = f7314a;
            x5.l.i(eVar, "IBitmapDescriptorFactory is not initialized");
            c7.c cVar = (c7.c) eVar;
            Parcel M0 = cVar.M0();
            c7.b.b(M0, bitmap);
            Parcel L0 = cVar.L0(M0, 6);
            h6.a J0 = h6.b.J0(L0.readStrongBinder());
            L0.recycle();
            return new m5.c0(J0);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static m5.c0 b(int i9) {
        try {
            c7.e eVar = f7314a;
            x5.l.i(eVar, "IBitmapDescriptorFactory is not initialized");
            c7.c cVar = (c7.c) eVar;
            Parcel M0 = cVar.M0();
            M0.writeInt(i9);
            Parcel L0 = cVar.L0(M0, 1);
            h6.a J0 = h6.b.J0(L0.readStrongBinder());
            L0.recycle();
            return new m5.c0(J0);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
