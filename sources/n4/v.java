package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new m8.h(5);
    public final l f14961a;
    public final long f14962b;
    public MediaSession.QueueItem f14963c;

    public v(l lVar, long j3) {
        if (j3 != -1) {
            this.f14961a = lVar;
            this.f14962b = j3;
            this.f14963c = null;
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
        sb2.append(this.f14961a);
        sb2.append(", Id=");
        return a4.a.s(sb2, this.f14962b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        this.f14961a.writeToParcel(parcel, i10);
        parcel.writeLong(this.f14962b);
    }

    public v(Parcel parcel) {
        this.f14961a = l.CREATOR.createFromParcel(parcel);
        this.f14962b = parcel.readLong();
    }
}
