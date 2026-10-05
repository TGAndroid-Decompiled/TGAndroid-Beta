package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new m8.h(7);
    public final MediaSession.Token f16646b;
    public h f16647c;
    public final Object f16645a = new Object();
    public y4.d d = null;

    public x(MediaSession.Token token, q qVar) {
        this.f16646b = token;
        this.f16647c = qVar;
    }

    public final h a() {
        h hVar;
        synchronized (this.f16645a) {
            hVar = this.f16647c;
        }
        return hVar;
    }

    public final void b(h hVar) {
        synchronized (this.f16645a) {
            this.f16647c = hVar;
        }
    }

    public final void c(y4.d dVar) {
        synchronized (this.f16645a) {
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
        return this.f16646b.equals(((x) obj).f16646b);
    }

    public final int hashCode() {
        return this.f16646b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f16646b, i10);
    }
}
