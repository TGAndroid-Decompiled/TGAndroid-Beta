package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new m8.h(7);
    public final MediaSession.Token f15001b;
    public h f15002c;
    public final Object f15000a = new Object();
    public y4.d d = null;

    public x(MediaSession.Token token, q qVar) {
        this.f15001b = token;
        this.f15002c = qVar;
    }

    public final h a() {
        h hVar;
        synchronized (this.f15000a) {
            hVar = this.f15002c;
        }
        return hVar;
    }

    public final void b(h hVar) {
        synchronized (this.f15000a) {
            this.f15002c = hVar;
        }
    }

    public final void c(y4.d dVar) {
        synchronized (this.f15000a) {
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
        return this.f15001b.equals(((x) obj).f15001b);
    }

    public final int hashCode() {
        return this.f15001b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f15001b, i10);
    }
}
