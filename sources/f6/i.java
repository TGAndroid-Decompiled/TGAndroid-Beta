package f6;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import e6.p;
import java.util.ArrayList;
public abstract class i {
    public static final g6.b f9060a = new g6.b("MediaSessionUtils", null);

    public static ArrayList a(p pVar) {
        try {
            Parcel P0 = pVar.P0(pVar.N0(), 3);
            ArrayList createTypedArrayList = P0.createTypedArrayList(e6.d.CREATOR);
            P0.recycle();
            return createTypedArrayList;
        } catch (RemoteException e) {
            Object[] objArr = {"getNotificationActions", p.class.getSimpleName()};
            g6.b bVar = f9060a;
            Log.e(bVar.f9934a, bVar.d("Unable to call %s on %s.", objArr), e);
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
            g6.b bVar = f9060a;
            Log.e(bVar.f9934a, bVar.d("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }
}
