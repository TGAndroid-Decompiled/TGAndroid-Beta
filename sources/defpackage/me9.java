package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public class me9 implements Parcelable {
    public static final Parcelable.Creator<me9> CREATOR = new mx6((byte) 18);
    public cl5 a;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            cl5 cl5Var = this.a;
            if (cl5Var == null) {
                cl5Var = new le9(this);
                this.a = cl5Var;
            }
            parcel.writeStrongBinder(cl5Var.asBinder());
        }
    }

    public void a(int i, Bundle bundle) {
    }
}
