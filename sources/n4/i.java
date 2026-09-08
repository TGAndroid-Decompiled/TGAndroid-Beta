package n4;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
public final class i extends Binder implements f {
    public static final int f16477b = 0;
    public final WeakReference f16478a;

    public i() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f16478a = new WeakReference(null);
    }

    @Override
    public final void h(int i10) {
        if (this.f16478a.get() == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        if (this.f16478a.get() == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        h0 h0Var;
        if (i10 != 1598968902) {
            switch (i10) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    t0(readString);
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    throw new AssertionError();
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        h0Var = h0.CREATOR.createFromParcel(parcel);
                    } else {
                        h0Var = null;
                    }
                    t(h0Var);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        m.CREATOR.createFromParcel(parcel);
                    }
                    throw new AssertionError();
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.createTypedArrayList(v.CREATOR);
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
                        e0.CREATOR.createFromParcel(parcel);
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
                    if (this.f16478a.get() != null) {
                        throw new ClassCastException();
                    }
                    break;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    h(parcel.readInt());
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (this.f16478a.get() != null) {
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
    public final void t(h0 h0Var) {
        if (this.f16478a.get() == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override
    public final void t0(String str) {
        if (this.f16478a.get() == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
