package n4;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
public final class i extends Binder implements f {
    public static final int f16652b = 0;
    public final WeakReference f16653a;

    public i() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f16653a = new WeakReference(null);
    }

    @Override
    public final void h(int i10) {
        if (this.f16653a.get() == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        if (this.f16653a.get() == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        f0 f0Var;
        if (i10 != 1598968902) {
            switch (i10) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    if (this.f16653a.get() != null) {
                        throw new ClassCastException();
                    }
                    break;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    throw new AssertionError();
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        f0Var = f0.CREATOR.createFromParcel(parcel);
                    } else {
                        f0Var = null;
                    }
                    t(f0Var);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        m.CREATOR.createFromParcel(parcel);
                    }
                    throw new AssertionError();
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.createTypedArrayList(u.CREATOR);
                    throw new AssertionError();
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                    }
                    throw new AssertionError();
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        Bundle bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    throw new AssertionError();
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        d0.CREATOR.createFromParcel(parcel);
                    }
                    throw new AssertionError();
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    onRepeatModeChanged(parcel.readInt());
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    if (this.f16653a.get() != null) {
                        throw new ClassCastException();
                    }
                    break;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    h(parcel.readInt());
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (this.f16653a.get() != null) {
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

    @Override
    public final void t(f0 f0Var) {
        if (this.f16653a.get() == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
