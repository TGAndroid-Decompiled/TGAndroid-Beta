package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new m8.h(6);
    public final MediaSession.Token f17124b;
    public d f17125c;
    public final Object f17123a = new Object();
    public y4.d d = null;

    public r(MediaSession.Token token, m mVar) {
        this.f17124b = token;
        this.f17125c = mVar;
    }

    public final d a() {
        d dVar;
        synchronized (this.f17123a) {
            dVar = this.f17125c;
        }
        return dVar;
    }

    public final void b(d dVar) {
        synchronized (this.f17123a) {
            this.f17125c = dVar;
        }
    }

    public final void c(y4.d dVar) {
        synchronized (this.f17123a) {
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
        return this.f17124b.equals(((r) obj).f17124b);
    }

    public final int hashCode() {
        return this.f17124b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f17124b, i10);
    }
}
