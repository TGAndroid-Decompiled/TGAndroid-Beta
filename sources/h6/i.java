package h6;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import g6.o;
import java.util.ArrayList;
public abstract class i {
    public static final i6.b f14351a = new i6.b("MediaSessionUtils", null);

    public static ArrayList a(o oVar) {
        try {
            Parcel R0 = oVar.R0(oVar.P0(), 3);
            ArrayList createTypedArrayList = R0.createTypedArrayList(g6.d.CREATOR);
            R0.recycle();
            return createTypedArrayList;
        } catch (RemoteException e10) {
            Object[] objArr = {"getNotificationActions", o.class.getSimpleName()};
            i6.b bVar = f14351a;
            Log.e(bVar.f14620a, bVar.d("Unable to call %s on %s.", objArr), e10);
            return null;
        }
    }

    public static int[] b(o oVar) {
        try {
            Parcel R0 = oVar.R0(oVar.P0(), 4);
            int[] createIntArray = R0.createIntArray();
            R0.recycle();
            return createIntArray;
        } catch (RemoteException e10) {
            Object[] objArr = {"getCompactViewActionIndices", o.class.getSimpleName()};
            i6.b bVar = f14351a;
            Log.e(bVar.f14620a, bVar.d("Unable to call %s on %s.", objArr), e10);
            return null;
        }
    }
}
