package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new m8.h(5);
    public final l f15230a;
    public final long f15231b;
    public MediaSession.QueueItem f15232c;

    public v(l lVar, long j3) {
        if (j3 != -1) {
            this.f15230a = lVar;
            this.f15231b = j3;
            this.f15232c = null;
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
        sb2.append(this.f15230a);
        sb2.append(", Id=");
        return a4.a.s(sb2, this.f15231b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        this.f15230a.writeToParcel(parcel, i10);
        parcel.writeLong(this.f15231b);
    }

    public v(Parcel parcel) {
        this.f15230a = l.CREATOR.createFromParcel(parcel);
        this.f15231b = parcel.readLong();
    }
}
