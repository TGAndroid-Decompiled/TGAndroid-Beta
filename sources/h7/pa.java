package h7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class pa extends b7.a implements ra {
    public final oa U0(h6.b bVar, ta taVar) {
        oa aVar;
        Parcel M0 = M0();
        int i9 = c0.f9893a;
        M0.writeStrongBinder(bVar);
        M0.writeInt(1);
        taVar.writeToParcel(M0, 0);
        Parcel O0 = O0(M0, 1);
        IBinder readStrongBinder = O0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            if (queryLocalInterface instanceof oa) {
                aVar = (oa) queryLocalInterface;
            } else {
                aVar = new b7.a(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", 5);
            }
        }
        O0.recycle();
        return aVar;
    }
}
