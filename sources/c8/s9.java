package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
public abstract class s9 {
    public static v7.e f4949a;

    public static hi.u5 a(Bitmap bitmap) {
        try {
            v7.e eVar = f4949a;
            q6.m.i(eVar, "IBitmapDescriptorFactory is not initialized");
            v7.c cVar = (v7.c) eVar;
            Parcel p12 = cVar.p1();
            v7.b.b(p12, bitmap);
            Parcel o12 = cVar.o1(p12, 6);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new hi.u5(m12);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static hi.u5 b(int i7) {
        try {
            v7.e eVar = f4949a;
            q6.m.i(eVar, "IBitmapDescriptorFactory is not initialized");
            v7.c cVar = (v7.c) eVar;
            Parcel p12 = cVar.p1();
            p12.writeInt(i7);
            Parcel o12 = cVar.o1(p12, 1);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new hi.u5(m12);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
