package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new h8.j(29);
    public final MediaSession.Token f18692b;
    public d f18693c;
    public final Object f18691a = new Object();
    public z4.d d = null;

    public r(MediaSession.Token token, m mVar) {
        this.f18692b = token;
        this.f18693c = mVar;
    }

    public final d a() {
        d dVar;
        synchronized (this.f18691a) {
            dVar = this.f18693c;
        }
        return dVar;
    }

    public final void b(d dVar) {
        synchronized (this.f18691a) {
            this.f18693c = dVar;
        }
    }

    public final void c(z4.d dVar) {
        synchronized (this.f18691a) {
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
        return this.f18692b.equals(((r) obj).f18692b);
    }

    public final int hashCode() {
        return this.f18692b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f18692b, i10);
    }
}
