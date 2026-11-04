package c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new w.a(16);
    public b f3931a;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        synchronized (this) {
            try {
                if (this.f3931a == null) {
                    this.f3931a = new c(this);
                }
                parcel.writeStrongBinder(this.f3931a.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(int i3, Bundle bundle) {
    }
}
