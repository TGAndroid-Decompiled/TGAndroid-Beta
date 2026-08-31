package c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b9.e;
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new e(1);
    public b f1996a;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f1996a == null) {
                    this.f1996a = new c(this);
                }
                parcel.writeStrongBinder(this.f1996a.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(int i10, Bundle bundle) {
    }
}
