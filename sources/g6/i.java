package g6;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import f6.p;
import java.util.ArrayList;
public abstract class i {
    public static final h6.b f12394a = new h6.b("MediaSessionUtils", null);

    public static ArrayList a(p pVar) {
        try {
            Parcel P0 = pVar.P0(pVar.N0(), 3);
            ArrayList createTypedArrayList = P0.createTypedArrayList(f6.d.CREATOR);
            P0.recycle();
            return createTypedArrayList;
        } catch (RemoteException e) {
            Object[] objArr = {"getNotificationActions", p.class.getSimpleName()};
            h6.b bVar = f12394a;
            Log.e(bVar.f12620a, bVar.d("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }

    public static int[] b(p pVar) {
        try {
            Parcel P0 = pVar.P0(pVar.N0(), 4);
            int[] createIntArray = P0.createIntArray();
            P0.recycle();
            return createIntArray;
        } catch (RemoteException e) {
            Object[] objArr = {"getCompactViewActionIndices", p.class.getSimpleName()};
            h6.b bVar = f12394a;
            Log.e(bVar.f12620a, bVar.d("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }
}
