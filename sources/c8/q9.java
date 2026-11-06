package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
public abstract class q9 {
    public static v7.e f5820a;

    public static k8.a a(Bitmap bitmap) {
        try {
            v7.e eVar = f5820a;
            q6.m.h(eVar, "IBitmapDescriptorFactory is not initialized");
            v7.c cVar = (v7.c) eVar;
            Parcel P0 = cVar.P0();
            v7.b.b(P0, bitmap);
            Parcel O0 = cVar.O0(P0, 6);
            a7.a M0 = a7.b.M0(O0.readStrongBinder());
            O0.recycle();
            return new k8.a(M0, 1);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static k8.a b(int i7) {
        try {
            v7.e eVar = f5820a;
            q6.m.h(eVar, "IBitmapDescriptorFactory is not initialized");
            v7.c cVar = (v7.c) eVar;
            Parcel P0 = cVar.P0();
            P0.writeInt(i7);
            Parcel O0 = cVar.O0(P0, 1);
            a7.a M0 = a7.b.M0(O0.readStrongBinder());
            O0.recycle();
            return new k8.a(M0, 1);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
