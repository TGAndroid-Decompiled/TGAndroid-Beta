package n4;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;
public final class e extends Binder implements b {
    public static final int f17089b = 0;
    public final WeakReference f17090a;

    public e() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f17090a = new WeakReference(null);
    }

    @Override
    public final void h(int i10) {
        if (this.f17090a.get() == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        if (this.f17090a.get() == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        y yVar;
        if (i10 != 3) {
            if (i10 != 9) {
                if (i10 != 1598968902) {
                    WeakReference weakReference = this.f17090a;
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
                            h(parcel.readInt());
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
            onRepeatModeChanged(parcel.readInt());
            return true;
        }
        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        if (parcel.readInt() != 0) {
            yVar = y.CREATOR.createFromParcel(parcel);
        } else {
            yVar = null;
        }
        t(yVar);
        return true;
    }

    @Override
    public final void t(y yVar) {
        if (this.f17090a.get() == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
