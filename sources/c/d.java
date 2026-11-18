package c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new w.a(22);
    public b f4322a;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        synchronized (this) {
            try {
                if (this.f4322a == null) {
                    this.f4322a = new c(this);
                }
                parcel.writeStrongBinder(this.f4322a.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(int i7, Bundle bundle) {
    }
}
