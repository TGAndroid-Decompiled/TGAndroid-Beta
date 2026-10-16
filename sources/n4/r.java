package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new m8.h(6);
    public final MediaSession.Token f15742b;
    public d f15743c;
    public final Object f15741a = new Object();
    public y4.d d = null;

    public r(MediaSession.Token token, m mVar) {
        this.f15742b = token;
        this.f15743c = mVar;
    }

    public final d a() {
        d dVar;
        synchronized (this.f15741a) {
            dVar = this.f15743c;
        }
        return dVar;
    }

    public final void b(d dVar) {
        synchronized (this.f15741a) {
            this.f15743c = dVar;
        }
    }

    public final void c(y4.d dVar) {
        synchronized (this.f15741a) {
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
        return this.f15742b.equals(((r) obj).f15742b);
    }

    public final int hashCode() {
        return this.f15742b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f15742b, i10);
    }
}
