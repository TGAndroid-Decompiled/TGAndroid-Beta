package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new m8.h(5);
    public final l f16604a;
    public final long f16605b;
    public MediaSession.QueueItem f16606c;

    public u(l lVar, long j3) {
        if (j3 != -1) {
            this.f16604a = lVar;
            this.f16605b = j3;
            this.f16606c = null;
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
        sb2.append(this.f16604a);
        sb2.append(", Id=");
        return a1.g.s(sb2, this.f16605b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        this.f16604a.writeToParcel(parcel, i10);
        parcel.writeLong(this.f16605b);
    }

    public u(Parcel parcel) {
        this.f16604a = l.CREATOR.createFromParcel(parcel);
        this.f16605b = parcel.readLong();
    }
}
