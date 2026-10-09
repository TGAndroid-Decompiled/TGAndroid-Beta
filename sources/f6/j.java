package f6;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import e6.q;
import java.util.ArrayList;
public abstract class j {
    public static final g6.b f9800a = new g6.b("MediaSessionUtils", null);

    public static ArrayList a(q qVar) {
        try {
            Parcel P0 = qVar.P0(qVar.N0(), 3);
            ArrayList createTypedArrayList = P0.createTypedArrayList(e6.d.CREATOR);
            P0.recycle();
            return createTypedArrayList;
        } catch (RemoteException e7) {
            Object[] objArr = {"getNotificationActions", q.class.getSimpleName()};
            g6.b bVar = f9800a;
            Log.e(bVar.f10323a, bVar.d("Unable to call %s on %s.", objArr), e7);
            return null;
        }
    }

    public static int[] b(q qVar) {
        try {
            Parcel P0 = qVar.P0(qVar.N0(), 4);
            int[] createIntArray = P0.createIntArray();
            P0.recycle();
            return createIntArray;
        } catch (RemoteException e7) {
            Object[] objArr = {"getCompactViewActionIndices", q.class.getSimpleName()};
            g6.b bVar = f9800a;
            Log.e(bVar.f10323a, bVar.d("Unable to call %s on %s.", objArr), e7);
            return null;
        }
    }
}
