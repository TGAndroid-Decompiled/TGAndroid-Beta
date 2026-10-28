package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new h8.j(28);
    public final h f18688a;
    public final long f18689b;
    public MediaSession.QueueItem f18690c;

    public q(h hVar, long j10) {
        if (j10 != -1) {
            this.f18688a = hVar;
            this.f18689b = j10;
            this.f18690c = null;
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
        sb2.append(this.f18688a);
        sb2.append(", Id=");
        return a1.g.r(sb2, this.f18689b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        this.f18688a.writeToParcel(parcel, i10);
        parcel.writeLong(this.f18689b);
    }

    public q(Parcel parcel) {
        this.f18688a = h.CREATOR.createFromParcel(parcel);
        this.f18689b = parcel.readLong();
    }
}
