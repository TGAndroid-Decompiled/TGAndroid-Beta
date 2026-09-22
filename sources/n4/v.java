package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new m8.h(5);
    public final l f14984a;
    public final long f14985b;
    public MediaSession.QueueItem f14986c;

    public v(l lVar, long j3) {
        if (j3 != -1) {
            this.f14984a = lVar;
            this.f14985b = j3;
            this.f14986c = null;
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
        sb2.append(this.f14984a);
        sb2.append(", Id=");
        return a4.a.s(sb2, this.f14985b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        this.f14984a.writeToParcel(parcel, i10);
        parcel.writeLong(this.f14985b);
    }

    public v(Parcel parcel) {
        this.f14984a = l.CREATOR.createFromParcel(parcel);
        this.f14985b = parcel.readLong();
    }
}
