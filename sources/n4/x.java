package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new m8.h(7);
    public final MediaSession.Token f15176b;
    public h f15177c;
    public final Object f15175a = new Object();
    public y4.d d = null;

    public x(MediaSession.Token token, q qVar) {
        this.f15176b = token;
        this.f15177c = qVar;
    }

    public final h a() {
        h hVar;
        synchronized (this.f15175a) {
            hVar = this.f15177c;
        }
        return hVar;
    }

    public final void b(h hVar) {
        synchronized (this.f15175a) {
            this.f15177c = hVar;
        }
    }

    public final void c(y4.d dVar) {
        synchronized (this.f15175a) {
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
        return this.f15176b.equals(((x) obj).f15176b);
    }

    public final int hashCode() {
        return this.f15176b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f15176b, i10);
    }
}
