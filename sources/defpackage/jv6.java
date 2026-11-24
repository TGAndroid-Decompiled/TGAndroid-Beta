package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class jv6 implements Parcelable {
    public static final Parcelable.Creator<jv6> CREATOR = new hv6((byte) 0);
    public final kq6 a;
    public final long b;
    public MediaSession.QueueItem c;

    public jv6(kq6 kq6Var, long j) {
        if (j != -1) {
            this.a = kq6Var;
            this.b = j;
            this.c = null;
            return;
        }
        w26.j("Id cannot be QueueItem.UNKNOWN_ID");
        throw null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem { Description=");
        sb.append(this.a);
        sb.append(", Id=");
        return ls6.p(sb, this.b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
    }

    public jv6(Parcel parcel) {
        this.a = kq6.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }
}
