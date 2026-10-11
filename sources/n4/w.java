package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new m8.h(7);
    public final MediaSession.Token f16691b;
    public h f16692c;
    public final Object f16690a = new Object();
    public y4.d d = null;

    public w(MediaSession.Token token, q qVar) {
        this.f16691b = token;
        this.f16692c = qVar;
    }

    public final h a() {
        h hVar;
        synchronized (this.f16690a) {
            hVar = this.f16692c;
        }
        return hVar;
    }

    public final void b(h hVar) {
        synchronized (this.f16690a) {
            this.f16692c = hVar;
        }
    }

    public final void c(y4.d dVar) {
        synchronized (this.f16690a) {
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
        return this.f16691b.equals(((w) obj).f16691b);
    }

    public final int hashCode() {
        return this.f16691b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f16691b, i10);
    }
}
