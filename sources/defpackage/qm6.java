package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;
public final class qm6 extends Binder implements hi5 {
    public final WeakReference a;

    public qm6() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(null);
    }

    @Override
    public final void g(int i) {
        if (this.a.get() == null) {
            return;
        }
        fyb.g();
    }

    @Override
    public final void i(int i) {
        if (this.a.get() == null) {
            return;
        }
        fyb.g();
    }

    @Override
    public final void j(dc8 dc8Var) {
        if (this.a.get() == null) {
            return;
        }
        fyb.g();
    }

    @Override
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        dc8 dc8Var;
        if (i != 3) {
            if (i != 9) {
                if (i != 1598968902) {
                    WeakReference weakReference = this.a;
                    switch (i) {
                        case 11:
                            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                            parcel.readInt();
                            if (weakReference.get() != null) {
                                fyb.g();
                                return false;
                            }
                            break;
                        case 12:
                            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                            i(parcel.readInt());
                            return true;
                        case 13:
                            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                            if (weakReference.get() != null) {
                                fyb.g();
                                return false;
                            }
                            break;
                        default:
                            return super.onTransact(i, parcel, parcel2, i2);
                    }
                    return true;
                }
                parcel2.getClass();
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            g(parcel.readInt());
            return true;
        }
        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        if (parcel.readInt() != 0) {
            dc8Var = dc8.CREATOR.createFromParcel(parcel);
        } else {
            dc8Var = null;
        }
        j(dc8Var);
        return true;
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
