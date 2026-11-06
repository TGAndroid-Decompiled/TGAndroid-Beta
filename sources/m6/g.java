package m6;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new e(0);
    public final Messenger f19897a;

    public g(IBinder iBinder) {
        this.f19897a = new Messenger(iBinder);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            try {
                return this.f19897a.getBinder().equals(((g) obj).f19897a.getBinder());
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f19897a.getBinder().hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStrongBinder(this.f19897a.getBinder());
    }
}
