package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
public abstract class yif {
    public static final ce6 a = new ce6("MediaSessionUtils", null);

    public static ArrayList a(hvd hvdVar) {
        try {
            Parcel T = hvdVar.T(hvdVar.R(), 3);
            ArrayList createTypedArrayList = T.createTypedArrayList(zl7.CREATOR);
            T.recycle();
            return createTypedArrayList;
        } catch (RemoteException e) {
            Object[] objArr = {"getNotificationActions", hvd.class.getSimpleName()};
            ce6 ce6Var = a;
            Log.e(ce6Var.a, ce6Var.d("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }

    public static int[] b(hvd hvdVar) {
        try {
            Parcel T = hvdVar.T(hvdVar.R(), 4);
            int[] createIntArray = T.createIntArray();
            T.recycle();
            return createIntArray;
        } catch (RemoteException e) {
            Object[] objArr = {"getCompactViewActionIndices", hvd.class.getSimpleName()};
            ce6 ce6Var = a;
            Log.e(ce6Var.a, ce6Var.d("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }
}
