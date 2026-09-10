package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new m8.h(7);
    public final MediaSession.Token f13821b;
    public h f13822c;
    public final Object f13820a = new Object();
    public y4.d d = null;

    public x(MediaSession.Token token, q qVar) {
        this.f13821b = token;
        this.f13822c = qVar;
    }

    public final h a() {
        h hVar;
        synchronized (this.f13820a) {
            hVar = this.f13822c;
        }
        return hVar;
    }

    public final void b(h hVar) {
        synchronized (this.f13820a) {
            this.f13822c = hVar;
        }
    }

    public final void c(y4.d dVar) {
        synchronized (this.f13820a) {
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
        return this.f13821b.equals(((x) obj).f13821b);
    }

    public final int hashCode() {
        return this.f13821b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f13821b, i10);
    }
}
