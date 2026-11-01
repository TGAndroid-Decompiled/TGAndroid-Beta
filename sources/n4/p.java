package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new m8.i(5);
    public final MediaSession.Token f13525b;
    public d f13526c;
    public final Object f13524a = new Object();
    public y4.d d = null;

    public p(MediaSession.Token token, k kVar) {
        this.f13525b = token;
        this.f13526c = kVar;
    }

    public final d a() {
        d dVar;
        synchronized (this.f13524a) {
            dVar = this.f13526c;
        }
        return dVar;
    }

    public final void b(d dVar) {
        synchronized (this.f13524a) {
            this.f13526c = dVar;
        }
    }

    public final void c(y4.d dVar) {
        synchronized (this.f13524a) {
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
        if (!(obj instanceof p)) {
            return false;
        }
        return this.f13525b.equals(((p) obj).f13525b);
    }

    public final int hashCode() {
        return this.f13525b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f13525b, i10);
    }
}
