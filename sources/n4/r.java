package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new m8.h(6);
    public final MediaSession.Token f17121b;
    public d f17122c;
    public final Object f17120a = new Object();
    public y4.d d = null;

    public r(MediaSession.Token token, m mVar) {
        this.f17121b = token;
        this.f17122c = mVar;
    }

    public final d a() {
        d dVar;
        synchronized (this.f17120a) {
            dVar = this.f17122c;
        }
        return dVar;
    }

    public final void b(d dVar) {
        synchronized (this.f17120a) {
            this.f17122c = dVar;
        }
    }

    public final void c(y4.d dVar) {
        synchronized (this.f17120a) {
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
        return this.f17121b.equals(((r) obj).f17121b);
    }

    public final int hashCode() {
        return this.f17121b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f17121b, i10);
    }
}
