package c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new c(0);
    public b f2051a;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        synchronized (this) {
            try {
                if (this.f2051a == null) {
                    this.f2051a = new d(this);
                }
                parcel.writeStrongBinder(this.f2051a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i9, Bundle bundle) {
    }
}
