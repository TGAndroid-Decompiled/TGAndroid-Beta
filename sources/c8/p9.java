package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
public abstract class p9 {
    public static v7.e f4627a;

    public static ia.d a(Bitmap bitmap) {
        try {
            v7.e eVar = f4627a;
            q6.m.h(eVar, "IBitmapDescriptorFactory is not initialized");
            v7.c cVar = (v7.c) eVar;
            Parcel p12 = cVar.p1();
            v7.b.b(p12, bitmap);
            Parcel o12 = cVar.o1(p12, 6);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new ia.d(m12);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static ia.d b(int i7) {
        try {
            v7.e eVar = f4627a;
            q6.m.h(eVar, "IBitmapDescriptorFactory is not initialized");
            v7.c cVar = (v7.c) eVar;
            Parcel p12 = cVar.p1();
            p12.writeInt(i7);
            Parcel o12 = cVar.o1(p12, 1);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new ia.d(m12);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
