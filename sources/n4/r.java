package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new h8.j(29);
    public final MediaSession.Token f18693b;
    public d f18694c;
    public final Object f18692a = new Object();
    public z4.d d = null;

    public r(MediaSession.Token token, m mVar) {
        this.f18693b = token;
        this.f18694c = mVar;
    }

    public final d a() {
        d dVar;
        synchronized (this.f18692a) {
            dVar = this.f18694c;
        }
        return dVar;
    }

    public final void b(d dVar) {
        synchronized (this.f18692a) {
            this.f18694c = dVar;
        }
    }

    public final void c(z4.d dVar) {
        synchronized (this.f18692a) {
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
        return this.f18693b.equals(((r) obj).f18693b);
    }

    public final int hashCode() {
        return this.f18693b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f18693b, i10);
    }
}
