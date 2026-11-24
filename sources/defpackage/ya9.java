package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public class ya9 implements Parcelable {
    public static final Parcelable.Creator<ya9> CREATOR = new hv6((byte) 18);
    public aj5 a;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            aj5 aj5Var = this.a;
            if (aj5Var == null) {
                aj5Var = new xa9(this);
                this.a = aj5Var;
            }
            parcel.writeStrongBinder(aj5Var.asBinder());
        }
    }

    public void a(int i, Bundle bundle) {
    }
}
