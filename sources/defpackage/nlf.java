package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
public abstract class nlf {
    public static final he6 a = new he6("MediaSessionUtils", null);

    public static ArrayList a(uxd uxdVar) {
        try {
            Parcel T = uxdVar.T(uxdVar.R(), 3);
            ArrayList createTypedArrayList = T.createTypedArrayList(vm7.CREATOR);
            T.recycle();
            return createTypedArrayList;
        } catch (RemoteException e) {
            Object[] objArr = {"getNotificationActions", uxd.class.getSimpleName()};
            he6 he6Var = a;
            Log.e(he6Var.a, he6Var.d("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }

    public static int[] b(uxd uxdVar) {
        try {
            Parcel T = uxdVar.T(uxdVar.R(), 4);
            int[] createIntArray = T.createIntArray();
            T.recycle();
            return createIntArray;
        } catch (RemoteException e) {
            Object[] objArr = {"getCompactViewActionIndices", uxd.class.getSimpleName()};
            he6 he6Var = a;
            Log.e(he6Var.a, he6Var.d("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }
}
