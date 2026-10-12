package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new m8.h(5);
    public final m f16355a;
    public final long f16356b;
    public MediaSession.QueueItem f16357c;

    public v(m mVar, long j3) {
        if (j3 != -1) {
            this.f16355a = mVar;
            this.f16356b = j3;
            this.f16357c = null;
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
        sb2.append(this.f16355a);
        sb2.append(", Id=");
        return a1.g.s(sb2, this.f16356b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        this.f16355a.writeToParcel(parcel, i10);
        parcel.writeLong(this.f16356b);
    }

    public v(Parcel parcel) {
        this.f16355a = m.CREATOR.createFromParcel(parcel);
        this.f16356b = parcel.readLong();
    }
}
