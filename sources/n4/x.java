package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new m8.h(7);
    public final MediaSession.Token f14989b;
    public h f14990c;
    public final Object f14988a = new Object();
    public y4.d d = null;

    public x(MediaSession.Token token, q qVar) {
        this.f14989b = token;
        this.f14990c = qVar;
    }

    public final h a() {
        h hVar;
        synchronized (this.f14988a) {
            hVar = this.f14990c;
        }
        return hVar;
    }

    public final void b(h hVar) {
        synchronized (this.f14988a) {
            this.f14990c = hVar;
        }
    }

    public final void c(y4.d dVar) {
        synchronized (this.f14988a) {
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
        if (!(obj instanceof x)) {
            return false;
        }
        return this.f14989b.equals(((x) obj).f14989b);
    }

    public final int hashCode() {
        return this.f14989b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f14989b, i10);
    }
}
