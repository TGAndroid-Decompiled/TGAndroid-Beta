package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new m8.h(7);
    public final MediaSession.Token f16655b;
    public h f16656c;
    public final Object f16654a = new Object();
    public y4.d d = null;

    public w(MediaSession.Token token, q qVar) {
        this.f16655b = token;
        this.f16656c = qVar;
    }

    public final h a() {
        h hVar;
        synchronized (this.f16654a) {
            hVar = this.f16656c;
        }
        return hVar;
    }

    public final void b(h hVar) {
        synchronized (this.f16654a) {
            this.f16656c = hVar;
        }
    }

    public final void c(y4.d dVar) {
        synchronized (this.f16654a) {
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
        return this.f16655b.equals(((w) obj).f16655b);
    }

    public final int hashCode() {
        return this.f16655b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f16655b, i10);
    }
}
