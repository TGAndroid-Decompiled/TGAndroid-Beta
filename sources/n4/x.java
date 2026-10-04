package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new m8.h(7);
    public final MediaSession.Token f16641b;
    public h f16642c;
    public final Object f16640a = new Object();
    public y4.d d = null;

    public x(MediaSession.Token token, q qVar) {
        this.f16641b = token;
        this.f16642c = qVar;
    }

    public final h a() {
        h hVar;
        synchronized (this.f16640a) {
            hVar = this.f16642c;
        }
        return hVar;
    }

    public final void b(h hVar) {
        synchronized (this.f16640a) {
            this.f16642c = hVar;
        }
    }

    public final void c(y4.d dVar) {
        synchronized (this.f16640a) {
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
        return this.f16641b.equals(((x) obj).f16641b);
    }

    public final int hashCode() {
        return this.f16641b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f16641b, i10);
    }
}
