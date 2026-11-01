package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new m8.i(4);
    public final h f13521a;
    public final long f13522b;
    public MediaSession.QueueItem f13523c;

    public o(h hVar, long j10) {
        if (j10 != -1) {
            this.f13521a = hVar;
            this.f13522b = j10;
            this.f13523c = null;
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
        sb2.append(this.f13521a);
        sb2.append(", Id=");
        return a1.g.q(sb2, this.f13522b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        this.f13521a.writeToParcel(parcel, i10);
        parcel.writeLong(this.f13522b);
    }

    public o(Parcel parcel) {
        this.f13521a = h.CREATOR.createFromParcel(parcel);
        this.f13522b = parcel.readLong();
    }
}
