package n4;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;
public final class e extends Binder implements b {
    public static final int f13494b = 0;
    public final WeakReference f13495a;

    public e() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f13495a = new WeakReference(null);
    }

    @Override
    public final void c(int i10) {
        if (this.f13495a.get() == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override
    public final void i(int i10) {
        if (this.f13495a.get() == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        w wVar;
        if (i10 != 3) {
            if (i10 != 9) {
                if (i10 != 1598968902) {
                    WeakReference weakReference = this.f13495a;
                    switch (i10) {
                        case 11:
                            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                            parcel.readInt();
                            if (weakReference.get() != null) {
                                throw new ClassCastException();
                            }
                            break;
                        case 12:
                            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                            i(parcel.readInt());
                            return true;
                        case 13:
                            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                            if (weakReference.get() != null) {
                                throw new ClassCastException();
                            }
                            break;
                        default:
                            return super.onTransact(i10, parcel, parcel2, i11);
                    }
                    return true;
                }
                parcel2.getClass();
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            c(parcel.readInt());
            return true;
        }
        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        if (parcel.readInt() != 0) {
            wVar = w.CREATOR.createFromParcel(parcel);
        } else {
            wVar = null;
        }
        u(wVar);
        return true;
    }

    @Override
    public final void u(w wVar) {
        if (this.f13495a.get() == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
