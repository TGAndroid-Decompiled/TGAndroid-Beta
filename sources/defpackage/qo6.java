package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;
public final class qo6 extends Binder implements gk5 {
    public final WeakReference a;

    public qo6() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(null);
    }

    @Override
    public final void g(int i) {
        if (this.a.get() == null) {
            return;
        }
        rjb.p();
    }

    @Override
    public final void i(int i) {
        if (this.a.get() == null) {
            return;
        }
        rjb.p();
    }

    @Override
    public final void j(ge8 ge8Var) {
        if (this.a.get() == null) {
            return;
        }
        rjb.p();
    }

    @Override
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ge8 ge8Var;
        if (i != 3) {
            if (i != 9) {
                if (i != 1598968902) {
                    WeakReference weakReference = this.a;
                    switch (i) {
                        case 11:
                            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                            parcel.readInt();
                            if (weakReference.get() != null) {
                                rjb.p();
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
                                rjb.p();
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
            ge8Var = ge8.CREATOR.createFromParcel(parcel);
        } else {
            ge8Var = null;
        }
        j(ge8Var);
        return true;
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
