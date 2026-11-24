package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public class yc9 implements Parcelable {
    public static final Parcelable.Creator<yc9> CREATOR = new hx6((byte) 18);
    public zk5 a;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            zk5 zk5Var = this.a;
            if (zk5Var == null) {
                zk5Var = new xc9(this);
                this.a = zk5Var;
            }
            parcel.writeStrongBinder(zk5Var.asBinder());
        }
    }

    public void a(int i, Bundle bundle) {
    }
}
