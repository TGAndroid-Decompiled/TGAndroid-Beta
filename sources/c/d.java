package c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new w.a(15);
    public b f4079a;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f4079a == null) {
                    this.f4079a = new c(this);
                }
                parcel.writeStrongBinder(this.f4079a.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(int i10, Bundle bundle) {
    }
}
