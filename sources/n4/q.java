package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new m8.h(5);
    public final h f15738a;
    public final long f15739b;
    public MediaSession.QueueItem f15740c;

    public q(h hVar, long j10) {
        if (j10 != -1) {
            this.f15738a = hVar;
            this.f15739b = j10;
            this.f15740c = null;
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
        sb2.append(this.f15738a);
        sb2.append(", Id=");
        return a1.g.r(sb2, this.f15739b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        this.f15738a.writeToParcel(parcel, i10);
        parcel.writeLong(this.f15739b);
    }

    public q(Parcel parcel) {
        this.f15738a = h.CREATOR.createFromParcel(parcel);
        this.f15739b = parcel.readLong();
    }
}
