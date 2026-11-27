package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class px6 implements Parcelable {
    public static final Parcelable.Creator<px6> CREATOR = new mx6((byte) 2);
    public final MediaSession.Token b;
    public nk5 c;
    public final Object a = new Object();
    public aec d = null;

    public px6(MediaSession.Token token, fx6 fx6Var) {
        this.b = token;
        this.c = fx6Var;
    }

    public final nk5 a() {
        nk5 nk5Var;
        synchronized (this.a) {
            nk5Var = this.c;
        }
        return nk5Var;
    }

    public final void b(nk5 nk5Var) {
        synchronized (this.a) {
            this.c = nk5Var;
        }
    }

    public final void c(aec aecVar) {
        synchronized (this.a) {
            this.d = aecVar;
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
        if (!(obj instanceof px6)) {
            return false;
        }
        return this.b.equals(((px6) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
