package df;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;

public final class b extends Binder implements IInterface {

    public final Handler f4919a;

    public final xa.a f4920b;

    public b(xa.a aVar) {
        this.f4920b = aVar;
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        this.f4919a = new Handler(Looper.getMainLooper());
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        Handler handler = this.f4919a;
        if (i10 == 2) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            handler.post(new a(this, parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null));
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 3) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            handler.post(new a(this, parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, 1));
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 4) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            handler.post(new a(this, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null));
            parcel2.writeNoException();
            return true;
        }
        if (i10 != 5) {
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }
        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
        handler.post(new a(this, parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, 3));
        parcel2.writeNoException();
        return true;
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
