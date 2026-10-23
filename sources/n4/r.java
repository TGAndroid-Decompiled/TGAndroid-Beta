package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new m8.h(6);
    public final MediaSession.Token f17185b;
    public d f17186c;
    public final Object f17184a = new Object();
    public y4.d d = null;

    public r(MediaSession.Token token, m mVar) {
        this.f17185b = token;
        this.f17186c = mVar;
    }

    public final d a() {
        d dVar;
        synchronized (this.f17184a) {
            dVar = this.f17186c;
        }
        return dVar;
    }

    public final void b(d dVar) {
        synchronized (this.f17184a) {
            this.f17186c = dVar;
        }
    }

    public final void c(y4.d dVar) {
        synchronized (this.f17184a) {
            this.d = dVar;
        }
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return this.f17185b.equals(((r) obj).f17185b);
    }

    public final int hashCode() {
        return this.f17185b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f17185b, i10);
    }
}
