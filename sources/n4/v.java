package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new m8.h(5);
    public final l f16641a;
    public final long f16642b;
    public MediaSession.QueueItem f16643c;

    public v(l lVar, long j3) {
        if (j3 != -1) {
            this.f16641a = lVar;
            this.f16642b = j3;
            this.f16643c = null;
            return;
        }
        throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaSession.QueueItem { Description=");
        sb2.append(this.f16641a);
        sb2.append(", Id=");
        return a4.a.s(sb2, this.f16642b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        this.f16641a.writeToParcel(parcel, i10);
        parcel.writeLong(this.f16642b);
    }

    public v(Parcel parcel) {
        this.f16641a = l.CREATOR.createFromParcel(parcel);
        this.f16642b = parcel.readLong();
    }
}
