package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new m8.h(5);
    public final h f16024a;
    public final long f16025b;
    public MediaSession.QueueItem f16026c;

    public q(h hVar, long j10) {
        if (j10 != -1) {
            this.f16024a = hVar;
            this.f16025b = j10;
            this.f16026c = null;
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
        sb2.append(this.f16024a);
        sb2.append(", Id=");
        return a1.g.r(sb2, this.f16025b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        this.f16024a.writeToParcel(parcel, i10);
        parcel.writeLong(this.f16025b);
    }

    public q(Parcel parcel) {
        this.f16024a = h.CREATOR.createFromParcel(parcel);
        this.f16025b = parcel.readLong();
    }
}
