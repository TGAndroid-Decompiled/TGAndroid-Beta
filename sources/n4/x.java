package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new m8.h(7);
    public final MediaSession.Token f15219b;
    public h f15220c;
    public final Object f15218a = new Object();
    public y4.d d = null;

    public x(MediaSession.Token token, q qVar) {
        this.f15219b = token;
        this.f15220c = qVar;
    }

    public final h a() {
        h hVar;
        synchronized (this.f15218a) {
            hVar = this.f15220c;
        }
        return hVar;
    }

    public final void b(h hVar) {
        synchronized (this.f15218a) {
            this.f15220c = hVar;
        }
    }

    public final void c(y4.d dVar) {
        synchronized (this.f15218a) {
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
        return this.f15219b.equals(((x) obj).f15219b);
    }

    public final int hashCode() {
        return this.f15219b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f15219b, i10);
    }
}
