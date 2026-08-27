package h7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class r7 {

    public static d7.e f8533a;

    public static n2.b0 a(Bitmap bitmap) {
        y5.l.i(bitmap, "image must not be null");
        try {
            d7.e eVar = f8533a;
            y5.l.i(eVar, "IBitmapDescriptorFactory is not initialized");
            d7.c cVar = (d7.c) eVar;
            Parcel parcelM0 = cVar.M0();
            d7.b.b(parcelM0, bitmap);
            Parcel parcelL0 = cVar.L0(parcelM0, 6);
            i6.a aVarJ0 = i6.b.J0(parcelL0.readStrongBinder());
            parcelL0.recycle();
            return new n2.b0(aVarJ0);
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }

    public static n2.b0 b(int i10) {
        try {
            d7.e eVar = f8533a;
            y5.l.i(eVar, "IBitmapDescriptorFactory is not initialized");
            d7.c cVar = (d7.c) eVar;
            Parcel parcelM0 = cVar.M0();
            parcelM0.writeInt(i10);
            Parcel parcelL0 = cVar.L0(parcelM0, 1);
            i6.a aVarJ0 = i6.b.J0(parcelL0.readStrongBinder());
            parcelL0.recycle();
            return new n2.b0(aVarJ0);
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }
}
