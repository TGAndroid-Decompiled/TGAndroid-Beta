package i6;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import h6.p;
import java.util.ArrayList;
public abstract class i {
    public static final j6.b f15399a = new j6.b("MediaSessionUtils", null);

    public static ArrayList a(p pVar) {
        try {
            Parcel r12 = pVar.r1(pVar.p1(), 3);
            ArrayList createTypedArrayList = r12.createTypedArrayList(h6.d.CREATOR);
            r12.recycle();
            return createTypedArrayList;
        } catch (RemoteException e10) {
            Object[] objArr = {"getNotificationActions", p.class.getSimpleName()};
            j6.b bVar = f15399a;
            Log.e(bVar.f16508a, bVar.d("Unable to call %s on %s.", objArr), e10);
            return null;
        }
    }

    public static int[] b(p pVar) {
        try {
            Parcel r12 = pVar.r1(pVar.p1(), 4);
            int[] createIntArray = r12.createIntArray();
            r12.recycle();
            return createIntArray;
        } catch (RemoteException e10) {
            Object[] objArr = {"getCompactViewActionIndices", p.class.getSimpleName()};
            j6.b bVar = f15399a;
            Log.e(bVar.f16508a, bVar.d("Unable to call %s on %s.", objArr), e10);
            return null;
        }
    }
}
