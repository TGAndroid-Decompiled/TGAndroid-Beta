package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new m8.h(5);
    public final h f17118a;
    public final long f17119b;
    public MediaSession.QueueItem f17120c;

    public q(h hVar, long j10) {
        if (j10 != -1) {
            this.f17118a = hVar;
            this.f17119b = j10;
            this.f17120c = null;
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
        sb2.append(this.f17118a);
        sb2.append(", Id=");
        return a1.g.r(sb2, this.f17119b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        this.f17118a.writeToParcel(parcel, i10);
        parcel.writeLong(this.f17119b);
    }

    public q(Parcel parcel) {
        this.f17118a = h.CREATOR.createFromParcel(parcel);
        this.f17119b = parcel.readLong();
    }
}
