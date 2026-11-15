package m6;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new e(0);
    public final Messenger f20497a;

    public g(IBinder iBinder) {
        this.f20497a = new Messenger(iBinder);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            try {
                return this.f20497a.getBinder().equals(((g) obj).f20497a.getBinder());
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20497a.getBinder().hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStrongBinder(this.f20497a.getBinder());
    }
}
