package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new m8.h(7);
    public final MediaSession.Token f16637b;
    public h f16638c;
    public final Object f16636a = new Object();
    public y4.d d = null;

    public x(MediaSession.Token token, q qVar) {
        this.f16637b = token;
        this.f16638c = qVar;
    }

    public final h a() {
        h hVar;
        synchronized (this.f16636a) {
            hVar = this.f16638c;
        }
        return hVar;
    }

    public final void b(h hVar) {
        synchronized (this.f16636a) {
            this.f16638c = hVar;
        }
    }

    public final void c(y4.d dVar) {
        synchronized (this.f16636a) {
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
        return this.f16637b.equals(((x) obj).f16637b);
    }

    public final int hashCode() {
        return this.f16637b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f16637b, i10);
    }
}
