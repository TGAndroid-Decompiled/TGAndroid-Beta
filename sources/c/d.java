package c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new w.a(22);
    public b f5219a;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        synchronized (this) {
            try {
                if (this.f5219a == null) {
                    this.f5219a = new c(this);
                }
                parcel.writeStrongBinder(this.f5219a.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(int i7, Bundle bundle) {
    }
}
