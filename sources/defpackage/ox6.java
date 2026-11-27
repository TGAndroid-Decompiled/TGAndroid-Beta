package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class ox6 implements Parcelable {
    public static final Parcelable.Creator<ox6> CREATOR = new mx6((byte) 0);
    public final os6 a;
    public final long b;
    public MediaSession.QueueItem c;

    public ox6(os6 os6Var, long j) {
        if (j != -1) {
            this.a = os6Var;
            this.b = j;
            this.c = null;
            return;
        }
        lq5.j("Id cannot be QueueItem.UNKNOWN_ID");
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
        return qu6.p(sb, this.b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
    }

    public ox6(Parcel parcel) {
        this.a = os6.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }
}
