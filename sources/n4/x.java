package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new m8.h(7);
    public final MediaSession.Token f16360b;
    public h f16361c;
    public final Object f16359a = new Object();
    public y4.d d = null;

    public x(MediaSession.Token token, r rVar) {
        this.f16360b = token;
        this.f16361c = rVar;
    }

    public final h a() {
        h hVar;
        synchronized (this.f16359a) {
            hVar = this.f16361c;
        }
        return hVar;
    }

    public final void b(h hVar) {
        synchronized (this.f16359a) {
            this.f16361c = hVar;
        }
    }

    public final void c(y4.d dVar) {
        synchronized (this.f16359a) {
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
        return this.f16360b.equals(((x) obj).f16360b);
    }

    public final int hashCode() {
        return this.f16360b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f16360b, i10);
    }
}
