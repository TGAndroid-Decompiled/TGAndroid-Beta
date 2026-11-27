package defpackage;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
public final class yrd implements Parcelable {
    public static final Parcelable.Creator<yrd> CREATOR = new ced((byte) 17);
    public final Messenger a;

    public yrd(IBinder iBinder) {
        this.a = new Messenger(iBinder);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            try {
                return this.a.getBinder().equals(((yrd) obj).a.getBinder());
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.getBinder().hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.a.getBinder());
    }
}
