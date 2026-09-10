package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new m8.h(5);
    public final l f13816a;
    public final long f13817b;
    public MediaSession.QueueItem f13818c;

    public v(l lVar, long j3) {
        if (j3 != -1) {
            this.f13816a = lVar;
            this.f13817b = j3;
            this.f13818c = null;
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
        sb2.append(this.f13816a);
        sb2.append(", Id=");
        return a4.a.r(sb2, this.f13817b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        this.f13816a.writeToParcel(parcel, i10);
        parcel.writeLong(this.f13817b);
    }

    public v(Parcel parcel) {
        this.f13816a = l.CREATOR.createFromParcel(parcel);
        this.f13817b = parcel.readLong();
    }
}
