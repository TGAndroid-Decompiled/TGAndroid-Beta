package l6;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import i7.p;
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new p(14);
    public final Messenger f18068a;

    public f(IBinder iBinder) {
        this.f18068a = new Messenger(iBinder);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            try {
                return this.f18068a.getBinder().equals(((f) obj).f18068a.getBinder());
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18068a.getBinder().hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeStrongBinder(this.f18068a.getBinder());
    }
}
