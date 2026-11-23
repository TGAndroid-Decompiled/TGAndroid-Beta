package i6;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import h6.q;
import java.util.ArrayList;
public abstract class j {
    public static final j6.b f16258a = new j6.b("MediaSessionUtils", null);

    public static ArrayList a(q qVar) {
        try {
            Parcel r12 = qVar.r1(qVar.p1(), 3);
            ArrayList createTypedArrayList = r12.createTypedArrayList(h6.d.CREATOR);
            r12.recycle();
            return createTypedArrayList;
        } catch (RemoteException e10) {
            Object[] objArr = {"getNotificationActions", q.class.getSimpleName()};
            j6.b bVar = f16258a;
            Log.e(bVar.f17332a, bVar.d("Unable to call %s on %s.", objArr), e10);
            return null;
        }
    }

    public static int[] b(q qVar) {
        try {
            Parcel r12 = qVar.r1(qVar.p1(), 4);
            int[] createIntArray = r12.createIntArray();
            r12.recycle();
            return createIntArray;
        } catch (RemoteException e10) {
            Object[] objArr = {"getCompactViewActionIndices", q.class.getSimpleName()};
            j6.b bVar = f16258a;
            Log.e(bVar.f17332a, bVar.d("Unable to call %s on %s.", objArr), e10);
            return null;
        }
    }
}
