package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
public final class r05 {
    public final bl6 a;

    public r05(bl6 bl6Var) {
        this.a = bl6Var;
    }

    public final xj5 a() {
        LatLng createFromParcel;
        bl6 bl6Var = this.a;
        bl6Var.getClass();
        try {
            sjf sjfVar = (sjf) bl6Var.a;
            Parcel Q = sjfVar.Q(sjfVar.R(), 4);
            Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
            int i = tid.a;
            if (Q.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(Q);
            }
            LatLng latLng = createFromParcel;
            Q.recycle();
            return new xj5(latLng.a, latLng.b);
        } catch (RemoteException e) {
            i2d.h(e);
            return null;
        }
    }

    public final void b(xj5 xj5Var) {
        LatLng latLng = new LatLng(xj5Var.a, xj5Var.b);
        bl6 bl6Var = this.a;
        bl6Var.getClass();
        try {
            sjf sjfVar = (sjf) bl6Var.a;
            Parcel R = sjfVar.R();
            tid.b(R, latLng);
            sjfVar.V(R, 3);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    public final void c(float f) {
        bl6 bl6Var = this.a;
        bl6Var.getClass();
        try {
            sjf sjfVar = (sjf) bl6Var.a;
            Parcel R = sjfVar.R();
            R.writeFloat(f);
            sjfVar.V(R, 22);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }
}
