package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new m8.h(6);
    public final MediaSession.Token f17122b;
    public d f17123c;
    public final Object f17121a = new Object();
    public y4.d d = null;

    public r(MediaSession.Token token, m mVar) {
        this.f17122b = token;
        this.f17123c = mVar;
    }

    public final d a() {
        d dVar;
        synchronized (this.f17121a) {
            dVar = this.f17123c;
        }
        return dVar;
    }

    public final void b(d dVar) {
        synchronized (this.f17121a) {
            this.f17123c = dVar;
        }
    }

    public final void c(y4.d dVar) {
        synchronized (this.f17121a) {
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
        return this.f17122b.equals(((r) obj).f17122b);
    }

    public final int hashCode() {
        return this.f17122b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f17122b, i10);
    }
}
