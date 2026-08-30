package k7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
public abstract class n8 {
    public static g7.e f9948a;

    public static ph.j5 a(Bitmap bitmap) {
        b6.m.i(bitmap, "image must not be null");
        try {
            g7.e eVar = f9948a;
            b6.m.i(eVar, "IBitmapDescriptorFactory is not initialized");
            g7.c cVar = (g7.c) eVar;
            Parcel M0 = cVar.M0();
            g7.b.b(M0, bitmap);
            Parcel L0 = cVar.L0(M0, 6);
            l6.a J0 = l6.b.J0(L0.readStrongBinder());
            L0.recycle();
            return new ph.j5(J0);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public static ph.j5 b(int i10) {
        try {
            g7.e eVar = f9948a;
            b6.m.i(eVar, "IBitmapDescriptorFactory is not initialized");
            g7.c cVar = (g7.c) eVar;
            Parcel M0 = cVar.M0();
            M0.writeInt(i10);
            Parcel L0 = cVar.L0(M0, 1);
            l6.a J0 = l6.b.J0(L0.readStrongBinder());
            L0.recycle();
            return new ph.j5(J0);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
