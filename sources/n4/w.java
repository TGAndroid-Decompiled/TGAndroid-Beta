package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new m8.h(7);
    public final MediaSession.Token f16613b;
    public h f16614c;
    public final Object f16612a = new Object();
    public y4.d d = null;

    public w(MediaSession.Token token, q qVar) {
        this.f16613b = token;
        this.f16614c = qVar;
    }

    public final h a() {
        h hVar;
        synchronized (this.f16612a) {
            hVar = this.f16614c;
        }
        return hVar;
    }

    public final void b(h hVar) {
        synchronized (this.f16612a) {
            this.f16614c = hVar;
        }
    }

    public final void c(y4.d dVar) {
        synchronized (this.f16612a) {
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
        if (!(obj instanceof w)) {
            return false;
        }
        return this.f16613b.equals(((w) obj).f16613b);
    }

    public final int hashCode() {
        return this.f16613b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f16613b, i10);
    }
}
