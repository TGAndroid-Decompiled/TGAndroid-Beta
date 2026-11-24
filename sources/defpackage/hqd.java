package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
public abstract class hqd {
    public static qje a;

    public static nl9 a(Bitmap bitmap) {
        try {
            qje qjeVar = a;
            ite.i(qjeVar, "IBitmapDescriptorFactory is not initialized");
            a8e a8eVar = (a8e) qjeVar;
            Parcel R = a8eVar.R();
            tid.b(R, bitmap);
            Parcel Q = a8eVar.Q(R, 6);
            xk5 T = eq7.T(Q.readStrongBinder());
            Q.recycle();
            return new nl9(T);
        } catch (RemoteException e) {
            i2d.h(e);
            return null;
        }
    }

    public static nl9 b(int i) {
        try {
            qje qjeVar = a;
            ite.i(qjeVar, "IBitmapDescriptorFactory is not initialized");
            a8e a8eVar = (a8e) qjeVar;
            Parcel R = a8eVar.R();
            R.writeInt(i);
            Parcel Q = a8eVar.Q(R, 1);
            xk5 T = eq7.T(Q.readStrongBinder());
            Q.recycle();
            return new nl9(T);
        } catch (RemoteException e) {
            i2d.h(e);
            return null;
        }
    }
}
