package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new m8.h(5);
    public final l f15199a;
    public final long f15200b;
    public MediaSession.QueueItem f15201c;

    public v(l lVar, long j3) {
        if (j3 != -1) {
            this.f15199a = lVar;
            this.f15200b = j3;
            this.f15201c = null;
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
        sb2.append(this.f15199a);
        sb2.append(", Id=");
        return a4.a.s(sb2, this.f15200b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        this.f15199a.writeToParcel(parcel, i10);
        parcel.writeLong(this.f15200b);
    }

    public v(Parcel parcel) {
        this.f15199a = l.CREATOR.createFromParcel(parcel);
        this.f15200b = parcel.readLong();
    }
}
